package com.google.android.libraries.smartburst.filterfw;

import android.content.Context;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
public class GraphExporter {
    public static void exportAsDot(FilterGraph filterGraph, String str, boolean z) {
        String valueOf;
        Iterator it;
        int i;
        int i2;
        String dotName;
        Context applicationContext = filterGraph.getContext().getApplicationContext();
        Filter[] filters = filterGraph.getFilters();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(applicationContext.openFileOutput(str, 0));
        outputStreamWriter.write("digraph graphname {\n");
        outputStreamWriter.write("  node [shape=record];\n");
        for (Filter filter : filters) {
            valueOf = String.valueOf(filter.getName());
            String str2 = "  ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            outputStreamWriter.write(String.valueOf(getDotName(valueOf)).concat(" [label=\"{"));
            Set inputPorts = getInputPorts(filter, z);
            if (inputPorts.size() > 0) {
                outputStreamWriter.write(" { ");
                it = inputPorts.iterator();
                i = 0;
                while (true) {
                    i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    valueOf = (String) it.next();
                    dotName = getDotName(valueOf);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(dotName).length() + 5) + String.valueOf(valueOf).length());
                    stringBuilder.append("<");
                    stringBuilder.append(dotName);
                    stringBuilder.append("_IN>");
                    stringBuilder.append(valueOf);
                    outputStreamWriter.write(stringBuilder.toString());
                    i = i2 + 1;
                    if (i != inputPorts.size()) {
                        outputStreamWriter.write(" | ");
                    }
                }
                outputStreamWriter.write(" } | ");
            }
            outputStreamWriter.write(filter.getName());
            Set outputPorts = getOutputPorts(filter, z);
            if (outputPorts.size() > 0) {
                outputStreamWriter.write(" | { ");
                Iterator it2 = outputPorts.iterator();
                i = 0;
                while (true) {
                    i2 = i;
                    if (!it2.hasNext()) {
                        break;
                    }
                    valueOf = (String) it2.next();
                    String dotName2 = getDotName(valueOf);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(dotName2).length() + 6) + String.valueOf(valueOf).length());
                    stringBuilder2.append("<");
                    stringBuilder2.append(dotName2);
                    stringBuilder2.append("_OUT>");
                    stringBuilder2.append(valueOf);
                    outputStreamWriter.write(stringBuilder2.toString());
                    i = i2 + 1;
                    if (i != outputPorts.size()) {
                        outputStreamWriter.write(" | ");
                    }
                }
                outputStreamWriter.write(" } ");
            }
            outputStreamWriter.write("}\"];\n");
        }
        outputStreamWriter.write("\n");
        int length = filters.length;
        int i3 = 0;
        i = 0;
        while (i3 < length) {
            String dotName3;
            int length2;
            StringBuilder stringBuilder3;
            Filter filter2 = filters[i3];
            i2 = i;
            for (String valueOf2 : getOutputPorts(filter2, z)) {
                OutputPort connectedOutputPort = filter2.getConnectedOutputPort(valueOf2);
                if (connectedOutputPort != null) {
                    InputPort target = connectedOutputPort.getTarget();
                    dotName = getDotName(connectedOutputPort.getFilter().getName());
                    dotName3 = getDotName(connectedOutputPort.getName());
                    String dotName4 = getDotName(target.getFilter().getName());
                    valueOf2 = getDotName(target.getName());
                    int length3 = String.valueOf(dotName).length();
                    StringBuilder stringBuilder4 = new StringBuilder((((length3 + 17) + String.valueOf(dotName3).length()) + String.valueOf(dotName4).length()) + String.valueOf(valueOf2).length());
                    stringBuilder4.append("  ");
                    stringBuilder4.append(dotName);
                    stringBuilder4.append(":");
                    stringBuilder4.append(dotName3);
                    stringBuilder4.append("_OUT -> ");
                    stringBuilder4.append(dotName4);
                    stringBuilder4.append(":");
                    stringBuilder4.append(valueOf2);
                    stringBuilder4.append("_IN;\n");
                    outputStreamWriter.write(stringBuilder4.toString());
                } else {
                    if (filter2.getSignature().getOutputPortInfo(valueOf2).isRequired()) {
                        dotName3 = "red";
                    } else {
                        dotName3 = "blue";
                    }
                    i2++;
                    dotName = getDotName(filter2.getName());
                    valueOf2 = getDotName(valueOf2);
                    length2 = String.valueOf(dotName3).length();
                    stringBuilder3 = new StringBuilder((((length2 + 88) + String.valueOf(dotName).length()) + String.valueOf(valueOf2).length()) + String.valueOf(dotName3).length());
                    stringBuilder3.append("  dummy");
                    stringBuilder3.append(i2);
                    stringBuilder3.append(" [shape=point,label=\"\",color=");
                    stringBuilder3.append(dotName3);
                    stringBuilder3.append("];\n  ");
                    stringBuilder3.append(dotName);
                    stringBuilder3.append(":");
                    stringBuilder3.append(valueOf2);
                    stringBuilder3.append("_OUT -> dummy");
                    stringBuilder3.append(i2);
                    stringBuilder3.append(" [color=");
                    stringBuilder3.append(dotName3);
                    stringBuilder3.append("];\n");
                    outputStreamWriter.write(stringBuilder3.toString());
                }
            }
            for (String valueOf22 : getInputPorts(filter2, z)) {
                if (filter2.getConnectedInputPort(valueOf22) == null) {
                    if (filter2.getSignature().getInputPortInfo(valueOf22).isRequired()) {
                        dotName3 = "red";
                    } else {
                        dotName3 = "blue";
                    }
                    i2++;
                    dotName = getDotName(filter2.getName());
                    valueOf22 = getDotName(valueOf22);
                    length2 = String.valueOf(dotName3).length();
                    stringBuilder3 = new StringBuilder((((length2 + 87) + String.valueOf(dotName).length()) + String.valueOf(valueOf22).length()) + String.valueOf(dotName3).length());
                    stringBuilder3.append("  dummy");
                    stringBuilder3.append(i2);
                    stringBuilder3.append(" [shape=point,label=\"\",color=");
                    stringBuilder3.append(dotName3);
                    stringBuilder3.append("];\n  dummy");
                    stringBuilder3.append(i2);
                    stringBuilder3.append(" -> ");
                    stringBuilder3.append(dotName);
                    stringBuilder3.append(":");
                    stringBuilder3.append(valueOf22);
                    stringBuilder3.append("_IN [color=");
                    stringBuilder3.append(dotName3);
                    stringBuilder3.append("];\n");
                    outputStreamWriter.write(stringBuilder3.toString());
                }
            }
            i3++;
            i = i2;
        }
        outputStreamWriter.write("}\n");
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    private static String getDotName(String str) {
        return str.replaceAll("\\.", "___");
    }

    private static Set getInputPorts(Filter filter, boolean z) {
        Set hashSet = new HashSet();
        hashSet.addAll(filter.getConnectedInputPortMap().keySet());
        HashMap inputPorts = filter.getSignature().getInputPorts();
        if (inputPorts != null) {
            for (Entry entry : inputPorts.entrySet()) {
                if (z || ((PortInfo) entry.getValue()).isRequired()) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    private static Set getOutputPorts(Filter filter, boolean z) {
        Set hashSet = new HashSet();
        hashSet.addAll(filter.getConnectedOutputPortMap().keySet());
        HashMap outputPorts = filter.getSignature().getOutputPorts();
        if (outputPorts != null) {
            for (Entry entry : outputPorts.entrySet()) {
                if (z || ((PortInfo) entry.getValue()).isRequired()) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}

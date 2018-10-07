package p000;

import android.hardware.camera2.CaptureResult.Key;
import android.util.Pair;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.List;

/* compiled from: PG */
/* renamed from: axf */
public final class axf {
    /* renamed from: a */
    private static final String f1025a = bli.m887a("CaptureDataSerilzr");

    /* renamed from: a */
    private static String m753a(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        if (obj.getClass().isArray()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                stringBuilder.append(axf.m753a(Array.get(obj, i)));
                if (i != length - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        } else if (!(obj instanceof Pair)) {
            return obj.toString();
        } else {
            Pair pair = (Pair) obj;
            String a = axf.m753a(pair.first);
            String a2 = axf.m753a(pair.second);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(a).length() + 9) + String.valueOf(a2).length());
            stringBuilder2.append("Pair: ");
            stringBuilder2.append(a);
            stringBuilder2.append(" / ");
            stringBuilder2.append(a2);
            return stringBuilder2.toString();
        }
    }

    /* renamed from: a */
    public static void m754a(String str, iwp iwp, File file) {
        try {
            Writer fileWriter = new FileWriter(file, true);
            axg axg = new axg(iwp, str);
            Writer bufferedWriter = new BufferedWriter(fileWriter);
            try {
                List<Key> c = axg.f1026a.mo13732c();
                String format = String.format(null, axg.f1027b, new Object[0]);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(format).length() + 1);
                stringBuilder.append(format);
                stringBuilder.append(10);
                bufferedWriter.write(stringBuilder.toString());
                for (Key key : c) {
                    bufferedWriter.write(String.format(null, "    %s\n", new Object[]{key.getName()}));
                    bufferedWriter.write(String.format(null, "        %s\n", new Object[]{axf.m753a(axg.f1026a.mo13730a(key))}));
                }
                try {
                    bufferedWriter.close();
                } catch (Throwable e) {
                    bli.m892b(f1025a, "dumpMetadata - Failed to close writer.", e);
                }
            } catch (Throwable e2) {
                bli.m892b(f1025a, "dumpMetadata - Failed to dump metadata", e2);
                try {
                    bufferedWriter.close();
                } catch (Throwable e22) {
                    bli.m892b(f1025a, "dumpMetadata - Failed to close writer.", e22);
                }
            } catch (Throwable e222) {
                try {
                    bufferedWriter.close();
                } catch (Throwable e3) {
                    bli.m892b(f1025a, "dumpMetadata - Failed to close writer.", e3);
                }
                throw e222;
            }
            fileWriter.close();
        } catch (Throwable e2222) {
            bli.m892b(f1025a, "Could not write capture data to file.", e2222);
        }
    }
}

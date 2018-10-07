package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;

/* compiled from: PG */
/* renamed from: wv */
public final class C0569wv {
    /* renamed from: a */
    private static final Object f9986a = new Object();
    /* renamed from: b */
    private static DocumentBuilderFactory f9987b = C0569wv.m6233a();

    /* renamed from: a */
    private static DocumentBuilderFactory m6233a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
        }
        return newInstance;
    }

    /* renamed from: a */
    private static Object[] m6239a(Node node, boolean z, Object[] objArr) {
        while (true) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == (short) 7) {
                    ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                    if (processingInstruction.getTarget() == "xpacket") {
                        if (objArr != null) {
                            objArr[2] = processingInstruction.getData();
                        }
                    }
                }
                if (!(item.getNodeType() == (short) 3 || item.getNodeType() == (short) 7)) {
                    String namespaceURI = item.getNamespaceURI();
                    String localName = item.getLocalName();
                    if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                        z = false;
                        node = item;
                    } else if (z || !"RDF".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        Object[] a = C0569wv.m6239a(item, z, objArr);
                        if (a != null) {
                            return a;
                        }
                    } else if (objArr == null) {
                        return objArr;
                    } else {
                        objArr[0] = item;
                        objArr[1] = f9986a;
                        return objArr;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C0556wd m6238a(Object obj) {
        Node a;
        int i = 0;
        C0509tz.m5941a(obj);
        C0781xi c0781xi = new C0781xi();
        if (obj instanceof InputStream) {
            a = C0569wv.m6234a((InputStream) obj, c0781xi);
        } else if (obj instanceof byte[]) {
            a = C0569wv.m6237a(new C0561wj((byte[]) obj), c0781xi);
        } else {
            a = C0569wv.m6235a((String) obj, c0781xi);
        }
        Object[] a2 = C0569wv.m6239a(a, c0781xi.mo11535b(1), new Object[3]);
        if (a2 == null || a2[1] != f9986a) {
            return new C0776wt();
        }
        a = (Node) a2[0];
        C0776wt c0776wt = new C0776wt();
        if (a.hasAttributes()) {
            C0570ww c0570ww = c0776wt.f22365a;
            while (i < a.getChildNodes().getLength()) {
                Node item = a.getChildNodes().item(i);
                if (!C0564wm.m6201a(item)) {
                    C0564wm.m6199a(c0776wt, c0570ww, item, true);
                }
                i++;
            }
            if (c0781xi.mo11535b(32)) {
                return c0776wt;
            }
            return C0573wz.m6276a(c0776wt, c0781xi);
        }
        throw new C0554wb("Invalid attributes of rdf:RDF element", 202);
    }

    /* renamed from: a */
    private static Document m6236a(InputSource inputSource) {
        try {
            DocumentBuilder newDocumentBuilder = f9987b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (Throwable e) {
            throw new C0554wb("XML parsing failure", FrameType.ELEMENT_FLOAT64, e);
        } catch (Throwable e2) {
            throw new C0554wb("XML Parser not correctly configured", 0, e2);
        } catch (Throwable e22) {
            throw new C0554wb("Error reading the XML-file", 204, e22);
        }
    }

    /* renamed from: a */
    private static Document m6237a(C0561wj c0561wj, C0781xi c0781xi) {
        try {
            return C0569wv.m6236a(new InputSource(c0561wj.mo11464a()));
        } catch (Throwable e) {
            int i = e.f9951a;
            if (i == FrameType.ELEMENT_FLOAT64 || i == 204) {
                if (c0781xi.mo11535b(16) && "UTF-8".equals(c0561wj.mo11467b())) {
                    byte[] bArr = new byte[8];
                    C0561wj c0561wj2 = new C0561wj((c0561wj.f9964b << 2) / 3);
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = c0561wj.f9964b;
                        byte[] a;
                        if (i5 >= i6) {
                            if (i4 == 11) {
                                for (i5 = 0; i5 < i2; i5++) {
                                    a = C0509tz.m5943a(bArr[i5]);
                                    c0561wj2.mo11466a(a, a.length);
                                }
                                c0561wj = c0561wj2;
                            } else {
                                c0561wj = c0561wj2;
                            }
                        } else if (i5 < i6) {
                            int i7 = c0561wj.f9963a[i5] & Illuminant.kOther;
                            switch (i4) {
                                case 11:
                                    if (i3 > 0 && (i7 & 192) == 128) {
                                        i6 = i2 + 1;
                                        bArr[i2] = (byte) i7;
                                        i3--;
                                        if (i3 != 0) {
                                            i2 = i6;
                                            break;
                                        }
                                        c0561wj2.mo11466a(bArr, i6);
                                        i2 = 0;
                                        i4 = 0;
                                        break;
                                    }
                                    a = C0509tz.m5943a(bArr[0]);
                                    c0561wj2.mo11466a(a, a.length);
                                    i5 -= i2;
                                    i2 = 0;
                                    i4 = 0;
                                    break;
                                    break;
                                default:
                                    byte[] a2;
                                    if (i7 >= ScriptIntrinsicBLAS.RsBlas_csyrk) {
                                        if (i7 < 192) {
                                            a2 = C0509tz.m5943a((byte) i7);
                                            c0561wj2.mo11466a(a2, a2.length);
                                            break;
                                        }
                                        i3 = -1;
                                        i4 = i7;
                                        while (i3 < 8 && (i4 & 128) == 128) {
                                            i3++;
                                            i4 += i4;
                                        }
                                        i6 = i2 + 1;
                                        bArr[i2] = (byte) i7;
                                        i4 = 11;
                                        i2 = i6;
                                        break;
                                    }
                                    c0561wj2.mo11465a(c0561wj2.f9964b + 1);
                                    a2 = c0561wj2.f9963a;
                                    int i8 = c0561wj2.f9964b;
                                    c0561wj2.f9964b = i8 + 1;
                                    a2[i8] = (byte) i7;
                                    break;
                                    break;
                            }
                            i5++;
                        } else {
                            throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                        }
                    }
                }
                if (!c0781xi.mo11535b(8)) {
                    return C0569wv.m6236a(new InputSource(c0561wj.mo11464a()));
                }
                try {
                    return C0569wv.m6236a(new InputSource(new C0563wl(new InputStreamReader(c0561wj.mo11464a(), c0561wj.mo11467b()))));
                } catch (UnsupportedEncodingException e2) {
                    throw new C0554wb("Unsupported Encoding", 9, e);
                }
            }
            throw e;
        }
    }

    /* renamed from: a */
    private static Document m6234a(InputStream inputStream, C0781xi c0781xi) {
        if (!c0781xi.mo11535b(16) && !c0781xi.mo11535b(8)) {
            return C0569wv.m6236a(new InputSource(inputStream));
        }
        try {
            return C0569wv.m6237a(new C0561wj(inputStream), c0781xi);
        } catch (Throwable e) {
            throw new C0554wb("Error reading the XML-file", 204, e);
        }
    }

    /* renamed from: a */
    private static Document m6235a(String str, C0781xi c0781xi) {
        try {
            return C0569wv.m6236a(new InputSource(new StringReader(str)));
        } catch (C0554wb e) {
            if (e.f9951a == FrameType.ELEMENT_FLOAT64 && c0781xi.mo11535b(8)) {
                return C0569wv.m6236a(new InputSource(new C0563wl(new StringReader(str))));
            }
            throw e;
        }
    }
}

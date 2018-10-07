package p000;

import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

/* compiled from: PG */
/* renamed from: wm */
public final class C0564wm {
    /* renamed from: a */
    public final C0691ih f9971a = new C0691ih();
    /* renamed from: b */
    public final C0291in f9972b = new C0291in();

    /* renamed from: a */
    private static C0570ww m6197a(C0776wt c0776wt, C0570ww c0570ww, Node node, String str, boolean z) {
        boolean z2 = false;
        C0558wg c0558wg = C0557we.f9955a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            String str2;
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            Object b = c0558wg.mo11461b(namespaceURI);
            if (b == null) {
                if (node.getPrefix() == null) {
                    str2 = "_dflt";
                } else {
                    str2 = node.getPrefix();
                }
                b = c0558wg.mo11459a(namespaceURI, str2);
            }
            String valueOf = String.valueOf(b);
            str2 = String.valueOf(node.getLocalName());
            if (str2.length() == 0) {
                str2 = new String(valueOf);
            } else {
                str2 = valueOf.concat(str2);
            }
            C0782xj c0782xj = new C0782xj();
            if (z) {
                c0570ww = C0572wy.m6265a(c0776wt.f22365a, namespaceURI, "_dflt", true);
                c0570ww.f9994g = false;
                if (c0558wg.mo11460a(str2) != null) {
                    c0776wt.f22365a.f9995h = true;
                    c0570ww.f9995h = true;
                    z2 = true;
                }
            }
            boolean equals = "rdf:li".equals(str2);
            boolean equals2 = "rdf:value".equals(str2);
            C0570ww c0570ww2 = new C0570ww(str2, str, c0782xj);
            c0570ww2.f9996i = z2;
            if (equals2) {
                c0570ww.mo11493a(1, c0570ww2);
            } else {
                c0570ww.mo11494a(c0570ww2);
            }
            if (equals2) {
                if (z || !c0570ww.mo11503d().mo11535b(256)) {
                    throw new C0554wb("Misplaced rdf:value element", 202);
                }
                c0570ww.f9997j = true;
            }
            if (equals) {
                if (c0570ww.mo11503d().mo11535b(512)) {
                    c0570ww2.f9988a = "[]";
                } else {
                    throw new C0554wb("Misplaced rdf:li element", 202);
                }
            }
            return c0570ww2;
        }
        throw new C0554wb("XML namespace required for all elements and attributes", 202);
    }

    /* renamed from: a */
    private static C0570ww m6198a(C0570ww c0570ww, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = C0567wp.m6227d(str2);
        }
        C0570ww c0570ww2 = new C0570ww(str, str2, null);
        c0570ww.mo11498b(c0570ww2);
        return c0570ww2;
    }

    /* renamed from: a */
    public final void mo11475a(C0530ux c0530ux) {
        C0548vw c0548vw = (C0548vw) this.f9971a.get(c0530ux);
        if (c0548vw == null) {
            c0548vw = C0548vw.m6135a();
            this.f9971a.put(c0530ux, c0548vw);
        }
        c0548vw.f9941a |= 1;
    }

    /* renamed from: a */
    public final void mo11474a(long j, C0530ux c0530ux) {
        this.f9972b.mo8627a(j, c0530ux);
    }

    /* renamed from: a */
    public final void mo11476a(C0530ux c0530ux, C0515ue c0515ue) {
        C0548vw c0548vw = (C0548vw) this.f9971a.get(c0530ux);
        if (c0548vw == null) {
            c0548vw = C0548vw.m6135a();
            this.f9971a.put(c0530ux, c0548vw);
        }
        c0548vw.f9943c = c0515ue;
        c0548vw.f9941a |= 8;
    }

    /* renamed from: b */
    public final void mo11477b(C0530ux c0530ux, C0515ue c0515ue) {
        C0548vw c0548vw = (C0548vw) this.f9971a.get(c0530ux);
        if (c0548vw == null) {
            c0548vw = C0548vw.m6135a();
            this.f9971a.put(c0530ux, c0548vw);
        }
        c0548vw.f9942b = c0515ue;
        c0548vw.f9941a |= 4;
    }

    /* renamed from: a */
    public final void mo11473a() {
        this.f9971a.clear();
        this.f9972b.mo8625a();
    }

    /* renamed from: a */
    private static void m6200a(C0570ww c0570ww) {
        int i = 1;
        C0570ww a = c0570ww.mo11490a(1);
        if (a.mo11503d().mo11535b(64)) {
            if (c0570ww.mo11503d().mo11535b(64)) {
                throw new C0554wb("Redundant xml:lang for rdf:value element", 203);
            }
            C0570ww b = a.mo11496b(1);
            a.mo11504d(b);
            c0570ww.mo11498b(b);
        }
        while (i <= a.mo11505e()) {
            c0570ww.mo11498b(a.mo11496b(i));
            i++;
        }
        for (i = 2; i <= c0570ww.mo11499c(); i++) {
            c0570ww.mo11498b(c0570ww.mo11490a(i));
        }
        c0570ww.f9997j = false;
        c0570ww.mo11503d().mo14456d(false);
        c0570ww.mo11503d().mo14450a(a.mo11503d());
        c0570ww.f9989b = a.f9989b;
        c0570ww.f9991d = null;
        Iterator h = a.mo11508h();
        while (h.hasNext()) {
            c0570ww.mo11494a((C0570ww) h.next());
        }
    }

    /* renamed from: b */
    private static int m6202b(Node node) {
        String localName = node.getLocalName();
        Object namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            if ("li".equals(localName)) {
                return 9;
            }
            if ("parseType".equals(localName)) {
                return 4;
            }
            if ("Description".equals(localName)) {
                return 8;
            }
            if ("about".equals(localName)) {
                return 3;
            }
            if ("resource".equals(localName)) {
                return 5;
            }
            if ("RDF".equals(localName)) {
                return 1;
            }
            if ("ID".equals(localName)) {
                return 2;
            }
            if ("nodeID".equals(localName)) {
                return 6;
            }
            if ("datatype".equals(localName)) {
                return 7;
            }
            if ("aboutEach".equals(localName)) {
                return 10;
            }
            if ("aboutEachPrefix".equals(localName)) {
                return 11;
            }
            if ("bagID".equals(localName)) {
                return 12;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo11478b(C0530ux c0530ux) {
        C0548vw c0548vw = (C0548vw) this.f9971a.get(c0530ux);
        return (c0548vw == null || (c0548vw.f9941a & 1) == 0) ? false : true;
    }

    /* renamed from: a */
    static boolean m6201a(Node node) {
        if (node.getNodeType() != (short) 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C0515ue mo11472a(C0530ux c0530ux, int i) {
        C0515ue c0515ue = null;
        int a = this.f9971a.mo9190a((Object) c0530ux);
        if (a >= 0) {
            C0548vw c0548vw = (C0548vw) this.f9971a.mo9200d(a);
            if (c0548vw != null) {
                int i2 = c0548vw.f9941a;
                if ((i2 & i) != 0) {
                    c0548vw.f9941a = (i ^ -1) & i2;
                    if (i == 4) {
                        c0515ue = c0548vw.f9942b;
                    } else if (i == 8) {
                        c0515ue = c0548vw.f9943c;
                    } else {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    if ((c0548vw.f9941a & 12) == 0) {
                        this.f9971a.mo9196c(a);
                        C0548vw.m6136a(c0548vw);
                    }
                }
            }
        }
        return c0515ue;
    }

    /* renamed from: b */
    private static void m6203b(C0776wt c0776wt, C0570ww c0570ww, Node node, boolean z) {
        if (node.hasChildNodes()) {
            throw new C0554wb("Nested content not allowed with rdf:resource or property attributes", 202);
        }
        Object obj;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Node node2 = null;
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            if (!("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName())))) {
                switch (C0564wm.m6202b(item)) {
                    case 0:
                        if (!"value".equals(item.getLocalName()) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item.getNamespaceURI())) {
                            if (!"xml:lang".equals(item.getNodeName())) {
                                obj2 = 1;
                                break;
                            }
                            break;
                        } else if (obj3 == null) {
                            obj5 = 1;
                            node2 = item;
                            break;
                        } else {
                            throw new C0554wb("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                    case 2:
                        break;
                    case 5:
                        if (obj4 == null) {
                            if (obj5 == null) {
                                if (obj5 != null) {
                                    obj3 = 1;
                                    break;
                                }
                                obj3 = 1;
                                node2 = item;
                                break;
                            }
                            throw new C0554wb("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                        throw new C0554wb("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                    case 6:
                        if (obj3 == null) {
                            obj4 = 1;
                            break;
                        }
                        throw new C0554wb("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                    default:
                        throw new C0554wb("Unrecognized attribute of empty property element", 202);
                }
            }
        }
        C0570ww a = C0564wm.m6197a(c0776wt, c0570ww, node, "", z);
        if (obj5 != null || obj3 != null) {
            String str;
            if (node2 == null) {
                str = "";
            } else {
                str = node2.getNodeValue();
            }
            a.f9989b = str;
            if (obj5 == null) {
                a.mo11503d().mo11534a(2, true);
                obj = null;
            } else {
                obj = null;
            }
        } else if (obj2 != null) {
            a.mo11503d().mo14456d(true);
            obj = 1;
        } else {
            obj = null;
        }
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item2 = node.getAttributes().item(i2);
            if (!(item2 == node2 || "xmlns".equals(item2.getPrefix()) || (item2.getPrefix() == null && "xmlns".equals(item2.getNodeName())))) {
                switch (C0564wm.m6202b(item2)) {
                    case 0:
                        if (obj != null) {
                            if (!"xml:lang".equals(item2.getNodeName())) {
                                C0564wm.m6197a(c0776wt, a, item2, item2.getNodeValue(), false);
                                break;
                            } else {
                                C0564wm.m6198a(a, "xml:lang", item2.getNodeValue());
                                break;
                            }
                        }
                        C0564wm.m6198a(a, item2.getNodeName(), item2.getNodeValue());
                        break;
                    case 2:
                    case 6:
                        break;
                    case 5:
                        C0564wm.m6198a(a, "rdf:resource", item2.getNodeValue());
                        break;
                    default:
                        throw new C0554wb("Unrecognized attribute of empty property element", 202);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m6204c(C0776wt c0776wt, C0570ww c0570ww, Node node, boolean z) {
        Node item;
        String namespaceURI;
        int i = 0;
        C0570ww a = C0564wm.m6197a(c0776wt, c0570ww, node, null, z);
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            item = node.getAttributes().item(i2);
            if (!("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName())))) {
                namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ("xml:lang".equals(item.getNodeName())) {
                    C0564wm.m6198a(a, "xml:lang", item.getNodeValue());
                } else if (!("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) && ("ID".equals(localName) || "datatype".equals(localName)))) {
                    throw new C0554wb("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        while (i < node.getChildNodes().getLength()) {
            item = node.getChildNodes().item(i);
            if (item.getNodeType() == (short) 3) {
                namespaceURI = String.valueOf(str);
                str = String.valueOf(item.getNodeValue());
                if (str.length() == 0) {
                    str = new String(namespaceURI);
                } else {
                    str = namespaceURI.concat(str);
                }
                i++;
            } else {
                throw new C0554wb("Invalid child of literal property element", 202);
            }
        }
        a.f9989b = str;
    }

    /* renamed from: a */
    static void m6199a(C0776wt c0776wt, C0570ww c0570ww, Node node, boolean z) {
        int i = 0;
        int b = C0564wm.m6202b(node);
        if (b == 8 || b == 0) {
            if (!z) {
                b = 0;
            } else if (b != 0) {
                b = 0;
            } else {
                throw new C0554wb("Top level typed node not allowed", 203);
            }
            while (i < node.getAttributes().getLength()) {
                Node item = node.getAttributes().item(i);
                if (!("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName())))) {
                    int b2 = C0564wm.m6202b(item);
                    switch (b2) {
                        case 0:
                            C0564wm.m6197a(c0776wt, c0570ww, item, item.getNodeValue(), z);
                            break;
                        case 2:
                        case 3:
                        case 6:
                            if (b <= 0) {
                                b++;
                                if (z && b2 == 3) {
                                    String str = c0570ww.f9988a;
                                    if (str != null && str.length() > 0) {
                                        if (c0570ww.f9988a.equals(item.getNodeValue())) {
                                            break;
                                        }
                                        throw new C0554wb("Mismatched top level rdf:about values", 203);
                                    }
                                    c0570ww.f9988a = item.getNodeValue();
                                    break;
                                }
                            }
                            throw new C0554wb("Mutally exclusive about, ID, nodeID attributes", 202);
                            break;
                        default:
                            throw new C0554wb("Invalid nodeElement attribute", 202);
                    }
                }
                i++;
            }
            C0564wm.m6205d(c0776wt, c0570ww, node, z);
            return;
        }
        throw new C0554wb("Node element must be rdf:Description or typed node", 202);
    }

    /* JADX WARNING: Missing block: B:128:0x0270, code:
            throw new p000.C0554wb("Invalid attribute for resource property element", 202);
     */
    /* renamed from: d */
    private static void m6205d(p000.C0776wt r11, p000.C0570ww r12, org.w3c.dom.Node r13, boolean r14) {
        /*
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r13.getChildNodes();
        r0 = r0.getLength();
        if (r1 >= r0) goto L_0x03f4;
    L_0x000c:
        r0 = r13.getChildNodes();
        r4 = r0.item(r1);
        r0 = p000.C0564wm.m6201a(r4);
        if (r0 == 0) goto L_0x001e;
    L_0x001a:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0002;
    L_0x001e:
        r0 = r4.getNodeType();
        r2 = 1;
        if (r0 == r2) goto L_0x002f;
    L_0x0025:
        r0 = new wb;
        r1 = "Expected property element node not found";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x002f:
        r2 = p000.C0564wm.m6202b(r4);
        r0 = 8;
        if (r2 == r0) goto L_0x03c7;
    L_0x0037:
        r0 = 10;
        if (r2 < r0) goto L_0x03c4;
    L_0x003b:
        r0 = 12;
        if (r2 > r0) goto L_0x03c1;
    L_0x003f:
        r0 = 1;
    L_0x0040:
        if (r0 != 0) goto L_0x03be;
    L_0x0042:
        if (r2 <= 0) goto L_0x03bb;
    L_0x0044:
        r0 = 7;
        if (r2 > r0) goto L_0x03b8;
    L_0x0047:
        r0 = 1;
    L_0x0048:
        r0 = r0 ^ 1;
    L_0x004a:
        if (r0 != 0) goto L_0x0056;
    L_0x004c:
        r0 = new wb;
        r1 = "Invalid property element name";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x0056:
        r5 = r4.getAttributes();
        r2 = 0;
        r0 = 0;
        r3 = r0;
    L_0x005d:
        r0 = r5.getLength();
        if (r3 >= r0) goto L_0x009a;
    L_0x0063:
        r6 = r5.item(r3);
        r0 = "xmlns";
        r7 = r6.getPrefix();
        r0 = r0.equals(r7);
        if (r0 != 0) goto L_0x0085;
    L_0x0073:
        r0 = r6.getPrefix();
        if (r0 != 0) goto L_0x0094;
    L_0x0079:
        r0 = "xmlns";
        r7 = r6.getNodeName();
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0094;
    L_0x0085:
        if (r2 != 0) goto L_0x0098;
    L_0x0087:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x008c:
        r2 = r6.getNodeName();
        r0.add(r2);
        r2 = r0;
    L_0x0094:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x005d;
    L_0x0098:
        r0 = r2;
        goto L_0x008c;
    L_0x009a:
        if (r2 == 0) goto L_0x00b0;
    L_0x009c:
        r6 = r2.size();
        r0 = 0;
    L_0x00a1:
        if (r0 >= r6) goto L_0x00b0;
    L_0x00a3:
        r3 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r5.removeNamedItem(r0);
        r0 = r3;
        goto L_0x00a1;
    L_0x00b0:
        r0 = r5.getLength();
        r2 = 3;
        if (r0 <= r2) goto L_0x00bc;
    L_0x00b7:
        p000.C0564wm.m6203b(r11, r12, r4, r14);
        goto L_0x001a;
    L_0x00bc:
        r0 = 0;
    L_0x00bd:
        r2 = r5.getLength();
        if (r0 >= r2) goto L_0x01ce;
    L_0x00c3:
        r2 = r5.item(r0);
        r3 = r2.getLocalName();
        r6 = r2.getNamespaceURI();
        r7 = r2.getNodeValue();
        r8 = "xml:lang";
        r2 = r2.getNodeName();
        r2 = r8.equals(r2);
        if (r2 == 0) goto L_0x00ef;
    L_0x00df:
        r2 = "ID";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x01ca;
    L_0x00e7:
        r2 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r2 = r2.equals(r6);
        if (r2 == 0) goto L_0x01ca;
    L_0x00ef:
        r0 = "datatype";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0104;
    L_0x00f7:
        r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0104;
    L_0x00ff:
        p000.C0564wm.m6204c(r11, r12, r4, r14);
        goto L_0x001a;
    L_0x0104:
        r0 = "parseType";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0114;
    L_0x010c:
        r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r0 = r0.equals(r6);
        if (r0 != 0) goto L_0x0119;
    L_0x0114:
        p000.C0564wm.m6203b(r11, r12, r4, r14);
        goto L_0x001a;
    L_0x0119:
        r0 = "Literal";
        r0 = r0.equals(r7);
        if (r0 != 0) goto L_0x03ca;
    L_0x0121:
        r0 = "Resource";
        r0 = r0.equals(r7);
        if (r0 != 0) goto L_0x013b;
    L_0x0129:
        r0 = "Collection";
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x03d4;
    L_0x0131:
        r0 = new wb;
        r1 = "ParseTypeCollection property element not allowed";
        r2 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x013b:
        r0 = "";
        r2 = p000.C0564wm.m6197a(r11, r12, r4, r0, r14);
        r0 = r2.mo11503d();
        r3 = 1;
        r0.mo14456d(r3);
        r0 = 0;
    L_0x014a:
        r3 = r4.getAttributes();
        r3 = r3.getLength();
        if (r0 >= r3) goto L_0x01bd;
    L_0x0154:
        r3 = r4.getAttributes();
        r3 = r3.item(r0);
        r5 = "xmlns";
        r6 = r3.getPrefix();
        r5 = r5.equals(r6);
        if (r5 != 0) goto L_0x017a;
    L_0x0168:
        r5 = r3.getPrefix();
        if (r5 != 0) goto L_0x017d;
    L_0x016e:
        r5 = "xmlns";
        r6 = r3.getNodeName();
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x017d;
    L_0x017a:
        r0 = r0 + 1;
        goto L_0x014a;
    L_0x017d:
        r5 = r3.getLocalName();
        r6 = r3.getNamespaceURI();
        r7 = "xml:lang";
        r8 = r3.getNodeName();
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x019b;
    L_0x0191:
        r5 = "xml:lang";
        r3 = r3.getNodeValue();
        p000.C0564wm.m6198a(r2, r5, r3);
        goto L_0x017a;
    L_0x019b:
        r3 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x01b3;
    L_0x01a3:
        r3 = "ID";
        r3 = r3.equals(r5);
        if (r3 != 0) goto L_0x017a;
    L_0x01ab:
        r3 = "parseType";
        r3 = r3.equals(r5);
        if (r3 != 0) goto L_0x017a;
    L_0x01b3:
        r0 = new wb;
        r1 = "Invalid attribute for ParseTypeResource property element";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x01bd:
        r0 = 0;
        p000.C0564wm.m6205d(r11, r2, r4, r0);
        r0 = r2.f9997j;
        if (r0 == 0) goto L_0x001a;
    L_0x01c5:
        p000.C0564wm.m6200a(r2);
        goto L_0x001a;
    L_0x01ca:
        r0 = r0 + 1;
        goto L_0x00bd;
    L_0x01ce:
        r0 = r4.hasChildNodes();
        if (r0 == 0) goto L_0x03b3;
    L_0x01d4:
        r0 = 0;
    L_0x01d5:
        r2 = r4.getChildNodes();
        r2 = r2.getLength();
        if (r0 >= r2) goto L_0x03ae;
    L_0x01df:
        r2 = r4.getChildNodes();
        r2 = r2.item(r0);
        r2 = r2.getNodeType();
        r3 = 3;
        if (r2 != r3) goto L_0x01f1;
    L_0x01ee:
        r0 = r0 + 1;
        goto L_0x01d5;
    L_0x01f1:
        if (r14 == 0) goto L_0x01ff;
    L_0x01f3:
        r0 = "iX:changes";
        r2 = r4.getNodeName();
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x001a;
    L_0x01ff:
        r0 = "";
        r5 = p000.C0564wm.m6197a(r11, r12, r4, r0, r14);
        r0 = 0;
    L_0x0206:
        r2 = r4.getAttributes();
        r2 = r2.getLength();
        if (r0 >= r2) goto L_0x0271;
    L_0x0210:
        r2 = r4.getAttributes();
        r2 = r2.item(r0);
        r3 = "xmlns";
        r6 = r2.getPrefix();
        r3 = r3.equals(r6);
        if (r3 != 0) goto L_0x0236;
    L_0x0224:
        r3 = r2.getPrefix();
        if (r3 != 0) goto L_0x0239;
    L_0x022a:
        r3 = "xmlns";
        r6 = r2.getNodeName();
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x0239;
    L_0x0236:
        r0 = r0 + 1;
        goto L_0x0206;
    L_0x0239:
        r3 = r2.getLocalName();
        r6 = r2.getNamespaceURI();
        r7 = "xml:lang";
        r8 = r2.getNodeName();
        r7 = r7.equals(r8);
        if (r7 == 0) goto L_0x0257;
    L_0x024d:
        r3 = "xml:lang";
        r2 = r2.getNodeValue();
        p000.C0564wm.m6198a(r5, r3, r2);
        goto L_0x0236;
    L_0x0257:
        r2 = "ID";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0267;
    L_0x025f:
        r2 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r2 = r2.equals(r6);
        if (r2 != 0) goto L_0x0236;
    L_0x0267:
        r0 = new wb;
        r1 = "Invalid attribute for resource property element";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x0271:
        r2 = 0;
        r0 = 0;
        r10 = r0;
        r0 = r2;
        r2 = r10;
    L_0x0276:
        r3 = r4.getChildNodes();
        r3 = r3.getLength();
        if (r2 >= r3) goto L_0x03a2;
    L_0x0280:
        r3 = r4.getChildNodes();
        r3 = r3.item(r2);
        r6 = p000.C0564wm.m6201a(r3);
        if (r6 != 0) goto L_0x039f;
    L_0x028e:
        r6 = r3.getNodeType();
        r7 = 1;
        if (r6 != r7) goto L_0x03de;
    L_0x0295:
        if (r0 != 0) goto L_0x03de;
    L_0x0297:
        r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        r6 = r3.getNamespaceURI();
        r0 = r0.equals(r6);
        r6 = r3.getLocalName();
        if (r0 == 0) goto L_0x031a;
    L_0x02a7:
        r7 = "Bag";
        r7 = r7.equals(r6);
        if (r7 == 0) goto L_0x031a;
    L_0x02af:
        r0 = r5.mo11503d();
        r0.mo14453c();
    L_0x02b6:
        r0 = 0;
        p000.C0564wm.m6199a(r11, r5, r3, r0);
        r0 = r5.f9997j;
        if (r0 == 0) goto L_0x02c7;
    L_0x02be:
        p000.C0564wm.m6200a(r5);
        r3 = 1;
    L_0x02c2:
        r0 = r2 + 1;
        r2 = r0;
        r0 = r3;
        goto L_0x0276;
    L_0x02c7:
        r0 = r5.mo11503d();
        r3 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r0 = r0.mo11535b(r3);
        if (r0 != 0) goto L_0x02d5;
    L_0x02d3:
        r3 = 1;
        goto L_0x02c2;
    L_0x02d5:
        r0 = r5.mo11503d();
        r3 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r0 = r0.mo11535b(r3);
        if (r0 == 0) goto L_0x0318;
    L_0x02e1:
        r0 = r5.mo11506f();
        if (r0 == 0) goto L_0x0316;
    L_0x02e7:
        r3 = r5.mo11508h();
    L_0x02eb:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0314;
    L_0x02f1:
        r0 = r3.next();
        r0 = (p000.C0570ww) r0;
        r0 = r0.mo11503d();
        r6 = 64;
        r0 = r0.mo11535b(r6);
        if (r0 == 0) goto L_0x02eb;
    L_0x0303:
        r0 = 1;
    L_0x0304:
        if (r0 == 0) goto L_0x0312;
    L_0x0306:
        r0 = r5.mo11503d();
        r0.mo14455d();
        p000.C0572wy.m6272b(r5);
        r3 = 1;
        goto L_0x02c2;
    L_0x0312:
        r3 = 1;
        goto L_0x02c2;
    L_0x0314:
        r0 = 0;
        goto L_0x0304;
    L_0x0316:
        r3 = 1;
        goto L_0x02c2;
    L_0x0318:
        r3 = 1;
        goto L_0x02c2;
    L_0x031a:
        if (r0 == 0) goto L_0x0330;
    L_0x031c:
        r7 = "Seq";
        r7 = r7.equals(r6);
        if (r7 == 0) goto L_0x0330;
    L_0x0324:
        r0 = r5.mo11503d();
        r0 = r0.mo14453c();
        r0.mo14458f();
        goto L_0x02b6;
    L_0x0330:
        if (r0 == 0) goto L_0x034b;
    L_0x0332:
        r7 = "Alt";
        r7 = r7.equals(r6);
        if (r7 == 0) goto L_0x034b;
    L_0x033a:
        r0 = r5.mo11503d();
        r0 = r0.mo14453c();
        r0 = r0.mo14458f();
        r0.mo14457e();
        goto L_0x02b6;
    L_0x034b:
        r7 = r5.mo11503d();
        r8 = 1;
        r7.mo14456d(r8);
        if (r0 != 0) goto L_0x02b6;
    L_0x0355:
        r0 = "Description";
        r0 = r0.equals(r6);
        if (r0 != 0) goto L_0x02b6;
    L_0x035d:
        r0 = r3.getNamespaceURI();
        if (r0 != 0) goto L_0x036d;
    L_0x0363:
        r0 = new wb;
        r1 = "All XML elements must be in a namespace";
        r2 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x036d:
        r0 = java.lang.String.valueOf(r0);
        r7 = java.lang.String.valueOf(r0);
        r7 = r7.length();
        r8 = java.lang.String.valueOf(r6);
        r8 = r8.length();
        r9 = new java.lang.StringBuilder;
        r7 = r7 + 1;
        r7 = r7 + r8;
        r9.<init>(r7);
        r9.append(r0);
        r0 = 58;
        r9.append(r0);
        r9.append(r6);
        r0 = "rdf:type";
        r6 = r9.toString();
        p000.C0564wm.m6198a(r5, r0, r6);
        goto L_0x02b6;
    L_0x039f:
        r3 = r0;
        goto L_0x02c2;
    L_0x03a2:
        if (r0 != 0) goto L_0x001a;
    L_0x03a4:
        r0 = new wb;
        r1 = "Missing child of resource property element";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x03ae:
        p000.C0564wm.m6204c(r11, r12, r4, r14);
        goto L_0x001a;
    L_0x03b3:
        p000.C0564wm.m6203b(r11, r12, r4, r14);
        goto L_0x001a;
    L_0x03b8:
        r0 = 0;
        goto L_0x0048;
    L_0x03bb:
        r0 = 0;
        goto L_0x0048;
    L_0x03be:
        r0 = 0;
        goto L_0x004a;
    L_0x03c1:
        r0 = 0;
        goto L_0x0040;
    L_0x03c4:
        r0 = 0;
        goto L_0x0040;
    L_0x03c7:
        r0 = 0;
        goto L_0x004a;
    L_0x03ca:
        r0 = new wb;
        r1 = "ParseTypeLiteral property element not allowed";
        r2 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x03d4:
        r0 = new wb;
        r1 = "ParseTypeOther property element not allowed";
        r2 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x03de:
        if (r0 == 0) goto L_0x03ea;
    L_0x03e0:
        r0 = new wb;
        r1 = "Invalid child of resource property element";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x03ea:
        r0 = new wb;
        r1 = "Children of resource property element must be XML elements";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x03f4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.d(wt, ww, org.w3c.dom.Node, boolean):void");
    }

    /* renamed from: c */
    public final void mo11479c(C0530ux c0530ux) {
        C0548vw c0548vw = (C0548vw) this.f9971a.get(c0530ux);
        if (c0548vw != null) {
            c0548vw.f9941a &= -2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* renamed from: d */
    public final void mo11480d(p000.C0530ux r5) {
        /*
        r4 = this;
        r0 = r4.f9972b;
        r0 = r0.mo8631c();
        r0 = r0 + -1;
    L_0x0008:
        if (r0 < 0) goto L_0x0028;
    L_0x000a:
        r1 = r4.f9972b;
        r1 = r1.mo8628b(r0);
        if (r5 == r1) goto L_0x0015;
    L_0x0012:
        r0 = r0 + -1;
        goto L_0x0008;
    L_0x0015:
        r1 = r4.f9972b;
        r2 = r1.f7486d;
        r2 = r2[r0];
        r3 = p000.C0291in.f7483a;
        if (r2 == r3) goto L_0x0028;
    L_0x001f:
        r2 = r1.f7486d;
        r3 = p000.C0291in.f7483a;
        r2[r0] = r3;
        r0 = 1;
        r1.f7484b = r0;
    L_0x0028:
        r0 = r4.f9971a;
        r0 = r0.remove(r5);
        r0 = (p000.C0548vw) r0;
        if (r0 == 0) goto L_0x0035;
    L_0x0032:
        p000.C0548vw.m6136a(r0);
    L_0x0035:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.d(ux):void");
    }
}

package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: xb */
public final class C0575xb {
    /* renamed from: g */
    private static final Set f10001g = new HashSet(Arrays.asList(new String[]{"xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"}));
    /* renamed from: a */
    public C0776wt f10002a;
    /* renamed from: b */
    public C0562wk f10003b;
    /* renamed from: c */
    public OutputStreamWriter f10004c;
    /* renamed from: d */
    public C0783xk f10005d;
    /* renamed from: e */
    public int f10006e = 1;
    /* renamed from: f */
    public int f10007f;

    /* renamed from: a */
    private final void m6281a(String str, boolean z) {
        mo11519a(C0567wp.m6220a(str, z));
    }

    /* renamed from: a */
    private static boolean m6282a(C0570ww c0570ww) {
        if (c0570ww.mo11507g() || c0570ww.mo11503d().mo11535b(2) || c0570ww.mo11503d().mo14452b() || "[]".equals(c0570ww.f9988a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m6280a(String str, String str2, Set set, int i) {
        Object obj = null;
        if (str2 == null) {
            C0566wo c0566wo = new C0566wo(str);
            String str3 = c0566wo.f9975a;
            if (str3 != null && str3.length() > 0) {
                obj = 1;
            }
            if (obj != null) {
                str = c0566wo.f9975a;
                str2 = C0557we.f9955a.mo11462c(String.valueOf(str).concat(":"));
                m6280a(str, str2, set, i);
            } else {
                return;
            }
        }
        if (!set.contains(str)) {
            mo11517a();
            mo11526c(i);
            mo11519a("xmlns:");
            mo11519a(str);
            mo11519a("=\"");
            mo11519a(str2);
            mo11518a(34);
            set.add(str);
        }
    }

    /* renamed from: a */
    public final void mo11520a(C0570ww c0570ww, Set set, int i) {
        Iterator h;
        if (c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            String str = c0570ww.f9989b;
            m6280a(str.substring(0, str.length() - 1), c0570ww.f9988a, set, i);
        } else if (c0570ww.mo11503d().mo11535b(256)) {
            h = c0570ww.mo11508h();
            while (h.hasNext()) {
                m6280a(((C0570ww) h.next()).f9988a, null, set, i);
            }
        }
        h = c0570ww.mo11508h();
        while (h.hasNext()) {
            mo11520a((C0570ww) h.next(), set, i);
        }
        h = c0570ww.mo11509i();
        while (h.hasNext()) {
            C0570ww c0570ww2 = (C0570ww) h.next();
            m6280a(c0570ww2.f9988a, null, set, i);
            mo11520a(c0570ww2, set, i);
        }
    }

    /* renamed from: b */
    private final void m6283b(C0570ww c0570ww, boolean z, int i) {
        if (z || c0570ww.mo11506f()) {
            String str;
            mo11526c(i);
            if (z) {
                str = "<rdf:";
            } else {
                str = "</rdf:";
            }
            mo11519a(str);
            if (c0570ww.mo11503d().mo11535b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
                mo11519a("Alt");
            } else if (c0570ww.mo11503d().mo11535b(1024)) {
                mo11519a("Seq");
            } else {
                mo11519a("Bag");
            }
            if (!z || c0570ww.mo11506f()) {
                mo11519a(">");
            } else {
                mo11519a("/>");
            }
            mo11517a();
        }
    }

    /* renamed from: a */
    public final boolean mo11522a(C0570ww c0570ww, int i) {
        Iterator h = c0570ww.mo11508h();
        boolean z = true;
        while (h.hasNext()) {
            C0570ww c0570ww2 = (C0570ww) h.next();
            if (C0575xb.m6282a(c0570ww2)) {
                mo11517a();
                mo11526c(i);
                mo11519a(c0570ww2.f9988a);
                mo11519a("=\"");
                m6281a(c0570ww2.f9989b, true);
                mo11518a(34);
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo11525b(C0570ww c0570ww, int i) {
        Iterator h = c0570ww.mo11508h();
        while (h.hasNext()) {
            C0570ww c0570ww2 = (C0570ww) h.next();
            if (!C0575xb.m6282a(c0570ww2)) {
                String str;
                Object obj;
                boolean z;
                boolean z2;
                String str2 = c0570ww2.f9988a;
                if ("[]".equals(str2)) {
                    str = "rdf:li";
                } else {
                    str = str2;
                }
                mo11526c(i);
                mo11518a(60);
                mo11519a(str);
                Iterator i2 = c0570ww2.mo11509i();
                Object obj2 = null;
                boolean z3 = false;
                while (true) {
                    obj = obj2;
                    z = z3;
                    if (!i2.hasNext()) {
                        break;
                    }
                    C0570ww c0570ww3 = (C0570ww) i2.next();
                    if (f10001g.contains(c0570ww3.f9988a)) {
                        z = "rdf:resource".equals(c0570ww3.f9988a);
                        mo11518a(32);
                        mo11519a(c0570ww3.f9988a);
                        mo11519a("=\"");
                        m6281a(c0570ww3.f9989b, true);
                        mo11518a(34);
                    } else {
                        obj = 1;
                    }
                    z3 = z;
                    obj2 = obj;
                }
                int i3;
                Object obj3;
                if (obj != null) {
                    mo11519a(" rdf:parseType=\"Resource\">");
                    mo11517a();
                    i3 = i + 1;
                    mo11521a(c0570ww2, true, i3);
                    Iterator i4 = c0570ww2.mo11509i();
                    while (i4.hasNext()) {
                        mo11521a((C0570ww) i4.next(), false, i3);
                    }
                    z3 = true;
                    z2 = true;
                } else if (!c0570ww2.mo11503d().mo14452b()) {
                    Boolean bool;
                    Boolean bool2 = Boolean.TRUE;
                    Boolean bool3 = Boolean.TRUE;
                    Boolean bool4;
                    if (c0570ww2.mo11503d().mo11535b(2)) {
                        mo11519a(" rdf:resource=\"");
                        m6281a(c0570ww2.f9989b, true);
                        mo11519a("\"/>");
                        mo11517a();
                        bool4 = bool3;
                        obj3 = Boolean.FALSE;
                        bool = bool4;
                    } else {
                        String str3 = c0570ww2.f9989b;
                        if (str3 == null || str3.length() == 0) {
                            mo11519a("/>");
                            mo11517a();
                            bool4 = bool3;
                            bool3 = Boolean.FALSE;
                            bool = bool4;
                        } else {
                            mo11518a(62);
                            m6281a(c0570ww2.f9989b, false);
                            bool = Boolean.FALSE;
                            bool3 = bool2;
                        }
                    }
                    Object[] objArr = new Object[]{obj3, bool};
                    z3 = ((Boolean) objArr[0]).booleanValue();
                    z2 = ((Boolean) objArr[1]).booleanValue();
                } else if (c0570ww2.mo11503d().mo11535b(512)) {
                    mo11518a(62);
                    mo11517a();
                    i3 = i + 1;
                    m6283b(c0570ww2, true, i3);
                    if (c0570ww2.mo11503d().mo11535b(4096)) {
                        C0572wy.m6272b(c0570ww2);
                    }
                    mo11525b(c0570ww2, i + 2);
                    m6283b(c0570ww2, false, i3);
                    z3 = true;
                    z2 = true;
                } else {
                    Iterator h2 = c0570ww2.mo11508h();
                    obj = null;
                    obj3 = null;
                    while (true) {
                        Object obj4 = obj;
                        obj = obj3;
                        if (!h2.hasNext()) {
                            obj3 = obj;
                            obj = obj4;
                            break;
                        }
                        boolean a = C0575xb.m6282a((C0570ww) h2.next());
                        if (a) {
                            obj3 = obj;
                        } else {
                            obj3 = 1;
                        }
                        if (a) {
                            obj = 1;
                        } else {
                            obj = obj4;
                        }
                        if (obj != null) {
                            if (obj3 != null) {
                                break;
                            }
                        }
                    }
                    if (!z || obj3 == null) {
                        if (!c0570ww2.mo11506f()) {
                            mo11519a(" rdf:parseType=\"Resource\"/>");
                            mo11517a();
                            z2 = false;
                        } else if (obj3 == null) {
                            mo11522a(c0570ww2, i + 1);
                            mo11519a("/>");
                            mo11517a();
                            z2 = false;
                        } else if (obj == null) {
                            mo11519a(" rdf:parseType=\"Resource\">");
                            mo11517a();
                            mo11525b(c0570ww2, i + 1);
                            z2 = true;
                        } else {
                            mo11518a(62);
                            mo11517a();
                            i3 = i + 1;
                            mo11526c(i3);
                            mo11519a("<rdf:Description");
                            mo11522a(c0570ww2, i + 2);
                            mo11519a(">");
                            mo11517a();
                            mo11525b(c0570ww2, i3);
                            mo11526c(i3);
                            mo11519a("</rdf:Description>");
                            mo11517a();
                            z2 = true;
                        }
                        z3 = z2;
                        z2 = true;
                    } else {
                        throw new C0554wb("Can't mix rdf:resource qualifier and element fields", 202);
                    }
                }
                if (z3) {
                    if (z2) {
                        mo11526c(i);
                    }
                    mo11519a("</");
                    mo11519a(str);
                    mo11518a(62);
                    mo11517a();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* renamed from: a */
    public final void mo11521a(p000.C0570ww r8, boolean r9, int r10) {
        /*
        r7 = this;
        r0 = r8.f9988a;
        if (r9 == 0) goto L_0x01d1;
    L_0x0004:
        r0 = "rdf:value";
        r1 = r0;
    L_0x0007:
        r7.mo11526c(r10);
        r0 = 60;
        r7.mo11518a(r0);
        r7.mo11519a(r1);
        r4 = r8.mo11509i();
        r2 = 0;
        r0 = 0;
        r3 = r2;
        r2 = r0;
    L_0x001a:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0060;
    L_0x0020:
        r0 = r4.next();
        r0 = (p000.C0570ww) r0;
        r5 = f10001g;
        r6 = r0.f9988a;
        r5 = r5.contains(r6);
        if (r5 == 0) goto L_0x005c;
    L_0x0030:
        r2 = "rdf:resource";
        r5 = r0.f9988a;
        r2 = r2.equals(r5);
        if (r9 != 0) goto L_0x0059;
    L_0x003a:
        r5 = 32;
        r7.mo11518a(r5);
        r5 = r0.f9988a;
        r7.mo11519a(r5);
        r5 = "=\"";
        r7.mo11519a(r5);
        r0 = r0.f9989b;
        r5 = 1;
        r7.m6281a(r0, r5);
        r0 = 34;
        r7.mo11518a(r0);
        r0 = r2;
        r2 = r3;
    L_0x0056:
        r3 = r2;
        r2 = r0;
        goto L_0x001a;
    L_0x0059:
        r0 = r2;
        r2 = r3;
        goto L_0x0056;
    L_0x005c:
        r3 = 1;
        r0 = r2;
        r2 = r3;
        goto L_0x0056;
    L_0x0060:
        if (r3 == 0) goto L_0x00bb;
    L_0x0062:
        if (r9 != 0) goto L_0x00bb;
    L_0x0064:
        if (r2 == 0) goto L_0x0070;
    L_0x0066:
        r0 = new wb;
        r1 = "Can't mix rdf:resource and general qualifiers";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x0070:
        r0 = " rdf:parseType=\"Resource\">";
        r7.mo11519a(r0);
        r7.mo11517a();
        r2 = r10 + 1;
        r0 = 1;
        r7.mo11521a(r8, r0, r2);
        r3 = r8.mo11509i();
    L_0x0082:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00a1;
    L_0x0088:
        r0 = r3.next();
        r0 = (p000.C0570ww) r0;
        r4 = f10001g;
        r5 = r0.f9988a;
        r4 = r4.contains(r5);
        if (r4 != 0) goto L_0x0082;
    L_0x0098:
        r4 = 0;
        r7.mo11521a(r0, r4, r2);
        goto L_0x0082;
    L_0x009d:
        r0 = 0;
        r7.m6283b(r8, r0, r2);
    L_0x00a1:
        r2 = 1;
        r0 = 1;
    L_0x00a3:
        if (r2 == 0) goto L_0x00ba;
    L_0x00a5:
        if (r0 == 0) goto L_0x00aa;
    L_0x00a7:
        r7.mo11526c(r10);
    L_0x00aa:
        r0 = "</";
        r7.mo11519a(r0);
        r7.mo11519a(r1);
        r0 = 62;
        r7.mo11518a(r0);
        r7.mo11517a();
    L_0x00ba:
        return;
    L_0x00bb:
        r0 = r8.mo11503d();
        r0 = r0.mo14452b();
        if (r0 != 0) goto L_0x010b;
    L_0x00c5:
        r0 = r8.mo11503d();
        r2 = 2;
        r0 = r0.mo11535b(r2);
        if (r0 == 0) goto L_0x00e6;
    L_0x00d0:
        r0 = " rdf:resource=\"";
        r7.mo11519a(r0);
        r0 = r8.f9989b;
        r2 = 1;
        r7.m6281a(r0, r2);
        r0 = "\"/>";
        r7.mo11519a(r0);
        r7.mo11517a();
        r2 = 0;
        r0 = 1;
        goto L_0x00a3;
    L_0x00e6:
        r0 = r8.f9989b;
        if (r0 == 0) goto L_0x00f2;
    L_0x00ea:
        r2 = "";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x00fd;
    L_0x00f2:
        r0 = "/>";
        r7.mo11519a(r0);
        r7.mo11517a();
        r2 = 0;
        r0 = 1;
        goto L_0x00a3;
    L_0x00fd:
        r0 = 62;
        r7.mo11518a(r0);
        r0 = r8.f9989b;
        r2 = 0;
        r7.m6281a(r0, r2);
        r2 = 1;
        r0 = 0;
        goto L_0x00a3;
    L_0x010b:
        r0 = r8.mo11503d();
        r3 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r0.mo11535b(r3);
        if (r0 == 0) goto L_0x014b;
    L_0x0117:
        r0 = 62;
        r7.mo11518a(r0);
        r7.mo11517a();
        r2 = r10 + 1;
        r0 = 1;
        r7.m6283b(r8, r0, r2);
        r0 = r8.mo11503d();
        r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r0.mo11535b(r3);
        if (r0 == 0) goto L_0x0134;
    L_0x0131:
        p000.C0572wy.m6272b(r8);
    L_0x0134:
        r3 = r8.mo11508h();
    L_0x0138:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x009d;
    L_0x013e:
        r0 = r3.next();
        r0 = (p000.C0570ww) r0;
        r4 = 0;
        r5 = r10 + 2;
        r7.mo11521a(r0, r4, r5);
        goto L_0x0138;
    L_0x014b:
        if (r2 != 0) goto L_0x0182;
    L_0x014d:
        r0 = r8.mo11506f();
        if (r0 != 0) goto L_0x015f;
    L_0x0153:
        r0 = " rdf:parseType=\"Resource\"/>";
        r7.mo11519a(r0);
        r7.mo11517a();
        r2 = 0;
        r0 = 1;
        goto L_0x00a3;
    L_0x015f:
        r0 = " rdf:parseType=\"Resource\">";
        r7.mo11519a(r0);
        r7.mo11517a();
        r2 = r8.mo11508h();
    L_0x016b:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x017e;
    L_0x0171:
        r0 = r2.next();
        r0 = (p000.C0570ww) r0;
        r3 = 0;
        r4 = r10 + 1;
        r7.mo11521a(r0, r3, r4);
        goto L_0x016b;
    L_0x017e:
        r2 = 1;
        r0 = 1;
        goto L_0x00a3;
    L_0x0182:
        r2 = r8.mo11508h();
    L_0x0186:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x01c5;
    L_0x018c:
        r0 = r2.next();
        r0 = (p000.C0570ww) r0;
        r3 = p000.C0575xb.m6282a(r0);
        if (r3 != 0) goto L_0x01a2;
    L_0x0198:
        r0 = new wb;
        r1 = "Can't mix rdf:resource and complex fields";
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r0.<init>(r1, r2);
        throw r0;
    L_0x01a2:
        r7.mo11517a();
        r3 = r10 + 1;
        r7.mo11526c(r3);
        r3 = 32;
        r7.mo11518a(r3);
        r3 = r0.f9988a;
        r7.mo11519a(r3);
        r3 = "=\"";
        r7.mo11519a(r3);
        r0 = r0.f9989b;
        r3 = 1;
        r7.m6281a(r0, r3);
        r0 = 34;
        r7.mo11518a(r0);
        goto L_0x0186;
    L_0x01c5:
        r0 = "/>";
        r7.mo11519a(r0);
        r7.mo11517a();
        r2 = 0;
        r0 = 1;
        goto L_0x00a3;
    L_0x01d1:
        r1 = "[]";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x01de;
    L_0x01d9:
        r0 = "rdf:li";
        r1 = r0;
        goto L_0x0007;
    L_0x01de:
        r1 = r0;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.a(ww, boolean, int):void");
    }

    /* renamed from: a */
    public final void mo11518a(int i) {
        this.f10004c.write(i);
    }

    /* renamed from: a */
    public final void mo11519a(String str) {
        this.f10004c.write(str);
    }

    /* renamed from: b */
    public final void mo11524b(int i) {
        while (i > 0) {
            this.f10004c.write(32);
            i--;
        }
    }

    /* renamed from: c */
    public final void mo11526c(int i) {
        for (int i2 = this.f10005d.f22374e + i; i2 > 0; i2--) {
            this.f10004c.write(this.f10005d.f22373d);
        }
    }

    /* renamed from: a */
    public final void mo11517a() {
        this.f10004c.write(this.f10005d.f22372c);
    }

    /* renamed from: b */
    public final void mo11523b() {
        mo11518a(34);
        String str = this.f10002a.f22365a.f9988a;
        if (str != null) {
            m6281a(str, true);
        }
        mo11518a(34);
    }
}

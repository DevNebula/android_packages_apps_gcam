package p000;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: wz */
public final class C0573wz {
    /* renamed from: a */
    private static Map f10000a = new HashMap();

    static {
        C0782xj c0782xj = new C0782xj();
        c0782xj.mo14453c();
        f10000a.put("dc:contributor", c0782xj);
        f10000a.put("dc:language", c0782xj);
        f10000a.put("dc:publisher", c0782xj);
        f10000a.put("dc:relation", c0782xj);
        f10000a.put("dc:subject", c0782xj);
        f10000a.put("dc:type", c0782xj);
        c0782xj = new C0782xj();
        c0782xj.mo14453c();
        c0782xj.mo14458f();
        f10000a.put("dc:creator", c0782xj);
        f10000a.put("dc:date", c0782xj);
        c0782xj = new C0782xj();
        c0782xj.mo14453c();
        c0782xj.mo14458f();
        c0782xj.mo14457e();
        c0782xj.mo14455d();
        f10000a.put("dc:description", c0782xj);
        f10000a.put("dc:rights", c0782xj);
        f10000a.put("dc:title", c0782xj);
    }

    /* renamed from: a */
    private static void m6279a(C0570ww c0570ww, C0570ww c0570ww2, boolean z) {
        if (!c0570ww.f9989b.equals(c0570ww2.f9989b) || c0570ww.mo11499c() != c0570ww2.mo11499c()) {
            throw new C0554wb("Mismatch between alias and base nodes", 203);
        } else if (z || (c0570ww.f9988a.equals(c0570ww2.f9988a) && c0570ww.mo11503d().equals(c0570ww2.mo11503d()) && c0570ww.mo11505e() == c0570ww2.mo11505e())) {
            Iterator h = c0570ww.mo11508h();
            Iterator h2 = c0570ww2.mo11508h();
            while (h.hasNext() && h2.hasNext()) {
                C0573wz.m6279a((C0570ww) h.next(), (C0570ww) h2.next(), false);
            }
            h = c0570ww.mo11509i();
            h2 = c0570ww2.mo11509i();
            while (h.hasNext() && h2.hasNext()) {
                C0573wz.m6279a((C0570ww) h.next(), (C0570ww) h2.next(), false);
            }
        } else {
            throw new C0554wb("Mismatch between alias and base nodes", 203);
        }
    }

    /* renamed from: a */
    static C0556wd m6276a(C0776wt c0776wt, C0781xi c0781xi) {
        C0570ww c0570ww;
        int i;
        C0570ww a;
        C0570ww a2;
        C0570ww a3;
        String str;
        String str2;
        String valueOf;
        String valueOf2;
        C0570ww c0570ww2 = c0776wt.f22365a;
        C0572wy.m6265a(c0570ww2, "http://purl.org/dc/elements/1.1/", null, true);
        Iterator h = c0776wt.f22365a.mo11508h();
        while (h.hasNext()) {
            c0570ww = (C0570ww) h.next();
            if ("http://purl.org/dc/elements/1.1/".equals(c0570ww.f9988a)) {
                int i2 = 1;
                while (true) {
                    i = i2;
                    if (i > c0570ww.mo11499c()) {
                        break;
                    }
                    C0570ww a4 = c0570ww.mo11490a(i);
                    C0782xj c0782xj = (C0782xj) f10000a.get(a4.f9988a);
                    if (c0782xj != null) {
                        if ((a4.mo11503d().f10018a & 768) != 0) {
                            a4.mo11503d().mo11534a(7680, false);
                            a4.mo11503d().mo14450a(c0782xj);
                            if (c0782xj.mo11535b(4096)) {
                                C0573wz.m6278a(a4);
                            }
                        } else {
                            C0570ww c0570ww3 = new C0570ww(a4.f9988a, c0782xj);
                            a4.f9988a = "[]";
                            c0570ww3.mo11494a(a4);
                            c0570ww3.f9990c = c0570ww;
                            c0570ww.mo11495b().set(i - 1, c0570ww3);
                            if (c0782xj.mo11535b(4096) && !a4.mo11503d().mo11535b(64)) {
                                a4.mo11498b(new C0570ww("xml:lang", "x-default", null));
                            }
                        }
                    }
                    i2 = i + 1;
                }
            } else if ("http://ns.adobe.com/exif/1.0/".equals(c0570ww.f9988a)) {
                a = C0572wy.m6266a(c0570ww, "exif:GPSTimeStamp", false);
                if (a != null) {
                    try {
                        C0551vz e = C0509tz.m5949e(a.f9989b);
                        if (e.mo11433i() == 0 && e.mo11426e() == 0 && e.mo11420b() == 0) {
                            a2 = C0572wy.m6266a(c0570ww, "exif:DateTimeOriginal", false);
                            if (a2 == null) {
                                a2 = C0572wy.m6266a(c0570ww, "exif:DateTimeDigitized", false);
                            }
                            C0551vz e2 = C0509tz.m5949e(a2.f9989b);
                            Calendar a5 = e.mo11417a();
                            a5.set(1, e2.mo11433i());
                            a5.set(2, e2.mo11426e());
                            a5.set(5, e2.mo11420b());
                            a.f9989b = C0509tz.m5939a(new C0774wq(a5));
                        }
                    } catch (C0554wb e3) {
                    }
                }
                c0570ww = C0572wy.m6266a(c0570ww, "exif:UserComment", false);
                if (c0570ww != null) {
                    C0573wz.m6278a(c0570ww);
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(c0570ww.f9988a)) {
                a3 = C0572wy.m6266a(c0570ww, "xmpDM:copyright", false);
                if (a3 != null) {
                    try {
                        c0570ww = C0572wy.m6265a(c0776wt.f22365a, "http://purl.org/dc/elements/1.1/", null, true);
                        str = a3.f9989b;
                        str2 = "\n\n";
                        C0570ww a6 = C0572wy.m6266a(c0570ww, "dc:rights", false);
                        if (a6 == null || !a6.mo11506f()) {
                            String str3;
                            valueOf = String.valueOf(str2);
                            String valueOf3 = String.valueOf(str);
                            if (valueOf3.length() == 0) {
                                str3 = new String(valueOf);
                            } else {
                                str3 = valueOf.concat(valueOf3);
                            }
                            c0776wt.mo11444a("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", str3);
                        } else {
                            int a7 = C0572wy.m6264a(a6, "x-default");
                            if (a7 < 0) {
                                C0776wt c0776wt2 = c0776wt;
                                c0776wt2.mo11444a("http://purl.org/dc/elements/1.1/", "rights", "", "x-default", a6.mo11490a(1).f9989b);
                                a7 = C0572wy.m6264a(a6, "x-default");
                            }
                            a2 = a6.mo11490a(a7);
                            valueOf = a2.f9989b;
                            i = valueOf.indexOf(str2);
                            if (i >= 0) {
                                i += 2;
                                if (!valueOf.substring(i).equals(str)) {
                                    valueOf2 = String.valueOf(valueOf.substring(0, i));
                                    valueOf = String.valueOf(str);
                                    if (valueOf.length() == 0) {
                                        valueOf = new String(valueOf2);
                                    } else {
                                        valueOf = valueOf2.concat(valueOf);
                                    }
                                    a2.f9989b = valueOf;
                                }
                            } else if (!str.equals(valueOf)) {
                                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str2).length()) + String.valueOf(str).length());
                                stringBuilder.append(valueOf);
                                stringBuilder.append(str2);
                                stringBuilder.append(str);
                                a2.f9989b = stringBuilder.toString();
                            }
                        }
                        a3.f9990c.mo11500c(a3);
                    } catch (C0554wb e4) {
                    }
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(c0570ww.f9988a)) {
                c0570ww = C0572wy.m6266a(c0570ww, "xmpRights:UsageTerms", false);
                if (c0570ww != null) {
                    C0573wz.m6278a(c0570ww);
                }
            }
        }
        if (c0570ww2.f9995h) {
            c0570ww2.f9995h = false;
            boolean b = c0781xi.mo11535b(4);
            for (C0570ww a22 : Collections.unmodifiableList(new ArrayList(c0570ww2.mo11495b()))) {
                if (a22.f9995h) {
                    Iterator h2 = a22.mo11508h();
                    while (h2.hasNext()) {
                        c0570ww = (C0570ww) h2.next();
                        if (c0570ww.f9996i) {
                            c0570ww.f9996i = false;
                            C0580xl a8 = C0557we.f9955a.mo11460a(c0570ww.f9988a);
                            if (a8 != null) {
                                a3 = C0572wy.m6265a(c0570ww2, a8.mo11541b(), null, true);
                                a3.f9994g = false;
                                str = String.valueOf(a8.mo11542c());
                                valueOf2 = String.valueOf(a8.mo11543d());
                                if (valueOf2.length() == 0) {
                                    valueOf2 = new String(str);
                                } else {
                                    valueOf2 = str.concat(valueOf2);
                                }
                                C0570ww a9 = C0572wy.m6266a(a3, valueOf2, false);
                                if (a9 == null) {
                                    if (a8.mo11540a().mo14447b()) {
                                        str = String.valueOf(a8.mo11542c());
                                        valueOf2 = String.valueOf(a8.mo11543d());
                                        if (valueOf2.length() == 0) {
                                            valueOf2 = new String(str);
                                        } else {
                                            valueOf2 = str.concat(valueOf2);
                                        }
                                        c0570ww.f9988a = valueOf2;
                                        a3.mo11494a(c0570ww);
                                        h2.remove();
                                    } else {
                                        str2 = String.valueOf(a8.mo11542c());
                                        valueOf2 = String.valueOf(a8.mo11543d());
                                        if (valueOf2.length() == 0) {
                                            valueOf2 = new String(str2);
                                        } else {
                                            valueOf2 = str2.concat(valueOf2);
                                        }
                                        a9 = new C0570ww(valueOf2, a8.mo11540a().mo14448c());
                                        a3.mo11494a(a9);
                                        C0573wz.m6277a(h2, c0570ww, a9);
                                    }
                                } else if (a8.mo11540a().mo14447b()) {
                                    if (b) {
                                        C0573wz.m6279a(c0570ww, a9, true);
                                    }
                                    h2.remove();
                                } else {
                                    if (a8.mo11540a().mo11535b(4096)) {
                                        i = C0572wy.m6264a(a9, "x-default");
                                        if (i != -1) {
                                            a = a9.mo11490a(i);
                                        } else {
                                            a = null;
                                        }
                                    } else if (a9.mo11506f()) {
                                        a = a9.mo11490a(1);
                                    } else {
                                        a = null;
                                    }
                                    if (a == null) {
                                        C0573wz.m6277a(h2, c0570ww, a9);
                                    } else {
                                        if (b) {
                                            C0573wz.m6279a(c0570ww, a, true);
                                        }
                                        h2.remove();
                                    }
                                }
                            }
                        }
                    }
                    a22.f9995h = false;
                }
            }
        }
        valueOf = c0570ww2.f9988a;
        if (valueOf != null && valueOf.length() >= 36) {
            valueOf = c0570ww2.f9988a.toLowerCase();
            if (valueOf.startsWith("uuid:")) {
                valueOf = valueOf.substring(5);
            }
            if (C0567wp.m6222a(valueOf)) {
                a22 = C0572wy.m6267a(c0570ww2, C0509tz.m5940a("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                if (a22 != null) {
                    a22.f9993f = null;
                    valueOf = String.valueOf(valueOf);
                    valueOf2 = "uuid:";
                    if (valueOf.length() == 0) {
                        valueOf = new String(valueOf2);
                    } else {
                        valueOf = valueOf2.concat(valueOf);
                    }
                    a22.f9989b = valueOf;
                    a22.f9991d = null;
                    C0782xj d = a22.mo11503d();
                    d.mo14451b(false);
                    d.mo14449a(false);
                    d.mo14454c(false);
                    a22.f9992e = null;
                    c0570ww2.f9988a = null;
                } else {
                    throw new C0554wb("Failure creating xmpMM:InstanceID", 9);
                }
            }
        }
        Iterator h3 = c0570ww2.mo11508h();
        while (h3.hasNext()) {
            if (!((C0570ww) h3.next()).mo11506f()) {
                h3.remove();
            }
        }
        return c0776wt;
    }

    /* renamed from: a */
    private static void m6278a(C0570ww c0570ww) {
        if (c0570ww != null && c0570ww.mo11503d().mo11535b(512)) {
            c0570ww.mo11503d().mo14458f().mo14457e().mo14455d();
            Iterator h = c0570ww.mo11508h();
            while (h.hasNext()) {
                C0570ww c0570ww2 = (C0570ww) h.next();
                if (c0570ww2.mo11503d().mo14452b()) {
                    h.remove();
                } else if (!c0570ww2.mo11503d().mo11535b(64)) {
                    String str = c0570ww2.f9989b;
                    if (str == null || str.length() == 0) {
                        h.remove();
                    } else {
                        c0570ww2.mo11498b(new C0570ww("xml:lang", "x-repair", null));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m6277a(Iterator it, C0570ww c0570ww, C0570ww c0570ww2) {
        if (c0570ww2.mo11503d().mo11535b(4096)) {
            if (c0570ww.mo11503d().mo11535b(64)) {
                throw new C0554wb("Alias to x-default already has a language qualifier", 203);
            }
            c0570ww.mo11498b(new C0570ww("xml:lang", "x-default", null));
        }
        it.remove();
        c0570ww.f9988a = "[]";
        c0570ww2.mo11494a(c0570ww);
    }
}

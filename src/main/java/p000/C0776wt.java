package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wt */
public final class C0776wt implements C0556wd {
    /* renamed from: a */
    public C0570ww f22365a;

    public C0776wt() {
        this.f22365a = new C0570ww(null, null, null);
    }

    private C0776wt(C0570ww c0570ww) {
        this.f22365a = c0570ww;
    }

    /* renamed from: a */
    public final void mo11446a(String str, String str2, C0782xj c0782xj, String str3, C0782xj c0782xj2) {
        C0509tz.m5947c(str);
        C0509tz.m5942a(str2);
        if ((c0782xj.f10018a & -7681) != 0) {
            throw new C0554wb("Only array form flags allowed for arrayOptions", 103);
        }
        C0782xj a = C0572wy.m6268a(c0782xj, null);
        C0577xd a2 = C0509tz.m5940a(str, str2);
        C0570ww a3 = C0572wy.m6267a(this.f22365a, a2, false, null);
        if (a3 != null) {
            if (!a3.mo11503d().mo11535b(512)) {
                throw new C0554wb("The named property is not an array", 102);
            }
        } else if (a.mo11535b(512)) {
            a3 = C0572wy.m6267a(this.f22365a, a2, true, a);
            if (a3 == null) {
                throw new C0554wb("Failure creating array node", 102);
            }
        } else {
            throw new C0554wb("Explicit arrayOptions required to create new array", 103);
        }
        C0570ww c0570ww = new C0570ww("[]", null);
        C0782xj a4 = C0572wy.m6268a(c0782xj2, (Object) str3);
        int c = a3.mo11499c() + 1;
        if (c > 0) {
            a3.mo11493a(c, c0570ww);
            C0776wt.m14736a(c0570ww, (Object) str3, a4);
            return;
        }
        throw new C0554wb("Array index out of bounds", 104);
    }

    public final Object clone() {
        return new C0776wt((C0570ww) this.f22365a.clone());
    }

    /* renamed from: a */
    public final void mo11439a(String str, String str2) {
        try {
            C0509tz.m5947c(str);
            C0509tz.m5946b(str2);
            C0570ww a = C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, str2), false, null);
            if (a != null) {
                C0572wy.m6269a(a);
            }
        } catch (C0554wb e) {
        }
    }

    /* renamed from: b */
    public final boolean mo11449b(String str, String str2) {
        try {
            C0509tz.m5947c(str);
            C0509tz.m5946b(str2);
            if (C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, str2), false, null) != null) {
                return true;
            }
            return false;
        } catch (C0554wb e) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m14735a(int i, C0570ww c0570ww) {
        Object obj = c0570ww.f9989b;
        switch (i) {
            case 1:
                return new Boolean(C0509tz.m5948d(obj));
            case 2:
                return new Integer(C0509tz.m5951g(obj));
            case 3:
                return new Long(C0509tz.m5952h(obj));
            case 4:
                return new Double(C0509tz.m5950f(obj));
            case 5:
                return C0509tz.m5949e(obj);
            case 6:
                return C0509tz.m5949e(obj).mo11417a();
            case 7:
                return C0509tz.m5953i(obj);
            default:
                if (obj != null || c0570ww.mo11503d().mo14452b()) {
                    return obj;
                }
                return "";
        }
    }

    /* renamed from: c */
    public final C0581xm mo11450c(String str, String str2) {
        C0509tz.m5947c(str);
        C0509tz.m5942a(str2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 13);
        stringBuilder.append(str2);
        stringBuilder.append('[');
        stringBuilder.append(1);
        stringBuilder.append(']');
        String stringBuilder2 = stringBuilder.toString();
        C0509tz.m5947c(str);
        C0509tz.m5946b(stringBuilder2);
        C0570ww a = C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, stringBuilder2), false, null);
        if (a != null) {
            return new C0777wu(C0776wt.m14735a(0, a));
        }
        return null;
    }

    /* renamed from: d */
    public final C0581xm mo11452d(String str, String str2) {
        C0509tz.m5947c(str);
        C0509tz.m5946b(str2);
        C0570ww a = C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, str2), false, null);
        if (a != null) {
            return new C0777wu(C0776wt.m14735a(0, a));
        }
        return null;
    }

    /* renamed from: e */
    public final byte[] mo11453e(String str, String str2) {
        return (byte[]) m14737b(str, str2, 7);
    }

    /* renamed from: f */
    public final Boolean mo11454f(String str, String str2) {
        return (Boolean) m14737b(str, str2, 1);
    }

    /* renamed from: g */
    public final Calendar mo11455g(String str, String str2) {
        return (Calendar) m14737b(str, str2, 6);
    }

    /* renamed from: h */
    public final Double mo11456h(String str, String str2) {
        return (Double) m14737b(str, str2, 4);
    }

    /* renamed from: i */
    public final Integer mo11457i(String str, String str2) {
        return (Integer) m14737b(str, str2, 2);
    }

    /* renamed from: b */
    private final Object m14737b(String str, String str2, int i) {
        C0509tz.m5947c(str);
        C0509tz.m5946b(str2);
        C0570ww a = C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, str2), false, null);
        if (a == null) {
            return null;
        }
        if (i == 0 || !a.mo11503d().mo14452b()) {
            return C0776wt.m14735a(i, a);
        }
        throw new C0554wb("Property must be simple when a value type is requested", 102);
    }

    /* renamed from: j */
    public final String mo11458j(String str, String str2) {
        return (String) m14737b(str, str2, 0);
    }

    /* renamed from: a */
    public final C0555wc mo11438a() {
        return new C0555wc(this);
    }

    /* renamed from: a */
    public final void mo11444a(String str, String str2, String str3, String str4, String str5) {
        C0509tz.m5947c(str);
        C0509tz.m5942a(str2);
        if (str4.length() == 0) {
            throw new C0554wb("Empty specific language", 4);
        }
        String d = C0567wp.m6227d(str3);
        String d2 = C0567wp.m6227d(str4);
        C0570ww a = C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, str2), true, new C0782xj(7680));
        if (a == null) {
            throw new C0554wb("Failed to find or create array node", 102);
        }
        C0570ww c0570ww;
        Object obj;
        C0570ww c0570ww2;
        if (!a.mo11503d().mo11535b(4096)) {
            if (a.mo11506f() || !a.mo11503d().mo11535b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
                throw new C0554wb("Specified property is no alt-text array", 102);
            }
            a.mo11503d().mo14455d();
        }
        Iterator h = a.mo11508h();
        while (h.hasNext()) {
            c0570ww = (C0570ww) h.next();
            if (c0570ww.mo11507g() && "xml:lang".equals(c0570ww.mo11496b(1).f9988a)) {
                if ("x-default".equals(c0570ww.mo11496b(1).f9989b)) {
                    obj = 1;
                    c0570ww2 = c0570ww;
                    break;
                }
            }
            throw new C0554wb("Language qualifier must be first", 102);
        }
        obj = null;
        c0570ww2 = null;
        if (c0570ww2 != null && a.mo11499c() > 1) {
            a.mo11500c(c0570ww2);
            a.mo11493a(1, c0570ww2);
        }
        if (a.mo11503d().mo11535b(4096)) {
            int i;
            Object obj2;
            Object[] objArr;
            Object obj3;
            if (a.mo11506f()) {
                Iterator h2 = a.mo11508h();
                i = 0;
                obj2 = null;
                c0570ww = null;
                while (true) {
                    int i2 = i;
                    Object obj4 = obj2;
                    C0570ww c0570ww3 = c0570ww;
                    if (h2.hasNext()) {
                        c0570ww = (C0570ww) h2.next();
                        if (c0570ww.mo11503d().mo14452b()) {
                            throw new C0554wb("Alt-text array item is not simple", 102);
                        } else if (c0570ww.mo11507g() && "xml:lang".equals(c0570ww.mo11496b(1).f9988a)) {
                            String str6 = c0570ww.mo11496b(1).f9989b;
                            if (d2.equals(str6)) {
                                objArr = new Object[]{new Integer(1), c0570ww};
                                break;
                            }
                            if (d != null && str6.startsWith(d)) {
                                if (obj4 == null) {
                                    obj4 = c0570ww;
                                }
                                i2++;
                                c0570ww = c0570ww3;
                            } else if (!"x-default".equals(str6)) {
                                c0570ww = c0570ww3;
                            }
                            obj2 = obj4;
                            i = i2;
                        }
                    } else if (i2 == 1) {
                        objArr = new Object[]{new Integer(2), obj4};
                    } else if (i2 > 1) {
                        objArr = new Object[]{new Integer(3), obj4};
                    } else if (c0570ww3 != null) {
                        objArr = new Object[]{new Integer(4), c0570ww3};
                    } else {
                        objArr = new Object[]{new Integer(5), a.mo11490a(1)};
                    }
                }
                throw new C0554wb("Alt-text array item has no language qualifier", 102);
            }
            objArr = new Object[]{new Integer(0), null};
            i = ((Integer) objArr[0]).intValue();
            c0570ww = (C0570ww) objArr[1];
            boolean equals = "x-default".equals(d2);
            switch (i) {
                case 0:
                    C0572wy.m6270a(a, "x-default", str5);
                    if (!equals) {
                        C0572wy.m6270a(a, d2, str5);
                        obj3 = 1;
                        break;
                    }
                    obj3 = 1;
                    break;
                case 1:
                    if (!equals) {
                        if (!(obj == null || c0570ww2 == c0570ww || c0570ww2 == null || !c0570ww2.f9989b.equals(c0570ww.f9989b))) {
                            c0570ww2.f9989b = str5;
                        }
                        c0570ww.f9989b = str5;
                        obj3 = obj;
                        break;
                    }
                    Iterator h3 = a.mo11508h();
                    while (h3.hasNext()) {
                        c0570ww = (C0570ww) h3.next();
                        if (c0570ww != c0570ww2) {
                            String str7 = c0570ww.f9989b;
                            if (c0570ww2 == null) {
                                obj2 = null;
                            } else {
                                obj2 = c0570ww2.f9989b;
                            }
                            if (str7.equals(obj2)) {
                                c0570ww.f9989b = str5;
                            }
                        }
                    }
                    if (c0570ww2 == null) {
                        obj3 = obj;
                        break;
                    }
                    c0570ww2.f9989b = str5;
                    obj3 = obj;
                    break;
                case 2:
                    if (!(obj == null || c0570ww2 == c0570ww || c0570ww2 == null || !c0570ww2.f9989b.equals(c0570ww.f9989b))) {
                        c0570ww2.f9989b = str5;
                    }
                    c0570ww.f9989b = str5;
                    obj3 = obj;
                    break;
                case 3:
                    C0572wy.m6270a(a, d2, str5);
                    if (!equals) {
                        obj3 = obj;
                        break;
                    } else {
                        obj3 = 1;
                        break;
                    }
                case 4:
                    if (c0570ww2 != null && a.mo11499c() == 1) {
                        c0570ww2.f9989b = str5;
                    }
                    C0572wy.m6270a(a, d2, str5);
                    obj3 = obj;
                    break;
                case 5:
                    C0572wy.m6270a(a, d2, str5);
                    if (!equals) {
                        obj3 = obj;
                        break;
                    } else {
                        obj3 = 1;
                        break;
                    }
                default:
                    throw new C0554wb("Unexpected result from ChooseLocalizedText", 9);
            }
            if (obj3 == null && a.mo11499c() == 1) {
                C0572wy.m6270a(a, "x-default", str5);
                return;
            }
            return;
        }
        throw new C0554wb("Localized text array is not alt-text", 102);
    }

    /* renamed from: a */
    private static void m14736a(C0570ww c0570ww, Object obj, C0782xj c0782xj) {
        String str = null;
        c0570ww.mo11503d().mo14450a(c0782xj);
        if (!c0570ww.mo11503d().mo14452b()) {
            String valueOf = obj != null ? obj instanceof Boolean ? !((Boolean) obj).booleanValue() ? "False" : "True" : obj instanceof Integer ? String.valueOf(((Integer) obj).intValue()) : obj instanceof Long ? String.valueOf(((Long) obj).longValue()) : obj instanceof Double ? String.valueOf(((Double) obj).doubleValue()) : obj instanceof C0551vz ? C0509tz.m5939a((C0551vz) obj) : obj instanceof GregorianCalendar ? C0509tz.m5939a(C0553wa.m6159a((GregorianCalendar) obj)) : obj instanceof byte[] ? new String(C0560wi.m6192b((byte[]) obj)) : obj.toString() : null;
            if (valueOf != null) {
                str = C0567wp.m6228e(valueOf);
            }
            if (c0570ww.mo11503d().mo11535b(32) && "xml:lang".equals(c0570ww.f9988a)) {
                c0570ww.f9989b = C0567wp.m6227d(str);
            } else {
                c0570ww.f9989b = str;
            }
        } else if (obj == null || obj.toString().length() <= 0) {
            c0570ww.f9991d = null;
        } else {
            throw new C0554wb("Composite nodes can't have values", 102);
        }
    }

    /* renamed from: a */
    public final void mo11442a(String str, String str2, Object obj) {
        mo11443a(str, str2, obj, null);
    }

    /* renamed from: a */
    public final void mo11443a(String str, String str2, Object obj, C0782xj c0782xj) {
        C0509tz.m5947c(str);
        C0509tz.m5946b(str2);
        C0782xj a = C0572wy.m6268a(c0782xj, obj);
        C0570ww a2 = C0572wy.m6267a(this.f22365a, C0509tz.m5940a(str, str2), true, a);
        if (a2 != null) {
            C0776wt.m14736a(a2, obj, a);
            return;
        }
        throw new C0554wb("Specified property does not exist", 102);
    }

    /* renamed from: a */
    public final void mo11448a(String str, String str2, byte[] bArr) {
        mo11443a(str, str2, bArr, null);
    }

    /* renamed from: a */
    public final void mo11447a(String str, String str2, boolean z) {
        Object obj;
        if (z) {
            obj = "True";
        } else {
            obj = "False";
        }
        mo11443a(str, str2, obj, null);
    }

    /* renamed from: a */
    public final void mo11445a(String str, String str2, C0551vz c0551vz) {
        mo11443a(str, str2, c0551vz, null);
    }

    /* renamed from: a */
    public final void mo11440a(String str, String str2, double d) {
        mo11443a(str, str2, new Double(d), null);
    }

    /* renamed from: a */
    public final void mo11441a(String str, String str2, int i) {
        mo11443a(str, str2, new Integer(i), null);
    }
}

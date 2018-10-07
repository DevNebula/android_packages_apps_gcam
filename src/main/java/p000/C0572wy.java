package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.refocus.processing.DepthmapTask;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wy */
public final class C0572wy {
    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9999a;

    public C0572wy(RecyclerView recyclerView) {
        this.f9999a = recyclerView;
    }

    /* renamed from: a */
    static void m6270a(C0570ww c0570ww, String str, String str2) {
        C0570ww c0570ww2 = new C0570ww("[]", str2, null);
        C0570ww c0570ww3 = new C0570ww("xml:lang", str, null);
        c0570ww2.mo11498b(c0570ww3);
        if ("x-default".equals(c0570ww3.f9989b)) {
            c0570ww.mo11493a(1, c0570ww2);
        } else {
            c0570ww.mo11494a(c0570ww2);
        }
    }

    /* renamed from: a */
    static void m6269a(C0570ww c0570ww) {
        C0570ww c0570ww2 = c0570ww.f9990c;
        if (c0570ww.mo11503d().mo11535b(32)) {
            c0570ww2.mo11504d(c0570ww);
        } else {
            c0570ww2.mo11500c(c0570ww);
        }
        if (!c0570ww2.mo11506f() && c0570ww2.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE)) {
            c0570ww2.f9990c.mo11500c(c0570ww2);
        }
    }

    /* renamed from: a */
    static C0570ww m6266a(C0570ww c0570ww, String str, boolean z) {
        if (!(c0570ww.mo11503d().mo11535b(kvl.UNSET_ENUM_VALUE) || c0570ww.mo11503d().mo11535b(256))) {
            if (!c0570ww.f9994g) {
                throw new C0554wb("Named children only allowed for schemas and structs", 102);
            } else if (c0570ww.mo11503d().mo11535b(512)) {
                throw new C0554wb("Named children not allowed for arrays", 102);
            } else if (z) {
                c0570ww.mo11503d().mo14456d(true);
            }
        }
        C0570ww a = c0570ww.mo11491a(str);
        if (a != null || !z) {
            return a;
        }
        a = new C0570ww(str, new C0782xj());
        a.f9994g = true;
        c0570ww.mo11494a(a);
        return a;
    }

    /* renamed from: b */
    private static int m6271b(C0570ww c0570ww, String str, boolean z) {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt <= 0) {
                throw new C0554wb("Array index must be larger than zero", 102);
            }
            if (z && parseInt == c0570ww.mo11499c() + 1) {
                C0570ww c0570ww2 = new C0570ww("[]", null);
                c0570ww2.f9994g = true;
                c0570ww.mo11494a(c0570ww2);
            }
            return parseInt;
        } catch (NumberFormatException e) {
            throw new C0554wb("Array index not digits.", 102);
        }
    }

    /* renamed from: a */
    public static C0570ww m6267a(C0570ww c0570ww, C0577xd c0577xd, boolean z, C0782xj c0782xj) {
        if (c0577xd == null || c0577xd.mo11527a() == 0) {
            throw new C0554wb("Empty XMPPath", 102);
        }
        C0570ww a = C0572wy.m6265a(c0570ww, c0577xd.mo11528a(0).f10014a, null, z);
        if (a == null) {
            return null;
        }
        C0570ww c0570ww2;
        if (a.f9994g) {
            a.f9994g = false;
            c0570ww2 = a;
        } else {
            c0570ww2 = null;
        }
        int i = 1;
        while (true) {
            C0570ww c0570ww3;
            try {
                int i2 = i;
                C0570ww c0570ww4 = a;
                c0570ww3 = c0570ww2;
                if (i2 >= c0577xd.mo11527a()) {
                    if (c0570ww3 != null) {
                        c0570ww4.mo11503d().mo14450a(c0782xj);
                        c0570ww4.f9993f = c0570ww4.mo11503d();
                    }
                    return c0570ww4;
                }
                C0578xe a2 = c0577xd.mo11528a(i2);
                int i3 = a2.f10015b;
                if (i3 == 1) {
                    a = C0572wy.m6266a(c0570ww4, a2.f10014a, z);
                } else if (i3 == 2) {
                    String substring = a2.f10014a.substring(1);
                    a = c0570ww4.mo11497b(substring);
                    if (a == null && z) {
                        a = new C0570ww(substring, null);
                        a.f9994g = true;
                        c0570ww4.mo11498b(a);
                    }
                } else if (c0570ww4.mo11503d().mo11535b(512)) {
                    int b;
                    String str;
                    if (i3 == 3) {
                        b = C0572wy.m6271b(c0570ww4, a2.f10014a, z);
                    } else if (i3 == 4) {
                        b = c0570ww4.mo11499c();
                    } else if (i3 != 6) {
                        if (i3 == 5) {
                            String[] f = C0567wp.m6229f(a2.f10014a);
                            String str2 = f[0];
                            str = f[1];
                            i3 = a2.f10017d;
                            if (!"xml:lang".equals(str2)) {
                                b = 1;
                                while (true) {
                                    i3 = b;
                                    if (i3 >= c0570ww4.mo11499c()) {
                                        b = -1;
                                        break;
                                    }
                                    Iterator i4 = c0570ww4.mo11490a(i3).mo11509i();
                                    while (i4.hasNext()) {
                                        c0570ww2 = (C0570ww) i4.next();
                                        if (str2.equals(c0570ww2.f9988a) && str.equals(c0570ww2.f9989b)) {
                                            b = i3;
                                            break;
                                        }
                                    }
                                    b = i3 + 1;
                                }
                            } else {
                                b = C0572wy.m6264a(c0570ww4, C0567wp.m6227d(str));
                                if (b < 0 && (i3 & 4096) > 0) {
                                    c0570ww2 = new C0570ww("[]", null);
                                    c0570ww2.mo11498b(new C0570ww("xml:lang", "x-default", null));
                                    c0570ww4.mo11493a(1, c0570ww2);
                                    b = 1;
                                }
                            }
                        } else {
                            throw new C0554wb("Unknown array indexing step in FollowXPathStep", 9);
                        }
                    } else {
                        String[] f2 = C0567wp.m6229f(a2.f10014a);
                        str = f2[0];
                        String str3 = f2[1];
                        b = -1;
                        i3 = 1;
                        while (i3 <= c0570ww4.mo11499c() && b < 0) {
                            C0570ww a3 = c0570ww4.mo11490a(i3);
                            if (a3.mo11503d().mo11535b(256)) {
                                for (int i5 = 1; i5 <= a3.mo11499c(); i5++) {
                                    C0570ww a4 = a3.mo11490a(i5);
                                    if (str.equals(a4.f9988a) && str3.equals(a4.f9989b)) {
                                        b = i3;
                                        break;
                                    }
                                }
                                i3++;
                            } else {
                                throw new C0554wb("Field selector must be used on array of struct", 102);
                            }
                        }
                    }
                    a = b > 0 ? b <= c0570ww4.mo11499c() ? c0570ww4.mo11490a(b) : null : null;
                } else {
                    throw new C0554wb("Indexing applied to non-array", 102);
                }
                if (a == null) {
                    if (z) {
                        C0572wy.m6269a(c0570ww3);
                    }
                    return null;
                }
                if (a.f9994g) {
                    a.f9994g = false;
                    if (i2 == 1 && c0577xd.mo11528a(i2).f10016c && c0577xd.mo11528a(i2).f10017d != 0) {
                        a.mo11503d().mo11534a(c0577xd.mo11528a(i2).f10017d, true);
                    } else if (i2 < c0577xd.mo11527a() - 1 && c0577xd.mo11528a(i2).f10015b == 1 && !a.mo11503d().mo14452b()) {
                        a.mo11503d().mo14456d(true);
                    }
                    if (c0570ww3 == null) {
                        c0570ww2 = a;
                    } else {
                        c0570ww2 = c0570ww3;
                    }
                } else {
                    c0570ww2 = c0570ww3;
                }
                i = i2 + 1;
            } catch (C0554wb e) {
                if (c0570ww3 != null) {
                    C0572wy.m6269a(c0570ww3);
                }
                throw e;
            }
        }
    }

    /* renamed from: a */
    public static C0570ww m6265a(C0570ww c0570ww, String str, String str2, boolean z) {
        C0570ww a = c0570ww.mo11491a(str);
        if (a != null || !z) {
            return a;
        }
        C0782xj c0782xj = new C0782xj();
        c0782xj.mo11534a(kvl.UNSET_ENUM_VALUE, true);
        C0570ww c0570ww2 = new C0570ww(str, c0782xj);
        c0570ww2.f9994g = true;
        String b = C0557we.f9955a.mo11461b(str);
        if (b == null) {
            if (str2 == null || str2.length() == 0) {
                throw new C0554wb("Unregistered schema namespace URI", 101);
            }
            b = C0557we.f9955a.mo11459a(str, str2);
        }
        c0570ww2.f9989b = b;
        c0570ww.mo11494a(c0570ww2);
        return c0570ww2;
    }

    /* renamed from: a */
    static int m6264a(C0570ww c0570ww, String str) {
        if (c0570ww.mo11503d().mo11535b(512)) {
            for (int i = 1; i <= c0570ww.mo11499c(); i++) {
                C0570ww a = c0570ww.mo11490a(i);
                if (a.mo11507g() && "xml:lang".equals(a.mo11496b(1).f9988a) && str.equals(a.mo11496b(1).f9989b)) {
                    return i;
                }
            }
            return -1;
        }
        throw new C0554wb("Language item must be used on array", 102);
    }

    /* renamed from: b */
    static void m6272b(C0570ww c0570ww) {
        if (c0570ww.mo11503d().mo11535b(4096)) {
            for (int i = 2; i <= c0570ww.mo11499c(); i++) {
                C0570ww a = c0570ww.mo11490a(i);
                if (a.mo11507g() && "x-default".equals(a.mo11496b(1).f9989b)) {
                    try {
                        c0570ww.mo11495b().remove(i - 1);
                        c0570ww.mo11492a();
                        c0570ww.mo11493a(1, a);
                    } catch (C0554wb e) {
                    }
                    if (i == 2) {
                        c0570ww.mo11490a(2).f9989b = a.f9989b;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11515a(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2) {
        RecyclerView recyclerView = this.f9999a;
        c0530ux.mo11316a(false);
        if (recyclerView.f724x.mo11201a(c0530ux, c0515ue, c0515ue2)) {
            recyclerView.mo1168n();
        }
    }

    /* renamed from: b */
    public final void mo11516b(C0530ux c0530ux, C0515ue c0515ue, C0515ue c0515ue2) {
        this.f9999a.f704d.mo11297b(c0530ux);
        RecyclerView recyclerView = this.f9999a;
        recyclerView.mo1120a(c0530ux);
        c0530ux.mo11316a(false);
        if (recyclerView.f724x.mo11204b(c0530ux, c0515ue, c0515ue2)) {
            recyclerView.mo1168n();
        }
    }

    /* renamed from: a */
    public final void mo11514a(C0530ux c0530ux) {
        RecyclerView recyclerView = this.f9999a;
        C0517ug c0517ug = recyclerView.f711k;
        View view = c0530ux.f9877a;
        C0524up c0524up = recyclerView.f704d;
        C0457rp c0457rp = c0517ug.f9816f;
        int a = c0457rp.f9647a.mo11047a(view);
        if (a >= 0) {
            if (c0457rp.f9648b.mo11044d(a)) {
                c0457rp.mo11038d(view);
            }
            c0457rp.f9647a.mo11049b(a);
        }
        c0524up.mo11296b(view);
    }

    /* renamed from: a */
    public static C0782xj m6268a(C0782xj c0782xj, Object obj) {
        C0579xh c0782xj2;
        if (c0782xj2 == null) {
            c0782xj2 = new C0782xj();
        }
        if (c0782xj2.mo11535b(4096)) {
            c0782xj2.mo14457e();
        }
        if (c0782xj2.mo11535b(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX)) {
            c0782xj2.mo14458f();
        }
        if (c0782xj2.mo11535b(1024)) {
            c0782xj2.mo14453c();
        }
        if (!c0782xj2.mo14452b() || obj == null || obj.toString().length() <= 0) {
            c0782xj2.mo11533a(c0782xj2.f10018a);
            return c0782xj2;
        }
        throw new C0554wb("Structs and arrays can't have values", 103);
    }
}

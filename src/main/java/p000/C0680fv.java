package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: fv */
public class C0680fv extends C0219ex {
    /* renamed from: q */
    private static final String[] f18813q = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    /* renamed from: p */
    public int f18814p = 3;

    /* renamed from: a */
    public final void mo6638a(C0228fl c0228fl) {
        C0680fv.m10993d(c0228fl);
    }

    /* renamed from: b */
    public void mo6646b(C0228fl c0228fl) {
        C0680fv.m10993d(c0228fl);
    }

    /* renamed from: d */
    private static void m10993d(C0228fl c0228fl) {
        c0228fl.f4836a.put("android:visibility:visibility", Integer.valueOf(c0228fl.f4837b.getVisibility()));
        c0228fl.f4836a.put("android:visibility:parent", c0228fl.f4837b.getParent());
        Object obj = new int[2];
        c0228fl.f4837b.getLocationOnScreen(obj);
        c0228fl.f4836a.put("android:visibility:screenLocation", obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A:{SYNTHETIC, RETURN} */
    /* renamed from: a */
    public final android.animation.Animator mo6626a(android.view.ViewGroup r10, p000.C0228fl r11, p000.C0228fl r12) {
        /*
        r9 = this;
        r8 = 2;
        r7 = 1;
        r6 = 0;
        r1 = 0;
        r0 = p000.C0680fv.m10992b(r11, r12);
        r2 = r0.f5040a;
        if (r2 == 0) goto L_0x0020;
    L_0x000c:
        r2 = r0.f5044e;
        if (r2 != 0) goto L_0x0014;
    L_0x0010:
        r2 = r0.f5045f;
        if (r2 == 0) goto L_0x0020;
    L_0x0014:
        r2 = r0.f5041b;
        if (r2 != 0) goto L_0x0112;
    L_0x0018:
        r3 = r0.f5043d;
        r0 = r9.f18814p;
        r0 = r0 & 2;
        if (r0 == r8) goto L_0x0021;
    L_0x0020:
        return r1;
    L_0x0021:
        if (r11 == 0) goto L_0x010f;
    L_0x0023:
        r2 = r11.f4837b;
    L_0x0025:
        if (r12 == 0) goto L_0x010c;
    L_0x0027:
        r0 = r12.f4837b;
    L_0x0029:
        if (r0 == 0) goto L_0x0031;
    L_0x002b:
        r4 = r0.getParent();
        if (r4 != 0) goto L_0x00f5;
    L_0x0031:
        if (r0 != 0) goto L_0x005d;
    L_0x0033:
        if (r2 == 0) goto L_0x00f2;
    L_0x0035:
        r0 = r2.getParent();
        if (r0 == 0) goto L_0x00ef;
    L_0x003b:
        r0 = r2.getParent();
        r0 = r0 instanceof android.view.View;
        if (r0 == 0) goto L_0x00ec;
    L_0x0043:
        r0 = r2.getParent();
        r0 = (android.view.View) r0;
        r4 = r9.mo6645b(r0, r7);
        r5 = r9.mo6631a(r0, r7);
        r4 = p000.C0680fv.m10992b(r4, r5);
        r4 = r4.f5040a;
        if (r4 != 0) goto L_0x00cd;
    L_0x0059:
        r0 = p000.C0227fk.m2383a(r10, r2, r0);
    L_0x005d:
        r2 = r0;
        r0 = r1;
    L_0x005f:
        if (r2 == 0) goto L_0x00a9;
    L_0x0061:
        if (r11 == 0) goto L_0x00a9;
    L_0x0063:
        r0 = r11.f4836a;
        r1 = "android:visibility:screenLocation";
        r0 = r0.get(r1);
        r0 = (int[]) r0;
        r1 = r0[r6];
        r0 = r0[r7];
        r3 = new int[r8];
        r10.getLocationOnScreen(r3);
        r4 = r3[r6];
        r1 = r1 - r4;
        r4 = r2.getLeft();
        r1 = r1 - r4;
        r2.offsetLeftAndRight(r1);
        r1 = r3[r7];
        r0 = r0 - r1;
        r1 = r2.getTop();
        r0 = r0 - r1;
        r2.offsetTopAndBottom(r0);
        r0 = p000.C0186df.m1643a(r10);
        r1 = r0.f4861a;
        r1.add(r2);
        r1 = r9.mo13284b(r2, r11);
        if (r1 != 0) goto L_0x009f;
    L_0x009b:
        r0.mo6860a(r2);
        goto L_0x0020;
    L_0x009f:
        r3 = new fw;
        r3.<init>(r0, r2);
        r1.addListener(r3);
        goto L_0x0020;
    L_0x00a9:
        if (r0 == 0) goto L_0x0020;
    L_0x00ab:
        r2 = r0.getVisibility();
        p000.C0231fo.m2405a(r0, r6);
        r1 = r9.mo13284b(r0, r11);
        if (r1 == 0) goto L_0x00c8;
    L_0x00b8:
        r2 = new fx;
        r2.<init>(r0, r3);
        r1.addListener(r2);
        p000.C0186df.m1645a(r1, r2);
        r9.mo6630a(r2);
        goto L_0x0020;
    L_0x00c8:
        p000.C0231fo.m2405a(r0, r2);
        goto L_0x0020;
    L_0x00cd:
        r2 = r0.getParent();
        if (r2 != 0) goto L_0x00e9;
    L_0x00d3:
        r0 = r0.getId();
        r2 = -1;
        if (r0 == r2) goto L_0x00e6;
    L_0x00da:
        r0 = r10.findViewById(r0);
        if (r0 == 0) goto L_0x00e3;
    L_0x00e0:
        r0 = r1;
        goto L_0x005d;
    L_0x00e3:
        r0 = r1;
        goto L_0x005d;
    L_0x00e6:
        r0 = r1;
        goto L_0x005d;
    L_0x00e9:
        r0 = r1;
        goto L_0x005d;
    L_0x00ec:
        r0 = r1;
        goto L_0x005d;
    L_0x00ef:
        r0 = r1;
        goto L_0x005f;
    L_0x00f2:
        r0 = r1;
        goto L_0x005d;
    L_0x00f5:
        r4 = 4;
        if (r3 == r4) goto L_0x0109;
    L_0x00f8:
        if (r2 == r0) goto L_0x0106;
    L_0x00fa:
        r0 = r2.getParent();
        r0 = (android.view.View) r0;
        r0 = p000.C0227fk.m2383a(r10, r2, r0);
        goto L_0x005d;
    L_0x0106:
        r2 = r1;
        goto L_0x005f;
    L_0x0109:
        r2 = r1;
        goto L_0x005f;
    L_0x010c:
        r0 = r1;
        goto L_0x0029;
    L_0x010f:
        r2 = r1;
        goto L_0x0025;
    L_0x0112:
        r0 = r9.f18814p;
        r0 = r0 & 1;
        if (r0 != r7) goto L_0x0020;
    L_0x0118:
        if (r12 == 0) goto L_0x0020;
    L_0x011a:
        if (r11 != 0) goto L_0x0134;
    L_0x011c:
        r0 = r12.f4837b;
        r0 = r0.getParent();
        r0 = (android.view.View) r0;
        r2 = r9.mo6631a(r0, r6);
        r0 = r9.mo6645b(r0, r6);
        r0 = p000.C0680fv.m10992b(r2, r0);
        r0 = r0.f5040a;
        if (r0 != 0) goto L_0x0020;
    L_0x0134:
        r0 = r12.f4837b;
        r1 = r9.mo13283a(r0, r11);
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: fv.a(android.view.ViewGroup, fl, fl):android.animation.Animator");
    }

    /* renamed from: a */
    public final String[] mo6641a() {
        return f18813q;
    }

    /* renamed from: b */
    private static C0237fy m10992b(C0228fl c0228fl, C0228fl c0228fl2) {
        C0237fy c0237fy = new C0237fy();
        c0237fy.f5040a = false;
        c0237fy.f5041b = false;
        if (c0228fl == null || !c0228fl.f4836a.containsKey("android:visibility:visibility")) {
            c0237fy.f5042c = -1;
            c0237fy.f5044e = null;
        } else {
            c0237fy.f5042c = ((Integer) c0228fl.f4836a.get("android:visibility:visibility")).intValue();
            c0237fy.f5044e = (ViewGroup) c0228fl.f4836a.get("android:visibility:parent");
        }
        if (c0228fl2 == null || !c0228fl2.f4836a.containsKey("android:visibility:visibility")) {
            c0237fy.f5043d = -1;
            c0237fy.f5045f = null;
        } else {
            c0237fy.f5043d = ((Integer) c0228fl2.f4836a.get("android:visibility:visibility")).intValue();
            c0237fy.f5045f = (ViewGroup) c0228fl2.f4836a.get("android:visibility:parent");
        }
        if (c0228fl != null && c0228fl2 != null) {
            int i = c0237fy.f5042c;
            int i2 = c0237fy.f5043d;
            if (i == i2 && c0237fy.f5044e == c0237fy.f5045f) {
                return c0237fy;
            }
            if (i != i2) {
                if (i == 0) {
                    c0237fy.f5041b = false;
                    c0237fy.f5040a = true;
                } else if (i2 == 0) {
                    c0237fy.f5041b = true;
                    c0237fy.f5040a = true;
                }
            } else if (c0237fy.f5045f == null) {
                c0237fy.f5041b = false;
                c0237fy.f5040a = true;
            } else if (c0237fy.f5044e == null) {
                c0237fy.f5041b = true;
                c0237fy.f5040a = true;
            }
        } else if (c0228fl == null && c0237fy.f5043d == 0) {
            c0237fy.f5041b = true;
            c0237fy.f5040a = true;
        } else if (c0228fl2 == null && c0237fy.f5042c == 0) {
            c0237fy.f5041b = false;
            c0237fy.f5040a = true;
        }
        return c0237fy;
    }

    /* renamed from: a */
    public final boolean mo6640a(C0228fl c0228fl, C0228fl c0228fl2) {
        if (c0228fl == null && c0228fl2 == null) {
            return false;
        }
        if (c0228fl != null && c0228fl2 != null && c0228fl2.f4836a.containsKey("android:visibility:visibility") != c0228fl.f4836a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0237fy b = C0680fv.m10992b(c0228fl, c0228fl2);
        if (!b.f5040a) {
            return false;
        }
        if (b.f5042c == 0) {
            return true;
        }
        if (b.f5043d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Animator mo13283a(View view, C0228fl c0228fl) {
        return null;
    }

    /* renamed from: b */
    public Animator mo13284b(View view, C0228fl c0228fl) {
        return null;
    }
}

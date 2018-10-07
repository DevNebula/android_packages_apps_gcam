package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* renamed from: ee */
public final class C0672ee extends C0219ex {
    /* renamed from: p */
    private static final String[] f17305p = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    /* renamed from: q */
    private static final Property f17306q = new C0208eg(PointF.class, "topLeft");
    /* renamed from: r */
    private static final Property f17307r = new C0209eh(PointF.class, "bottomRight");
    /* renamed from: s */
    private static final Property f17308s = new C0210ei(PointF.class, "bottomRight");
    /* renamed from: t */
    private static final Property f17309t = new C0211ej(PointF.class, "topLeft");
    /* renamed from: u */
    private static final Property f17310u = new C0212ek(PointF.class, "position");

    static {
        C0207ef c0207ef = new C0207ef(PointF.class, "boundsOrigin");
        C0217ev c0217ev = new C0217ev();
    }

    /* renamed from: a */
    public final void mo6638a(C0228fl c0228fl) {
        C0672ee.m9843d(c0228fl);
    }

    /* renamed from: b */
    public final void mo6646b(C0228fl c0228fl) {
        C0672ee.m9843d(c0228fl);
    }

    /* renamed from: d */
    private static void m9843d(C0228fl c0228fl) {
        View view = c0228fl.f4837b;
        if (C0315jm.m4649x(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            c0228fl.f4836a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c0228fl.f4836a.put("android:changeBounds:parent", c0228fl.f4837b.getParent());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* renamed from: a */
    public final android.animation.Animator mo6626a(android.view.ViewGroup r19, p000.C0228fl r20, p000.C0228fl r21) {
        /*
        r18 = this;
        if (r20 == 0) goto L_0x0004;
    L_0x0002:
        if (r21 != 0) goto L_0x0006;
    L_0x0004:
        r2 = 0;
    L_0x0005:
        return r2;
    L_0x0006:
        r0 = r20;
        r1 = r0.f4836a;
        r0 = r21;
        r2 = r0.f4836a;
        r3 = "android:changeBounds:parent";
        r1 = r1.get(r3);
        r1 = (android.view.ViewGroup) r1;
        r3 = "android:changeBounds:parent";
        r2 = r2.get(r3);
        r2 = (android.view.ViewGroup) r2;
        if (r1 == 0) goto L_0x0022;
    L_0x0020:
        if (r2 != 0) goto L_0x0024;
    L_0x0022:
        r2 = 0;
        goto L_0x0005;
    L_0x0024:
        r0 = r21;
        r4 = r0.f4837b;
        r0 = r20;
        r1 = r0.f4836a;
        r2 = "android:changeBounds:bounds";
        r1 = r1.get(r2);
        r1 = (android.graphics.Rect) r1;
        r0 = r21;
        r2 = r0.f4836a;
        r3 = "android:changeBounds:bounds";
        r2 = r2.get(r3);
        r2 = (android.graphics.Rect) r2;
        r5 = r1.left;
        r6 = r2.left;
        r7 = r1.top;
        r8 = r2.top;
        r9 = r1.right;
        r10 = r2.right;
        r11 = r1.bottom;
        r12 = r2.bottom;
        r13 = r9 - r5;
        r14 = r11 - r7;
        r15 = r10 - r6;
        r16 = r12 - r8;
        r0 = r20;
        r1 = r0.f4836a;
        r2 = "android:changeBounds:clip";
        r1 = r1.get(r2);
        r1 = (android.graphics.Rect) r1;
        r0 = r21;
        r2 = r0.f4836a;
        r3 = "android:changeBounds:clip";
        r2 = r2.get(r3);
        r2 = (android.graphics.Rect) r2;
        if (r13 != 0) goto L_0x0141;
    L_0x0072:
        if (r15 == 0) goto L_0x013e;
    L_0x0074:
        if (r16 == 0) goto L_0x013b;
    L_0x0076:
        if (r5 != r6) goto L_0x0138;
    L_0x0078:
        if (r7 == r8) goto L_0x0135;
    L_0x007a:
        r3 = 1;
    L_0x007b:
        if (r9 == r10) goto L_0x0131;
    L_0x007d:
        r3 = r3 + 1;
    L_0x007f:
        if (r1 == 0) goto L_0x0087;
    L_0x0081:
        r17 = r1.equals(r2);
        if (r17 == 0) goto L_0x008b;
    L_0x0087:
        if (r1 != 0) goto L_0x012e;
    L_0x0089:
        if (r2 == 0) goto L_0x012b;
    L_0x008b:
        r1 = r3 + 1;
    L_0x008d:
        if (r1 <= 0) goto L_0x0128;
    L_0x008f:
        p000.C0231fo.m2406a(r4, r5, r7, r9, r11);
        r2 = 2;
        if (r1 != r2) goto L_0x0104;
    L_0x0095:
        if (r13 != r15) goto L_0x00c8;
    L_0x0097:
        r0 = r16;
        if (r14 != r0) goto L_0x00c8;
    L_0x009b:
        r1 = (float) r5;
        r2 = (float) r7;
        r3 = (float) r6;
        r5 = (float) r8;
        r1 = p000.C0216eu.m2165a(r1, r2, r3, r5);
        r2 = f17310u;
        r1 = p000.C0186df.m1635a(r4, r2, r1);
        r2 = r1;
    L_0x00aa:
        r1 = r4.getParent();
        r1 = r1 instanceof android.view.ViewGroup;
        if (r1 == 0) goto L_0x0005;
    L_0x00b2:
        r1 = r4.getParent();
        r1 = (android.view.ViewGroup) r1;
        r3 = 1;
        p000.C0186df.m1650a(r1, r3);
        r3 = new em;
        r3.<init>(r1);
        r0 = r18;
        r0.mo6630a(r3);
        goto L_0x0005;
    L_0x00c8:
        r1 = new en;
        r1.<init>(r4);
        r2 = (float) r5;
        r3 = (float) r7;
        r5 = (float) r6;
        r6 = (float) r8;
        r2 = p000.C0216eu.m2165a(r2, r3, r5, r6);
        r3 = f17306q;
        r2 = p000.C0186df.m1635a(r1, r3, r2);
        r3 = (float) r9;
        r5 = (float) r11;
        r6 = (float) r10;
        r7 = (float) r12;
        r3 = p000.C0216eu.m2165a(r3, r5, r6, r7);
        r5 = f17307r;
        r3 = p000.C0186df.m1635a(r1, r5, r3);
        r1 = new android.animation.AnimatorSet;
        r1.<init>();
        r5 = 2;
        r5 = new android.animation.Animator[r5];
        r6 = 0;
        r5[r6] = r2;
        r2 = 1;
        r5[r2] = r3;
        r1.playTogether(r5);
        r2 = new el;
        r2.<init>();
        r1.addListener(r2);
        r2 = r1;
        goto L_0x00aa;
    L_0x0104:
        if (r5 != r6) goto L_0x0108;
    L_0x0106:
        if (r7 == r8) goto L_0x0118;
    L_0x0108:
        r1 = (float) r5;
        r2 = (float) r7;
        r3 = (float) r6;
        r5 = (float) r8;
        r1 = p000.C0216eu.m2165a(r1, r2, r3, r5);
        r2 = f17309t;
        r1 = p000.C0186df.m1635a(r4, r2, r1);
        r2 = r1;
        goto L_0x00aa;
    L_0x0118:
        r1 = (float) r9;
        r2 = (float) r11;
        r3 = (float) r10;
        r5 = (float) r12;
        r1 = p000.C0216eu.m2165a(r1, r2, r3, r5);
        r2 = f17308s;
        r1 = p000.C0186df.m1635a(r4, r2, r1);
        r2 = r1;
        goto L_0x00aa;
    L_0x0128:
        r2 = 0;
        goto L_0x0005;
    L_0x012b:
        r1 = r3;
        goto L_0x008d;
    L_0x012e:
        r1 = r3;
        goto L_0x008d;
    L_0x0131:
        if (r11 != r12) goto L_0x007d;
    L_0x0133:
        goto L_0x007f;
    L_0x0135:
        r3 = 0;
        goto L_0x007b;
    L_0x0138:
        r3 = 1;
        goto L_0x007b;
    L_0x013b:
        r3 = 0;
        goto L_0x007f;
    L_0x013e:
        r3 = 0;
        goto L_0x007f;
    L_0x0141:
        if (r14 != 0) goto L_0x0076;
    L_0x0143:
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.a(android.view.ViewGroup, fl, fl):android.animation.Animator");
    }

    /* renamed from: a */
    public final String[] mo6641a() {
        return f17305p;
    }
}

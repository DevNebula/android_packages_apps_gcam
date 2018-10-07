package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxu */
public final class gxu {
    /* renamed from: a */
    private static final String f6144a = bli.m887a("CamBoxHelper");

    /* renamed from: a */
    private static int m2928a(float f) {
        return f >= 0.0f ? (int) f : 0;
    }

    /* renamed from: a */
    private static gxv m2931a(Size size, Size size2, hir hir, boolean z, Context context) {
        String str = f6144a;
        String valueOf = String.valueOf(size);
        String valueOf2 = String.valueOf(size2);
        String valueOf3 = String.valueOf(hir);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("Computing layout for window: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", and preview: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", orientation: ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", isMultiWindow: ");
        stringBuilder.append(z);
        bli.m894c(str, stringBuilder.toString());
        int width;
        int height;
        int a;
        gxv a2;
        StringBuilder stringBuilder2;
        if (z) {
            width = size.getWidth();
            height = size.getHeight();
            int a3 = height - hhz.m3207a(84.0f);
            a = gxu.m2929a(context);
            a2 = gxv.m2935i().mo7623a(size).mo7627e(new Rect(0, 0, width, height)).mo7628f(new Rect(0, 0, width, a)).mo7626d(new Rect(0, 0, width, hhz.m3207a(72.0f))).mo7622a(new Rect(0, a3, width, height)).mo7629g(new Rect(0, a, width, a3)).mo7625c(new Rect(0, a3 - hhz.m3207a(44.0f), width, a3)).mo7624b(new Rect(0, 0, width, height)).mo7621a();
            valueOf = f6144a;
            valueOf2 = String.valueOf(a2);
            stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
            stringBuilder2.append("Computed layout: ");
            stringBuilder2.append(valueOf2);
            bli.m894c(valueOf, stringBuilder2.toString());
            return a2;
        }
        Size size3;
        Size a4 = gxu.m2930a(size, hir);
        Size a5 = gxu.m2930a(size2, hir);
        length = a4.getWidth();
        int height2 = a4.getHeight();
        int a6 = hhz.m3207a(48.0f);
        height = (length << 2) / 3;
        int a7 = gxu.m2929a(context);
        int a8 = hhz.m3207a(72.0f);
        int a9 = hhz.m3207a(44.0f);
        width = height + a7;
        if (height2 - width < hhz.m3207a(135.0f)) {
            width = height;
        }
        Rect rect = new Rect(0, a7, length, width);
        if (a5.getWidth() == 0) {
            rect = new Rect(0, 0, 0, 0);
        } else {
            a = (a5.getHeight() * a4.getWidth()) / a5.getWidth();
            if (a == a4.getHeight()) {
                rect = new Rect(0, 0, a4.getWidth(), a4.getHeight());
            } else if (a != rect.height()) {
                if (a <= rect.height() + a7) {
                    bli.m894c(f6144a, "Positioning the preview above the bottom bar");
                    rect = new Rect(0, 0, a4.getWidth(), a);
                } else if (a4.getHeight() - a >= (a7 + a6) - ((int) (((float) a6) * 0.3f))) {
                    bli.m894c(f6144a, "Positioning the preview between the top bar and the navigation bar");
                    rect = new Rect(0, a7, a4.getWidth(), a + a7);
                } else {
                    bli.m891b(f6144a, "Cannot position preview using standard methods!");
                    rect = new Rect(0, 0, a4.getWidth(), a);
                }
            }
        }
        gxv a10 = gxv.m2935i().mo7623a(a4).mo7628f(new Rect(0, 0, length, a7)).mo7626d(new Rect(0, 0, length, a8)).mo7622a(new Rect(0, width, length, height2)).mo7625c(new Rect(0, width - a9, length, width)).mo7629g(new Rect(0, a8, length, width)).mo7627e(rect).mo7624b(new Rect(0, 0, length, height2)).mo7621a();
        Size h = a10.mo7520h();
        switch (hir.ordinal()) {
            case 0:
            case 3:
                size3 = h;
                break;
            case 1:
            case 2:
                size3 = new Size(h.getHeight(), h.getWidth());
                break;
            default:
                valueOf = String.valueOf(hir);
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder3.append("Unexpected UI Orientation: ");
                stringBuilder3.append(valueOf);
                throw new RuntimeException(stringBuilder3.toString());
        }
        a2 = gxv.m2935i().mo7623a(size3).mo7627e(gxv.m2934a(a10.mo7517e(), size3, hir)).mo7629g(gxv.m2934a(a10.mo7519g(), size3, hir)).mo7628f(gxv.m2934a(a10.mo7518f(), size3, hir)).mo7626d(gxv.m2934a(a10.mo7516d(), size3, hir)).mo7622a(gxv.m2934a(a10.mo7513a(), size3, hir)).mo7625c(gxv.m2934a(a10.mo7515c(), size3, hir)).mo7624b(gxv.m2934a(a10.mo7514b(), size3, hir)).mo7621a();
        valueOf = f6144a;
        valueOf2 = String.valueOf(a2);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
        stringBuilder2.append("Computed layout: ");
        stringBuilder2.append(valueOf2);
        bli.m894c(valueOf, stringBuilder2.toString());
        return a2;
    }

    /* renamed from: a */
    public static gxv m2932a(gxw gxw, boolean z, Context context) {
        if (gxw.mo7525e()) {
            return gxu.m2931a(gxw.mo7524d(), gxw.mo7524d(), gxw.mo7521a(), z, context);
        }
        return gxu.m2931a(gxw.mo7524d(), gxw.mo7522b(), gxw.mo7521a(), z, context);
    }

    /* renamed from: a */
    private static Size m2930a(Size size, hir hir) {
        switch (hir.ordinal()) {
            case 0:
            case 3:
                return size;
            case 1:
            case 2:
                return new Size(size.getHeight(), size.getWidth());
            default:
                String valueOf = String.valueOf(hir);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Unknown UI orientation: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static int m2929a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.topbar_height);
    }

    /* renamed from: a */
    public static gyh m2933a(Size size, Rect rect, ipz ipz, boolean z, int i) {
        int height;
        Size size2;
        int i2 = 1;
        if (z) {
            int width = size.getWidth();
            height = size.getHeight();
            if (!(i == gcb.f5289a || i == gcb.f5290b)) {
                i2 = 0;
            }
            if (i2 != 0) {
                height = (int) (((float) size.getWidth()) * ipz.mo8752b());
            } else {
                width = (int) (((float) size.getHeight()) * ipz.mo8752b());
            }
            Size size3 = new Size(width, height);
            height = 17;
            size2 = size3;
        } else {
            size2 = new Size(-1, -1);
            height = 51;
        }
        return new gxt(size2, new Rect(gxu.m2928a((float) rect.left), gxu.m2928a((float) rect.top), size.getWidth() - gxu.m2928a((float) rect.right), size.getHeight() - gxu.m2928a((float) rect.bottom)), new Rect(0, 0, 0, 0), height);
    }
}

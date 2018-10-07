package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: vf */
final class C0536vf {
    /* renamed from: a */
    public static final int[] f9915a = new int[]{-16842910};
    /* renamed from: b */
    public static final int[] f9916b = new int[]{16842908};
    /* renamed from: c */
    public static final int[] f9917c = new int[]{16842919};
    /* renamed from: d */
    public static final int[] f9918d = new int[]{16842912};
    /* renamed from: e */
    public static final int[] f9919e = new int[0];
    /* renamed from: f */
    private static final ThreadLocal f9920f = new ThreadLocal();
    /* renamed from: g */
    private static final int[] f9921g = new int[1];

    /* renamed from: a */
    public static int m6101a(Context context, int i) {
        ColorStateList c = C0536vf.m6103c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f9915a, c.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f9920f.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f9920f.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int b = C0536vf.m6102b(context, i);
        return C0258gu.m2883b(b, Math.round(f * ((float) Color.alpha(b))));
    }

    /* renamed from: b */
    public static int m6102b(Context context, int i) {
        f9921g[0] = i;
        C0540vk a = C0540vk.m6108a(context, null, f9921g);
        try {
            int a2 = a.mo11386a(0, 0);
            return a2;
        } finally {
            a.f9927b.recycle();
        }
    }

    /* renamed from: c */
    public static ColorStateList m6103c(Context context, int i) {
        f9921g[0] = i;
        C0540vk a = C0540vk.m6108a(context, null, f9921g);
        try {
            ColorStateList a2 = a.mo11387a(0);
            return a2;
        } finally {
            a.f9927b.recycle();
        }
    }
}

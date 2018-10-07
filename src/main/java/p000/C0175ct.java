package p000;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: ct */
public final class C0175ct {
    /* renamed from: a */
    private static final boolean f2881a = true;
    /* renamed from: b */
    private static final int[] f2882b = new int[]{16842919};
    /* renamed from: c */
    private static final int[] f2883c = new int[]{16843623, 16842908};
    /* renamed from: d */
    private static final int[] f2884d = new int[]{16842908};
    /* renamed from: e */
    private static final int[] f2885e = new int[]{16843623};
    /* renamed from: f */
    private static final int[] f2886f = new int[]{16842913, 16842919};
    /* renamed from: g */
    private static final int[] f2887g = new int[]{16842913, 16843623, 16842908};
    /* renamed from: h */
    private static final int[] f2888h = new int[]{16842913, 16842908};
    /* renamed from: i */
    private static final int[] f2889i = new int[]{16842913, 16843623};
    /* renamed from: j */
    private static final int[] f2890j = new int[]{16842913};

    /* renamed from: a */
    public static ColorStateList m1540a(ColorStateList colorStateList) {
        int[][] iArr;
        int[] iArr2;
        if (f2881a) {
            iArr = new int[2][];
            iArr2 = new int[]{f2890j, C0175ct.m1539a(colorStateList, f2886f)};
            iArr[1] = StateSet.NOTHING;
            iArr2[1] = C0175ct.m1539a(colorStateList, f2882b);
            return new ColorStateList(iArr, iArr2);
        }
        iArr = new int[10][];
        iArr2 = new int[]{f2886f, C0175ct.m1539a(colorStateList, f2886f), f2887g, C0175ct.m1539a(colorStateList, f2887g), f2888h, C0175ct.m1539a(colorStateList, f2888h), f2889i, C0175ct.m1539a(colorStateList, f2889i), f2890j, 0};
        iArr[5] = f2882b;
        iArr2[5] = C0175ct.m1539a(colorStateList, f2882b);
        iArr[6] = f2883c;
        iArr2[6] = C0175ct.m1539a(colorStateList, f2883c);
        iArr[7] = f2884d;
        iArr2[7] = C0175ct.m1539a(colorStateList, f2884d);
        iArr[8] = f2885e;
        iArr2[8] = C0175ct.m1539a(colorStateList, f2885e);
        iArr[9] = StateSet.NOTHING;
        iArr2[9] = 0;
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: a */
    private static int m1539a(ColorStateList colorStateList, int[] iArr) {
        int colorForState;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            colorForState = 0;
        }
        if (!f2881a) {
            return colorForState;
        }
        int alpha = Color.alpha(colorForState);
        return C0258gu.m2883b(colorForState, Math.min(alpha + alpha, Illuminant.kOther));
    }
}

package p000;

import com.google.android.apps.refocus.image.RGBZ;

/* compiled from: PG */
/* renamed from: hsk */
public final class hsk {
    /* renamed from: b */
    private static final String f6943b = bli.m887a("LensController");
    /* renamed from: a */
    public float f6944a = 1.0f;
    /* renamed from: c */
    private float[] f6945c = new float[64];
    /* renamed from: d */
    private float f6946d = 1.0f;
    /* renamed from: e */
    private float f6947e = (this.f6946d + 1.0E-6f);

    public hsk(RGBZ rgbz) {
        int i = 0;
        if (rgbz != null) {
            int length;
            if (rgbz == null || rgbz.getDepthTransform() == null) {
                bli.m891b(f6943b, "The RGBZ was invalid or had no depth!");
            } else {
                this.f6946d = rgbz.getDepthTransform().getNear();
                this.f6947e = rgbz.getDepthTransform().getFar();
            }
            this.f6945c = hsk.m3399a(rgbz, this.f6946d, this.f6947e, 0, rgbz.getWidth(), 0, rgbz.getHeight());
            float f = this.f6946d;
            float f2 = this.f6947e;
            int max = ((int) (((float) Math.max(rgbz.getWidth(), rgbz.getHeight())) * 0.2f)) / 2;
            float[] a = hsk.m3399a(rgbz, f, f2, (rgbz.getWidth() / 2) - max, (rgbz.getWidth() / 2) + max, (rgbz.getHeight() / 2) - max, (rgbz.getHeight() / 2) + max);
            int length2 = a.length - 1;
            float f3 = 0.0f;
            while (true) {
                length = a.length;
                if (i >= length) {
                    i = length2;
                    break;
                }
                f3 += a[i];
                if (f3 > 0.4f) {
                    break;
                }
                i++;
            }
            this.f6944a = (f2 * f) / (f2 - (((f2 - f) * ((float) i)) / ((float) (length - 1))));
        }
    }

    /* renamed from: a */
    public final float mo8087a(float f, float f2, float f3) {
        float a = mo8086a(f, f2);
        return a == 0.0f ? f3 : f3 / a;
    }

    /* renamed from: a */
    public final float mo8086a(float f, float f2) {
        float f3 = f * (1.0f - f2);
        float f4 = f * (f2 + 1.0f);
        float f5 = 0.0f;
        for (int i = 0; i < 64; i++) {
            float f6 = this.f6947e;
            float f7 = this.f6946d;
            f6 = (f6 * f7) / (f6 - (((f6 - f7) * ((float) i)) / 63.0f));
            f5 += ((Math.max(f3 - f6, 0.0f) + Math.max(f6 - f4, 0.0f)) * this.f6945c[i]) / f6;
        }
        return f5;
    }

    /* renamed from: a */
    private static float[] m3399a(RGBZ rgbz, float f, float f2, int i, int i2, int i3, int i4) {
        int i5 = (i / 10) * 10;
        int i6 = (i3 / 10) * 10;
        rgbz.getWidth();
        float[] fArr = new float[64];
        for (int i7 = i6; i7 < i4; i7 += 10) {
            for (i6 = i5; i6 < i2; i6 += 10) {
                float depth = rgbz.getDepth(i6, i7);
                if (depth > 0.0f) {
                    int i8 = (int) (((f2 - ((f * f2) / depth)) / (f2 - f)) * 63.0f);
                    fArr[i8] = fArr[i8] + 1.0f;
                }
            }
        }
        float f3 = 0.0f;
        for (i6 = 0; i6 < 64; i6++) {
            f3 += fArr[i6];
        }
        if (f3 > 0.0f) {
            for (i6 = 0; i6 < 64; i6++) {
                fArr[i6] = fArr[i6] / f3;
            }
        }
        return fArr;
    }

    /* renamed from: a */
    public static float m3398a() {
        return 0.1f;
    }
}

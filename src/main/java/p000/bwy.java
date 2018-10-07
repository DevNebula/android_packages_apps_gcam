package p000;

import android.graphics.Rect;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bwy */
public final class bwy {
    /* renamed from: a */
    public final cde f1697a;
    /* renamed from: b */
    public final int f1698b;
    /* renamed from: c */
    public final iqp f1699c;
    /* renamed from: d */
    public final long f1700d;
    /* renamed from: e */
    private final cdk f1701e;
    /* renamed from: f */
    private final SizeF f1702f;
    /* renamed from: g */
    private final iqp f1703g;
    /* renamed from: h */
    private final float f1704h;
    /* renamed from: i */
    private final Object f1705i;
    /* renamed from: j */
    private final AtomicReference f1706j;

    public bwy(SizeF sizeF, iqp iqp, iqp iqp2, cde cde, cdk cdk) {
        this(sizeF, iqp, iqp2, 12, cde, cdk);
        this.f1705i = new Object();
        this.f1706j = new AtomicReference();
        List arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(0, jdf.m4476a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        }
        this.f1706j.set(arrayList);
    }

    private bwy(SizeF sizeF, iqp iqp, iqp iqp2, int i, cde cde, cdk cdk) {
        jri.m13395a(true);
        this.f1702f = sizeF;
        this.f1699c = iqp;
        this.f1703g = iqp2;
        this.f1700d = 0;
        this.f1698b = 12;
        this.f1697a = cde;
        this.f1701e = cdk;
        float width = sizeF.getWidth() / sizeF.getHeight();
        float f = ((float) iqp.f7695a) / ((float) iqp.f7696b);
        this.f1704h = ((f / width) - 4.0f) / ((f + f) / width);
    }

    /* renamed from: a */
    public final long mo2197a(long j, float[] fArr) {
        float f = this.f1704h;
        return (long) (((1.0f - (f + f)) * ((float) j)) / fArr[1]);
    }

    /* renamed from: a */
    public final long mo2196a(long j, long j2, float[] fArr) {
        if (j <= 0) {
            return j;
        }
        float f = (float) j2;
        return (((long) (this.f1704h * f)) + j) + ((long) (f * (0.5f - (0.5f / fArr[1]))));
    }

    /* renamed from: a */
    public static long m1048a(long j, long j2, long j3) {
        return ((j2 + j3) / 2) + j;
    }

    /* renamed from: a */
    public final float mo2195a(float f, float f2, float[] fArr) {
        return ((fArr[0] + fArr[1]) * 0.5f) * (((1.0f / ((1.0f / f) - (f2 / 1000.0f))) * ((float) this.f1699c.f7695a)) / this.f1702f.getWidth());
    }

    /* renamed from: a */
    public final float[] mo2199a(long j, long j2, long j3, iqp iqp, float[] fArr, boolean z) {
        float[] fArr2 = new float[]{0.0f, 0.0f};
        if (j >= 0) {
            long a = bwy.m1048a(j, j2, j3);
            if (z) {
                fArr2 = this.f1701e.mo2268a(a, j3);
            } else {
                fArr2 = this.f1701e.mo2267a(a);
            }
        }
        float[] fArr3 = new float[2];
        fArr3[0] = ((float) (iqp.f7695a - 1)) * ((fArr2[0] * fArr[0]) + 0.5f);
        fArr3[1] = ((fArr2[1] * fArr[1]) + 0.5f) * ((float) (iqp.f7696b - 1));
        return fArr3;
    }

    /* renamed from: a */
    public final List mo2198a(gid gid) {
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        long j = gid.f19185b;
        float f = gid.f19188e;
        float f2 = gid.f19189f;
        float[] a = mo2200a(gid.f19192i);
        float a2 = mo2195a(f, f2, a);
        long j2 = gid.f19184a;
        long j3 = gid.f19186c;
        long j4 = gid.f19191h;
        long a3 = mo2196a(j2, j3, a);
        long a4 = mo2196a(j4, j3, a);
        long a5 = mo2197a(j3, a);
        float[] fArr = null;
        int i = 0;
        while (true) {
            int i2 = this.f1698b;
            if (i >= i2) {
                break;
            }
            j4 = ((long) i) * a5;
            long j5 = (long) i2;
            j5 = bwy.m1048a(a3 + (j4 / j5), a5 / j5, j);
            j2 = (long) this.f1698b;
            float[] a6 = mo2199a(a4 + (j4 / j2), a5 / j2, j, this.f1699c, a, true);
            float[] fArr2 = new float[9];
            if (!(this.f1697a.mo2263a(j5, a2, a6[0], a6[1], 0, fArr2) || fArr == null)) {
                fArr2 = fArr;
            }
            arrayList.add(jdf.m4476a(fArr2));
            i++;
            fArr = fArr2;
        }
        synchronized (this.f1705i) {
            List list = (List) this.f1706j.get();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < this.f1698b) {
                    jdf a7;
                    jdf a8;
                    float[] fArr3 = ((jdf) list.get(i4)).f8084a;
                    float f3 = fArr3[0];
                    float f4 = fArr3[4];
                    float f5 = fArr3[8];
                    float f6 = fArr3[5];
                    float f7 = fArr3[7];
                    float f8 = (f4 * f5) - (f6 * f7);
                    float f9 = fArr3[1];
                    float f10 = fArr3[3];
                    float f11 = fArr3[6];
                    double d = ((double) (fArr3[2] * ((f10 * f7) - (f4 * f11)))) + ((((double) (f3 * f8)) + 0.0d) - ((double) (((f10 * f5) - (f6 * f11)) * f9)));
                    if (d != 0.0d) {
                        f3 = (float) (1.0d / d);
                        float[] fArr4 = new float[9];
                        fArr4[0] = f8 * f3;
                        fArr4[1] = (-((fArr3[1] * fArr3[8]) - (fArr3[2] * fArr3[7]))) * f3;
                        fArr4[2] = ((fArr3[1] * fArr3[5]) - (fArr3[2] * fArr3[4])) * f3;
                        fArr4[3] = (-((fArr3[3] * fArr3[8]) - (fArr3[5] * fArr3[6]))) * f3;
                        fArr4[4] = ((fArr3[0] * fArr3[8]) - (fArr3[2] * fArr3[6])) * f3;
                        fArr4[5] = (-((fArr3[0] * fArr3[5]) - (fArr3[2] * fArr3[3]))) * f3;
                        fArr4[6] = ((fArr3[3] * fArr3[7]) - (fArr3[4] * fArr3[6])) * f3;
                        fArr4[7] = (-((fArr3[0] * fArr3[7]) - (fArr3[1] * fArr3[6]))) * f3;
                        fArr4[8] = ((fArr3[0] * fArr3[4]) - (fArr3[3] * fArr3[1])) * f3;
                        a7 = jdf.m4476a(fArr4);
                    } else {
                        a7 = null;
                    }
                    if (a7 == null) {
                        bli.m891b("RelativeGyroTransformCalculator", "Inverse could not be computed. Defaulting to identity");
                        a8 = jdf.m4476a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                    } else {
                        a8 = a7;
                    }
                    a7 = (jdf) arrayList.get(i4);
                    float[] a9 = a8.mo9329a();
                    float[] fArr5 = new float[9];
                    for (int i5 = 0; i5 < 3; i5++) {
                        for (int i6 = 0; i6 < 3; i6++) {
                            for (int i7 = 0; i7 < 3; i7++) {
                                int i8 = i5 * 3;
                                int i9 = i8 + i6;
                                fArr5[i9] = (a7.f8084a[i8 + i7] * a9[(i7 * 3) + i6]) + fArr5[i9];
                            }
                        }
                    }
                    arrayList2.add(jdf.m4476a(fArr5));
                    i3 = i4 + 1;
                } else {
                    this.f1706j.set(arrayList);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final float[] mo2200a(Rect rect) {
        float[] fArr = new float[]{1.0f, 1.0f};
        if (rect != null) {
            iqp iqp = this.f1703g;
            fArr[0] = ((float) iqp.f7695a) / ((float) (rect.right - rect.left));
            fArr[1] = ((float) iqp.f7696b) / ((float) (rect.bottom - rect.top));
        }
        return fArr;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1699c);
        String valueOf2 = String.valueOf(this.f1702f);
        int i = this.f1698b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 113) + String.valueOf(valueOf2).length());
        stringBuilder.append("AbsoluteGyroTransformCalculator{imageSize=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", sensorSize=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", timeoutMs=");
        stringBuilder.append(0);
        stringBuilder.append(", numOfStrips=");
        stringBuilder.append(i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

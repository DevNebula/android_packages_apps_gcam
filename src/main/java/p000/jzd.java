package p000;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jzd */
public final class jzd {
    /* renamed from: a */
    public final int f8500a;
    /* renamed from: b */
    public final float[][] f8501b;
    /* renamed from: c */
    public final int[][] f8502c;
    /* renamed from: d */
    public float[][] f8503d;
    /* renamed from: e */
    private final int f8504e;
    /* renamed from: f */
    private final jze f8505f = new jze(this.f8500a);
    /* renamed from: g */
    private final jze f8506g;
    /* renamed from: h */
    private final boolean[] f8507h;
    /* renamed from: i */
    private final int[] f8508i;

    public jzd(int i) {
        this.f8500a = i;
        int i2 = this.f8500a;
        this.f8504e = i2 - 1;
        this.f8501b = (float[][]) Array.newInstance(Float.TYPE, new int[]{i2, i2});
        this.f8506g = new jze(i2 * i2);
        i2 = this.f8500a;
        this.f8502c = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, i2});
        this.f8507h = new boolean[i2];
        this.f8508i = new int[i2];
    }

    /* renamed from: a */
    public final boolean mo9627a(boolean z) {
        Arrays.fill(this.f8507h, false);
        this.f8505f.f8510b = 0;
        jze jze = this.f8506g;
        jze.f8510b = 0;
        jze.mo9628a(0);
        while (true) {
            jze = this.f8506g;
            int i = jze.f8510b;
            if (i == 0) {
                return false;
            }
            jze.f8510b = i - 1;
            i = jze.f8509a[jze.f8510b];
            for (int i2 = 0; i2 < this.f8500a; i2++) {
                int i3 = this.f8502c[i][i2];
                if (i3 == 0) {
                    continue;
                    break;
                }
                if (!this.f8507h[i3]) {
                    boolean z2;
                    float f = this.f8503d[i][i3];
                    if (f - this.f8501b[i][i3] > 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        if (f <= 0.0f) {
                            z2 = false;
                        } else if (z2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        continue;
                    } else if (i3 == this.f8504e) {
                        this.f8505f.mo9628a(i3);
                        i2 = i;
                        while (true) {
                            this.f8505f.mo9628a(i2);
                            if (i2 == 0) {
                                return true;
                            }
                            i2 = this.f8508i[i2];
                        }
                    } else {
                        this.f8508i[i3] = i;
                        this.f8506g.mo9628a(i3);
                    }
                }
            }
            this.f8507h[i] = true;
        }
    }

    /* renamed from: a */
    public final float mo9626a() {
        int i;
        int i2 = 1;
        float f = Float.MAX_VALUE;
        int i3 = 1;
        while (true) {
            jze jze = this.f8505f;
            if (i3 >= jze.f8510b) {
                break;
            }
            int[] iArr = jze.f8509a;
            int i4 = iArr[i3];
            i = iArr[i3 - 1];
            f = Math.min(f, this.f8503d[i4][i] - this.f8501b[i4][i]);
            i3++;
        }
        while (true) {
            jze jze2 = this.f8505f;
            if (i2 >= jze2.f8510b) {
                return f;
            }
            int[] iArr2 = jze2.f8509a;
            i = iArr2[i2];
            i3 = iArr2[i2 - 1];
            float[][] fArr = this.f8501b;
            float[] fArr2 = fArr[i];
            fArr2[i3] = fArr2[i3] + f;
            float[] fArr3 = fArr[i3];
            fArr3[i] = fArr3[i] - f;
            i2++;
        }
    }
}

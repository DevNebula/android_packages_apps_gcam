package p000;

import com.google.android.libraries.smartburst.utils.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: jwn */
public final class jwn implements jwo {
    /* renamed from: a */
    private final jyz f21784a;

    public jwn(jza jza) {
        boolean z;
        int i;
        int i2;
        boolean z2 = true;
        jri.m13404b((Object) jza);
        if (jza.f8495C.length <= 2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        int[] iArr = jza.f8495C;
        if (iArr.length == 2) {
            i = iArr[0];
            i2 = iArr[1];
        } else {
            i2 = iArr[0];
            i = 1;
            z2 = false;
        }
        this.f21784a = new jyz(i, i2, z2);
    }

    /* renamed from: a */
    public final float mo9580a(Feature feature, Feature feature2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        jyz jyz = this.f21784a;
        Object values = feature.getValues();
        float[] values2 = feature2.getValues();
        jri.m13391a(values, (Object) "hist1");
        jri.m13391a(values, (Object) "hist2");
        if (values.length == jyz.f8449b * jyz.f8450c) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "histogram dimensions are mismatched.");
        if (values2.length == jyz.f8449b * jyz.f8450c) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "histogram dimensions are mismatched.");
        int i5 = i - 1;
        for (float[] fill : jyz.f8452e) {
            Arrays.fill(fill, 0.0f);
        }
        for (i2 = 0; i2 < jyz.f8449b * jyz.f8450c; i2++) {
            float f = values[i2] - values2[i2];
            i = i2 + 1;
            if (f > 0.0f) {
                jyz.f8452e[0][i] = f;
            } else if (f < 0.0f) {
                jyz.f8452e[i][i5] = -f;
            }
        }
        for (int i6 = 1; i6 < i5; i6++) {
            if (jyz.f8452e[0][i6] != 0.0f) {
                ArrayList a;
                i = jyz.f8449b;
                if (i == 1) {
                    a = jyz.m4763a(i6, jyz.f8450c, jyz.f8451d);
                } else {
                    int i7 = jyz.f8450c;
                    if (i7 == 1) {
                        a = jyz.m4763a(i6, i, false);
                    } else {
                        boolean z2 = jyz.f8451d;
                        ArrayList arrayList = new ArrayList();
                        i3 = i6 - 1;
                        int i8 = i3 % i7;
                        int i9 = i3 / i7;
                        i3 = i8 - 1;
                        while (true) {
                            i4 = i3;
                            if (i4 > i8 + 1) {
                                break;
                            }
                            int b = jyz.m4764b(i4, i7, z2);
                            if (b != -1) {
                                for (i3 = i9 - 1; i3 <= i9 + 1; i3++) {
                                    int b2 = jyz.m4764b(i3, i, false);
                                    if (b2 != -1) {
                                        arrayList.add(Integer.valueOf(((b2 * i7) + b) + 1));
                                    }
                                }
                            }
                            i3 = i4 + 1;
                        }
                        a = arrayList;
                    }
                }
                i = a.size();
                i2 = 0;
                while (i2 < i) {
                    i4 = i2 + 1;
                    Integer num = (Integer) a.get(i2);
                    if (jyz.f8452e[num.intValue()][i5] > 0.0f) {
                        jyz.f8452e[i6][num.intValue()] = Float.MAX_VALUE;
                        i2 = i4;
                    } else {
                        i2 = i4;
                    }
                }
            }
        }
        jzd jzd = jyz.f8448a;
        float[][] fArr = jyz.f8452e;
        if (fArr.length == jzd.f8500a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (fArr[0].length == jzd.f8500a) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jzd.f8503d = fArr;
        for (int[] fill2 : jzd.f8502c) {
            Arrays.fill(fill2, 0);
        }
        i2 = 0;
        while (true) {
            i3 = i2;
            i2 = jzd.f8500a;
            if (i3 >= i2) {
                break;
            }
            int i10 = i2 - 1;
            i2 = 0;
            i4 = i10;
            while (i4 > 0) {
                float[][] fArr2 = jzd.f8503d;
                if (fArr2[i3][i4] > 0.0f || fArr2[i4][i3] > 0.0f) {
                    jzd.f8502c[i3][i2] = i4;
                    i2++;
                }
                i4--;
            }
            i2 = i3 + 1;
        }
        for (float[] fill3 : jzd.f8501b) {
            Arrays.fill(fill3, 0.0f);
        }
        float f2 = 0.0f;
        while (jzd.mo9627a(true)) {
            f2 += jzd.mo9626a();
        }
        while (jzd.mo9627a(false)) {
            f2 += jzd.mo9626a();
        }
        float f3 = 0.0f;
        i3 = 0;
        while (true) {
            float[][] fArr3 = jyz.f8452e;
            if (i3 >= fArr3.length) {
                return f3 - (f2 * 0.5f);
            }
            f3 += fArr3[0][i3];
            i3++;
        }
    }
}

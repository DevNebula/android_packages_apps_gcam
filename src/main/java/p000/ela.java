package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ela */
public final class ela implements eky {
    /* renamed from: a */
    private boolean f17526a = true;
    /* renamed from: b */
    private ArrayList f17527b = new ArrayList();
    /* renamed from: c */
    private float[] f17528c = new float[16];

    public ela(boolean z) {
        this.f17526a = z;
        Matrix.setIdentityM(this.f17528c, 0);
    }

    /* renamed from: a */
    public final void mo6293a(float f, ekt ekt, float[] fArr, int i, int i2) {
        int i3;
        ArrayList arrayList = this.f17527b;
        if (arrayList != null) {
            float f2;
            float f3;
            arrayList.clear();
            float f4 = f * 20.0f;
            boolean z = this.f17526a;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            i3 = -2;
            while (true) {
                int i4 = i3;
                if (i4 > 2) {
                    break;
                }
                if (i4 == 0) {
                    i3 = 0;
                } else {
                    Object obj = new float[16];
                    Matrix.setIdentityM(obj, 0);
                    Matrix.rotateM(obj, 0, ((float) i4) * f4, f3, f2, 0.0f);
                    int i5 = 0 + 1;
                    arrayList.add(0, obj);
                    i3 = i5;
                }
                i4++;
            }
        }
        if (ekt != null) {
            float[] fArr2 = this.f17528c;
            arrayList = this.f17527b;
            if (arrayList != null) {
                ejq ejq = ekt.f4068g;
                if (ejq != null && ekt.f4066e != null) {
                    GLES20.glUseProgram(ejq.f3898d);
                    ekt.f4068g.mo13160a(1.0f);
                    i3 = 0;
                    while (true) {
                        try {
                            int i6 = i3;
                            if (i6 < arrayList.size()) {
                                float[] fArr3 = (float[]) arrayList.get(i6);
                                ejt ejt = ekt.f4066e;
                                Matrix.multiplyMM(ekt.f4072k, 0, fArr2, 0, fArr3, 0);
                                Matrix.multiplyMV(ekt.f4071j, 0, ekt.f4072k, 0, ekt.f4070i, 0);
                                ekt.m1890b(ekt.f4071j);
                                float[] fArr4 = ekt.f4071j;
                                float f5 = fArr4[0];
                                float f6 = ekt.f4074m;
                                f5 = (f5 * f6) + f6;
                                float f7 = fArr4[1];
                                f6 = ekt.f4075n;
                                f7 = (f7 * f6) + f6;
                                if (ejt != null) {
                                    ejt.mo13153a(fArr, f5, f7, 0.4f);
                                }
                                i3 = i6 + 1;
                            } else {
                                return;
                            }
                        } catch (Throwable e) {
                            kqg.f8786a.mo10213b(e);
                            return;
                        }
                    }
                }
            }
        }
    }
}

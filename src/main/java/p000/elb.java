package p000;

import android.graphics.PointF;
import android.opengl.GLES20;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: elb */
public final class elb implements eky {
    /* renamed from: a */
    private static final float[] f17529a = new float[]{-0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f};
    /* renamed from: b */
    private static final float[] f17530b = new float[]{-0.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f};
    /* renamed from: c */
    private final ArrayList f17531c = new ArrayList();

    /* renamed from: a */
    public final void mo6293a(float f, ekt ekt, float[] fArr, int i, int i2) {
        float f2;
        float f3;
        int i3;
        float f4 = ((float) i) / 2.0f;
        float f5 = ((float) i2) / 2.0f;
        float min = Math.min(f4, f5) * 0.95f;
        this.f17531c.clear();
        int length = f17529a.length;
        if (i > i2) {
            f2 = 1.3333334f;
        } else {
            f2 = 1.0f;
        }
        if (i > i2) {
            f3 = 1.0f;
        } else {
            f3 = 1.3333334f;
        }
        for (i3 = 0; i3 < length; i3++) {
            this.f17531c.add(new PointF((((f17529a[i3] * f) * min) * f2) + f4, (((f17530b[i3] * f) * min) * f3) + f5));
        }
        ArrayList arrayList = this.f17531c;
        if (arrayList != null) {
            ejq ejq = ekt.f4068g;
            if (ejq != null && ekt.f4066e != null) {
                GLES20.glUseProgram(ejq.f3898d);
                ekt.f4068g.mo13160a(1.0f);
                int i4 = 0;
                while (true) {
                    try {
                        i3 = i4;
                        if (i3 < arrayList.size()) {
                            PointF pointF = (PointF) arrayList.get(i3);
                            ejt ejt = ekt.f4066e;
                            if (ejt != null) {
                                ejt.mo13153a(fArr, pointF.x, pointF.y, 0.4f);
                            }
                            i4 = i3 + 1;
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

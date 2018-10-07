package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: exz */
public final class exz implements exk {
    /* renamed from: a */
    private final ccr f18003a;

    public exz(ccr ccr) {
        this.f18003a = ccr;
    }

    /* renamed from: a */
    public final float mo6669a(gid gid, gid gid2) {
        ccr ccr = this.f18003a;
        if (ccr != null && ccr.mo12450b()) {
            this.f18003a.mo12448a(Math.max((gid.f19184a + gid.f19185b) + gid.f19186c, (gid2.f19184a + gid2.f19185b) + gid2.f19186c));
            ccr = this.f18003a;
            bwy bwy = ccr.f12172b;
            if (bwy != null) {
                iqp iqp = ccr.f12174d;
                long j = gid.f19185b;
                float f = gid.f19188e;
                float f2 = gid.f19189f;
                float[] a = bwy.mo2200a(gid.f19192i);
                long j2 = gid.f19184a;
                long j3 = gid.f19186c;
                long j4 = gid.f19191h;
                long j5 = gid2.f19185b;
                float f3 = gid2.f19188e;
                float f4 = gid2.f19189f;
                float[] a2 = bwy.mo2200a(gid2.f19192i);
                long j6 = gid2.f19184a;
                long j7 = gid2.f19186c;
                long j8 = gid2.f19191h;
                long a3 = bwy.mo2196a(j2, j3, a);
                long a4 = bwy.mo2196a(j4, j3, a);
                j4 = bwy.mo2197a(j3, a);
                long a5 = bwy.mo2196a(j6, j7, a2);
                long a6 = bwy.mo2196a(j8, j7, a2);
                j8 = bwy.mo2197a(j7, a2);
                j2 = bwy.m1048a(a3, j4, j);
                float a7 = bwy.mo2195a(f, f2, a);
                long a8 = bwy.m1048a(a5, j8, j5);
                float a9 = bwy.mo2195a(f3, f4, a2);
                a = bwy.mo2199a(a4, j4, j, bwy.f1699c, a, false);
                float[] a10 = bwy.mo2199a(a6, j8, j5, bwy.f1699c, a2, false);
                jdf a11 = jdf.m4476a(bwy.f1697a.mo2264a(j2, a7, a[0], a[1], a8, a9, a10[0], a10[1], 0));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new float[]{null, null});
                arrayList.add(new float[]{(float) iqp.f7695a, null});
                arrayList.add(new float[]{null, (float) iqp.f7696b});
                arrayList.add(new float[]{(float) iqp.f7695a, (float) iqp.f7696b});
                int size = arrayList.size();
                float f5 = 0.0f;
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    float[] fArr = (float[]) arrayList.get(i);
                    a = a11.f8084a;
                    float f6 = a[6];
                    float f7 = fArr[0];
                    a9 = a[7];
                    float f8 = fArr[1];
                    f6 = ((f6 * f7) + (a9 * f8)) + a[8];
                    float[] fArr2 = new float[2];
                    fArr2[0] = (((f7 * a[0]) + (f8 * a[1])) + a[2]) / f6;
                    fArr2[1] = (a[5] + ((a[3] * fArr[0]) + (a[4] * fArr[1]))) / f6;
                    f5 = (float) Math.max((double) f5, Math.hypot((double) (fArr2[0] - fArr[0]), (double) (fArr2[1] - fArr[1])));
                    i = i2;
                }
                return f5;
            }
        }
        return -1.0f;
    }

    public final String toString() {
        return "GyroFrameDistanceMetric";
    }
}

package p000;

import android.util.Log;

/* renamed from: bww */
final /* synthetic */ class bww implements Runnable {
    /* renamed from: a */
    private final bwv f1695a;
    /* renamed from: b */
    private final iwp f1696b;

    bww(bwv bwv, iwp iwp) {
        this.f1695a = bwv;
        this.f1696b = iwp;
    }

    public final void run() {
        int i = 0;
        bwv bwv = this.f1695a;
        iwp iwp = this.f1696b;
        long[] jArr = (long[]) iwp.mo13730a(hsz.f6981i);
        int i2 = bwv.f11879b;
        if (i2 == 0) {
            int[] iArr = (int[]) iwp.mo13730a(hsz.f6982j);
            int[] iArr2 = (int[]) iwp.mo13730a(hsz.f6983k);
            if (jArr == null || iArr == null || iArr2 == null) {
                Log.e("OisListener", "Null pointer for OIS data. API version: 0");
            } else {
                while (i < jArr.length) {
                    bwv.f11878a.mo2266a(jArr[i], (float) iArr[i], (float) iArr2[i]);
                    i++;
                }
            }
        } else if (i2 == 1) {
            float[] fArr = (float[]) iwp.mo13730a(hsz.f6984l);
            float[] fArr2 = (float[]) iwp.mo13730a(hsz.f6985m);
            if (jArr == null || fArr == null || fArr2 == null) {
                Log.e("OisListener", "Null pointer for OIS data. API version: 1");
            } else {
                while (i < jArr.length) {
                    bwv.f11878a.mo2266a(jArr[i], fArr[i], fArr2[i]);
                    i++;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Invalid OIS API version: ");
            stringBuilder.append(i2);
            Log.e("OisListener", stringBuilder.toString());
        }
        for (fiw a_ : bwv.f11880c) {
            a_.mo6826a_(iwp);
        }
    }
}

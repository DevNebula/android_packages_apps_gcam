package p000;

import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import java.util.List;

/* compiled from: PG */
/* renamed from: iuw */
public final class iuw {
    /* renamed from: a */
    public static void m4317a(iwz iwz, iwz iwz2) {
        boolean z;
        jri.m13404b((Object) iwz);
        jri.m13404b((Object) iwz2);
        if (iwz.mo13741c() == iwz2.mo13741c()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (iwz.mo13741c() != 34) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (iwz2.mo13741c() != 34) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        iqp iqp = new iqp(iwz.mo13745g(), iwz.mo13742d());
        iqp iqp2 = new iqp(iwz2.mo13745g(), iwz2.mo13742d());
        boolean equals = iqp.equals(iqp2);
        String valueOf = String.valueOf(iqp);
        String valueOf2 = String.valueOf(iqp2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 60) + String.valueOf(valueOf2).length());
        stringBuilder.append("source image size ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" is different with destination image size ");
        stringBuilder.append(valueOf2);
        jri.m13396a(equals, stringBuilder.toString());
        if (iwz.mo13741c() == 35) {
            List e = iwz.mo13743e();
            List e2 = iwz2.mo13743e();
            if (YuvUtilNative.m1380a(iwz.mo13745g(), iwz.mo13742d(), ((ixa) e.get(0)).mo9144a(), ((ixa) e.get(1)).mo9144a(), ((ixa) e.get(2)).mo9144a(), ((ixa) e.get(0)).mo9146c(), ((ixa) e.get(1)).mo9146c(), ((ixa) e.get(1)).mo9145b(), ((ixa) e2.get(0)).mo9144a(), ((ixa) e2.get(1)).mo9144a(), ((ixa) e2.get(2)).mo9144a(), ((ixa) e2.get(0)).mo9146c(), ((ixa) e2.get(1)).mo9146c(), ((ixa) e2.get(1)).mo9145b())) {
                for (ixa a : iwz2.mo13743e()) {
                    a.mo9144a().rewind();
                }
                return;
            }
            throw new IllegalStateException("Copy failed.");
        }
        int c = iwz.mo13741c();
        StringBuilder stringBuilder2 = new StringBuilder(37);
        stringBuilder2.append("Unsupported image format: ");
        stringBuilder2.append(c);
        throw new UnsupportedOperationException(stringBuilder2.toString());
    }
}

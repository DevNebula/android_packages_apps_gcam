package p000;

import android.graphics.Rect;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ggg */
final class ggg {
    static {
        bli.m887a("LSScorer");
    }

    /* renamed from: a */
    public static double m2594a(gfw gfw) {
        iwz iwz = gfw.f5387b;
        ixa ixa = (ixa) iwz.mo13743e().get(0);
        int g = iwz.mo13745g();
        int d = iwz.mo13742d();
        ByteBuffer a = ixa.mo9144a();
        int b = ixa.mo9145b();
        int c = ixa.mo9146c();
        Rect rect = gfw.f5391f;
        return (double) ImgUtilNative.m1353a(g, d, a, b, c, rect.left, rect.top, rect.right, rect.bottom);
    }
}

package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;

/* renamed from: eye */
final /* synthetic */ class eye implements Runnable {
    /* renamed from: a */
    private final eyl f4572a;
    /* renamed from: b */
    private final kpk f4573b;
    /* renamed from: c */
    private final kpk f4574c;

    eye(eyl eyl, kpk kpk, kpk kpk2, int i) {
        this.f4572a = eyl;
        this.f4573b = kpk;
        this.f4574c = kpk2;
    }

    public final void run() {
        eyl eyl = this.f4572a;
        Future future = this.f4573b;
        iwz iwz = (iwz) kow.m13881c(future);
        Bitmap bitmap = (Bitmap) kow.m13881c(this.f4574c);
        if (bitmap == null || iwz == null) {
            bli.m898e("MeanVarianceToneMapParameterExtractor", "Skip tone mapping extraction, either shutter frame or postview bitmap is null.");
            return;
        }
        Object iyq = new iyq();
        iyp iyp = new iyp();
        int g = iwz.mo13745g();
        int d = iwz.mo13742d();
        ixa ixa = (ixa) iwz.mo13743e().get(1);
        ixa ixa2 = (ixa) iwz.mo13743e().get(2);
        ByteBuffer a = cdn.m1143a(g, d, (ixa) iwz.mo13743e().get(0));
        int i = g / 2;
        int i2 = d / 2;
        ByteBuffer a2 = cdn.m1143a(i, i2, ixa);
        ByteBuffer a3 = cdn.m1143a(i, i2, ixa2);
        int width = bitmap.getWidth();
        i = bitmap.getHeight();
        int i3 = width * i;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3);
        int i4 = i3 / 4;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i4);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i4);
        MicrovideoToneMapNative.argbToYuv(bitmap, allocateDirect, allocateDirect2, allocateDirect3);
        MicrovideoToneMapNative.extractMeanVarianceMappingNative(g, d, a, a2, a3, width, i, allocateDirect, allocateDirect2, allocateDirect3, iyp);
        iyq.f24721a = iyp;
        eyl.f4585a.mo15641a(iyq);
        ((iwz) kow.m13881c(future)).close();
    }
}

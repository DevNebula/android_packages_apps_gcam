package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;

/* compiled from: PG */
/* renamed from: brb */
final class brb implements Runnable {
    /* renamed from: a */
    private final gfw f1511a;
    /* renamed from: b */
    private final kpw f1512b;

    public brb(gfw gfw, kpw kpw) {
        this.f1511a = gfw;
        this.f1512b = kpw;
    }

    public final void run() {
        try {
            kpk kpk = this.f1511a.f5389d;
            if (kpk != null) {
                iwp iwp = (iwp) kpk.get();
                ixa ixa = (ixa) this.f1511a.f5387b.mo13743e().get(0);
                ixa ixa2 = (ixa) this.f1511a.f5387b.mo13743e().get(1);
                ixa ixa3 = (ixa) this.f1511a.f5387b.mo13743e().get(2);
                Face[] faceArr = (Face[]) iwp.mo13730a(CaptureResult.STATISTICS_FACES);
                Rect rect = (Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION);
                if (faceArr != null) {
                    int length = faceArr.length;
                    if (length > 0 && rect != null) {
                        Rect[] rectArr = new Rect[length];
                        for (int i = 0; i < faceArr.length; i++) {
                            Rect bounds = faceArr[i].getBounds();
                            rectArr[i] = new Rect(((bounds.left - rect.left) * this.f1511a.f5387b.mo13745g()) / rect.width(), ((bounds.top - rect.top) * this.f1511a.f5387b.mo13742d()) / rect.height(), ((bounds.right - rect.left) * this.f1511a.f5387b.mo13745g()) / rect.width(), ((bounds.bottom - rect.top) * this.f1511a.f5387b.mo13742d()) / rect.height());
                        }
                        byte[] nativeFaceBeautification = FaceBeautificationNative.nativeFaceBeautification(this.f1511a.f5387b.mo13741c(), this.f1511a.f5387b.mo13745g(), this.f1511a.f5387b.mo13742d(), ixa.mo9144a(), ixa.mo9145b(), ixa.mo9146c(), ixa2.mo9144a(), ixa2.mo9145b(), ixa2.mo9146c(), ixa3.mo9144a(), ixa3.mo9145b(), ixa3.mo9146c(), rectArr);
                        grg grg = this.f1511a.f5390e;
                        if (grg != null) {
                            grg.mo7372a((kkc) kvl.mergeFrom(new kkc(), nativeFaceBeautification));
                        }
                    }
                }
            }
            this.f1512b.mo15641a(this.f1511a);
        } catch (Throwable th) {
            this.f1512b.mo15642a(th);
        }
    }
}

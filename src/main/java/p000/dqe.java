package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: dqe */
final class dqe extends fiw {
    /* renamed from: a */
    private final iqt f16483a;

    public dqe(iqt iqt) {
        this.f16483a = iqt;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        if (iwp != null) {
            this.f16483a.mo8826a(new fvj((Face[]) iwp.mo13730a(CaptureResult.STATISTICS_FACES), (Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION)));
        }
    }
}

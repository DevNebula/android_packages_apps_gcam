package p000;

import android.hardware.camera2.CameraAccessException;

/* renamed from: ivq */
final /* synthetic */ class ivq implements iqo {
    /* renamed from: a */
    private final iwg f21326a;

    ivq(iwg iwg) {
        this.f21326a = iwg;
    }

    public final void close() {
        try {
            this.f21326a.mo13717d();
        } catch (CameraAccessException e) {
        } catch (iwf e2) {
        }
    }
}

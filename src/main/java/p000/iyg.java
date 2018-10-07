package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

/* renamed from: iyg */
final /* synthetic */ class iyg implements OnFrameAvailableListener {
    /* renamed from: a */
    private final iye f7914a;

    iyg(iye iye) {
        this.f7914a = iye;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        iye iye = this.f7914a;
        synchronized (iye.f21380m) {
            if (!iye.f21385r && iye.f21381n.mo9709b()) {
                iye.f21369b.execute(new iyh(iye));
            }
        }
    }
}

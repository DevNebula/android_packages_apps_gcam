package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.view.Surface;

/* renamed from: iyi */
final /* synthetic */ class iyi implements Runnable {
    /* renamed from: a */
    private final iye f7916a;
    /* renamed from: b */
    private final jek f7917b;
    /* renamed from: c */
    private final izv f7918c;
    /* renamed from: d */
    private final OnFrameAvailableListener f7919d;
    /* renamed from: e */
    private final kpw f7920e;

    iyi(iye iye, jek jek, izv izv, OnFrameAvailableListener onFrameAvailableListener, kpw kpw) {
        this.f7916a = iye;
        this.f7917b = jek;
        this.f7918c = izv;
        this.f7919d = onFrameAvailableListener;
        this.f7920e = kpw;
    }

    public final void run() {
        iye iye = this.f7916a;
        jek jek = this.f7917b;
        izu izu = this.f7918c;
        OnFrameAvailableListener onFrameAvailableListener = this.f7919d;
        knk knk = this.f7920e;
        synchronized (iye.f21380m) {
            if (iye.f21385r) {
                return;
            }
            iye.f21375h.mo8856a("createInputSurface");
            iye.f21373f = new SurfaceTexture(((jfb) jek.mo15035c()).mo15038i(), false);
            iye.f21373f.setDefaultBufferSize(izu.f7958a[0], izu.mo9245b());
            iye.f21373f.setOnFrameAvailableListener(onFrameAvailableListener);
            knk.mo15641a(new Surface(iye.f21373f));
            iye.f21375h.mo8857b();
        }
    }
}

package p000;

import android.util.Size;
import android.view.Surface;

/* renamed from: iyk */
final /* synthetic */ class iyk implements Runnable {
    /* renamed from: a */
    private final iye f7922a;
    /* renamed from: b */
    private final Surface f7923b;
    /* renamed from: c */
    private final Size f7924c;

    iyk(iye iye, Surface surface, Size size) {
        this.f7922a = iye;
        this.f7923b = surface;
        this.f7924c = size;
    }

    public final void run() {
        iye iye = this.f7922a;
        Surface surface = this.f7923b;
        Size size = this.f7924c;
        synchronized (iye.f21380m) {
            iye.f21375h.mo8856a("setOutputSurface");
            jri.m13406b(iye.f21385r ^ 1, (Object) "Tried to set output surface after ViewfinderEffectsPipeline is closed");
            if (iye.f21381n.mo9709b()) {
                if (iye.f21382o.mo15044c() == surface && iye.f21382o.mo15581d() == null) {
                    throw new jhu();
                }
                ((jdk) iye.f21381n.mo9706a()).close();
            }
            iye.f21382o = new jfo(surface);
            jdo jdo = iye.f21369b;
            iye.f21381n = kbg.m4804c(new jdk(jdo, jdo.mo15034f().mo15564a(new jdm(iye.f21382o, izu.m4426a(size.getWidth(), size.getHeight())))));
            iye.f21375h.mo8857b();
        }
    }
}

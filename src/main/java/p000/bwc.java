package p000;

/* compiled from: PG */
/* renamed from: bwc */
final class bwc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bwb f1680a;

    bwc(bwb bwb) {
        this.f1680a = bwb;
    }

    public final void run() {
        synchronized (this.f1680a.f1678k) {
            bwb bwb = this.f1680a;
            if (!(bwb.f1670c == null || bwb.f1672e == null)) {
                bwb.f1677j.mo2186a(bwb.f1674g);
                bwb = this.f1680a;
                bwb.f1673f.eglSwapBuffers(bwb.f1670c, bwb.f1672e);
                this.f1680a.f1675h = false;
            }
            this.f1680a.f1678k.notifyAll();
        }
    }
}

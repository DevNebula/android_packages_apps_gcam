package p000;

/* compiled from: PG */
/* renamed from: gfb */
final class gfb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gfn f5369a;
    /* renamed from: b */
    private final /* synthetic */ gfa f5370b;

    gfb(gfa gfa, gfn gfn) {
        this.f5370b = gfa;
        this.f5369a = gfn;
    }

    public final void run() {
        gfo gfo = this.f5370b.f19127f;
        gfn gfn = this.f5369a;
        synchronized (gfo.f19144a) {
            if (gfo.f19144a.contains(gfn)) {
                gfo.f19144a.remove(gfn);
                gfo.f19145b.remove(gfn);
                gfr gfr = new gfr(gfo);
            } else {
                gfs gfs = new gfs(gfo);
            }
        }
    }
}

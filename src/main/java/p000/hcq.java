package p000;

/* renamed from: hcq */
final /* synthetic */ class hcq implements Runnable {
    /* renamed from: a */
    private final hcx f6356a;
    /* renamed from: b */
    private final hcn f6357b;
    /* renamed from: c */
    private final hcz f6358c;

    hcq(hcx hcx, hcn hcn, hcz hcz) {
        this.f6356a = hcx;
        this.f6357b = hcn;
        this.f6358c = hcz;
    }

    public final void run() {
        hcx hcx = this.f6356a;
        hcx.f19914g.post(new hcu(hcx, this.f6357b, this.f6358c));
    }
}

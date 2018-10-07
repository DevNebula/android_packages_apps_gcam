package p000;

/* renamed from: hcr */
final /* synthetic */ class hcr implements Runnable {
    /* renamed from: a */
    private final hcx f6359a;
    /* renamed from: b */
    private final hcn f6360b;
    /* renamed from: c */
    private final hcz f6361c;

    hcr(hcx hcx, hcn hcn, hcz hcz) {
        this.f6359a = hcx;
        this.f6360b = hcn;
        this.f6361c = hcz;
    }

    public final void run() {
        hcx hcx = this.f6359a;
        hcx.f19914g.post(new hcv(hcx, this.f6360b, this.f6361c));
    }
}

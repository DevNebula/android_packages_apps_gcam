package p000;

/* renamed from: hct */
final /* synthetic */ class hct implements iqo {
    /* renamed from: a */
    private final hcx f19903a;
    /* renamed from: b */
    private final hcn f19904b;
    /* renamed from: c */
    private final hcz f19905c;

    hct(hcx hcx, hcn hcn, hcz hcz) {
        this.f19903a = hcx;
        this.f19904b = hcn;
        this.f19905c = hcz;
    }

    public final void close() {
        hcx hcx = this.f19903a;
        hcn hcn = this.f19904b;
        hcz hcz = this.f19905c;
        synchronized (hcx.f19927t) {
            hcx.f19926s = true;
        }
        hcn.close();
        hcz.close();
    }
}

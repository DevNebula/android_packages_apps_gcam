package p000;

/* renamed from: hcv */
final /* synthetic */ class hcv implements Runnable {
    /* renamed from: a */
    private final hcx f6366a;
    /* renamed from: b */
    private final hcn f6367b;
    /* renamed from: c */
    private final hcz f6368c;

    hcv(hcx hcx, hcn hcn, hcz hcz) {
        this.f6366a = hcx;
        this.f6367b = hcn;
        this.f6368c = hcz;
    }

    public final void run() {
        hcx hcx = this.f6366a;
        hcn hcn = this.f6367b;
        hcz hcz = this.f6368c;
        hcn.f6351a.mo7731a();
        if (hcx.f19923p && hcx.f19913f.get() > 0) {
            hcz.mo13523b();
        }
    }
}

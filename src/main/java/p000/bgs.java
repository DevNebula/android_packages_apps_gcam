package p000;

/* compiled from: PG */
/* renamed from: bgs */
public final class bgs extends fiw {
    /* renamed from: a */
    private final fcb f11338a;
    /* renamed from: b */
    private final fcp f11339b;
    /* renamed from: c */
    private boolean f11340c = false;

    static {
        bli.m887a("AaaReqCalbak");
    }

    public bgs(fcb fcb, fcp fcp) {
        this.f11338a = fcb;
        this.f11339b = fcp;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        this.f11339b.mo8826a(iwp);
        this.f11340c = this.f11339b.f24241b.isDone();
        if (this.f11340c) {
            this.f11338a.mo8826a(iwp);
        }
    }
}

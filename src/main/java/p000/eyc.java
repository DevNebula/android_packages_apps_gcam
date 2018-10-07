package p000;

/* renamed from: eyc */
final /* synthetic */ class eyc implements Runnable {
    /* renamed from: a */
    private final eyb f4569a;
    /* renamed from: b */
    private final iwp f4570b;
    /* renamed from: c */
    private final iqm f4571c;

    eyc(eyb eyb, iwp iwp, iqm iqm) {
        this.f4569a = eyb;
        this.f4570b = iwp;
        this.f4571c = iqm;
    }

    public final void run() {
        eyb eyb = this.f4569a;
        gid gid = new gid(this.f4570b, this.f4571c.f7692e, eyb.f18007c);
        long j = gid.f19184a;
        eyb.f18008d = j;
        exd exd = eyb.f18005a;
        exd.f4555a.mo9155a(euh.m2174a(j), gid);
        exd.mo6665a(gid);
    }
}

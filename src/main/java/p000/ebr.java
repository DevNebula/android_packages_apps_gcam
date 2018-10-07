package p000;

/* renamed from: ebr */
final /* synthetic */ class ebr implements iqb {
    /* renamed from: a */
    private final ebq f17216a;
    /* renamed from: b */
    private final hfz f17217b;
    /* renamed from: c */
    private final csp f17218c;

    ebr(ebq ebq, hfz hfz, csp csp) {
        this.f17216a = ebq;
        this.f17217b = hfz;
        this.f17218c = csp;
    }

    /* renamed from: a */
    public final void mo8765a(Object obj) {
        ebq ebq = this.f17216a;
        hfz hfz = this.f17217b;
        csp csp = this.f17218c;
        err a = ebq.mo13143a(hfz);
        if (a != null) {
            ebq.mo13145a(csp, hfz, a);
        } else {
            bli.m891b(ebq.f17201a, "filmstrip item was null");
        }
    }
}

package p000;

/* compiled from: PG */
/* renamed from: ebs */
final class ebs implements ctt {
    /* renamed from: a */
    private final /* synthetic */ csp f17219a;
    /* renamed from: b */
    private final /* synthetic */ ebq f17220b;

    ebs(ebq ebq, csp csp) {
        this.f17220b = ebq;
        this.f17219a = csp;
    }

    /* renamed from: a */
    public final void mo5807a() {
        bli.m894c(ebq.f17201a, "onTransitionCancel");
    }

    /* renamed from: b */
    public final void mo5808b() {
        bli.m894c(ebq.f17201a, "onTransitionEnd");
        ebq ebq = this.f17220b;
        csp csp = this.f17219a;
        hfz hfz = (hfz) ebq.f17202b.mo10562a();
        err a = ebq.mo13143a(hfz);
        if (a == null) {
            bli.m888a(ebq.f17201a, "no item found at index 0, requestLoad");
            hfz.mo7823a(new ebr(ebq, hfz, csp));
            return;
        }
        ebq.mo13145a(csp, hfz, a);
    }

    /* renamed from: c */
    public final void mo5809c() {
    }
}

package p000;

/* compiled from: PG */
/* renamed from: ehs */
class ehs extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehp f24187a;

    ehs(ehp ehp) {
        this.f24187a = ehp;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(ehp.f24180f, "enter ready for capture state");
        this.f24187a.f24183i.mo7000a();
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(ehp.f24180f, "exit ready for capture state");
    }

    /* renamed from: I */
    public void mo13406I() {
        this.f24187a.f24181g.startPanoramaCalibration();
        this.f24187a.f24182h.mo7670a(hbf.CONFIRM_DISABLED);
    }
}

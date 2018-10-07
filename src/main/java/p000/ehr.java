package p000;

/* compiled from: PG */
/* renamed from: ehr */
class ehr extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehp f24186a;

    ehr(ehp ehp) {
        this.f24186a = ehp;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f24186a.f24183i.mo7004b();
        bli.m888a(ehp.f24180f, "enter capturing state.");
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(ehp.f24180f, "exit capturing state.");
    }

    /* renamed from: F */
    public void mo13403F() {
        this.f24186a.f24181g.stopPanoramaCapture();
        this.f24186a.f24182h.mo7670a(hbf.PHOTO_IDLE);
        bli.m888a(ehp.f24180f, "Cancel photosphere capture");
    }

    /* renamed from: G */
    public void mo13404G() {
        this.f24186a.f24181g.stopPanoramaCapture();
        this.f24186a.f24182h.mo7670a(hbf.CONFIRM_YES_TRANSIENT);
        bli.m888a(ehp.f24180f, "Finish photosphere capture");
    }
}

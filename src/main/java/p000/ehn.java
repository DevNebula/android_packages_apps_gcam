package p000;

/* compiled from: PG */
/* renamed from: ehn */
class ehn extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehm f24179a;

    ehn(ehm ehm) {
        this.f24179a = ehm;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(ehm.f24174d, "enter capturing state");
        this.f24179a.f24178h.mo7004b();
        this.f24179a.f24175e.startLensBlurCapture();
        this.f24179a.f24176f.mo7670a(hbf.CANCEL);
        this.f24179a.f24177g.mo13473a(false);
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(ehm.f24174d, "exit capturing state");
        this.f24179a.f24178h.mo7000a();
        this.f24179a.f24175e.stopLensBlurCapture();
        this.f24179a.f24176f.mo7670a(hbf.PHOTO_IDLE);
        this.f24179a.f24177g.mo13473a(true);
    }

    /* renamed from: E */
    public void mo13402E() {
    }
}

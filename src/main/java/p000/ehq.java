package p000;

/* compiled from: PG */
/* renamed from: ehq */
class ehq extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehp f24185a;

    ehq(ehp ehp) {
        this.f24185a = ehp;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f24185a.f24183i.mo7004b();
        bli.m888a(ehp.f24180f, "enter calibration state.");
        this.f24185a.f24184j.mo8826a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f24185a.f24184j.mo8826a(Boolean.valueOf(false));
    }

    /* renamed from: F */
    public void mo13403F() {
        this.f24185a.f24183i.mo7000a();
        this.f24185a.f24181g.stopPanoramaCapture();
        this.f24185a.f24182h.mo7670a(hbf.PHOTO_IDLE);
        bli.m888a(ehp.f24180f, "Cancel photosphere capture");
    }

    /* renamed from: J */
    public void mo13407J() {
        this.f24185a.f24182h.mo7670a(hbf.CONFIRM_ENABLED);
    }
}

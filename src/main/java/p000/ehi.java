package p000;

/* compiled from: PG */
/* renamed from: ehi */
class ehi extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehg f24165a;

    ehi(ehg ehg) {
        this.f24165a = ehg;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        ehg ehg = this.f24165a;
        ehg.f24161d = true;
        ehg.f24164g.f5222b.mo14607b();
        this.f24165a.f24164g.mo7004b();
        this.f24165a.f24162e.startHfrRecording();
        this.f24165a.f24163f.mo7670a(hbf.VIDEO_RECORDING);
    }

    /* renamed from: b */
    public final void mo7344b() {
        ehg ehg = this.f24165a;
        ehg.f24161d = false;
        ehg.f24164g.mo7000a();
        this.f24165a.f24164g.f5222b.mo14609c();
        this.f24165a.f24162e.stopHfrRecording();
        this.f24165a.f24163f.mo7670a(hbf.VIDEO_IDLE);
    }

    /* renamed from: A */
    public void mo6224A() {
    }
}

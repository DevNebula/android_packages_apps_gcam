package p000;

/* compiled from: PG */
/* renamed from: edj */
class edj extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edf f24147a;

    edj(edf edf) {
        this.f24147a = edf;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edf.f24130a, "enter SlowMo state");
        edf edf = this.f24147a;
        edf.f24132c.f2636e = true;
        edf.f24133d.setVisibility(0);
        this.f24147a.f24135f.switchToVideoHfr();
        hcd hcd = this.f24147a.f24136g;
        hcd.mo7670a(hbf.VIDEO_IDLE);
        hcd.f6321a.setVisibility(0);
        this.f24147a.f24143n.mo8826a(hhx.SLOW_MOTION);
        this.f24147a.f24138i.mo8003c();
        this.f24147a.f24131b.mo14885a(edj.class);
        this.f24147a.f24142m.mo2206b();
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edf.f24130a, "exit SlowMo state");
        this.f24147a.f24131b.mo14886b(edj.class);
        edf edf = this.f24147a;
        edf.f24132c.f2636e = false;
        edf.f24138i.mo7996a();
        this.f24147a.f24138i.mo8010i();
        this.f24147a.f24142m.mo2204a();
    }

    /* renamed from: s */
    public void mo13450s() {
    }
}

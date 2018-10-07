package p000;

/* compiled from: PG */
/* renamed from: ehw */
class ehw extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehu f24200a;

    ehw(ehu ehu) {
        this.f24200a = ehu;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(ehu.f24189d, "enter Video state");
        if (!((Boolean) this.f24200a.f24190a.mo13673b()).booleanValue()) {
            this.f24200a.f24190a.mo8826a(Boolean.valueOf(true));
        }
        this.f24200a.f24197j.mo7569b(hhx.VIDEO);
        this.f24200a.f24194g.switchToVideo();
        this.f24200a.f24195h.mo7669a();
        this.f24200a.f24194g.setProgress(1.0f, false);
        this.f24200a.f24191b.mo8826a(hhx.VIDEO);
        this.f24200a.f24192e.mo14885a(ehw.class);
        this.f24200a.f24193f.mo2206b();
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(ehu.f24189d, "exit Video state");
        this.f24200a.f24192e.mo14886b(ehw.class);
        this.f24200a.f24196i.mo8006e();
        this.f24200a.f24193f.mo2204a();
    }

    /* renamed from: K */
    public void mo13408K() {
    }
}

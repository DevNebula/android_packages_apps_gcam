package p000;

/* compiled from: PG */
/* renamed from: ehv */
class ehv extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehu f24199a;

    ehv(ehu ehu) {
        this.f24199a = ehu;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(ehu.f24189d, "enter Photo state");
        this.f24199a.f24197j.mo7569b(hhx.PHOTO);
        this.f24199a.f24194g.setProgress(1.0f, true);
        this.f24199a.f24194g.switchToPhoto();
        hcd hcd = this.f24199a.f24195h;
        hcd.mo7670a(hbf.PHOTO_IDLE);
        hcd.f6321a.setVisibility(0);
        this.f24199a.f24191b.mo8826a(hhx.PHOTO);
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(ehu.f24189d, "exit Photo state");
        this.f24199a.f24196i.mo8006e();
    }

    /* renamed from: L */
    public void mo13409L() {
    }
}

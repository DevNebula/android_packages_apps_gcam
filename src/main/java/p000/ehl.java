package p000;

/* compiled from: PG */
/* renamed from: ehl */
class ehl extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehj f24173a;

    ehl(ehj ehj) {
        this.f24173a = ehj;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f24173a.f24168d.switchToPhotoIntentReview();
        hcd hcd = this.f24173a.f24169e;
        hcd.f6321a.setEnabled(true);
        hcd.mo7670a(hbf.CONFIRM_ENABLED);
        this.f24173a.f24171g.f5222b.mo14607b();
        this.f24173a.f24171g.mo7004b();
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f24173a.f24168d.returnToPhotoIntent();
        this.f24173a.f24169e.mo7670a(hbf.PHOTO_IDLE);
        this.f24173a.f24171g.mo7000a();
        this.f24173a.f24171g.f5222b.mo14609c();
    }

    /* renamed from: C */
    public void mo13400C() {
    }
}

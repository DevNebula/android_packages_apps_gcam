package p000;

/* compiled from: PG */
/* renamed from: edp */
class edp extends edn {
    /* renamed from: a */
    private final /* synthetic */ edo f26253a;

    edp(edo edo) {
        this.f26253a = edo;
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edo.f26238a, "enter Lens Blur state");
        this.f26253a.f26243f.setVisibility(0);
        this.f26253a.f26245h.switchToLensBlur();
        hcd hcd = this.f26253a.f26246i;
        hcd.mo7670a(hbf.PHOTO_IDLE);
        hcd.f6321a.setVisibility(0);
        edo edo = this.f26253a;
        edo.f26242e.f2636e = true;
        edo.f26252o.mo8826a(hhx.LENS_BLUR);
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edo.f26238a, "exit Lens Blur state");
        this.f26253a.f26242e.f2636e = false;
    }

    /* renamed from: s */
    public void mo13450s() {
    }
}

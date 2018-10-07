package p000;

/* compiled from: PG */
/* renamed from: edr */
class edr extends edn {
    /* renamed from: a */
    private final /* synthetic */ edo f26256a;

    edr(edo edo) {
        this.f26256a = edo;
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edo.f26238a, "enter Gouda state");
        boolean a = this.f26256a.f26250m.mo2107a(gdp.f5332d);
        hcd hcd = this.f26256a.f26246i;
        hcd.mo7670a(hbf.PORTRAIT_IDLE);
        hcd.f6321a.setVisibility(0);
        edo edo = this.f26256a;
        edo.f26242e.f2636e = true;
        edo.f26248k.mo8003c();
        this.f26256a.f26248k.mo8010i();
        this.f26256a.f26245h.switchToPortrait(a);
        this.f26256a.f26252o.mo8826a(hhx.PORTRAIT);
        this.f26256a.f26244g.mo6731a();
        this.f26256a.f26251n.mo13473a(a);
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edo.f26238a, "exit Gouda state");
        edo edo = this.f26256a;
        edo.f26242e.f2636e = false;
        edo.f26248k.mo7996a();
        this.f26256a.f26248k.mo8004c(1.0f);
        this.f26256a.f26248k.mo8010i();
        this.f26256a.f26251n.mo13473a(true);
    }

    /* renamed from: s */
    public void mo13450s() {
    }
}

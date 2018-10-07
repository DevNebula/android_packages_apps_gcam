package p000;

/* compiled from: PG */
/* renamed from: edl */
class edl extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edk f24156a;

    edl(edk edk) {
        this.f24156a = edk;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f24156a.f24149b.mo8826a(Boolean.valueOf(true));
        edk edk = this.f24156a;
        gyz gyz = edk.f24148a;
        edk.f24154g = gyz.f6196d.f6212e;
        gyz.mo7566a(false);
        this.f24156a.f24150c.f1445a.mo13438e();
        this.f24156a.f24151d.startCountdown();
        this.f24156a.f24152e.mo7670a(hbf.CANCEL);
        this.f24156a.f24153f.mo13473a(false);
        this.f24156a.f24155h.mo7004b();
        hnu.f6750a = false;
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f24156a.f24149b.mo8826a(Boolean.valueOf(false));
        edk edk = this.f24156a;
        edk.f24148a.mo7566a(edk.f24154g);
        this.f24156a.f24151d.stopCountdown();
        hcd hcd = this.f24156a.f24152e;
        hcd.mo7670a(hcd.f6324d);
        this.f24156a.f24153f.mo13473a(true);
        this.f24156a.f24155h.mo7000a();
        hnu.f6750a = true;
    }

    /* renamed from: t */
    public void mo13452t() {
    }
}

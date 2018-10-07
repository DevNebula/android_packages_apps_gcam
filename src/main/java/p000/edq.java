package p000;

/* compiled from: PG */
/* renamed from: edq */
class edq extends edn {
    /* renamed from: a */
    private eti f26254a;
    /* renamed from: b */
    private final /* synthetic */ edo f26255b;

    edq(edo edo) {
        this.f26255b = edo;
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a(edo.f26238a, "enter PhotoVideo state");
        edo edo = this.f26255b;
        edo.f26241d.setVisibility(8);
        edo.f26240c.setVisibility(0);
        this.f26255b.f26239b.mo13526a(true);
        edo = this.f26255b;
        edo.f26242e.f2636e = true;
        edo.f26244g.mo6731a();
        this.f26255b.f26243f.setVisibility(0);
        this.f26255b.f26248k.mo8003c();
        this.f26255b.f26245h.enablePhotoVideoSwitch();
        if (this.f26255b.f26249l.mo9709b() && this.f26254a != null) {
            ((eth) this.f26255b.f26249l.mo9706a()).mo13181a(this.f26254a);
        }
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a(edo.f26238a, "exit PhotoVideo state");
        this.f26255b.f26247j.mo13451s_();
        edo edo = this.f26255b;
        edo.f26242e.f2636e = false;
        edo.f26248k.mo7996a();
        this.f26255b.f26245h.disablePhotoVideoSwitch();
        if (this.f26255b.f26249l.mo9709b()) {
            this.f26254a = ((eth) this.f26255b.f26249l.mo9706a()).mo13180a();
            ((eth) this.f26255b.f26249l.mo9706a()).mo13181a(eti.MICROVIDEO_MODE_OFF);
        }
    }

    /* renamed from: o_ */
    public void mo14874o_() {
    }

    /* renamed from: p_ */
    public void mo14875p_() {
    }
}

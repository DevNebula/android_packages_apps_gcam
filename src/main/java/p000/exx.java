package p000;

/* compiled from: PG */
/* renamed from: exx */
public final class exx {
    /* renamed from: a */
    private final exd f4561a;
    /* renamed from: b */
    private final ccr f4562b;
    /* renamed from: c */
    private final iqp f4563c;
    /* renamed from: d */
    private final hjf f4564d;
    /* renamed from: e */
    private final eyb f4565e;
    /* renamed from: f */
    private volatile boolean f4566f = false;

    public exx(exd exd, ccr ccr, hjf hjf, iqp iqp, eyb eyb) {
        this.f4561a = exd;
        this.f4565e = eyb;
        this.f4562b = ccr;
        this.f4563c = iqp;
        this.f4564d = hjf;
    }

    /* renamed from: a */
    public final boolean mo6671a() {
        if (!this.f4564d.f6633b.f7875e && !this.f4562b.mo12451c()) {
            bli.m891b("GyroCaptureInitializer", "One of several gyro sensor properties is null. No gyro available for microvideo");
            return false;
        } else if (this.f4566f) {
            return true;
        } else {
            iqp iqp = this.f4563c;
            iqp iqp2 = new iqp(iqp.f7695a, iqp.f7696b);
            this.f4565e.mo13201a(true);
            this.f4561a.mo6662a();
            this.f4562b.mo12449a(iqp2);
            this.f4566f = true;
            return true;
        }
    }

    /* renamed from: b */
    public final void mo6672b() {
        this.f4565e.mo13201a(false);
        this.f4562b.mo12452d();
        this.f4566f = false;
    }
}

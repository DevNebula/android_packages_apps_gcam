package p000;

/* compiled from: PG */
/* renamed from: eun */
public final class eun {
    /* renamed from: a */
    private final exi f4476a;
    /* renamed from: b */
    private final kbg f4477b;
    /* renamed from: c */
    private final exx f4478c;
    /* renamed from: d */
    private boolean f4479d = false;
    /* renamed from: e */
    private boolean f4480e = true;
    /* renamed from: f */
    private boolean f4481f = false;

    public eun(exi exi, kbg kbg, exx exx) {
        this.f4476a = exi;
        this.f4477b = kbg;
        this.f4478c = exx;
    }

    /* renamed from: a */
    public final synchronized void mo6602a(boolean z) {
        this.f4480e = z;
        m2183a();
    }

    /* renamed from: b */
    public final synchronized void mo6603b(boolean z) {
        this.f4481f = z;
        m2183a();
    }

    /* renamed from: a */
    private final void m2183a() {
        boolean z;
        if (this.f4480e) {
            z = true;
        } else if (this.f4481f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f4479d != z) {
            if (z) {
                this.f4476a.mo13199a(true);
                if (this.f4477b.mo9709b()) {
                    this.f4477b.mo9706a();
                    throw new NoSuchMethodError();
                } else {
                    this.f4478c.mo6671a();
                    bli.m888a("MvCapAdj", "starting gyro capture and adjusting upwards HLINE CIRCLE");
                }
            } else {
                this.f4476a.mo13199a(false);
                if (this.f4477b.mo9709b()) {
                    this.f4477b.mo9706a();
                    throw new NoSuchMethodError();
                } else {
                    this.f4478c.mo6672b();
                    bli.m888a("MvCapAdj", "stopping gyro capture and adjusting downwards HLINE CIRCLE");
                }
            }
            this.f4479d = z;
        }
    }
}

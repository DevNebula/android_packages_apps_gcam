package p000;

/* compiled from: PG */
/* renamed from: agl */
final class agl implements agn, ary {
    /* renamed from: a */
    private static final C0300iw f10258a = ars.m685a(20, new agm());
    /* renamed from: b */
    private final asa f10259b = asa.m692a();
    /* renamed from: c */
    private agn f10260c;
    /* renamed from: d */
    private boolean f10261d;
    /* renamed from: e */
    private boolean f10262e;

    agl() {
    }

    /* renamed from: b */
    public final Object mo262b() {
        return this.f10260c.mo262b();
    }

    /* renamed from: c */
    public final Class mo263c() {
        return this.f10260c.mo263c();
    }

    /* renamed from: d */
    public final int mo264d() {
        return this.f10260c.sizeOf();
    }

    /* renamed from: a */
    public final asa mo1764a() {
        return this.f10259b;
    }

    /* renamed from: a */
    static agl m6468a(agn agn) {
        agl agl = (agl) aqe.m610a((agl) f10258a.mo9113a(), "Argument must not be null");
        agl.f10262e = false;
        agl.f10261d = true;
        agl.f10260c = agn;
        return agl;
    }

    /* renamed from: e */
    public final synchronized void mo265e() {
        this.f10259b.mo1767b();
        this.f10262e = true;
        if (!this.f10261d) {
            this.f10260c.mo265e();
            this.f10260c = null;
            f10258a.mo9114a(this);
        }
    }

    /* renamed from: f */
    final synchronized void mo11638f() {
        this.f10259b.mo1767b();
        if (this.f10261d) {
            this.f10261d = false;
            if (this.f10262e) {
                mo265e();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}

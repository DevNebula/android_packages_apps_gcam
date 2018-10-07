package p000;

/* compiled from: PG */
/* renamed from: gqn */
public final class gqn implements gqi, gqm {
    /* renamed from: a */
    public final gqi f24440a;
    /* renamed from: b */
    private final gqi[] f24441b;

    public gqn(gqi gqi, gqi... gqiArr) {
        this.f24440a = gqi;
        this.f24441b = gqiArr;
    }

    /* renamed from: h */
    public final void mo7345h() {
        mo13459i();
    }

    /* renamed from: i */
    public final void mo13459i() {
        gqh.m2777a(this.f24440a);
        for (gqi a : this.f24441b) {
            gqh.m2777a(a);
        }
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f24440a.mo7343a();
        for (gqi a : this.f24441b) {
            a.mo7343a();
        }
    }

    /* renamed from: b */
    public final void mo7344b() {
        for (gqi b : this.f24441b) {
            b.mo7344b();
        }
        this.f24440a.mo7344b();
    }
}

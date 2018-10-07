package p000;

/* compiled from: PG */
/* renamed from: dbs */
public final class dbs implements dbr {
    /* renamed from: a */
    private static final String f23747a = bli.m887a("ResOpenedCam");
    /* renamed from: b */
    private final fbj f23748b;
    /* renamed from: c */
    private final iut f23749c;
    /* renamed from: d */
    private final ffc f23750d;
    /* renamed from: e */
    private final iqp f23751e;
    /* renamed from: f */
    private final fxg f23752f;
    /* renamed from: g */
    private final ilp f23753g;
    /* renamed from: h */
    private final ikb f23754h;

    public dbs(fbj fbj, iut iut, ffc ffc, iqp iqp, fxg fxg, ilp ilp, ikb ikb) {
        this.f23748b = fbj;
        this.f23749c = iut;
        this.f23750d = ffc;
        this.f23751e = iqp;
        this.f23752f = fxg;
        this.f23753g = ilp;
        this.f23754h = ikb;
    }

    public final void close() {
        bli.m888a(f23747a, "close");
        this.f23754h.close();
        this.f23748b.close();
    }

    /* renamed from: a */
    public final fbj mo12964a() {
        return this.f23748b;
    }

    /* renamed from: b */
    public final ffc mo12965b() {
        return this.f23750d;
    }

    /* renamed from: c */
    public final iut mo12966c() {
        return this.f23749c;
    }

    /* renamed from: d */
    public final fxg mo12967d() {
        return this.f23752f;
    }

    /* renamed from: e */
    public final iqp mo12968e() {
        return this.f23751e;
    }

    /* renamed from: f */
    public final ilp mo12969f() {
        return this.f23753g;
    }

    /* renamed from: g */
    public final kpk mo12970g() {
        return this.f23748b.mo13217d();
    }
}

package p000;

/* compiled from: PG */
/* renamed from: dsn */
public final class dsn {
    /* renamed from: a */
    public final ffc f3478a;
    /* renamed from: b */
    private final ird f3479b;
    /* renamed from: c */
    private final ira f3480c;
    /* renamed from: d */
    private final fuw f3481d;
    /* renamed from: e */
    private final fjk f3482e;
    /* renamed from: f */
    private final fhg f3483f;
    /* renamed from: g */
    private final kpk f3484g;
    /* renamed from: h */
    private final fde f3485h;
    /* renamed from: i */
    private final dqp f3486i;
    /* renamed from: j */
    private final gjk f3487j;
    /* renamed from: k */
    private final fds f3488k = new fds();

    public dsn(ird ird, ira ira, fjk fjk, fhg fhg, kpk kpk, fde fde, fuw fuw, dqp dqp, gjk gjk, ffc ffc) {
        this.f3479b = ird;
        this.f3480c = ira;
        this.f3482e = fjk;
        this.f3483f = fhg;
        this.f3484g = kpk;
        this.f3485h = fde;
        this.f3487j = gjk;
        this.f3478a = ffc;
        this.f3481d = fuw;
        this.f3486i = dqp;
    }

    /* renamed from: a */
    public final fwl mo6054a() {
        boolean z;
        fel fel;
        if (this.f3478a.mo9064c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        kpk a = kny.m18475a(this.f3484g, new dso(this, z), kpq.f8776a);
        fdh fdh = fdh.ANY;
        fdg b = new fdg(fdh, fdh, fdh).mo6755a(fdh.CONVERGED).mo6756b(fdh.LOCKED);
        ird ird = this.f3479b;
        ira ira = this.f3480c;
        dqp dqp = this.f3486i;
        fjk fjk = this.f3482e;
        fhg fhg = this.f3483f;
        kpk kpk = this.f3484g;
        fde fde = this.f3485h;
        fuw fuw = this.f3481d;
        if (z) {
            fel = this.f3487j;
        } else {
            fel = this.f3488k;
        }
        return new dsw(new drs(ird, ira, dqp, fjk, fhg, kpk, a, b, fde, fuw, fel, 1), 2, true);
    }
}

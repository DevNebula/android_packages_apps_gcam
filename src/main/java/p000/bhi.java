package p000;

/* compiled from: PG */
/* renamed from: bhi */
final class bhi implements aub {
    /* renamed from: a */
    private final /* synthetic */ kpk f11380a;
    /* renamed from: b */
    private final /* synthetic */ kpw f11381b;
    /* renamed from: c */
    private final /* synthetic */ Runnable f11382c;
    /* renamed from: d */
    private final /* synthetic */ asw f11383d;
    /* renamed from: e */
    private final /* synthetic */ bhf f11384e;

    bhi(bhf bhf, kpk kpk, kpw kpw, Runnable runnable, asw asw) {
        this.f11384e = bhf;
        this.f11380a = kpk;
        this.f11381b = kpw;
        this.f11382c = runnable;
        this.f11383d = asw;
    }

    /* renamed from: a */
    public final void mo1798a() {
    }

    /* renamed from: b */
    public final ilp mo1799b() {
        return new ilb(this.f11383d.f977a);
    }

    /* renamed from: c */
    public final kpk mo1800c() {
        return this.f11380a;
    }

    /* renamed from: d */
    public final kpk mo1801d() {
        return this.f11381b;
    }

    /* renamed from: e */
    public final void mo1802e() {
        bhf bhf = this.f11384e;
        Runnable runnable = this.f11382c;
        bli.m888a(bhf.f11372a, "Execute AF reset runnable");
        bhf.f11374c.mo8826a(fdp.m10408a());
        bhf.f11375d.mo8826a(fdp.m10408a());
        runnable.run();
    }
}

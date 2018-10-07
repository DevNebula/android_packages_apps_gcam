package p000;

/* compiled from: PG */
/* renamed from: big */
final class big implements aub {
    /* renamed from: a */
    private final /* synthetic */ kpk f11442a;
    /* renamed from: b */
    private final /* synthetic */ kpw f11443b;
    /* renamed from: c */
    private final /* synthetic */ asw f11444c;
    /* renamed from: d */
    private final /* synthetic */ bie f11445d;

    big(bie bie, kpk kpk, kpw kpw, asw asw) {
        this.f11445d = bie;
        this.f11442a = kpk;
        this.f11443b = kpw;
        this.f11444c = asw;
    }

    /* renamed from: a */
    public final void mo1798a() {
        this.f11445d.f11433f.mo8826a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final ilp mo1799b() {
        return new ilb(this.f11444c.f977a);
    }

    /* renamed from: c */
    public final kpk mo1800c() {
        return this.f11442a;
    }

    /* renamed from: d */
    public final kpk mo1801d() {
        return this.f11443b;
    }

    /* renamed from: e */
    public final void mo1802e() {
        bie bie = this.f11445d;
        bli.m888a(bie.f11428a, "reset AF");
        bie.f11434g.mo8826a(Boolean.valueOf(true));
        bie.f11430c.mo8826a(fdp.m10408a());
        bie.f11431d.mo8826a(fdp.m10408a());
        bli.m888a(bie.f11428a, "reset AE");
        bie.f11432e.mo8826a(Integer.valueOf(0));
        bie.f11433f.mo8826a(Boolean.valueOf(false));
        ((Runnable) jqk.m13354c(bie.f11436i)).run();
    }
}

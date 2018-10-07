package p000;

/* compiled from: PG */
/* renamed from: fhv */
public final class fhv implements kwk {
    /* renamed from: a */
    private final kwk f18298a;
    /* renamed from: b */
    private final kwk f18299b;
    /* renamed from: c */
    private final kwk f18300c;
    /* renamed from: d */
    private final kwk f18301d;

    private fhv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f18298a = kwk;
        this.f18299b = kwk2;
        this.f18300c = kwk3;
        this.f18301d = kwk4;
    }

    /* renamed from: a */
    public static fhv m10579a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fhv(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18298a;
        kwk kwk2 = this.f18299b;
        kwk kwk3 = this.f18300c;
        fiq fiq = (fiq) kwk.mo10566a();
        ikb ikb = (ikb) kwk2.mo10566a();
        kpk kpk = (kpk) kwk3.mo10566a();
        this.f18301d.mo10566a();
        return (kpk) ktm.m14219a(kny.m18475a(kpk, new fhs(ikb, fiq), kpq.f8776a), "Cannot return null from a non-@Nullable @Provides method");
    }
}

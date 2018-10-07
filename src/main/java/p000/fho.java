package p000;

/* compiled from: PG */
/* renamed from: fho */
public final class fho implements kwk {
    /* renamed from: a */
    private final kwk f18288a;
    /* renamed from: b */
    private final kwk f18289b;
    /* renamed from: c */
    private final kwk f18290c;
    /* renamed from: d */
    private final kwk f18291d;

    private fho(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f18288a = kwk;
        this.f18289b = kwk2;
        this.f18290c = kwk3;
        this.f18291d = kwk4;
    }

    /* renamed from: a */
    public static fho m10569a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fho(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18288a;
        kwk kwk2 = this.f18289b;
        kwk kwk3 = this.f18290c;
        fiq fiq = (fiq) kwk.mo10566a();
        ikb ikb = (ikb) kwk2.mo10566a();
        kpk kpk = (kpk) kwk3.mo10566a();
        this.f18291d.mo10566a();
        return (kpk) ktm.m14219a(kny.m18475a(kpk, new fhl(ikb, fiq), kpq.f8776a), "Cannot return null from a non-@Nullable @Provides method");
    }
}

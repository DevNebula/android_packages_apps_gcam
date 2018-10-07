package p000;

/* compiled from: PG */
/* renamed from: fxb */
public final class fxb implements kwk {
    /* renamed from: a */
    private final kwk f18869a;
    /* renamed from: b */
    private final kwk f18870b;
    /* renamed from: c */
    private final kwk f18871c;
    /* renamed from: d */
    private final kwk f18872d;
    /* renamed from: e */
    private final kwk f18873e;

    private fxb(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f18869a = kwk;
        this.f18870b = kwk2;
        this.f18871c = kwk3;
        this.f18872d = kwk4;
        this.f18873e = kwk5;
    }

    /* renamed from: a */
    public static fxb m11055a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new fxb(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18869a;
        kwk kwk2 = this.f18870b;
        kwk kwk3 = this.f18871c;
        kwk kwk4 = this.f18872d;
        kwk kwk5 = this.f18873e;
        ikb ikb = (ikb) kwk.mo10566a();
        fff fff = (fff) kwk2.mo10566a();
        Object a = kwk3.mo10566a();
        kpk kpk = (kpk) kwk4.mo10566a();
        kpk kpk2 = (kpk) kwk5.mo10566a();
        fwx fwx = (fwx) a;
        Runnable ffq = new ffq(fff, fwx);
        kow.m13878a(kpk, new fwz(ffq, ikb), kpq.f8776a);
        kpk2.mo10200a(ffq, kpq.f8776a);
        return (ijk) ktm.m14219a(aqe.m607a(new fwy(fff, fwx)), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

/* compiled from: PG */
/* renamed from: fod */
public final class fod implements kwk {
    /* renamed from: a */
    private final kwk f18512a;
    /* renamed from: b */
    private final kwk f18513b;
    /* renamed from: c */
    private final kwk f18514c;
    /* renamed from: d */
    private final kwk f18515d;
    /* renamed from: e */
    private final kwk f18516e;

    private fod(fnz fnz, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f18512a = kwk;
        this.f18513b = kwk2;
        this.f18514c = kwk3;
        this.f18515d = kwk4;
        this.f18516e = kwk5;
    }

    /* renamed from: a */
    public static fod m10755a(fnz fnz, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new fod(fnz, kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18512a;
        kwk kwk2 = this.f18513b;
        kwk kwk3 = this.f18514c;
        kwk kwk4 = this.f18515d;
        ikb ikb = (ikb) kwk.mo10566a();
        ikv ikv = (ikv) kwk2.mo10566a();
        fyy fyy = (fyy) kwk3.mo10566a();
        fmt fmt = (fmt) kwk4.mo10566a();
        int intValue = ((Integer) this.f18516e.mo10566a()).intValue();
        ive ive = fyy.f5059a;
        return (fmm) ktm.m14219a(fmt.mo6859a(ikb, ikv, ive.f7861b, ive.f7860a, intValue), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

/* compiled from: PG */
/* renamed from: fnx */
public final class fnx implements kwk {
    /* renamed from: a */
    private final fnu f18503a;
    /* renamed from: b */
    private final kwk f18504b;
    /* renamed from: c */
    private final kwk f18505c;
    /* renamed from: d */
    private final kwk f18506d;
    /* renamed from: e */
    private final kwk f18507e;

    private fnx(fnu fnu, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f18503a = fnu;
        this.f18504b = kwk;
        this.f18505c = kwk2;
        this.f18506d = kwk3;
        this.f18507e = kwk4;
    }

    /* renamed from: a */
    public static fnx m10745a(fnu fnu, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fnx(fnu, kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18504b;
        kwk kwk2 = this.f18505c;
        kwk kwk3 = this.f18506d;
        ikb ikb = (ikb) kwk.mo10566a();
        ikv ikv = (ikv) kwk2.mo10566a();
        fyy fyy = (fyy) kwk3.mo10566a();
        fmt fmt = (fmt) this.f18507e.mo10566a();
        jri.m13405b(fyy.f5061c.mo9709b());
        ive ive = (ive) fyy.f5061c.mo9706a();
        return (fmm) ktm.m14219a(fmt.mo6859a(ikb, ikv, ive.f7861b, ive.f7860a, 3), "Cannot return null from a non-@Nullable @Provides method");
    }
}

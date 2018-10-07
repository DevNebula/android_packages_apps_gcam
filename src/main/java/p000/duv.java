package p000;

/* compiled from: PG */
/* renamed from: duv */
public final class duv implements kwk {
    /* renamed from: a */
    private final kwk f16838a;
    /* renamed from: b */
    private final kwk f16839b;
    /* renamed from: c */
    private final kwk f16840c;
    /* renamed from: d */
    private final kwk f16841d;
    /* renamed from: e */
    private final kwk f16842e;
    /* renamed from: f */
    private final kwk f16843f;
    /* renamed from: g */
    private final kwk f16844g;
    /* renamed from: h */
    private final kwk f16845h;

    private duv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8) {
        this.f16838a = kwk;
        this.f16839b = kwk2;
        this.f16840c = kwk3;
        this.f16841d = kwk4;
        this.f16842e = kwk5;
        this.f16843f = kwk6;
        this.f16844g = kwk7;
        this.f16845h = kwk8;
    }

    /* renamed from: a */
    public static duv m9588a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8) {
        return new duv(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        boolean z;
        kwk kwk = this.f16838a;
        kwk kwk2 = this.f16839b;
        kwk kwk3 = this.f16840c;
        kwk kwk4 = this.f16841d;
        kwk kwk5 = this.f16842e;
        kwk kwk6 = this.f16843f;
        kwk kwk7 = this.f16844g;
        bkw bkw = (bkw) kwk.mo10566a();
        ffc ffc = (ffc) kwk2.mo10566a();
        fxc fxc = (fxc) kwk3.mo10566a();
        ilp ilp = (ilp) kwk4.mo10566a();
        ilp ilp2 = (ilp) kwk5.mo10566a();
        ilp ilp3 = (ilp) kwk6.mo10566a();
        dud dud = (dud) kwk7.mo10566a();
        this.f16845h.mo10566a();
        boolean v = ffc.mo9083v();
        if (ffc.mo9064c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        return (ilp) ktm.m14219a(new dtz(bkw, v, z, fxc, ilp, ilp2, ilp3, dud.f16793a), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

/* compiled from: PG */
/* renamed from: dre */
public final class dre implements kwk {
    /* renamed from: a */
    private final kwk f16524a;
    /* renamed from: b */
    private final kwk f16525b;
    /* renamed from: c */
    private final kwk f16526c;
    /* renamed from: d */
    private final kwk f16527d;
    /* renamed from: e */
    private final kwk f16528e;

    private dre(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f16524a = kwk;
        this.f16525b = kwk2;
        this.f16526c = kwk3;
        this.f16527d = kwk4;
        this.f16528e = kwk5;
    }

    /* renamed from: a */
    public static dre m9438a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new dre(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16524a;
        kwk kwk2 = this.f16525b;
        kwk kwk3 = this.f16526c;
        kwk kwk4 = this.f16527d;
        dri dri = (dri) kwk.mo10566a();
        dsn dsn = (dsn) kwk2.mo10566a();
        dsl dsl = (dsl) kwk3.mo10566a();
        dsj dsj = (dsj) kwk4.mo10566a();
        bxg bxg = (bxg) this.f16528e.mo10566a();
        fwl a = dsn.mo6054a();
        fwl a2 = dsj.mo6052a();
        fwl a3 = dsl.mo6053a(a2);
        return (dsv) ktm.m14219a(new dsv(new drq(dri.f3423a, new drk(dri.f3424b, dri.f3428f.mo6051a(a3), a, dri.f3426d, dri.f3427e, dri.f3428f.mo6051a(dri.f3425c.mo6050a(bxg, a2, dri.f3430h.mo6778a(Math.max(bxg.f1722i, 0))))))), "Cannot return null from a non-@Nullable @Provides method");
    }
}

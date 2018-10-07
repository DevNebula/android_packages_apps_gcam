package p000;

/* compiled from: PG */
/* renamed from: atx */
public final class atx implements kwk {
    /* renamed from: a */
    private final kwk f10750a;
    /* renamed from: b */
    private final kwk f10751b;
    /* renamed from: c */
    private final kwk f10752c;
    /* renamed from: d */
    private final kwk f10753d;
    /* renamed from: e */
    private final kwk f10754e;
    /* renamed from: f */
    private final kwk f10755f;

    private atx(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f10750a = kwk;
        this.f10751b = kwk2;
        this.f10752c = kwk3;
        this.f10753d = kwk4;
        this.f10754e = kwk5;
        this.f10755f = kwk6;
    }

    /* renamed from: a */
    public static atx m7068a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new atx(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f10750a;
        kwk kwk2 = this.f10751b;
        kwk kwk3 = this.f10752c;
        kwk kwk4 = this.f10753d;
        kwk kwk5 = this.f10754e;
        kwk kwk6 = this.f10755f;
        ffc ffc = (ffc) kwk.mo10566a();
        kwk2.mo10566a();
        kbg kbg = (kbg) kwk3.mo10566a();
        asn obj2;
        if (!ffc.mo9080s()) {
            obj2 = (asn) kwk4.mo10566a();
        } else if (kbg.mo9709b()) {
            obj2 = (asn) kwk6.mo10566a();
        } else {
            obj2 = (asn) kwk5.mo10566a();
        }
        return (asn) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

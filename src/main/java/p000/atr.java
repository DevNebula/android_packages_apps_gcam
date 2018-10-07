package p000;

/* compiled from: PG */
/* renamed from: atr */
public final class atr implements kwk {
    /* renamed from: a */
    private final kwk f10732a;
    /* renamed from: b */
    private final kwk f10733b;
    /* renamed from: c */
    private final kwk f10734c;

    private atr(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10732a = kwk;
        this.f10733b = kwk2;
        this.f10734c = kwk3;
    }

    /* renamed from: a */
    public static atr m7056a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new atr(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f10732a;
        kwk kwk2 = this.f10733b;
        kwk kwk3 = this.f10734c;
        if (((ffc) kwk.mo10566a()).mo9080s()) {
            asn obj2 = (asn) kwk3.mo10566a();
        } else {
            obj2 = (asn) kwk2.mo10566a();
        }
        return (asn) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

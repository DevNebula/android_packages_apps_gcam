package p000;

/* compiled from: PG */
/* renamed from: ato */
public final class ato implements kwk {
    /* renamed from: a */
    private final kwk f10727a;
    /* renamed from: b */
    private final kwk f10728b;
    /* renamed from: c */
    private final kwk f10729c;

    private ato(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f10727a = kwk;
        this.f10728b = kwk2;
        this.f10729c = kwk3;
    }

    /* renamed from: a */
    public static ato m7050a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new ato(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f10727a;
        kwk kwk2 = this.f10728b;
        kwk kwk3 = this.f10729c;
        if (((ffc) kwk.mo10566a()).mo9080s()) {
            obj = (fiw) kwk2.mo10566a();
        } else {
            fiw obj2 = (fiw) kwk3.mo10566a();
        }
        return (fiw) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

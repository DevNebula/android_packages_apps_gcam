package p000;

/* compiled from: PG */
/* renamed from: dgj */
public final class dgj implements kwk {
    /* renamed from: a */
    private final kwk f13795a;
    /* renamed from: b */
    private final kwk f13796b;

    public dgj(kwk kwk, kwk kwk2) {
        this.f13795a = kwk;
        this.f13796b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        String str;
        kwk kwk = this.f13795a;
        kwk kwk2 = this.f13796b;
        kwk.mo10566a();
        if (((bsn) kwk2.mo10566a()).mo2107a(gdp.f5332d)) {
            str = "PhotoModule";
        } else {
            str = "GoudaModule";
        }
        return (cwa) ktm.m14219a(new cwa(hhx.PORTRAIT, str, false), "Cannot return null from a non-@Nullable @Provides method");
    }
}

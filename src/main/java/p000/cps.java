package p000;

/* compiled from: PG */
/* renamed from: cps */
public final class cps implements kwk {
    /* renamed from: a */
    private final kwk f13119a;
    /* renamed from: b */
    private final kwk f13120b;
    /* renamed from: c */
    private final kwk f13121c;

    public cps(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f13119a = kwk;
        this.f13120b = kwk2;
        this.f13121c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        kwk kwk = this.f13119a;
        kwk kwk2 = this.f13120b;
        kwk kwk3 = this.f13121c;
        if (((Boolean) kwk.mo10566a()).booleanValue()) {
            obj = (hfz) kwk3.mo10566a();
        } else {
            hfz obj2 = (hfz) kwk2.mo10566a();
        }
        return (hfz) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

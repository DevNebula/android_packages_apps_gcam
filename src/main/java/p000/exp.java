package p000;

/* compiled from: PG */
/* renamed from: exp */
public final class exp implements kwk {
    /* renamed from: a */
    private final kwk f17971a;

    private exp(kwk kwk) {
        this.f17971a = kwk;
    }

    /* renamed from: a */
    public static exp m10224a(kwk kwk) {
        return new exp(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        iqp iqp = ((fyy) this.f17971a.mo10566a()).f5062d;
        if (ipz.f7670b.mo8751a(ipz.m4077b(iqp))) {
            obj = exa.f4554b;
        } else {
            jri.m13395a(ipz.f7669a.mo8751a(ipz.m4077b(iqp)));
            obj = exa.f4553a;
        }
        return (iqp) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}

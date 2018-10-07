package p000;

/* compiled from: PG */
/* renamed from: duq */
public final class duq implements kwk {
    /* renamed from: a */
    private final kwk f16822a;
    /* renamed from: b */
    private final kwk f16823b;
    /* renamed from: c */
    private final kwk f16824c;

    private duq(dul dul, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16822a = kwk;
        this.f16823b = kwk2;
        this.f16824c = kwk3;
    }

    /* renamed from: a */
    public static duq m9578a(dul dul, kwk kwk, kwk kwk2, kwk kwk3) {
        return new duq(dul, kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        boolean z;
        kwk kwk = this.f16822a;
        ikb ikb = (ikb) kwk.mo10566a();
        if (((bym) this.f16823b.mo10566a()).mo2226c(bya.m1072b((ffc) this.f16824c.mo10566a())) >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        return (dub) ktm.m14219a((dub) ikb.mo8557a(new dub()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

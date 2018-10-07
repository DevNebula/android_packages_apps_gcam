package p000;

/* compiled from: PG */
/* renamed from: cam */
public final class cam implements kwk {
    /* renamed from: a */
    private final kwk f12078a;
    /* renamed from: b */
    private final kwk f12079b;

    private cam(kwk kwk, kwk kwk2) {
        this.f12078a = kwk;
        this.f12079b = kwk2;
    }

    /* renamed from: a */
    public static cam m8029a(kwk kwk, kwk kwk2) {
        return new cam(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object cdj;
        kwk kwk = this.f12078a;
        Integer num = (Integer) kwk.mo10566a();
        fyy fyy = (fyy) this.f12079b.mo10566a();
        if (num.intValue() < 0) {
            cdj = new cdj();
        } else {
            cdl cdj2 = new cdl(num.intValue(), fyy.f5060b.f7861b);
        }
        return (cdk) ktm.m14219a(cdj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

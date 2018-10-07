package p000;

/* compiled from: PG */
/* renamed from: dtc */
public final class dtc implements kwk {
    /* renamed from: a */
    private final kwk f16661a;
    /* renamed from: b */
    private final kwk f16662b;

    private dtc(kwk kwk, kwk kwk2) {
        this.f16661a = kwk;
        this.f16662b = kwk2;
    }

    /* renamed from: a */
    public static dtc m9510a(kwk kwk, kwk kwk2) {
        return new dtc(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16661a;
        iqt iqt = (dsx) this.f16662b.mo10566a();
        ((fjd) kwk.mo10566a()).mo14892a(fds.m10419a(iqt));
        return (ilp) ktm.m14219a(iqt, "Cannot return null from a non-@Nullable @Provides method");
    }
}

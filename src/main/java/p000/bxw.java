package p000;

/* compiled from: PG */
/* renamed from: bxw */
public final class bxw implements kwk {
    /* renamed from: a */
    private final kwk f11940a;
    /* renamed from: b */
    private final kwk f11941b;

    private bxw(kwk kwk, kwk kwk2) {
        this.f11940a = kwk;
        this.f11941b = kwk2;
    }

    /* renamed from: a */
    public static bxw m7957a(kwk kwk, kwk kwk2) {
        return new bxw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object c;
        kwk kwk = this.f11940a;
        if (((Boolean) ((ilp) this.f11941b.mo10566a()).mo13673b()).booleanValue()) {
            c = kbg.m4804c((fqu) kwk.mo10566a());
        } else {
            c = kau.f21835a;
        }
        return (kbg) ktm.m14219a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}

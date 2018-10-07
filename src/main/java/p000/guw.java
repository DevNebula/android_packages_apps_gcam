package p000;

/* compiled from: PG */
/* renamed from: guw */
public final class guw implements kwk {
    /* renamed from: a */
    private final kwk f19642a;
    /* renamed from: b */
    private final kwk f19643b;

    private guw(kwk kwk, kwk kwk2) {
        this.f19642a = kwk;
        this.f19643b = kwk2;
    }

    /* renamed from: a */
    public static guw m11785a(kwk kwk, kwk kwk2) {
        return new guw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object c;
        kwk kwk = this.f19642a;
        kbg kbg = (kbg) kwk.mo10566a();
        this.f19643b.mo10566a();
        if (kbg.mo9709b()) {
            c = kbg.m4804c(((gup) kbg.mo9706a()).mo7461a());
        } else {
            c = kau.f21835a;
        }
        return (kbg) ktm.m14219a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}

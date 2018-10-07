package p000;

/* compiled from: PG */
/* renamed from: dgi */
public final class dgi implements kwk {
    /* renamed from: a */
    private final kwk f13792a;
    /* renamed from: b */
    private final kwk f13793b;
    /* renamed from: c */
    private final kwk f13794c;

    public dgi(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f13792a = kwk;
        this.f13793b = kwk2;
        this.f13794c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object c;
        kwk kwk = this.f13792a;
        kwk kwk2 = this.f13793b;
        kwk kwk3 = this.f13794c;
        cwa cwa = (cwa) kwk2.mo10566a();
        if (((kbg) kwk.mo10566a()).mo9709b()) {
            c = kbg.m4804c(new cwg(cwa, kwk3));
        } else {
            c = kau.f21835a;
        }
        return (kbg) ktm.m14219a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}

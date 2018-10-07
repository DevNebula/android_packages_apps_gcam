package p000;

/* compiled from: PG */
/* renamed from: byr */
public final class byr implements kwk {
    /* renamed from: a */
    private final kwk f12019a;
    /* renamed from: b */
    private final kwk f12020b;
    /* renamed from: c */
    private final kwk f12021c;
    /* renamed from: d */
    private final kwk f12022d;

    private byr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f12019a = kwk;
        this.f12020b = kwk2;
        this.f12021c = kwk3;
        this.f12022d = kwk4;
    }

    /* renamed from: a */
    public static byr m8001a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new byr(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object c;
        kwk kwk = this.f12019a;
        kwk kwk2 = this.f12020b;
        kwk kwk3 = this.f12021c;
        kbg kbg = (kbg) kwk.mo10566a();
        ikb ikb = (ikb) kwk2.mo10566a();
        fgw fgw = (fgw) kwk3.mo10566a();
        this.f12022d.mo10566a();
        if (fgw.mo6785c() && kbg.mo9709b()) {
            iqo b = ((bwo) kbg.mo9706a()).mo2187b();
            ikb.mo8557a(b);
            c = kbg.m4804c(b);
        } else {
            c = kau.f21835a;
        }
        return (kbg) ktm.m14219a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}

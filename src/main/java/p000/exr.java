package p000;

/* compiled from: PG */
/* renamed from: exr */
public final class exr implements kwk {
    /* renamed from: a */
    private final kwk f17974a;
    /* renamed from: b */
    private final kwk f17975b;
    /* renamed from: c */
    private final kwk f17976c;
    /* renamed from: d */
    private final kwk f17977d;

    private exr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17974a = kwk;
        this.f17975b = kwk2;
        this.f17976c = kwk3;
        this.f17977d = kwk4;
    }

    /* renamed from: a */
    public static exr m10228a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new exr(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        int i;
        kwk kwk = this.f17974a;
        kwk kwk2 = this.f17975b;
        kwk kwk3 = this.f17976c;
        ixc ixc = (ixc) kwk.mo10566a();
        iqp iqp = (iqp) kwk2.mo10566a();
        bmb bmb = (bmb) kwk3.mo10566a();
        etg etg = (etg) this.f17977d.mo10566a();
        int i2 = iqp.f7695a;
        int i3 = iqp.f7696b;
        if (bmb.mo2021c()) {
            i = 8;
        } else {
            i = 0;
        }
        if (euh.m2182b(bmb, etg)) {
            i += 48;
        }
        return (ixb) ktm.m14219a(ixc.mo9147a(i2, i3, 35, Math.min(52, i)), "Cannot return null from a non-@Nullable @Provides method");
    }
}

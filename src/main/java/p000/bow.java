package p000;

/* compiled from: PG */
/* renamed from: bow */
public final class bow implements kwk {
    /* renamed from: a */
    private final kwk f11678a;
    /* renamed from: b */
    private final kwk f11679b;
    /* renamed from: c */
    private final kwk f11680c;
    /* renamed from: d */
    private final kwk f11681d;

    public bow(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11678a = kwk;
        this.f11679b = kwk2;
        this.f11680c = kwk3;
        this.f11681d = kwk4;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11678a;
        kwk kwk2 = this.f11679b;
        kwk kwk3 = this.f11680c;
        ena ena = (ena) kwk3.mo10566a();
        ikd ikd = (ikd) this.f11681d.mo10566a();
        eol bov = new bov((baf) kwk.mo10566a(), (bou) kwk2.mo10566a());
        eio.m1804a(ikd, ena, bov);
        return (gqd) ktm.m14219a(bov, "Cannot return null from a non-@Nullable @Provides method");
    }
}

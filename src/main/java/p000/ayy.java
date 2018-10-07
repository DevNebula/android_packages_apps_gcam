package p000;

/* compiled from: PG */
/* renamed from: ayy */
public final class ayy implements ayx {
    /* renamed from: b */
    private static final ayv f11061b = new axy();
    /* renamed from: a */
    public ayv f11062a;
    /* renamed from: c */
    private final ikd f11063c;
    /* renamed from: d */
    private final ayw f11064d;

    public ayy(ikd ikd, ayw ayw) {
        this.f11063c = ikd;
        this.f11064d = ayw;
    }

    /* renamed from: a */
    public final ayv mo1861a(axp axp) {
        ayv ayv = this.f11062a;
        if (ayv != null && ayv.mo1858b() != C0252go.f5947s) {
            return f11061b;
        }
        this.f11062a = this.f11064d.mo1860a(axp);
        this.f11063c.execute(new ayz(this));
        return this.f11062a;
    }
}

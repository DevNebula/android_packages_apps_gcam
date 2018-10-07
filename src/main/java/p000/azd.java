package p000;

/* compiled from: PG */
/* renamed from: azd */
public final class azd implements fuw {
    /* renamed from: a */
    private final axm f11070a;
    /* renamed from: b */
    private final ayb f11071b;
    /* renamed from: c */
    private final fuw f11072c;

    public azd(fuw fuw, axm axm, ayb ayb) {
        this.f11070a = (axm) jri.m13404b((Object) axm);
        this.f11071b = (ayb) jri.m13404b((Object) ayb);
        this.f11072c = (fuw) jri.m13404b((Object) fuw);
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        return new aze(this.f11070a, this.f11071b, this.f11072c.mo6915a(fwa));
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return this.f11072c.mo6916a();
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return this.f11072c.mo6918b();
    }

    /* renamed from: b */
    public final fux mo6917b(fwa fwa) {
        fux b = this.f11072c.mo6917b(fwa);
        if (b == null) {
            return null;
        }
        return new aze(this.f11070a, this.f11071b, b);
    }
}

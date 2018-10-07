package p000;

/* compiled from: PG */
/* renamed from: ftt */
public final class ftt implements fuw {
    /* renamed from: a */
    private final fuw f18780a;
    /* renamed from: b */
    private final fuc f18781b;

    public ftt(fuw fuw, fuc fuc) {
        this.f18781b = fuc;
        this.f18780a = fuw;
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        return m10955a(this.f18780a.mo6915a(fwa), fwa);
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return this.f18780a.mo6916a();
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return this.f18780a.mo6918b();
    }

    /* renamed from: b */
    public final fux mo6917b(fwa fwa) {
        fwa.f4982b.mo13369a(new ftu());
        fux b = this.f18780a.mo6917b(fwa);
        if (b == null) {
            return null;
        }
        return m10955a(b, fwa);
    }

    /* renamed from: a */
    private final fux m10955a(fux fux, fwa fwa) {
        glm ftu = new ftu();
        fwa.f4982b.mo13369a(ftu);
        String n = fwa.f4982b.mo13385n();
        fuc fuc = this.f18781b;
        jri.m13395a(n.isEmpty() ^ 1);
        return new ftv(fux, ftu.f18782a, new fud(fuc, new fub(n)), this.f18781b);
    }
}

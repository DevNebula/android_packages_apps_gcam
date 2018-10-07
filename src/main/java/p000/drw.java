package p000;

/* compiled from: PG */
/* renamed from: drw */
public final class drw implements fwl {
    /* renamed from: a */
    private final fyt f16582a;
    /* renamed from: b */
    private final fwl f16583b;
    /* renamed from: c */
    private final iqz f16584c;
    /* renamed from: d */
    private final ilp f16585d;

    public drw(fyt fyt, ira ira, dsh dsh, bxg bxg) {
        this.f16582a = fyt;
        this.f16584c = ira.mo8854a("GoudaCptrCmd");
        fwl a = dsh.f3469c.mo6050a(bxg, dsh.f3470d, dsh.f3472f.mo6778a(bxg.f1722i));
        ira ira2 = dsh.f3467a;
        ilp ilp = dsh.f3468b;
        fwl fwl = dsh.f3471e;
        this.f16583b = new drq(ira2, new drk(ilp, a, fwl, a, fwl, a));
        ilp b = ilq.m3890b(fyt.mo6949c(), Integer.valueOf(1));
        this.f16585d = ilq.m3892b(this.f16583b.mo9689a(), b);
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16585d;
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        return this.f16583b.mo9689a();
    }

    /* renamed from: a */
    public final void mo6937a(fwm fwm, fwa fwa) {
        iqo d = this.f16582a.mo6950d();
        iqz iqz = this.f16584c;
        String valueOf = String.valueOf(this.f16582a.mo6949c().mo13673b());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
        stringBuilder.append("Remaining tickets: ");
        stringBuilder.append(valueOf);
        iqz.mo8832b(stringBuilder.toString());
        if (d == null) {
            this.f16584c.mo8838f("Ticket not available");
            return;
        }
        fwa.f4981a.f4680g.mo8557a(d);
        this.f16583b.mo6937a(fwm, fwa);
    }
}

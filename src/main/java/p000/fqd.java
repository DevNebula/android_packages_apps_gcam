package p000;

/* compiled from: PG */
/* renamed from: fqd */
public final class fqd implements fux {
    /* renamed from: a */
    public final /* synthetic */ fqc f24279a;
    /* renamed from: b */
    private final axm f24280b;
    /* renamed from: c */
    private final gkr f24281c;
    /* renamed from: d */
    private final ggc f24282d;
    /* renamed from: e */
    private final ggb f24283e;
    /* renamed from: f */
    private final gfz f24284f;
    /* renamed from: g */
    private int f24285g = 0;
    /* renamed from: h */
    private iqm f24286h;

    fqd(fqc fqc, fwa fwa, fux fux, axm axm, ggc ggc) {
        this.f24279a = fqc;
        this.f24280b = axm;
        this.f24281c = fwa.f4982b;
        this.f24282d = ggc;
        this.f24283e = new ggb(this, fux);
        this.f24284f = gfz.m17717a(fqc.f18629c, fqc.f18630d, kbg.m4804c(this.f24283e), new fqe(), this.f24282d, fqc.f18628b);
        gfz gfz = this.f24284f;
        kow.m13878a(gfz.mo13340a(), new gga(gfz, this.f24281c), kpq.f8776a);
        ((grg) jri.m13404b(this.f24281c.mo7077h())).mo7376b();
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        this.f24285g++;
        this.f24286h = iqm.m4095a(((Integer) this.f24280b.mo1837b().mo13673b()).intValue());
        this.f24284f.mo13341a(new gfw(iwz, this.f24286h, kpk, this.f24279a.f18631e), this.f24281c);
    }

    public final void close() {
        this.f24284f.close();
        if (this.f24285g == 0) {
            this.f24281c.mo13360a();
        }
    }
}

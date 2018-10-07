package p000;

/* compiled from: PG */
/* renamed from: djz */
public final class djz implements iqo {
    /* renamed from: a */
    public final ilb f14125a;
    /* renamed from: b */
    public final ilb f14126b;
    /* renamed from: c */
    public final Object f14127c;
    /* renamed from: d */
    public boolean f14128d;
    /* renamed from: e */
    private final iut f14129e;
    /* renamed from: f */
    private final ffc f14130f;
    /* renamed from: g */
    private final gci f14131g;
    /* renamed from: h */
    private final gbw f14132h = new dka(this);

    public djz(iut iut, ffc ffc, gci gci) {
        this.f14129e = iut;
        this.f14130f = ffc;
        this.f14131g = gci;
        this.f14125a = new ilb(mo13041a(this.f14131g.mo7034a()));
        this.f14126b = new ilb(iqm.m4095a(mo13041a(this.f14131g.mo7034a()).intValue()));
        this.f14127c = new Object();
        this.f14128d = false;
        this.f14131g.mo7035a(this.f14132h);
    }

    /* renamed from: a */
    final Integer mo13041a(iqm iqm) {
        return Integer.valueOf(axm.m758a(this.f14130f.mo9076o(), iqm.f7692e, this.f14129e == iut.FRONT));
    }

    public final void close() {
        this.f14131g.mo7036b(this.f14132h);
    }

    /* renamed from: a */
    public final void mo13042a() {
        synchronized (this.f14127c) {
            if (this.f14128d) {
                return;
            }
            this.f14128d = true;
        }
    }

    /* renamed from: b */
    public final void mo13043b() {
        synchronized (this.f14127c) {
            if (this.f14128d) {
                this.f14128d = false;
                this.f14125a.mo8826a(mo13041a(this.f14131g.mo7034a()));
                return;
            }
        }
    }
}

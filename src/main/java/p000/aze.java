package p000;

/* compiled from: PG */
/* renamed from: aze */
final class aze implements fux {
    /* renamed from: a */
    private final axm f22528a;
    /* renamed from: b */
    private final ayb f22529b;
    /* renamed from: c */
    private final fux f22530c;
    /* renamed from: d */
    private fkp f22531d;

    aze(axm axm, ayb ayb, fux fux) {
        this.f22528a = axm;
        this.f22529b = ayb;
        this.f22530c = fux;
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        Object obj = 1;
        if (iwz.mo13741c() == 35) {
            if (this.f22531d != null && iwz.mo13744f() <= this.f22531d.mo13744f()) {
                obj = null;
            }
            if (obj != null) {
                iwz iuz = new iuz(iwz, 2);
                fkp fkp = this.f22531d;
                if (fkp != null) {
                    fkp.close();
                }
                this.f22531d = new fkp(new iva(iuz), kpk);
                iwz = iuz;
            }
        }
        this.f22530c.mo13282a(new iva(iwz), kpk);
    }

    public final void close() {
        if (this.f22531d != null) {
            iqm a = iqm.m4095a(((Integer) this.f22528a.mo1837b().mo13673b()).intValue());
            iwz iwz = this.f22531d;
            this.f22529b.mo1841a(new gfw(iwz, a, iwz.mo15529h()));
            this.f22531d.close();
        }
        this.f22530c.close();
    }
}

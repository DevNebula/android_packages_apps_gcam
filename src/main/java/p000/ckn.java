package p000;

/* compiled from: PG */
/* renamed from: ckn */
public final class ckn implements jqw {
    /* renamed from: a */
    public final fkp f12654a;
    /* renamed from: b */
    public final chs f12655b;

    public ckn(chs chs) {
        jri.m13404b((Object) chs);
        this.f12654a = null;
        this.f12655b = chs;
    }

    public ckn(fkp fkp) {
        jri.m13404b((Object) fkp);
        this.f12654a = fkp;
        this.f12655b = null;
    }

    public final void close() {
        fkp fkp = this.f12654a;
        if (fkp != null) {
            fkp.close();
        }
    }

    /* renamed from: a */
    public final int mo9533a() {
        fkp fkp = this.f12654a;
        return fkp == null ? this.f12655b.f2182d : fkp.mo13742d();
    }

    /* renamed from: b */
    public final int mo9534b() {
        fkp fkp = this.f12654a;
        return fkp == null ? this.f12655b.f2181c : fkp.mo13745g();
    }
}

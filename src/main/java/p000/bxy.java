package p000;

/* compiled from: PG */
/* renamed from: bxy */
public final class bxy implements kwk {
    /* renamed from: a */
    private final kwk f11943a;
    /* renamed from: b */
    private final kwk f11944b;
    /* renamed from: c */
    private final kwk f11945c;
    /* renamed from: d */
    private final kwk f11946d;
    /* renamed from: e */
    private final kwk f11947e;
    /* renamed from: f */
    private final kwk f11948f;

    private bxy(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11943a = kwk;
        this.f11944b = kwk2;
        this.f11945c = kwk3;
        this.f11946d = kwk4;
        this.f11947e = kwk5;
        this.f11948f = kwk6;
    }

    /* renamed from: a */
    public static bxy m7960a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new bxy(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object a;
        kwk kwk = this.f11943a;
        kwk kwk2 = this.f11944b;
        kwk kwk3 = this.f11945c;
        kwk kwk4 = this.f11946d;
        kwk kwk5 = this.f11947e;
        ffc ffc = (ffc) kwk.mo10566a();
        bsn bsn = (bsn) kwk2.mo10566a();
        ilp ilp = (ilp) kwk3.mo10566a();
        bmb bmb = (bmb) kwk4.mo10566a();
        bsq bsq = (bsq) kwk5.mo10566a();
        if (((Boolean) ((ilp) this.f11948f.mo10566a()).mo13673b()).booleanValue()) {
            a = ilq.m3876a(bxh.RGB);
        } else {
            a = ilq.m3875a(ilp, new bxs(ffc, bsn, bsq, bmb));
        }
        return (ilp) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}

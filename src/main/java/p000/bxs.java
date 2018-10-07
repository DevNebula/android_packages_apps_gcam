package p000;

/* renamed from: bxs */
final /* synthetic */ class bxs implements kaw {
    /* renamed from: a */
    private final ffc f11933a;
    /* renamed from: b */
    private final bsn f11934b;
    /* renamed from: c */
    private final bsq f11935c;
    /* renamed from: d */
    private final bmb f11936d;

    bxs(ffc ffc, bsn bsn, bsq bsq, bmb bmb) {
        this.f11933a = ffc;
        this.f11934b = bsn;
        this.f11935c = bsq;
        this.f11936d = bmb;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        Object obj2 = null;
        ffc ffc = this.f11933a;
        bsn bsn = this.f11934b;
        bsq bsq = this.f11935c;
        if (ffc.mo9064c() == iut.FRONT && bsn.mo2107a(bsq)) {
            obj2 = 1;
        }
        if (obj2 != null) {
            return bxh.YUV;
        }
        return bxh.JPEG;
    }
}

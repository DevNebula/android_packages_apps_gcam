package p000;

/* renamed from: dgm */
final /* synthetic */ class dgm implements iqt {
    /* renamed from: a */
    private final dgl f13803a;

    dgm(dgl dgl) {
        this.f13803a = dgl;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        boolean z = false;
        dgl dgl = this.f13803a;
        Object obj2 = ((fvj) obj).f4961a;
        if (obj2 != null) {
            boolean z2;
            ilb ilb = dgl.f23917w;
            int length = obj2.length;
            if (length > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ilb.mo8826a(Boolean.valueOf(z2));
            gdj gdj = dgl.f23915u;
            jri.m13404b(obj2);
            gdj.f5325a.mo7911a((float) length);
            if (dgl.f23874F != null && dgl.f23896b.mo6126c()) {
                dgl.f23875G.mo7911a(((fvr) dgl.f23874F.mo13673b()).mo6920a().floatValue());
                if (((int) (dgl.f23915u.f5325a.f6640a + 0.5f)) == 0 && dgl.f23875G.f6640a > 3.0f) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                gdl gdl = dgl.f23872D;
                if (valueOf.booleanValue()) {
                    synchronized (gdl.f19088e) {
                        if (gdl.f19090g) {
                            if (gdl.f19091h != C0252go.f5810aI) {
                                gdl.f19091h = C0252go.f5810aI;
                                gdl.f19084a.mo6721b(gdl.f19085b);
                                gdl.mo13330c();
                                gdl.mo13328a(800);
                            }
                        }
                    }
                }
                gdl.f19089f = valueOf;
            }
        }
    }
}

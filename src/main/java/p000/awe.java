package p000;

/* compiled from: PG */
/* renamed from: awe */
public final class awe implements ast {
    /* renamed from: a */
    private final ikb f22524a = new ikb();
    /* renamed from: b */
    private final aso f22525b;
    /* renamed from: c */
    private final hnh f22526c;
    /* renamed from: d */
    private final hnf f22527d;

    public awe(asl asl, aso aso, asy asy, atb atb, hnh hnh, hnf hnf, ikd ikd, asn asn, ffc ffc, ilp ilp, ilp ilp2) {
        boolean z = !ffc.mo9080s() ? ffc.mo9079r() : true;
        jri.m13395a(z);
        this.f22525b = aso;
        this.f22526c = hnh;
        this.f22527d = hnf;
        hnh.mo13548a(new avn(asl, asy.mo1789a(asn, ilp, ffc), atb, ffc.mo9064c(), kgn.f24941a));
        aso.mo1784a();
        this.f22524a.mo8557a(aso.mo1783a(ilp));
        this.f22524a.mo8557a(ilp2.mo13672a(new awf(atb), ikd));
    }

    public final void close() {
        this.f22524a.close();
        this.f22525b.mo1784a();
        this.f22526c.f20208a = null;
    }
}

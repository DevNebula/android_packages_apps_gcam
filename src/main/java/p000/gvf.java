package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gvf */
public final class gvf implements ast {
    /* renamed from: a */
    private final ikb f24447a = new ikb();
    /* renamed from: b */
    private final hnh f24448b;
    /* renamed from: c */
    private final aso f24449c;

    public gvf(asl asl, aso aso, asy asy, atb atb, atn atn, hnh hnh, ikd ikd, hig hig, hik hik, Set set, asn asn, ffc ffc, ilp ilp, ilp ilp2) {
        this.f24448b = hnh;
        this.f24449c = aso;
        boolean z = !ffc.mo9080s() ? ffc.mo9079r() : true;
        jri.m13395a(z);
        asx a = asy.mo1789a(asn, ilp, ffc);
        if (ffc.mo9080s()) {
            this.f24447a.mo8557a(atn.mo1796a(ilp));
        }
        hnh.mo13548a(new gvj(a, atb, hig, hik, ffc.mo9064c(), asl, set));
        aso.mo1784a();
        this.f24447a.mo8557a(aso.mo1783a(ilp));
        this.f24447a.mo8557a(ilp2.mo13672a(new gvg(atb), ikd));
    }

    public final void close() {
        this.f24447a.close();
        this.f24449c.mo1784a();
        this.f24448b.f20208a = null;
    }
}

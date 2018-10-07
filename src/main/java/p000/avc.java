package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: avc */
public final class avc implements ast {
    /* renamed from: a */
    private final ikb f22512a;
    /* renamed from: b */
    private final aso f22513b;
    /* renamed from: c */
    private final hnh f22514c;
    /* renamed from: d */
    private final hnf f22515d;

    public avc(asl asl, aso aso, asy asy, atb atb, atn atn, hnh hnh, hnf hnf, ikd ikd, Set set, asn asn, ffc ffc, ilp ilp, ilp ilp2) {
        this.f22512a = new ikb();
        boolean z = !ffc.mo9080s() ? ffc.mo9079r() : true;
        jri.m13395a(z);
        this.f22513b = aso;
        this.f22514c = hnh;
        this.f22515d = hnf;
        asx a = asy.mo1789a(asn, ilp, ffc);
        if (ffc.mo9080s()) {
            this.f22512a.mo8557a(atn.mo1796a(ilp));
        }
        hnh.mo13548a(new avn(asl, a, atb, ffc.mo9064c(), set));
        aso.mo1784a();
        this.f22512a.mo8557a(aso.mo1783a(ilp));
        this.f22512a.mo8557a(ilp2.mo13672a(new avd(atb), ikd));
    }

    public avc(asl asl, aso aso, asy asy, atb atb, atn atn, hnh hnh, hnf hnf, ikd ikd, Set set, asn asn, ffc ffc, ilp ilp, ilp ilp2, byte b) {
        this(asl, aso, asy, atb, atn, hnh, hnf, ikd, set, asn, ffc, ilp, ilp2);
    }

    public final void close() {
        this.f22512a.close();
        this.f22513b.mo1784a();
        this.f22514c.f20208a = null;
    }
}

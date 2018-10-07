package p000;

/* compiled from: PG */
/* renamed from: elg */
public final class elg {
    /* renamed from: a */
    public final ejl f4155a = new ejl();
    /* renamed from: b */
    private final ejl f4156b = new ejl();
    /* renamed from: c */
    private final ejl f4157c = new ejl();
    /* renamed from: d */
    private final ejl f4158d = new ejl();
    /* renamed from: e */
    private final ejl f4159e = new ejl();
    /* renamed from: f */
    private final eji f4160f = new eji();
    /* renamed from: g */
    private final eji f4161g = new eji();

    /* renamed from: a */
    public static void m1909a(ejl ejl, eji eji) {
        double d;
        double a = ejl.m1833a(ejl, ejl);
        double sqrt = Math.sqrt(a);
        if (a < 1.0E-8d) {
            a = 1.0d - (a * 0.1666666716337204d);
            sqrt = 0.5d;
        } else if (a < 1.0E-6d) {
            sqrt = 0.5d - (0.0416666679084301d * a);
            a *= 0.1666666716337204d;
            a = 1.0d - (a * (1.0d - a));
        } else {
            d = 1.0d / sqrt;
            a = Math.sin(sqrt) * d;
            sqrt = (1.0d - Math.cos(sqrt)) * (d * d);
        }
        d = ejl.f3883a;
        d *= d;
        double d2 = ejl.f3884b;
        d2 *= d2;
        double d3 = ejl.f3885c;
        d3 *= d3;
        eji.mo6238a(0, 0, 1.0d - ((d2 + d3) * sqrt));
        eji.mo6238a(1, 1, 1.0d - ((d3 + d) * sqrt));
        eji.mo6238a(2, 2, 1.0d - ((d + d2) * sqrt));
        d = ejl.f3885c * a;
        d2 = (ejl.f3883a * ejl.f3884b) * sqrt;
        eji.mo6238a(0, 1, d2 - d);
        eji.mo6238a(1, 0, d + d2);
        d = ejl.f3884b * a;
        d2 = (ejl.f3883a * ejl.f3885c) * sqrt;
        eji.mo6238a(0, 2, d2 + d);
        eji.mo6238a(2, 0, d2 - d);
        a *= ejl.f3883a;
        sqrt *= ejl.f3884b * ejl.f3885c;
        eji.mo6238a(1, 2, sqrt - a);
        eji.mo6238a(2, 1, sqrt + a);
    }

    /* renamed from: a */
    public final void mo6307a(ejl ejl, ejl ejl2, eji eji) {
        eji.mo6235a();
        ejl.m1834a(ejl, ejl2, this.f4157c);
        if (this.f4157c.mo6246a() != 0.0d) {
            this.f4158d.mo6249a(ejl);
            this.f4159e.mo6249a(ejl2);
            this.f4157c.mo6250b();
            this.f4158d.mo6250b();
            this.f4159e.mo6250b();
            eji eji2 = this.f4160f;
            eji2.mo6239a(0, this.f4158d);
            eji2.mo6239a(1, this.f4157c);
            ejl.m1834a(this.f4157c, this.f4158d, this.f4156b);
            eji2.mo6239a(2, this.f4156b);
            eji eji3 = this.f4161g;
            eji3.mo6239a(0, this.f4159e);
            eji3.mo6239a(1, this.f4157c);
            ejl.m1834a(this.f4157c, this.f4159e, this.f4156b);
            eji3.mo6239a(2, this.f4156b);
            double[] dArr = eji2.f3875a;
            double d = dArr[1];
            dArr[1] = dArr[3];
            dArr[3] = d;
            d = dArr[2];
            dArr[2] = dArr[6];
            dArr[6] = d;
            d = dArr[5];
            dArr[5] = dArr[7];
            dArr[7] = d;
            eji.m1820a(eji3, eji2, eji);
        }
    }
}

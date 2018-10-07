package p000;

/* compiled from: PG */
/* renamed from: ejl */
public final class ejl {
    /* renamed from: a */
    public double f3883a;
    /* renamed from: b */
    public double f3884b;
    /* renamed from: c */
    public double f3885c;

    /* renamed from: a */
    public static void m1834a(ejl ejl, ejl ejl2, ejl ejl3) {
        double d = ejl.f3884b;
        double d2 = ejl2.f3885c;
        double d3 = ejl.f3885c;
        double d4 = ejl2.f3884b;
        double d5 = ejl2.f3883a;
        double d6 = ejl.f3883a;
        ejl3.mo6248a((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* renamed from: a */
    public static double m1833a(ejl ejl, ejl ejl2) {
        return ((ejl.f3883a * ejl2.f3883a) + (ejl.f3884b * ejl2.f3884b)) + (ejl.f3885c * ejl2.f3885c);
    }

    /* renamed from: a */
    public final double mo6246a() {
        double d = this.f3883a;
        double d2 = this.f3884b;
        double d3 = this.f3885c;
        return Math.sqrt(((d * d) + (d2 * d2)) + (d3 * d3));
    }

    /* renamed from: b */
    public final void mo6250b() {
        double a = mo6246a();
        if (a != 0.0d) {
            mo6247a(1.0d / a);
        }
    }

    /* renamed from: a */
    public final void mo6247a(double d) {
        this.f3883a *= d;
        this.f3884b *= d;
        this.f3885c *= d;
    }

    /* renamed from: a */
    public final void mo6248a(double d, double d2, double d3) {
        this.f3883a = d;
        this.f3884b = d2;
        this.f3885c = d3;
    }

    /* renamed from: a */
    public final void mo6249a(ejl ejl) {
        this.f3883a = ejl.f3883a;
        this.f3884b = ejl.f3884b;
        this.f3885c = ejl.f3885c;
    }

    /* renamed from: c */
    public final void mo6251c() {
        this.f3885c = 0.0d;
        this.f3884b = 0.0d;
        this.f3883a = 0.0d;
    }
}

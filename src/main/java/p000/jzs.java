package p000;

/* compiled from: PG */
/* renamed from: jzs */
public final class jzs {
    /* renamed from: a */
    private double f8523a = Double.MAX_VALUE;
    /* renamed from: b */
    private double f8524b = Double.MIN_VALUE;
    /* renamed from: c */
    private double f8525c = 0.0d;
    /* renamed from: d */
    private double f8526d = 0.0d;
    /* renamed from: e */
    private int f8527e = 0;

    /* renamed from: a */
    public final jzs mo9666a(double d) {
        if (d > this.f8524b) {
            this.f8524b = d;
        }
        if (d < this.f8523a) {
            this.f8523a = d;
        }
        this.f8527e++;
        double d2 = this.f8525c;
        double d3 = d - d2;
        this.f8525c = d2 + (d3 / ((double) this.f8527e));
        this.f8526d += d3 * (d - this.f8525c);
        return this;
    }

    /* renamed from: a */
    public final jzr mo9665a() {
        double d;
        int i = this.f8527e;
        if (i != 0) {
            d = this.f8526d / ((double) i);
        } else {
            d = Double.NaN;
        }
        return new jzr(i, this.f8523a, this.f8524b, this.f8525c, d);
    }
}

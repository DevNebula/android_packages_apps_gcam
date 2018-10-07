package p000;

/* compiled from: PG */
/* renamed from: inl */
final class inl extends inp {
    /* renamed from: a */
    private final ind f21079a;
    /* renamed from: b */
    private final ine f21080b;
    /* renamed from: c */
    private final int f21081c;
    /* renamed from: d */
    private final inc f21082d;
    /* renamed from: e */
    private final int f21083e;
    /* renamed from: f */
    private final int f21084f;
    /* renamed from: g */
    private final int f21085g;

    inl(ind ind, ine ine, int i, inc inc, int i2, int i3, int i4) {
        if (ind == null) {
            throw new NullPointerException("Null videoFileFormat");
        }
        this.f21079a = ind;
        if (ine == null) {
            throw new NullPointerException("Null videoResolution");
        }
        this.f21080b = ine;
        this.f21081c = i;
        if (inc == null) {
            throw new NullPointerException("Null camcorderCaptureRate");
        }
        this.f21082d = inc;
        this.f21083e = i2;
        this.f21084f = i3;
        this.f21085g = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof inp)) {
            return false;
        }
        inp inp = (inp) obj;
        if (this.f21079a.equals(inp.mo8648f()) && this.f21080b.equals(inp.mo8649g()) && this.f21081c == inp.mo8644b() && this.f21082d.equals(inp.mo8643a()) && this.f21083e == inp.mo8645c() && this.f21084f == inp.mo8647e() && this.f21085g == inp.mo8646d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final inc mo8643a() {
        return this.f21082d;
    }

    /* renamed from: b */
    public final int mo8644b() {
        return this.f21081c;
    }

    /* renamed from: c */
    public final int mo8645c() {
        return this.f21083e;
    }

    /* renamed from: d */
    public final int mo8646d() {
        return this.f21085g;
    }

    /* renamed from: e */
    public final int mo8647e() {
        return this.f21084f;
    }

    /* renamed from: f */
    public final ind mo8648f() {
        return this.f21079a;
    }

    /* renamed from: g */
    public final ine mo8649g() {
        return this.f21080b;
    }

    public final int hashCode() {
        return ((((((((((((this.f21079a.hashCode() ^ 1000003) * 1000003) ^ this.f21080b.hashCode()) * 1000003) ^ this.f21081c) * 1000003) ^ this.f21082d.hashCode()) * 1000003) ^ this.f21083e) * 1000003) ^ this.f21084f) * 1000003) ^ this.f21085g;
    }
}

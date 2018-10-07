package p000;

/* compiled from: PG */
/* renamed from: ezf */
public final class ezf implements ezi {
    /* renamed from: a */
    private final long f18064a;
    /* renamed from: b */
    private final eyn f18065b;
    /* renamed from: c */
    private final exk f18066c;
    /* renamed from: d */
    private volatile float f18067d = Float.MAX_VALUE;
    /* renamed from: e */
    private volatile float f18068e;

    public ezf(exk exk, eyn eyn) {
        this.f18065b = eyn;
        this.f18066c = exk;
        this.f18064a = (long) ((((double) eyn.f4588a) * 1.0E9d) / 30.0d);
        this.f18068e = eyn.f4591d;
    }

    /* renamed from: a */
    public final String mo6686a() {
        return "adaptive distance";
    }

    /* renamed from: a */
    public final boolean mo6687a(gid gid, gid gid2) {
        float a = this.f18066c.mo6669a(gid, gid2);
        long abs = Math.abs(gid2.f19184a - gid.f19184a);
        if (abs <= this.f18064a) {
            this.f18067d = Math.min(this.f18067d, (float) ((((double) a) * 1.0E9d) / ((double) abs)));
            float f = this.f18067d;
            eyn eyn = this.f18065b;
            if (f <= eyn.f4589b) {
                float f2 = eyn.f4592e;
                if (f < f2) {
                    f = eyn.f4590c;
                } else {
                    float f3 = eyn.f4593f;
                    if (f > f3) {
                        f = eyn.f4591d;
                    } else {
                        float f4 = eyn.f4590c;
                        f = (((f - f2) * (eyn.f4591d - f4)) / (f3 - f2)) + f4;
                    }
                }
            } else {
                f = 0.0f;
            }
            this.f18068e = f;
        }
        return a > this.f18068e;
    }
}

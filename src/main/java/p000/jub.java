package p000;

/* compiled from: PG */
/* renamed from: jub */
public final class jub implements jtv {
    /* renamed from: a */
    private final jtv f21752a;
    /* renamed from: b */
    private final float f21753b;
    /* renamed from: c */
    private final float f21754c;
    /* renamed from: d */
    private final float f21755d;
    /* renamed from: e */
    private final float f21756e;
    /* renamed from: f */
    private final float f21757f;

    public jub(jtv jtv) {
        this(jtv, (byte) 0);
    }

    private jub(jtv jtv, byte b) {
        this.f21752a = jtv;
        this.f21753b = 1.0f;
        this.f21754c = -1.0f;
        this.f21755d = 1.0f;
        this.f21756e = Float.NaN;
        this.f21757f = Float.NaN;
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        float a = this.f21752a.mo9554a(j).mo9629a();
        float f = this.f21756e;
        if (a >= f) {
            f = a;
        }
        a = this.f21757f;
        if (f > a) {
            f = a;
        }
        a = this.f21755d;
        if (a != 1.0f) {
            f = (float) Math.pow((double) f, (double) a);
            if (Float.isNaN(f)) {
                f = 0.0f;
            }
        }
        return new jzc((f * this.f21754c) + this.f21753b);
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
        this.f21752a.mo9556b(j);
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
        this.f21752a.mo9557c(j);
    }

    /* renamed from: a */
    public final void mo9555a() {
        this.f21752a.mo9555a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21752a);
        float f = this.f21753b;
        float f2 = this.f21754c;
        float f3 = this.f21755d;
        float f4 = this.f21756e;
        float f5 = this.f21757f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 164);
        stringBuilder.append("PolynomialScoreTransformer[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", translate=");
        stringBuilder.append(f);
        stringBuilder.append(", scale=");
        stringBuilder.append(f2);
        stringBuilder.append(", exponent=");
        stringBuilder.append(f3);
        stringBuilder.append(", clampLow=");
        stringBuilder.append(f4);
        stringBuilder.append(", clampHigh=");
        stringBuilder.append(f5);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

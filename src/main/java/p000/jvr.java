package p000;

/* compiled from: PG */
/* renamed from: jvr */
public final class jvr implements jvs {
    /* renamed from: a */
    private final int f21769a = 2;
    /* renamed from: b */
    private final int f21770b = 1;
    /* renamed from: c */
    private final float f21771c;
    /* renamed from: d */
    private final float f21772d;

    public jvr(float f, float f2) {
        jri.m13395a(true);
        jri.m13395a(true);
        this.f21771c = f;
        this.f21772d = f2;
    }

    /* renamed from: a */
    public final float mo9573a(juh juh, long j) {
        if (j < juh.f8352c || j > juh.f8353d) {
            throw new IllegalArgumentException("No threshold for timestamp outside frame segment.");
        }
        int indexOf = ken.m13713a(juh.f8350a).indexOf(Long.valueOf(j));
        if (indexOf < this.f21769a || indexOf >= juh.mo9565d() - this.f21770b) {
            return this.f21771c;
        }
        return this.f21772d;
    }

    public final String toString() {
        float f = this.f21771c;
        float f2 = this.f21772d;
        int i = this.f21769a;
        int i2 = this.f21770b;
        StringBuilder stringBuilder = new StringBuilder(190);
        stringBuilder.append("DifferentStartEndThresholdGenerator[threshold for start/end frames=");
        stringBuilder.append(f);
        stringBuilder.append(", threshold for middle frames=");
        stringBuilder.append(f2);
        stringBuilder.append(", start frames count=");
        stringBuilder.append(i);
        stringBuilder.append(", end frames count=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

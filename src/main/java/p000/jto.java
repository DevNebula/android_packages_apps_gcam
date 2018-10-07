package p000;

/* compiled from: PG */
/* renamed from: jto */
public final class jto {
    /* renamed from: a */
    public final jtp f8334a;
    /* renamed from: b */
    public final int f8335b;
    /* renamed from: c */
    public final int f8336c;
    /* renamed from: d */
    public final boolean f8337d;
    /* renamed from: e */
    public final float f8338e;
    /* renamed from: f */
    public final float f8339f;

    private jto(jtp jtp, int i, int i2, boolean z, float f, float f2) {
        this.f8334a = jtp;
        this.f8335b = i;
        this.f8336c = i2;
        this.f8337d = z;
        this.f8338e = f;
        this.f8339f = f2;
    }

    /* renamed from: a */
    public static jto m4693a(int i) {
        return new jto(jtp.ABS, i, -1, true, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public static jto m4695a(int i, int i2, boolean z) {
        return new jto(jtp.MUL, i, i2, z, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public static jto m4694a(int i, float f, float f2) {
        return new jto(jtp.SIGMOID, i, -1, true, f, f2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8334a);
        int i = this.f8335b;
        int i2 = this.f8336c;
        boolean z = this.f8337d;
        float f = this.f8338e;
        float f2 = this.f8339f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 148);
        stringBuilder.append("FeatureTransform[transform=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", index=");
        stringBuilder.append(i);
        stringBuilder.append(", crossIndex=");
        stringBuilder.append(i2);
        stringBuilder.append(", absolute=");
        stringBuilder.append(z);
        stringBuilder.append(", sigmoidOffset=");
        stringBuilder.append(f);
        stringBuilder.append(", sigmoidScale=");
        stringBuilder.append(f2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

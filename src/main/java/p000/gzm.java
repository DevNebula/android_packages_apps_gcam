package p000;

/* compiled from: PG */
/* renamed from: gzm */
final class gzm {
    /* renamed from: a */
    public final float f6228a;
    /* renamed from: b */
    public final float f6229b;
    /* renamed from: c */
    public final float f6230c;

    public gzm(float f, float f2) {
        this.f6228a = f * 3.0f;
        float f3 = this.f6228a;
        this.f6230c = ((f2 - f) * 3.0f) - f3;
        this.f6229b = (1.0f - f3) - this.f6230c;
    }

    /* renamed from: a */
    public final float mo7590a(float f) {
        return ((((this.f6229b * f) + this.f6230c) * f) + this.f6228a) * f;
    }
}

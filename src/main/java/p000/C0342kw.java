package p000;

/* compiled from: PG */
/* renamed from: kw */
final class C0342kw {
    /* renamed from: a */
    public int f9092a;
    /* renamed from: b */
    public int f9093b;
    /* renamed from: c */
    public float f9094c;
    /* renamed from: d */
    public float f9095d;
    /* renamed from: e */
    public long f9096e = Long.MIN_VALUE;
    /* renamed from: f */
    public long f9097f = 0;
    /* renamed from: g */
    public int f9098g = 0;
    /* renamed from: h */
    public long f9099h = -1;
    /* renamed from: i */
    public float f9100i;
    /* renamed from: j */
    public int f9101j;

    C0342kw() {
    }

    /* renamed from: a */
    final float mo10561a(long j) {
        long j2 = this.f9096e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f9099h;
        if (j3 < 0 || j < j3) {
            return C0341kv.m5425a(((float) (j - j2)) / ((float) this.f9092a), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f9100i;
        return (C0341kv.m5425a(((float) (j - j3)) / ((float) this.f9101j), 0.0f, 1.0f) * f) + (1.0f - f);
    }
}

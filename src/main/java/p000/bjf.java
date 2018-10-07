package p000;

/* compiled from: PG */
/* renamed from: bjf */
enum bjf {
    FPS_30(20000001, 33333333, 1.0f),
    FPS_60(0, 20000000, 1.5f);
    
    /* renamed from: c */
    public final float f1232c;
    /* renamed from: d */
    private final long f1233d;
    /* renamed from: e */
    private final long f1234e;

    private bjf(long j, long j2, float f) {
        this.f1233d = j;
        this.f1234e = j2;
        this.f1232c = f;
    }

    /* renamed from: a */
    final boolean mo1981a(long j) {
        return j >= this.f1233d && j <= this.f1234e;
    }
}

package p000;

/* compiled from: PG */
/* renamed from: hjm */
public final class hjm {
    /* renamed from: a */
    public float f6640a = 0.0f;
    /* renamed from: b */
    private final float f6641b;
    /* renamed from: c */
    private float f6642c = 0.0f;

    public hjm(int i) {
        this.f6641b = (float) i;
    }

    /* renamed from: a */
    public final void mo7911a(float f) {
        float f2 = this.f6642c;
        float f3 = this.f6641b;
        if (f2 != f3) {
            f3 = f2 + 1.0f;
        }
        this.f6642c = f3;
        f3 = 1.0f / this.f6642c;
        this.f6640a = (f3 * f) + (this.f6640a * (1.0f - f3));
    }
}

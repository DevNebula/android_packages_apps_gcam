package p000;

/* compiled from: PG */
/* renamed from: gzg */
public final class gzg {
    /* renamed from: a */
    public float f6219a;
    /* renamed from: b */
    public float f6220b;
    /* renamed from: c */
    private final float f6221c;
    /* renamed from: d */
    private final float f6222d;
    /* renamed from: e */
    private float f6223e;

    public gzg() {
        this((byte) 0);
    }

    private gzg(byte b) {
        this.f6219a = 0.0f;
        this.f6223e = 0.0f;
        this.f6220b = 0.0f;
        this.f6222d = 200.0f;
        this.f6221c = 3.75f;
    }

    /* renamed from: a */
    public final boolean mo7584a() {
        return Math.abs(this.f6223e) >= 0.01f || Math.abs(this.f6219a - this.f6220b) >= 0.01f;
    }

    /* renamed from: b */
    public final void mo7585b() {
        this.f6219a = this.f6220b;
        this.f6223e = 0.0f;
    }

    /* renamed from: a */
    public final float mo7583a(float f) {
        float f2 = (f / this.f6222d) * this.f6221c;
        if (f2 > 1.0f || f2 < 0.0f) {
            mo7585b();
            return this.f6220b;
        }
        float f3 = this.f6219a;
        float f4 = this.f6220b;
        float f5 = this.f6223e;
        this.f6223e = (((f3 - f4) - (f5 + f5)) * f2) + f5;
        this.f6220b = (f2 * this.f6223e) + f4;
        if (!mo7584a()) {
            mo7585b();
        }
        return this.f6220b;
    }
}

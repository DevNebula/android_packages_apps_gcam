package p000;

/* compiled from: PG */
/* renamed from: hrk */
public final class hrk {
    /* renamed from: a */
    public float f6864a = 0.0f;
    /* renamed from: b */
    public float f6865b = this.f6864a;
    /* renamed from: c */
    private float f6866c;

    public hrk(float f) {
        this.f6866c = f;
    }

    /* renamed from: a */
    public final void mo8058a(float f) {
        this.f6864a = f;
        this.f6865b = f;
    }

    /* renamed from: b */
    public final void mo8059b(float f) {
        float f2 = this.f6864a;
        this.f6865b = f2;
        float f3 = this.f6866c;
        this.f6864a = (f2 * f3) + ((1.0f - f3) * f);
    }
}

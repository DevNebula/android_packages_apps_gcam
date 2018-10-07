package p000;

/* compiled from: PG */
/* renamed from: ejk */
public final class ejk {
    /* renamed from: a */
    public float f3880a;
    /* renamed from: b */
    public float f3881b;
    /* renamed from: c */
    public float f3882c;

    static {
        ejk ejk = new ejk(0.0f, 0.0f, 0.0f);
    }

    public ejk(float f, float f2, float f3) {
        mo6244a(f, f2, f3);
    }

    /* renamed from: a */
    public final void mo6244a(float f, float f2, float f3) {
        this.f3880a = f;
        this.f3881b = f2;
        this.f3882c = f3;
    }

    public final String toString() {
        float f = this.f3880a;
        float f2 = this.f3881b;
        float f3 = this.f3882c;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        return stringBuilder.toString();
    }
}

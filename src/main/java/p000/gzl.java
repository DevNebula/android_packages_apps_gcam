package p000;

/* compiled from: PG */
/* renamed from: gzl */
public final class gzl {
    /* renamed from: a */
    public final float f6224a = 1.0f;
    /* renamed from: b */
    public final float f6225b;
    /* renamed from: c */
    public final float f6226c;
    /* renamed from: d */
    private final float f6227d;

    public gzl(float f, float f2) {
        this.f6225b = f;
        this.f6227d = f2;
        float f3 = (this.f6227d - this.f6225b) / this.f6224a;
        if (Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        this.f6226c = f3;
    }

    public final String toString() {
        float f = this.f6224a;
        float f2 = this.f6225b;
        float f3 = this.f6227d;
        StringBuilder stringBuilder = new StringBuilder(113);
        stringBuilder.append("LinearScale{mDomainA=");
        stringBuilder.append(0.0f);
        stringBuilder.append(", mDomainB=");
        stringBuilder.append(f);
        stringBuilder.append(", mRangeA=");
        stringBuilder.append(f2);
        stringBuilder.append(", mRangeB=");
        stringBuilder.append(f3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package p000;

/* compiled from: PG */
/* renamed from: se */
final class C0472se {
    /* renamed from: a */
    public C0530ux f9698a;
    /* renamed from: b */
    public C0530ux f9699b;
    /* renamed from: c */
    public int f9700c;
    /* renamed from: d */
    public int f9701d;
    /* renamed from: e */
    public int f9702e;
    /* renamed from: f */
    public int f9703f;

    private C0472se(C0530ux c0530ux, C0530ux c0530ux2) {
        this.f9698a = c0530ux;
        this.f9699b = c0530ux2;
    }

    C0472se(C0530ux c0530ux, C0530ux c0530ux2, int i, int i2, int i3, int i4) {
        this(c0530ux, c0530ux2);
        this.f9700c = i;
        this.f9701d = i2;
        this.f9702e = i3;
        this.f9703f = i4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChangeInfo{oldHolder=");
        stringBuilder.append(this.f9698a);
        stringBuilder.append(", newHolder=");
        stringBuilder.append(this.f9699b);
        stringBuilder.append(", fromX=");
        stringBuilder.append(this.f9700c);
        stringBuilder.append(", fromY=");
        stringBuilder.append(this.f9701d);
        stringBuilder.append(", toX=");
        stringBuilder.append(this.f9702e);
        stringBuilder.append(", toY=");
        stringBuilder.append(this.f9703f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

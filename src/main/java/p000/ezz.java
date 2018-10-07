package p000;

/* compiled from: PG */
/* renamed from: ezz */
public final class ezz extends faa {
    /* renamed from: a */
    private final int f18077a;
    /* renamed from: b */
    private final int f18078b;
    /* renamed from: c */
    private final int f18079c;
    /* renamed from: d */
    private final int f18080d;
    /* renamed from: e */
    private final int f18081e;

    public ezz(int i, int i2, int i3, int i4, int i5) {
        this.f18077a = i;
        this.f18078b = i2;
        this.f18079c = i3;
        this.f18080d = i4;
        this.f18081e = i5;
    }

    /* renamed from: a */
    public final int mo6695a() {
        return this.f18077a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof faa)) {
            return false;
        }
        faa faa = (faa) obj;
        if (this.f18077a == faa.mo6695a() && this.f18078b == faa.mo6696b() && this.f18079c == faa.mo6699e() && this.f18080d == faa.mo6698d() && this.f18081e == faa.mo6697c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f18077a ^ 1000003) * 1000003) ^ this.f18078b) * 1000003) ^ this.f18079c) * 1000003) ^ this.f18080d) * 1000003) ^ this.f18081e;
    }

    /* renamed from: b */
    public final int mo6696b() {
        return this.f18078b;
    }

    /* renamed from: c */
    public final int mo6697c() {
        return this.f18081e;
    }

    /* renamed from: d */
    public final int mo6698d() {
        return this.f18080d;
    }

    /* renamed from: e */
    public final int mo6699e() {
        return this.f18079c;
    }
}

package p000;

/* compiled from: PG */
/* renamed from: inw */
final class inw extends ioc {
    /* renamed from: a */
    private final int f24652a;
    /* renamed from: b */
    private final int f24653b;
    /* renamed from: c */
    private final int f24654c;
    /* renamed from: d */
    private final int f24655d;
    /* renamed from: e */
    private final int f24656e;
    /* renamed from: f */
    private final int f24657f;
    /* renamed from: g */
    private final int f24658g;
    /* renamed from: h */
    private final int f24659h;
    /* renamed from: i */
    private final int f24660i;
    /* renamed from: j */
    private final int f24661j;
    /* renamed from: k */
    private final int f24662k;
    /* renamed from: l */
    private final int f24663l;
    /* renamed from: m */
    private final int f24664m;

    inw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f24652a = i;
        this.f24653b = i2;
        this.f24654c = i3;
        this.f24655d = i4;
        this.f24656e = i5;
        this.f24657f = i6;
        this.f24658g = i7;
        this.f24659h = i8;
        this.f24660i = i9;
        this.f24661j = i10;
        this.f24662k = i11;
        this.f24663l = i12;
        this.f24664m = i13;
    }

    /* renamed from: a */
    public final int mo8656a() {
        return this.f24652a;
    }

    /* renamed from: b */
    public final int mo8657b() {
        return this.f24653b;
    }

    /* renamed from: c */
    public final int mo8658c() {
        return this.f24654c;
    }

    /* renamed from: d */
    public final int mo8659d() {
        return this.f24655d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ioc)) {
            return false;
        }
        ioc ioc = (ioc) obj;
        if (this.f24652a == ioc.mo8656a() && this.f24653b == ioc.mo8657b() && this.f24654c == ioc.mo8658c() && this.f24655d == ioc.mo8659d() && this.f24656e == ioc.mo8660e() && this.f24657f == ioc.mo8661f() && this.f24658g == ioc.mo8662g() && this.f24659h == ioc.mo8663h() && this.f24660i == ioc.mo8665j() && this.f24661j == ioc.mo8664i() && this.f24662k == ioc.mo8666k() && this.f24663l == ioc.mo8667l() && this.f24664m == ioc.mo8668m()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo8660e() {
        return this.f24656e;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.f24652a ^ 1000003) * 1000003) ^ this.f24653b) * 1000003) ^ this.f24654c) * 1000003) ^ this.f24655d) * 1000003) ^ this.f24656e) * 1000003) ^ this.f24657f) * 1000003) ^ this.f24658g) * 1000003) ^ this.f24659h) * 1000003) ^ this.f24660i) * 1000003) ^ this.f24661j) * 1000003) ^ this.f24662k) * 1000003) ^ this.f24663l) * 1000003) ^ this.f24664m;
    }

    /* renamed from: f */
    public final int mo8661f() {
        return this.f24657f;
    }

    public final String toString() {
        int i = this.f24652a;
        int i2 = this.f24653b;
        int i3 = this.f24654c;
        int i4 = this.f24655d;
        int i5 = this.f24656e;
        int i6 = this.f24657f;
        int i7 = this.f24658g;
        int i8 = this.f24659h;
        int i9 = this.f24660i;
        int i10 = this.f24661j;
        int i11 = this.f24662k;
        int i12 = this.f24663l;
        int i13 = this.f24664m;
        StringBuilder stringBuilder = new StringBuilder(375);
        stringBuilder.append("SimpleCamcorderProfileProxy{audioBitRate=");
        stringBuilder.append(i);
        stringBuilder.append(", audioChannels=");
        stringBuilder.append(i2);
        stringBuilder.append(", audioCodec=");
        stringBuilder.append(i3);
        stringBuilder.append(", audioSampleRate=");
        stringBuilder.append(i4);
        stringBuilder.append(", fileFormat=");
        stringBuilder.append(i5);
        stringBuilder.append(", quality=");
        stringBuilder.append(i6);
        stringBuilder.append(", videoBitRate=");
        stringBuilder.append(i7);
        stringBuilder.append(", videoCodec=");
        stringBuilder.append(i8);
        stringBuilder.append(", videoCodecProfile=");
        stringBuilder.append(i9);
        stringBuilder.append(", videoCodecLevel=");
        stringBuilder.append(i10);
        stringBuilder.append(", videoFrameHeight=");
        stringBuilder.append(i11);
        stringBuilder.append(", videoFrameRate=");
        stringBuilder.append(i12);
        stringBuilder.append(", videoFrameWidth=");
        stringBuilder.append(i13);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: g */
    public final int mo8662g() {
        return this.f24658g;
    }

    /* renamed from: h */
    public final int mo8663h() {
        return this.f24659h;
    }

    /* renamed from: i */
    public final int mo8664i() {
        return this.f24661j;
    }

    /* renamed from: j */
    public final int mo8665j() {
        return this.f24660i;
    }

    /* renamed from: k */
    public final int mo8666k() {
        return this.f24662k;
    }

    /* renamed from: l */
    public final int mo8667l() {
        return this.f24663l;
    }

    /* renamed from: m */
    public final int mo8668m() {
        return this.f24664m;
    }
}

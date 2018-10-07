package p000;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: hay */
final class hay extends hcj {
    /* renamed from: a */
    private final int f19880a;
    /* renamed from: b */
    private final int f19881b;
    /* renamed from: c */
    private final int f19882c;
    /* renamed from: d */
    private final int f19883d;
    /* renamed from: e */
    private final int f19884e;
    /* renamed from: f */
    private final int f19885f;
    /* renamed from: g */
    private final int f19886g;
    /* renamed from: h */
    private final int f19887h;
    /* renamed from: i */
    private final Drawable f19888i;
    /* renamed from: j */
    private final int f19889j;
    /* renamed from: k */
    private final boolean f19890k;
    /* renamed from: l */
    private final int f19891l;
    /* renamed from: m */
    private final int f19892m;
    /* renamed from: n */
    private final int f19893n;
    /* renamed from: o */
    private final int f19894o;
    /* renamed from: p */
    private final hbf f19895p;

    hay(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Drawable drawable, int i9, boolean z, int i10, int i11, int i12, int i13, hbf hbf) {
        this.f19880a = i;
        this.f19881b = i2;
        this.f19882c = i3;
        this.f19883d = i4;
        this.f19884e = i5;
        this.f19885f = i6;
        this.f19886g = i7;
        this.f19887h = i8;
        this.f19888i = drawable;
        this.f19889j = i9;
        this.f19890k = z;
        this.f19891l = i10;
        this.f19892m = i11;
        this.f19893n = i12;
        this.f19894o = i13;
        this.f19895p = hbf;
    }

    /* renamed from: a */
    public final boolean mo7679a() {
        return this.f19890k;
    }

    /* renamed from: b */
    public final Drawable mo7680b() {
        return this.f19888i;
    }

    /* renamed from: c */
    public final int mo7681c() {
        return this.f19889j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcj)) {
            return false;
        }
        hcj hcj = (hcj) obj;
        if (this.f19880a == hcj.mo7686h() && this.f19881b == hcj.mo7684f() && this.f19882c == hcj.mo7685g() && this.f19883d == hcj.mo7694p() && this.f19884e == hcj.mo7693o() && this.f19885f == hcj.mo7692n() && this.f19886g == hcj.mo7687i() && this.f19887h == hcj.mo7688j()) {
            Drawable drawable = this.f19888i;
            if (drawable == null ? hcj.mo7680b() == null : drawable.equals(hcj.mo7680b())) {
                if (this.f19889j == hcj.mo7681c() && this.f19890k == hcj.mo7679a() && this.f19891l == hcj.mo7689k() && this.f19892m == hcj.mo7690l() && this.f19893n == hcj.mo7682d() && this.f19894o == hcj.mo7691m() && this.f19895p.equals(hcj.mo7683e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = (((((((((((((((this.f19880a ^ 1000003) * 1000003) ^ this.f19881b) * 1000003) ^ this.f19882c) * 1000003) ^ this.f19883d) * 1000003) ^ this.f19884e) * 1000003) ^ this.f19885f) * 1000003) ^ this.f19886g) * 1000003) ^ this.f19887h) * 1000003;
        Drawable drawable = this.f19888i;
        if (drawable != null) {
            hashCode = drawable.hashCode();
        } else {
            hashCode = 0;
        }
        i = (((hashCode ^ i) * 1000003) ^ this.f19889j) * 1000003;
        if (this.f19890k) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ this.f19891l) * 1000003) ^ this.f19892m) * 1000003) ^ this.f19893n) * 1000003) ^ this.f19894o) * 1000003) ^ this.f19895p.hashCode();
    }

    /* renamed from: d */
    public final int mo7682d() {
        return this.f19893n;
    }

    /* renamed from: e */
    public final hbf mo7683e() {
        return this.f19895p;
    }

    /* renamed from: f */
    public final int mo7684f() {
        return this.f19881b;
    }

    /* renamed from: g */
    public final int mo7685g() {
        return this.f19882c;
    }

    /* renamed from: h */
    public final int mo7686h() {
        return this.f19880a;
    }

    /* renamed from: i */
    public final int mo7687i() {
        return this.f19886g;
    }

    /* renamed from: j */
    public final int mo7688j() {
        return this.f19887h;
    }

    /* renamed from: k */
    public final int mo7689k() {
        return this.f19891l;
    }

    /* renamed from: l */
    public final int mo7690l() {
        return this.f19892m;
    }

    /* renamed from: m */
    public final int mo7691m() {
        return this.f19894o;
    }

    /* renamed from: n */
    public final int mo7692n() {
        return this.f19885f;
    }

    public final String toString() {
        int i = this.f19880a;
        int i2 = this.f19881b;
        int i3 = this.f19882c;
        int i4 = this.f19883d;
        int i5 = this.f19884e;
        int i6 = this.f19885f;
        int i7 = this.f19886g;
        int i8 = this.f19887h;
        String valueOf = String.valueOf(this.f19888i);
        int i9 = this.f19889j;
        boolean z = this.f19890k;
        int i10 = this.f19891l;
        int i11 = this.f19892m;
        int i12 = this.f19893n;
        int i13 = this.f19894o;
        String valueOf2 = String.valueOf(this.f19895p);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 477) + String.valueOf(valueOf2).length());
        stringBuilder.append("ShutterButtonSpec{photoCircleRadius=");
        stringBuilder.append(i);
        stringBuilder.append(", photoCircleAlpha=");
        stringBuilder.append(i2);
        stringBuilder.append(", photoCircleColor=");
        stringBuilder.append(i3);
        stringBuilder.append(", videoDotRadius=");
        stringBuilder.append(i4);
        stringBuilder.append(", videoCircleColor=");
        stringBuilder.append(i5);
        stringBuilder.append(", stopSquareHalfSize=");
        stringBuilder.append(i6);
        stringBuilder.append(", portraitInnerCircleRadius=");
        stringBuilder.append(i7);
        stringBuilder.append(", portraitOuterCircleRadius=");
        stringBuilder.append(i8);
        stringBuilder.append(", buttonImage=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", buttonImageRectHalfSize=");
        stringBuilder.append(i9);
        stringBuilder.append(", animateRippleEffect=");
        stringBuilder.append(z);
        stringBuilder.append(", ripplePaintAlpha=");
        stringBuilder.append(i10);
        stringBuilder.append(", rippleRadius=");
        stringBuilder.append(i11);
        stringBuilder.append(", mainButtonColor=");
        stringBuilder.append(i12);
        stringBuilder.append(", roundButtonRadius=");
        stringBuilder.append(i13);
        stringBuilder.append(", mode=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: o */
    public final int mo7693o() {
        return this.f19884e;
    }

    /* renamed from: p */
    public final int mo7694p() {
        return this.f19883d;
    }
}

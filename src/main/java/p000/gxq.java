package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: gxq */
public final class gxq extends gxv {
    /* renamed from: a */
    private final Size f19803a;
    /* renamed from: b */
    private final Rect f19804b;
    /* renamed from: c */
    private final Rect f19805c;
    /* renamed from: d */
    private final Rect f19806d;
    /* renamed from: e */
    private final Rect f19807e;
    /* renamed from: f */
    private final Rect f19808f;
    /* renamed from: g */
    private final Rect f19809g;
    /* renamed from: h */
    private final Rect f19810h;

    public gxq(Size size, Rect rect, Rect rect2, Rect rect3, Rect rect4, Rect rect5, Rect rect6, Rect rect7) {
        this.f19803a = size;
        this.f19804b = rect;
        this.f19805c = rect2;
        this.f19806d = rect3;
        this.f19807e = rect4;
        this.f19808f = rect5;
        this.f19809g = rect6;
        this.f19810h = rect7;
    }

    /* renamed from: a */
    public final Rect mo7513a() {
        return this.f19808f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxv)) {
            return false;
        }
        gxv gxv = (gxv) obj;
        if (this.f19803a.equals(gxv.mo7520h()) && this.f19804b.equals(gxv.mo7517e()) && this.f19805c.equals(gxv.mo7519g()) && this.f19806d.equals(gxv.mo7518f()) && this.f19807e.equals(gxv.mo7516d()) && this.f19808f.equals(gxv.mo7513a()) && this.f19809g.equals(gxv.mo7514b()) && this.f19810h.equals(gxv.mo7515c())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Rect mo7514b() {
        return this.f19809g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f19803a.hashCode() ^ 1000003) * 1000003) ^ this.f19804b.hashCode()) * 1000003) ^ this.f19805c.hashCode()) * 1000003) ^ this.f19806d.hashCode()) * 1000003) ^ this.f19807e.hashCode()) * 1000003) ^ this.f19808f.hashCode()) * 1000003) ^ this.f19809g.hashCode()) * 1000003) ^ this.f19810h.hashCode();
    }

    /* renamed from: c */
    public final Rect mo7515c() {
        return this.f19810h;
    }

    /* renamed from: d */
    public final Rect mo7516d() {
        return this.f19807e;
    }

    /* renamed from: e */
    public final Rect mo7517e() {
        return this.f19804b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19803a);
        String valueOf2 = String.valueOf(this.f19804b);
        String valueOf3 = String.valueOf(this.f19805c);
        String valueOf4 = String.valueOf(this.f19806d);
        String valueOf5 = String.valueOf(this.f19807e);
        String valueOf6 = String.valueOf(this.f19808f);
        String valueOf7 = String.valueOf(this.f19809g);
        String valueOf8 = String.valueOf(this.f19810h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder stringBuilder = new StringBuilder((((((((length + 117) + length2) + length3) + length4) + length5) + length6) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length());
        stringBuilder.append("CameraLayoutBoxes{window=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", preview=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", uncoveredPreview=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", topBar=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", optionsBar=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", bottomBar=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", fullScreen=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", modeSwitchUi=");
        stringBuilder.append(valueOf8);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public final Rect mo7518f() {
        return this.f19806d;
    }

    /* renamed from: g */
    public final Rect mo7519g() {
        return this.f19805c;
    }

    /* renamed from: h */
    public final Size mo7520h() {
        return this.f19803a;
    }
}

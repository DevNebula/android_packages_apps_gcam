package p000;

import android.util.Size;

/* compiled from: PG */
/* renamed from: gxr */
final class gxr extends gxw {
    /* renamed from: b */
    private final boolean f19811b;
    /* renamed from: c */
    private final Size f19812c;
    /* renamed from: d */
    private final Size f19813d;
    /* renamed from: e */
    private final hir f19814e;

    gxr(boolean z, Size size, Size size2, hir hir) {
        this.f19811b = z;
        this.f19812c = size;
        this.f19813d = size2;
        this.f19814e = hir;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxw)) {
            return false;
        }
        gxw gxw = (gxw) obj;
        if (this.f19811b == gxw.mo7525e() && this.f19812c.equals(gxw.mo7524d()) && this.f19813d.equals(gxw.mo7522b()) && this.f19814e.equals(gxw.mo7521a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f19811b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((i ^ 1000003) * 1000003) ^ this.f19812c.hashCode()) * 1000003) ^ this.f19813d.hashCode()) * 1000003) ^ this.f19814e.hashCode();
    }

    /* renamed from: a */
    public final hir mo7521a() {
        return this.f19814e;
    }

    /* renamed from: b */
    public final Size mo7522b() {
        return this.f19813d;
    }

    /* renamed from: c */
    public final gxx mo7523c() {
        return new gxx((gxw) this);
    }

    public final String toString() {
        boolean z = this.f19811b;
        String valueOf = String.valueOf(this.f19812c);
        String valueOf2 = String.valueOf(this.f19813d);
        String valueOf3 = String.valueOf(this.f19814e);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 95) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("CameraLayoutConstraints{windowSizeAsPreviewSize=");
        stringBuilder.append(z);
        stringBuilder.append(", windowSize=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", previewSize=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", orientation=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public final Size mo7524d() {
        return this.f19812c;
    }

    /* renamed from: e */
    public final boolean mo7525e() {
        return this.f19811b;
    }
}

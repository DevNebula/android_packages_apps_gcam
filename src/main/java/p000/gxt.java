package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: gxt */
final class gxt extends gyh {
    /* renamed from: a */
    private final Size f19818a;
    /* renamed from: b */
    private final Rect f19819b;
    /* renamed from: c */
    private final Rect f19820c;
    /* renamed from: d */
    private final int f19821d;
    /* renamed from: e */
    private final int f19822e = 0;

    gxt(Size size, Rect rect, Rect rect2, int i) {
        this.f19818a = size;
        this.f19819b = rect;
        this.f19820c = rect2;
        this.f19821d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gyh)) {
            return false;
        }
        gyh gyh = (gyh) obj;
        if (this.f19818a.equals(gyh.mo7545e()) && this.f19819b.equals(gyh.mo7544d()) && this.f19820c.equals(gyh.mo7543c()) && this.f19821d == gyh.mo7541a() && gyh.mo7542b() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo7541a() {
        return this.f19821d;
    }

    public final int hashCode() {
        return (((((((this.f19818a.hashCode() ^ 1000003) * 1000003) ^ this.f19819b.hashCode()) * 1000003) ^ this.f19820c.hashCode()) * 1000003) ^ this.f19821d) * 1000003;
    }

    /* renamed from: b */
    public final int mo7542b() {
        return 0;
    }

    /* renamed from: c */
    public final Rect mo7543c() {
        return this.f19820c;
    }

    /* renamed from: d */
    public final Rect mo7544d() {
        return this.f19819b;
    }

    /* renamed from: e */
    public final Size mo7545e() {
        return this.f19818a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19818a);
        String valueOf2 = String.valueOf(this.f19819b);
        String valueOf3 = String.valueOf(this.f19820c);
        int i = this.f19821d;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 97) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ViewfinderLayoutSpec{size=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", padding=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", margins=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", gravity=");
        stringBuilder.append(i);
        stringBuilder.append(", layoutDirection=");
        stringBuilder.append(0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

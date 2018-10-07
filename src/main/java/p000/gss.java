package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: gss */
public final class gss {
    /* renamed from: a */
    public final Bitmap f6036a;
    /* renamed from: b */
    public final iqm f6037b;

    public gss(Bitmap bitmap, iqm iqm) {
        jri.m13404b((Object) bitmap);
        jri.m13404b((Object) iqm);
        this.f6036a = bitmap;
        this.f6037b = iqm;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6036a);
        String valueOf2 = String.valueOf(this.f6037b);
        int hashCode = hashCode();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length());
        stringBuilder.append("OrientationBitmap[Bitmap: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("][rotation: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]: ");
        stringBuilder.append(hashCode);
        return stringBuilder.toString();
    }
}

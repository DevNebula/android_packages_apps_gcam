package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: jrd */
public final class jrd implements jqo {
    /* renamed from: a */
    private final agw f21667a;

    public jrd() {
        this(new ahe(52428800));
    }

    public jrd(agw agw) {
        jri.m13404b((Object) agw);
        this.f21667a = agw;
    }

    /* renamed from: a */
    public final jqr mo9529a(String str, int i, int i2, Config config) {
        Bitmap a = this.f21667a.mo280a(i, i2, config);
        if (a == null) {
            a = Bitmap.createBitmap(i, i2, config);
        }
        return new jre(a, this.f21667a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21667a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("PoolBitmapAllocator[pool=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final jqr mo9530a(String str, Bitmap bitmap) {
        return new jre(bitmap, this.f21667a);
    }
}

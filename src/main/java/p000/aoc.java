package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aoc */
public final class aoc implements ads {
    /* renamed from: b */
    private final ads f22497b;

    public aoc(ads ads) {
        this.f22497b = (ads) aqe.m610a((Object) ads, "Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoc)) {
            return false;
        }
        return this.f22497b.equals(((aoc) obj).f22497b);
    }

    public final int hashCode() {
        return this.f22497b.hashCode();
    }

    /* renamed from: a */
    public final agn mo11620a(Context context, agn agn, int i, int i2) {
        any any = (any) agn.mo262b();
        agn alv = new alv(any.mo12285b(), acc.m98a(context).f187a);
        agn a = this.f22497b.mo11620a(context, alv, i, i2);
        if (!alv.equals(a)) {
            alv.mo265e();
        }
        Bitmap bitmap = (Bitmap) a.mo262b();
        any.f10612a.f824a.mo1629a(this.f22497b, bitmap);
        return agn;
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        this.f22497b.mo172a(messageDigest);
    }
}

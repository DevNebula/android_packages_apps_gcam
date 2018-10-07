package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: amr */
public final class amr implements ads {
    /* renamed from: b */
    private final ads f22488b;
    /* renamed from: c */
    private final boolean f22489c;

    public amr(ads ads, boolean z) {
        this.f22488b = ads;
        this.f22489c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amr)) {
            return false;
        }
        return this.f22488b.equals(((amr) obj).f22488b);
    }

    public final int hashCode() {
        return this.f22488b.hashCode();
    }

    /* renamed from: a */
    public final agn mo11620a(Context context, agn agn, int i, int i2) {
        Drawable drawable = (Drawable) agn.mo262b();
        agn a = amp.m354a(acc.m98a(context).f187a, drawable, i, i2);
        if (a != null) {
            agn a2 = this.f22488b.mo11620a(context, a, i, i2);
            if (!a2.equals(a)) {
                return amv.m6719a(context.getResources(), a2);
            }
            a2.mo265e();
            return agn;
        } else if (!this.f22489c) {
            return agn;
        } else {
            String valueOf = String.valueOf(drawable);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("Unable to convert ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to a Bitmap");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        this.f22488b.mo172a(messageDigest);
    }
}

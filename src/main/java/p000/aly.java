package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: aly */
public final class aly extends alw {
    /* renamed from: b */
    private static final byte[] f25479b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f334a);

    public final boolean equals(Object obj) {
        return obj instanceof aly;
    }

    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }

    /* renamed from: a */
    protected final Bitmap mo14478a(agw agw, Bitmap bitmap, int i, int i2) {
        return anb.m366a(agw, bitmap, i, i2);
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        messageDigest.update(f25479b);
    }
}

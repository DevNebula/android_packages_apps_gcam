package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: jqn */
public abstract class jqn extends jzw implements jqr {
    public jqn(Bitmap bitmap) {
        super(bitmap, (byte) 0);
    }

    /* renamed from: a */
    protected abstract void mo15061a(Bitmap bitmap);

    /* renamed from: a */
    public final int mo15046a() {
        return ((Bitmap) mo9674e()).getHeight();
    }

    /* renamed from: b */
    public final int mo15047b() {
        return ((Bitmap) mo9674e()).getWidth();
    }

    /* renamed from: c */
    public final int mo15048c() {
        return ((Bitmap) mo9674e()).getAllocationByteCount();
    }
}

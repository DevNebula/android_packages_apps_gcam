package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: kag */
public final class kag extends kac implements jqr, kah {
    public kag(jqr jqr) {
        this((kae) jqr);
    }

    private kag(kae kae) {
        super((jzx) kae);
    }

    private kag(kag kag) {
        super((kac) kag);
    }

    public kag(kag kag, byte b) {
        this(kag);
    }

    public final void close() {
        super.close();
    }

    /* renamed from: a */
    public final int mo15046a() {
        return ((Bitmap) super.mo9674e()).getHeight();
    }

    /* renamed from: b */
    public final int mo15047b() {
        return ((Bitmap) super.mo9674e()).getWidth();
    }

    /* renamed from: D_ */
    public final kah mo13896E_() {
        return new kag(this);
    }

    /* renamed from: c */
    public final int mo15048c() {
        return ((Bitmap) super.mo9674e()).getAllocationByteCount();
    }
}

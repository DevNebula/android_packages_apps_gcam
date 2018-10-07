package p000;

import android.graphics.Bitmap;

/* renamed from: gla */
final /* synthetic */ class gla implements Runnable {
    /* renamed from: a */
    private final gkt f5588a;
    /* renamed from: b */
    private final Bitmap f5589b;
    /* renamed from: c */
    private final int f5590c;

    gla(gkt gkt, Bitmap bitmap, int i) {
        this.f5588a = gkt;
        this.f5589b = bitmap;
        this.f5590c = i;
    }

    public final void run() {
        gkt gkt = this.f5588a;
        gkt.f24401r.mo7243a(this.f5589b, this.f5590c);
    }
}

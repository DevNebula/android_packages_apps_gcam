package p000;

import android.net.Uri;

/* renamed from: gky */
final /* synthetic */ class gky implements Runnable {
    /* renamed from: a */
    private final gkt f5581a;
    /* renamed from: b */
    private final Uri f5582b;
    /* renamed from: c */
    private final int f5583c;

    gky(gkt gkt, Uri uri, int i) {
        this.f5581a = gkt;
        this.f5582b = uri;
        this.f5583c = i;
    }

    public final void run() {
        gkt gkt = this.f5581a;
        gkt.f24401r.mo7245a(this.f5582b, this.f5583c);
    }
}

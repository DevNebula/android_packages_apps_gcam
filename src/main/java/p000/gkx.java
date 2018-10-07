package p000;

import android.net.Uri;

/* renamed from: gkx */
final /* synthetic */ class gkx implements Runnable {
    /* renamed from: a */
    private final gkt f5579a;
    /* renamed from: b */
    private final Uri f5580b;

    gkx(gkt gkt, Uri uri) {
        this.f5579a = gkt;
        this.f5580b = uri;
    }

    public final void run() {
        gkt gkt = this.f5579a;
        gkt.f24401r.mo7244a(this.f5580b);
    }
}

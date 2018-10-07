package p000;

import android.net.Uri;

/* renamed from: glb */
final /* synthetic */ class glb implements Runnable {
    /* renamed from: a */
    private final gkt f5591a;
    /* renamed from: b */
    private final Uri f5592b;

    glb(gkt gkt, Uri uri) {
        this.f5591a = gkt;
        this.f5592b = uri;
    }

    public final void run() {
        gkt gkt = this.f5591a;
        gkt.f24401r.mo7251b(this.f5592b);
        gkt.f24409z = null;
    }
}

package p000;

import android.net.Uri;

/* renamed from: gkz */
final /* synthetic */ class gkz implements Runnable {
    /* renamed from: a */
    private final gkt f5584a;
    /* renamed from: b */
    private final Uri f5585b;
    /* renamed from: c */
    private final hec f5586c;

    gkz(gkt gkt, Uri uri, hec hec) {
        this.f5584a = gkt;
        this.f5585b = uri;
        this.f5586c = hec;
    }

    public final void run() {
        gkt gkt = this.f5584a;
        gkt.f24401r.mo7247a(this.f5585b, this.f5586c);
    }
}

package p000;

import android.net.Uri;

/* renamed from: glc */
final /* synthetic */ class glc implements Runnable {
    /* renamed from: a */
    private final gkt f5593a;
    /* renamed from: b */
    private final Uri f5594b;
    /* renamed from: c */
    private final hec f5595c;
    /* renamed from: d */
    private final boolean f5596d;

    glc(gkt gkt, Uri uri, hec hec, boolean z) {
        this.f5593a = gkt;
        this.f5594b = uri;
        this.f5595c = hec;
        this.f5596d = z;
    }

    public final void run() {
        gkt gkt = this.f5593a;
        gkt.f24401r.mo7248a(this.f5594b, this.f5595c, this.f5596d);
        gkt.f24409z = null;
    }
}

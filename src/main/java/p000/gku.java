package p000;

import android.net.Uri;

/* renamed from: gku */
final /* synthetic */ class gku implements Runnable {
    /* renamed from: a */
    private final gkt f5575a;
    /* renamed from: b */
    private final Uri f5576b;
    /* renamed from: c */
    private final glw f5577c;
    /* renamed from: d */
    private final eqi f5578d;

    gku(gkt gkt, Uri uri, glw glw, eqi eqi) {
        this.f5575a = gkt;
        this.f5576b = uri;
        this.f5577c = glw;
        this.f5578d = eqi;
    }

    public final void run() {
        gkt gkt = this.f5575a;
        gkt.f24401r.mo7246a(this.f5576b, this.f5577c, this.f5578d);
    }
}

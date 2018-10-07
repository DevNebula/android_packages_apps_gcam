package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gni */
final class gni implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5739a;
    /* renamed from: b */
    private final /* synthetic */ glw f5740b;
    /* renamed from: c */
    private final /* synthetic */ eqi f5741c;
    /* renamed from: d */
    private final /* synthetic */ gnh f5742d;

    gni(gnh gnh, Uri uri, glw glw, eqi eqi) {
        this.f5742d = gnh;
        this.f5739a = uri;
        this.f5740b = glw;
        this.f5741c = eqi;
    }

    public final void run() {
        synchronized (this.f5742d.f5736a) {
            for (glq a : this.f5742d.f5736a) {
                a.mo7207a(this.f5739a, this.f5740b, this.f5741c);
            }
        }
    }
}

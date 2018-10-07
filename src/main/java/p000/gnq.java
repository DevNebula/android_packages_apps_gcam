package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnq */
final class gnq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5762a;
    /* renamed from: b */
    private final /* synthetic */ hec f5763b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5764c;

    gnq(gnh gnh, Uri uri, hec hec) {
        this.f5764c = gnh;
        this.f5762a = uri;
        this.f5763b = hec;
    }

    public final void run() {
        synchronized (this.f5764c.f5736a) {
            for (glq a : this.f5764c.f5736a) {
                a.mo7208a(this.f5762a, this.f5763b);
            }
        }
    }
}

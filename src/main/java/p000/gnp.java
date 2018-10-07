package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnp */
final class gnp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5759a;
    /* renamed from: b */
    private final /* synthetic */ int f5760b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5761c;

    gnp(gnh gnh, Uri uri, int i) {
        this.f5761c = gnh;
        this.f5759a = uri;
        this.f5760b = i;
    }

    public final void run() {
        synchronized (this.f5761c.f5736a) {
            for (glq a : this.f5761c.f5736a) {
                a.mo7206a(this.f5759a, this.f5760b);
            }
        }
    }
}

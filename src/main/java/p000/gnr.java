package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnr */
final class gnr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5765a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5766b;

    gnr(gnh gnh, Uri uri) {
        this.f5766b = gnh;
        this.f5765a = uri;
    }

    public final void run() {
        synchronized (this.f5766b.f5736a) {
            for (glq c : this.f5766b.f5736a) {
                c.mo7213c(this.f5765a);
            }
        }
    }
}

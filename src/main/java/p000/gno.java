package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gno */
final class gno implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5757a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5758b;

    gno(gnh gnh, Uri uri) {
        this.f5758b = gnh;
        this.f5757a = uri;
    }

    public final void run() {
        synchronized (this.f5758b.f5736a) {
            for (glq b : this.f5758b.f5736a) {
                b.mo7212b(this.f5757a);
            }
        }
    }
}

package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnn */
final class gnn implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5755a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5756b;

    gnn(gnh gnh, Uri uri) {
        this.f5756b = gnh;
        this.f5755a = uri;
    }

    public final void run() {
        synchronized (this.f5756b.f5736a) {
            for (glq a : this.f5756b.f5736a) {
                a.mo7205a(this.f5755a);
            }
        }
        this.f5756b.f5738c.mo7198a(this.f5755a);
    }
}

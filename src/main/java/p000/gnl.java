package p000;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: gnl */
final class gnl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5748a;
    /* renamed from: b */
    private final /* synthetic */ List f5749b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5750c;

    gnl(gnh gnh, Uri uri, List list) {
        this.f5750c = gnh;
        this.f5748a = uri;
        this.f5749b = list;
    }

    public final void run() {
        synchronized (this.f5750c.f5736a) {
            for (glq a : this.f5750c.f5736a) {
                a.mo7210a(this.f5748a, this.f5749b);
            }
        }
        this.f5750c.f5738c.mo7198a(this.f5748a);
    }
}

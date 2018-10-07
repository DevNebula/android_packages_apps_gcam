package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gnm */
final class gnm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Uri f5751a;
    /* renamed from: b */
    private final /* synthetic */ hec f5752b;
    /* renamed from: c */
    private final /* synthetic */ boolean f5753c;
    /* renamed from: d */
    private final /* synthetic */ gnh f5754d;

    gnm(gnh gnh, Uri uri, hec hec, boolean z) {
        this.f5754d = gnh;
        this.f5751a = uri;
        this.f5752b = hec;
        this.f5753c = z;
    }

    public final void run() {
        synchronized (this.f5754d.f5736a) {
            for (glq a : this.f5754d.f5736a) {
                a.mo7209a(this.f5751a, this.f5752b, this.f5753c);
            }
        }
        this.f5754d.f5738c.mo7198a(this.f5751a);
    }
}

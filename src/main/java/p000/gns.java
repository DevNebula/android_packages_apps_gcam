package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: gns */
final class gns implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f5767a;
    /* renamed from: b */
    private final /* synthetic */ int f5768b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5769c;

    gns(gnh gnh, Bitmap bitmap, int i) {
        this.f5769c = gnh;
        this.f5767a = bitmap;
        this.f5768b = i;
    }

    public final void run() {
        synchronized (this.f5769c.f5736a) {
            for (glq a : this.f5769c.f5736a) {
                a.mo7204a(this.f5767a, this.f5768b);
            }
        }
    }
}

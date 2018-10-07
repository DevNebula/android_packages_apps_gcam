package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: gnj */
final class gnj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f5743a;
    /* renamed from: b */
    private final /* synthetic */ gnh f5744b;

    gnj(gnh gnh, Bitmap bitmap) {
        this.f5744b = gnh;
        this.f5743a = bitmap;
    }

    public final void run() {
        synchronized (this.f5744b.f5736a) {
            for (glq a : this.f5744b.f5736a) {
                a.mo7203a(this.f5743a);
            }
        }
    }
}

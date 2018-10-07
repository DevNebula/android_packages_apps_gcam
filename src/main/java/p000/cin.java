package p000;

import android.os.HandlerThread;
import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: cin */
final class cin implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cig f2256a;

    cin(cig cig) {
        this.f2256a = cig;
    }

    public final void run() {
        cig cig = this.f2256a;
        cig.f2226h = null;
        chh chh = (chh) cig.f2229k.getAndSet(null);
        if (chh != null) {
            chh.close();
        }
        cig.f2230l.set(null);
        HandlerThread handlerThread = (HandlerThread) cig.f2227i.getAndSet(null);
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        grw grw = (grw) cig.f2228j.getAndSet(null);
        if (grw != null) {
            cig.f2240v.mo8900a(grw.f6022b.getName(), grw.f6021a, cig.f2223e, ((float) (SystemClock.elapsedRealtime() - cig.f2242x)) / 1000.0f);
        }
    }
}

package p000;

import android.os.HandlerThread;

/* renamed from: ika */
final /* synthetic */ class ika implements Runnable {
    /* renamed from: a */
    private final HandlerThread f7409a;

    ika(HandlerThread handlerThread) {
        this.f7409a = handlerThread;
    }

    public final void run() {
        this.f7409a.quitSafely();
    }
}

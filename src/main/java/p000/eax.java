package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eax */
final /* synthetic */ class eax implements Runnable {
    /* renamed from: a */
    private final AtomicReference f3684a;

    eax(AtomicReference atomicReference) {
        this.f3684a = atomicReference;
    }

    public final void run() {
        ((gkr) this.f3684a.get()).mo13379g();
    }
}

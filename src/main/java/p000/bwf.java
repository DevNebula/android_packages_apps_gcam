package p000;

/* compiled from: PG */
/* renamed from: bwf */
final class bwf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Object f1684a;

    bwf(Object obj) {
        this.f1684a = obj;
    }

    public final void run() {
        synchronized (this.f1684a) {
            this.f1684a.notifyAll();
        }
    }
}

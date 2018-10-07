package p000;

/* compiled from: PG */
/* renamed from: gfl */
final class gfl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gfk f5386a;

    gfl(gfk gfk) {
        this.f5386a = gfk;
    }

    public final void run() {
        if (this.f5386a.f24338a.decrementAndGet() == 0) {
            synchronized (this.f5386a.f24339b) {
                this.f5386a.mo14902b();
            }
        }
    }
}

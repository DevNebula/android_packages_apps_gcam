package p000;

/* renamed from: cgw */
final /* synthetic */ class cgw implements Runnable {
    /* renamed from: a */
    private final cgu f2146a;
    /* renamed from: b */
    private final int f2147b;

    cgw(cgu cgu, int i) {
        this.f2146a = cgu;
        this.f2147b = i;
    }

    public final void run() {
        this.f2146a.mo11603a(this.f2147b, "Acquiring semaphore");
        Thread.currentThread().interrupt();
    }
}

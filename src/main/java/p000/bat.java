package p000;

/* renamed from: bat */
final /* synthetic */ class bat implements Runnable {
    /* renamed from: a */
    private final bas f1076a;
    /* renamed from: b */
    private final Thread f1077b;
    /* renamed from: c */
    private final Throwable f1078c;

    bat(bas bas, Thread thread, Throwable th) {
        this.f1076a = bas;
        this.f1077b = thread;
        this.f1078c = th;
    }

    public final void run() {
        this.f1076a.mo1883a(this.f1077b, this.f1078c);
    }
}

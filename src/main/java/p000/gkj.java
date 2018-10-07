package p000;

/* renamed from: gkj */
final /* synthetic */ class gkj implements Runnable {
    /* renamed from: a */
    private final gki f5549a;
    /* renamed from: b */
    private final Runnable f5550b;

    gkj(gki gki, Runnable runnable) {
        this.f5549a = gki;
        this.f5550b = runnable;
    }

    public final void run() {
        gki gki = this.f5549a;
        gki.f5547a.execute(this.f5550b);
    }
}

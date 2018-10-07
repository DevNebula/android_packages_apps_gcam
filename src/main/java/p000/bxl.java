package p000;

/* renamed from: bxl */
final /* synthetic */ class bxl implements Runnable {
    /* renamed from: a */
    private final bxj f1738a;

    bxl(bxj bxj) {
        this.f1738a = bxj;
    }

    public final void run() {
        bxj bxj = this.f1738a;
        bxj.mo2205a(1.0f);
        synchronized (bxj.f1732a) {
            bxj.f1734c = null;
        }
    }
}

package p000;

/* renamed from: eub */
final /* synthetic */ class eub implements Runnable {
    /* renamed from: a */
    private final eua f4473a;

    eub(eua eua) {
        this.f4473a = eua;
    }

    public final void run() {
        for (eux close : this.f4473a.f4466d) {
            close.close();
        }
    }
}

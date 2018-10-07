package p000;

/* renamed from: ffi */
public final /* synthetic */ class ffi implements iqo {
    /* renamed from: a */
    private final fff f18209a;

    public ffi(fff fff) {
        this.f18209a = fff;
    }

    public final void close() {
        fff fff = this.f18209a;
        synchronized (fff.f4754c) {
            kpm kpm = fff.f4755d;
            if (kpm != null) {
                kpm.shutdown();
            }
            fff.f4756e = true;
        }
    }
}

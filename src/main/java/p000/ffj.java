package p000;

/* renamed from: ffj */
public final /* synthetic */ class ffj implements iqo {
    /* renamed from: a */
    private final fff f18210a;

    public ffj(fff fff) {
        this.f18210a = fff;
    }

    public final void close() {
        fff fff = this.f18210a;
        synchronized (fff.f4754c) {
            kpm kpm = fff.f4755d;
            if (kpm != null) {
                kpm.shutdownNow();
            }
            fff.f4755d = null;
            fff.f4756e = true;
        }
    }
}

package p000;

/* renamed from: esn */
final /* synthetic */ class esn implements Runnable {
    /* renamed from: a */
    private final esd f4433a;

    esn(esd esd) {
        this.f4433a = esd;
    }

    public final void run() {
        esd esd = this.f4433a;
        synchronized (esd) {
            eth eth = esd.f17715l;
            if (eth == null) {
                return;
            }
            eth.mo13184c();
        }
    }
}

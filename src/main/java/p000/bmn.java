package p000;

/* renamed from: bmn */
final /* synthetic */ class bmn implements iqo {
    /* renamed from: a */
    private final bmm f11540a;

    bmn(bmm bmm) {
        this.f11540a = bmm;
    }

    public final void close() {
        bmm bmm = this.f11540a;
        synchronized (bmm.f11536a) {
            iqo iqo = bmm.f11537b;
            if (iqo != null) {
                iqo.close();
            }
            bmm.f11537b = null;
        }
    }
}

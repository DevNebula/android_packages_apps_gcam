package p000;

/* renamed from: cis */
final /* synthetic */ class cis implements iqo {
    /* renamed from: a */
    private final bnd f12585a;

    cis(bnd bnd) {
        this.f12585a = bnd;
    }

    public final void close() {
        bnd bnd = this.f12585a;
        if (bnd.f11566n.compareAndSet(false, true)) {
            bnd.f11555c.mo12397b();
            bnd.mo2040f();
            bnd.mo12396h();
        }
    }
}

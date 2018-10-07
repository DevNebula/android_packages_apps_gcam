package p000;

/* compiled from: PG */
/* renamed from: asb */
final class asb extends asa {
    /* renamed from: a */
    private volatile boolean f10686a;

    asb() {
        super();
    }

    /* renamed from: a */
    public final void mo1766a(boolean z) {
        this.f10686a = z;
    }

    /* renamed from: b */
    public final void mo1767b() {
        if (this.f10686a) {
            throw new IllegalStateException("Already released");
        }
    }
}

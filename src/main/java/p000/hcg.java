package p000;

/* compiled from: PG */
/* renamed from: hcg */
final class hcg implements iqo {
    /* renamed from: a */
    private final /* synthetic */ hch f19899a;
    /* renamed from: b */
    private final /* synthetic */ hcd f19900b;

    hcg(hcd hcd, hch hch) {
        this.f19900b = hcd;
        this.f19899a = hch;
    }

    public final void close() {
        synchronized (this.f19900b.f6322b) {
            this.f19900b.f6323c.remove(this.f19899a);
        }
    }
}

package p000;

/* renamed from: bxk */
final /* synthetic */ class bxk implements iqo {
    /* renamed from: a */
    private final bxj f11923a;
    /* renamed from: b */
    private final bxm f11924b;

    bxk(bxj bxj, bxm bxm) {
        this.f11923a = bxj;
        this.f11924b = bxm;
    }

    public final void close() {
        bxj bxj = this.f11923a;
        bxm bxm = this.f11924b;
        synchronized (bxj.f1732a) {
            bxj.f1733b.remove(bxm);
        }
    }
}

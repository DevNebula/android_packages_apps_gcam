package p000;

/* renamed from: byo */
final /* synthetic */ class byo implements iqo {
    /* renamed from: a */
    private final byn f11995a;
    /* renamed from: b */
    private final int f11996b;

    byo(byn byn, int i) {
        this.f11995a = byn;
        this.f11996b = i;
    }

    public final void close() {
        this.f11995a.f11972a.f1750c.remove(Integer.valueOf(this.f11996b));
    }
}

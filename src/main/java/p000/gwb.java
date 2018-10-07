package p000;

/* renamed from: gwb */
final /* synthetic */ class gwb implements iqo {
    /* renamed from: a */
    private final gwa f19719a;
    /* renamed from: b */
    private final gvu f19720b;

    gwb(gwa gwa, gvu gvu) {
        this.f19719a = gwa;
        this.f19720b = gvu;
    }

    public final void close() {
        gwa gwa = this.f19719a;
        gwa.f19714b.remove(this.f19720b);
    }
}

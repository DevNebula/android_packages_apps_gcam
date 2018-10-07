package p000;

/* renamed from: bvg */
final /* synthetic */ class bvg implements Runnable {
    /* renamed from: a */
    private final bvf f1655a;
    /* renamed from: b */
    private final bvk f1656b;

    bvg(bvf bvf, bvk bvk) {
        this.f1655a = bvf;
        this.f1656b = bvk;
    }

    public final void run() {
        bvf bvf = this.f1655a;
        bvk bvk = this.f1656b;
        ((kpw) jri.m13404b(bvf.f1652b)).mo15641a(bvk.getReadableDatabase());
        ((kpw) jri.m13404b(bvf.f1653c)).mo15641a(bvk.getWritableDatabase());
    }
}

package p000;

/* compiled from: PG */
/* renamed from: dth */
final class dth implements iqo {
    /* renamed from: a */
    private final /* synthetic */ fdf f16691a;
    /* renamed from: b */
    private final /* synthetic */ fhh f16692b;
    /* renamed from: c */
    private final /* synthetic */ iqo f16693c;

    dth(fdf fdf, fhh fhh, iqo iqo) {
        this.f16691a = fdf;
        this.f16692b = fhh;
        this.f16693c = iqo;
    }

    public final void close() {
        this.f16691a.close();
        this.f16692b.close();
        iqo iqo = this.f16693c;
        if (iqo != null) {
            iqo.close();
        }
    }
}

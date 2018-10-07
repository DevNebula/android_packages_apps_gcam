package p000;

/* compiled from: PG */
/* renamed from: dtl */
final class dtl implements iqo {
    /* renamed from: a */
    private final /* synthetic */ fdf f16732a;
    /* renamed from: b */
    private final /* synthetic */ fem f16733b;
    /* renamed from: c */
    private final /* synthetic */ fhh f16734c;
    /* renamed from: d */
    private final /* synthetic */ iqo f16735d;

    dtl(fdf fdf, fem fem, fhh fhh, iqo iqo) {
        this.f16732a = fdf;
        this.f16733b = fem;
        this.f16734c = fhh;
        this.f16735d = iqo;
    }

    public final void close() {
        this.f16732a.close();
        this.f16733b.close();
        this.f16734c.close();
        iqo iqo = this.f16735d;
        if (iqo != null) {
            iqo.close();
        }
    }
}

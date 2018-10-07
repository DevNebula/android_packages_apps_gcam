package p000;

/* compiled from: PG */
/* renamed from: chm */
final class chm extends izy {
    /* renamed from: a */
    private final /* synthetic */ dpu f23199a;
    /* renamed from: b */
    private final /* synthetic */ chj f23200b;

    chm(chj chj, dpu dpu) {
        this.f23200b = chj;
        this.f23199a = dpu;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        jrg jrg = (jrg) obj;
        bli.m888a(chj.f12507a, "processBurstResults : stopping previewer");
        chj chj = this.f23200b;
        if (chj.f12530m) {
            throw new IllegalStateException("Analysis encountered an error!");
        }
        chj.f12529l.mo8856a("BurstControllerImpl#processBurstResults_stopPreview");
        try {
            this.f23200b.f12526i.mo12518b();
            this.f23200b.f12526i.mo12517a(jrg.mo13836f());
            bli.m888a(chj.f12507a, "processBurstResults : populating results");
            this.f23200b.f12529l.mo8856a("BurstControllerImpl#processBurstResults_populateResults");
            try {
                this.f23200b.mo12502a(jrg, this.f23199a);
            } finally {
                this.f23200b.f12529l.mo8857b();
            }
        } finally {
            this.f23200b.f12529l.mo8857b();
        }
    }
}

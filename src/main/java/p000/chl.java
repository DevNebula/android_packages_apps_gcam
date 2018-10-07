package p000;

/* compiled from: PG */
/* renamed from: chl */
final class chl extends izy {
    /* renamed from: a */
    private final /* synthetic */ chj f23198a;

    chl(chj chj) {
        this.f23198a = chj;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        jar jar = (jar) obj;
        bli.m888a(chj.f12507a, "processBurstResults : stopping previewer with error");
        this.f23198a.f12529l.mo8856a("BurstControllerImpl#processBurstResults_stopPreviewWithError");
        try {
            this.f23198a.f12526i.mo12518b();
            ckw ckw = this.f23198a.f12526i;
            jar.getCause();
            ckw.f12673a.mo1906b();
            bli.m888a(chj.f12507a, "processBurstResults : handling exception");
            this.f23198a.f12529l.mo8856a("BurstControllerImpl#processBurstResults_handleException");
            try {
                this.f23198a.mo12503b();
                this.f23198a.f12520c.mo2338a(jar);
            } finally {
                this.f23198a.f12529l.mo8857b();
            }
        } finally {
            this.f23198a.f12529l.mo8857b();
        }
    }
}

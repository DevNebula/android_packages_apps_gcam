package p000;

/* compiled from: PG */
/* renamed from: ckf */
final class ckf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ckk f2281a;
    /* renamed from: b */
    private final /* synthetic */ cke f2282b;

    ckf(cke cke, ckk ckk) {
        this.f2282b = cke;
        this.f2281a = ckk;
    }

    public final void run() {
        try {
            this.f2282b.mo12508b(this.f2281a);
            synchronized (this.f2282b.f23203a) {
                if (this.f2282b.f23203a.isEmpty()) {
                    cke cke = this.f2282b;
                    if (cke.f23205c) {
                        cke.f23204b.shutdown();
                    }
                }
            }
        } catch (Throwable th) {
            synchronized (this.f2282b.f23203a) {
                if (this.f2282b.f23203a.isEmpty()) {
                    cke cke2 = this.f2282b;
                    if (cke2.f23205c) {
                        cke2.f23204b.shutdown();
                    }
                }
            }
        }
    }
}

package p000;

/* renamed from: ikg */
final /* synthetic */ class ikg implements Runnable {
    /* renamed from: a */
    private final Runnable f7413a;
    /* renamed from: b */
    private final kpw f7414b;

    ikg(Runnable runnable, kpw kpw) {
        this.f7413a = runnable;
        this.f7414b = kpw;
    }

    public final void run() {
        Runnable runnable = this.f7413a;
        knk knk = this.f7414b;
        try {
            runnable.run();
            knk.mo15641a(Boolean.valueOf(true));
        } catch (Throwable th) {
            knk.mo15642a(th);
        } finally {
            knk.mo15641a(Boolean.valueOf(false));
        }
    }
}

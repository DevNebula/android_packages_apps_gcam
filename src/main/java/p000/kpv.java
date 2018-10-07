package p000;

/* compiled from: PG */
/* renamed from: kpv */
final class kpv extends knk implements Runnable {
    /* renamed from: e */
    private final Runnable f26749e;

    public kpv(Runnable runnable) {
        this.f26749e = (Runnable) jri.m13404b((Object) runnable);
    }

    public final void run() {
        try {
            this.f26749e.run();
        } catch (Throwable th) {
            mo15642a(th);
            RuntimeException a = kbr.m4815a(th);
        }
    }
}

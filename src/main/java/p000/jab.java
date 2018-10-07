package p000;

/* compiled from: PG */
/* renamed from: jab */
final class jab implements izi {
    /* renamed from: a */
    private final /* synthetic */ Runnable f21404a;

    jab(Runnable runnable) {
        this.f21404a = runnable;
    }

    /* renamed from: a */
    private final Object m12959a(Throwable th) {
        try {
            this.f21404a.run();
        } catch (Throwable th2) {
            kqg.m5105a(th, th2);
        }
        throw th;
    }
}

package p000;

/* compiled from: PG */
/* renamed from: iki */
final class iki implements Runnable {
    /* renamed from: a */
    private final Runnable f7417a;
    /* renamed from: b */
    private final /* synthetic */ ikh f7418b;

    public iki(ikh ikh, Runnable runnable) {
        this.f7418b = ikh;
        this.f7417a = runnable;
    }

    public final void run() {
        try {
            this.f7417a.run();
        } catch (Exception e) {
            this.f7418b.f7415a.execute(new ikj(e));
        }
    }
}

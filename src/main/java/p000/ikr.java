package p000;

/* compiled from: PG */
/* renamed from: ikr */
final class ikr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ikq f7434a;

    ikr(ikq ikq) {
        this.f7434a = ikq;
    }

    public final void run() {
        synchronized (this.f7434a.f21030a) {
            ikq ikq = this.f7434a;
            Runnable runnable = ikq.f21031b;
            if (runnable == null) {
                return;
            }
            ikq.f21031b = null;
            runnable.run();
        }
    }
}

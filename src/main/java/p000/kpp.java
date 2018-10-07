package p000;

/* compiled from: PG */
/* renamed from: kpp */
final class kpp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f8774a;
    /* renamed from: b */
    private final /* synthetic */ kpo f8775b;

    kpp(kpo kpo, Runnable runnable) {
        this.f8775b = kpo;
        this.f8774a = runnable;
    }

    public final void run() {
        this.f8775b.f8771a = false;
        this.f8774a.run();
    }
}

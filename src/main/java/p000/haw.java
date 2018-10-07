package p000;

/* compiled from: PG */
/* renamed from: haw */
final class haw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ikd f6245a;
    /* renamed from: b */
    private final /* synthetic */ Runnable f6246b;

    haw(ikd ikd, Runnable runnable) {
        this.f6245a = ikd;
        this.f6246b = runnable;
    }

    public final void run() {
        this.f6245a.execute(this.f6246b);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: ikt */
final class ikt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Throwable f7436a;

    ikt(Throwable th) {
        this.f7436a = th;
    }

    public final void run() {
        throw new RuntimeException(this.f7436a);
    }
}

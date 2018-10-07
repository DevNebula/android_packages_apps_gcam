package p000;

/* compiled from: PG */
/* renamed from: ffh */
final class ffh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Exception f4760a;

    ffh(Exception exception) {
        this.f4760a = exception;
    }

    public final void run() {
        throw new RuntimeException(this.f4760a);
    }
}

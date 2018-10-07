package p000;

/* compiled from: PG */
/* renamed from: fso */
final class fso implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Exception f4921a;

    fso(Exception exception) {
        this.f4921a = exception;
    }

    public final void run() {
        throw new RuntimeException(this.f4921a);
    }
}

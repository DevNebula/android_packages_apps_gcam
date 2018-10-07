package p000;

/* compiled from: PG */
/* renamed from: avl */
final class avl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ avg f999a;

    avl(avg avg) {
        this.f999a = avg;
    }

    public final void run() {
        if (((Boolean) this.f999a.f10877l.mo13673b()).booleanValue()) {
            bli.m896d(avg.f10866a, "Ignore reset request since ev is in scrolling state.");
        } else {
            this.f999a.f10872g.mo15641a(null);
        }
    }
}

package p000;

/* compiled from: PG */
/* renamed from: bbw */
final class bbw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f1097a;
    /* renamed from: b */
    private final /* synthetic */ bbv f1098b;

    bbw(bbv bbv, Runnable runnable) {
        this.f1098b = bbv;
        this.f1097a = runnable;
    }

    public final void run() {
        this.f1098b.f11157a.execute(this.f1097a);
    }
}

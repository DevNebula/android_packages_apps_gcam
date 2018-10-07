package p000;

/* compiled from: PG */
/* renamed from: cwi */
public final class cwi extends knk {
    /* renamed from: e */
    private final Runnable f26622e;

    public cwi(Runnable runnable) {
        this.f26622e = runnable;
    }

    public final boolean cancel(boolean z) {
        Runnable runnable = this.f26622e;
        if (runnable != null) {
            runnable.run();
        }
        return super.cancel(z);
    }

    /* renamed from: a */
    public final boolean mo15711a(cwh cwh) {
        return super.mo15641a((Object) cwh);
    }
}

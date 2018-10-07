package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kpo */
public final class kpo implements Executor {
    /* renamed from: a */
    public boolean f8771a = true;
    /* renamed from: b */
    private final /* synthetic */ Executor f8772b;
    /* renamed from: c */
    private final /* synthetic */ knk f8773c;

    public kpo(Executor executor, knk knk) {
        this.f8772b = executor;
        this.f8773c = knk;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f8772b.execute(new kpp(this, runnable));
        } catch (Throwable e) {
            if (this.f8771a) {
                this.f8773c.mo15642a(e);
            }
        }
    }
}

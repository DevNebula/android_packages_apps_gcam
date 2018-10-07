package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ikh */
public final class ikh implements Executor {
    /* renamed from: a */
    public final ikd f7415a;
    /* renamed from: b */
    private final Executor f7416b;

    public ikh(ikd ikd, Executor executor) {
        this.f7415a = ikd;
        this.f7416b = executor;
    }

    public final void execute(Runnable runnable) {
        this.f7416b.execute(new iki(this, runnable));
    }
}

package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cte */
final class cte implements Executor {
    /* renamed from: a */
    private Executor f2900a = new ikd();

    cte() {
    }

    public final void execute(Runnable runnable) {
        if (ikd.m12502b()) {
            runnable.run();
        } else {
            this.f2900a.execute(runnable);
        }
    }
}

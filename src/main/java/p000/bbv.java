package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bbv */
public final class bbv implements iqo, Executor {
    /* renamed from: a */
    public final Executor f11157a = new ikd();
    /* renamed from: b */
    private final int f11158b;
    /* renamed from: c */
    private final ScheduledExecutorService f11159c;

    public bbv(String str, int i) {
        this.f11158b = i;
        this.f11159c = Executors.newSingleThreadScheduledExecutor(iel.m3778c(str, 0));
    }

    public final void close() {
        this.f11159c.shutdown();
    }

    public final void execute(Runnable runnable) {
        try {
            this.f11159c.schedule(new bbw(this, runnable), (long) this.f11158b, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}

package p000;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kps */
public class kps extends knx {
    /* renamed from: a */
    private final ExecutorService f25356a;

    public kps(ExecutorService executorService) {
        this.f25356a = (ExecutorService) jri.m13404b((Object) executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f25356a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f25356a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.f25356a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f25356a.isTerminated();
    }

    public final void shutdown() {
        this.f25356a.shutdown();
    }

    public final List shutdownNow() {
        return this.f25356a.shutdownNow();
    }
}

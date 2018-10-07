package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ffl */
public final /* synthetic */ class ffl implements iqo {
    /* renamed from: a */
    private final ScheduledExecutorService f18212a;

    public ffl(ScheduledExecutorService scheduledExecutorService) {
        this.f18212a = scheduledExecutorService;
    }

    public final void close() {
        this.f18212a.shutdownNow();
    }
}

package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ffk */
public final /* synthetic */ class ffk implements iqo {
    /* renamed from: a */
    private final ScheduledExecutorService f18211a;

    public ffk(ScheduledExecutorService scheduledExecutorService) {
        this.f18211a = scheduledExecutorService;
    }

    public final void close() {
        this.f18211a.shutdown();
    }
}

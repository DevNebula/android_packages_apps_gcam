package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ikp */
public final class ikp implements iqo, Executor {
    /* renamed from: a */
    private final ScheduledExecutorService f21024a;
    /* renamed from: b */
    private final long f21025b;
    /* renamed from: c */
    private final TimeUnit f21026c;
    /* renamed from: d */
    private final Object f21027d = new Object();
    /* renamed from: e */
    private ScheduledFuture f21028e;
    /* renamed from: f */
    private boolean f21029f = false;

    public ikp(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
        this.f21024a = scheduledExecutorService;
        this.f21025b = j;
        this.f21026c = timeUnit;
    }

    public final void close() {
        synchronized (this.f21027d) {
            if (this.f21029f) {
                return;
            }
            this.f21029f = true;
            this.f21024a.shutdownNow();
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f21027d) {
            if (this.f21029f) {
                return;
            }
            mo13668a();
            this.f21028e = this.f21024a.schedule(runnable, this.f21025b, this.f21026c);
        }
    }

    /* renamed from: a */
    public final void mo13668a() {
        synchronized (this.f21027d) {
            ScheduledFuture scheduledFuture = this.f21028e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }
}

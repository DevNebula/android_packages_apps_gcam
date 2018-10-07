package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gtx */
public final class gtx {
    /* renamed from: a */
    public final guf f6055a;
    /* renamed from: b */
    public final ScheduledExecutorService f6056b;
    /* renamed from: c */
    public volatile long f6057c = -1;
    /* renamed from: d */
    private final Object f6058d = new Object();
    /* renamed from: e */
    private ScheduledFuture f6059e;

    public gtx(guf guf, ScheduledExecutorService scheduledExecutorService) {
        this.f6055a = guf;
        this.f6056b = scheduledExecutorService;
    }

    /* renamed from: a */
    private final Runnable m2877a(gua gua) {
        return new gty(this, gua);
    }

    /* renamed from: a */
    public final void mo7451a(long j, gua gua) {
        synchronized (this.f6058d) {
            ScheduledFuture scheduledFuture = this.f6059e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f6059e = this.f6056b.scheduleAtFixedRate(m2877a(gua), 0, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void mo7450a() {
        synchronized (this.f6058d) {
            ScheduledFuture scheduledFuture = this.f6059e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f6059e = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo7452b() {
        this.f6056b.execute(m2877a(null));
    }
}

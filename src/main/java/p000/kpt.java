package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kpt */
public final class kpt extends kps implements kpn {
    /* renamed from: a */
    private final ScheduledExecutorService f26602a;

    public kpt(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f26602a = (ScheduledExecutorService) jri.m13404b((Object) scheduledExecutorService);
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object kpv = new kpv(runnable);
        return new kpu(kpv, this.f26602a.scheduleAtFixedRate(kpv, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object kpv = new kpv(runnable);
        return new kpu(kpv, this.f26602a.scheduleWithFixedDelay(kpv, j, j2, timeUnit));
    }
}

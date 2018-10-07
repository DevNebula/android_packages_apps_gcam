package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: etm */
public final class etm implements etl {
    /* renamed from: a */
    private final jfp f24221a;
    /* renamed from: b */
    private final exb f24222b;
    /* renamed from: c */
    private final ScheduledExecutorService f24223c;
    /* renamed from: d */
    private final long f24224d;
    /* renamed from: e */
    private ScheduledFuture f24225e = null;

    public etm(jfp jfp, exb exb, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f24221a = jfp;
        this.f24222b = exb;
        this.f24224d = j;
        this.f24223c = scheduledExecutorService;
    }

    public final synchronized void close() {
        ScheduledFuture scheduledFuture = this.f24225e;
        if (scheduledFuture == null) {
            bli.m898e("AudioSampler", "Sampler already stopped.");
        } else {
            scheduledFuture.cancel(false);
            this.f24225e = null;
            this.f24221a.mo9383b();
        }
        this.f24221a.close();
    }

    /* renamed from: a */
    public final synchronized void mo13186a() {
        if (this.f24225e != null) {
            bli.m898e("AudioSampler", "Sampler already started.");
        } else {
            this.f24221a.mo9382a();
            ScheduledExecutorService scheduledExecutorService = this.f24223c;
            exb exb = this.f24222b;
            exb.getClass();
            this.f24225e = scheduledExecutorService.scheduleAtFixedRate(new etn(exb), 0, this.f24224d, TimeUnit.MICROSECONDS);
        }
    }
}

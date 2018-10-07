package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bxj */
public final class bxj {
    /* renamed from: d */
    private static final String f1731d = bli.m887a("HdrPCpuPriority");
    /* renamed from: a */
    public final Object f1732a = new Object();
    /* renamed from: b */
    public final List f1733b = new ArrayList();
    /* renamed from: c */
    public Future f1734c;
    /* renamed from: e */
    private final Gcam f1735e;
    /* renamed from: f */
    private final ScheduledExecutorService f1736f;
    /* renamed from: g */
    private float f1737g = 1.0f;

    public bxj(Gcam gcam, ScheduledExecutorService scheduledExecutorService) {
        this.f1735e = gcam;
        this.f1736f = scheduledExecutorService;
    }

    /* renamed from: a */
    public final iqo mo2203a(int i) {
        String str = f1731d;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("Registering shot ");
        stringBuilder.append(i);
        bli.m896d(str, stringBuilder.toString());
        bxm bxm = new bxm(i);
        synchronized (this.f1732a) {
            this.f1733b.add(bxm);
        }
        return new bxk(this, bxm);
    }

    /* renamed from: a */
    public final void mo2204a() {
        bli.m894c(f1731d, "Setting HDR+ high processing priority");
        synchronized (this.f1732a) {
            Future future = this.f1734c;
            if (future != null) {
                future.cancel(false);
            }
        }
        mo2205a(1.0f);
    }

    /* renamed from: b */
    public final void mo2206b() {
        bli.m894c(f1731d, "Setting HDR+ low processing priority");
        mo2205a(0.5f);
        synchronized (this.f1732a) {
            this.f1734c = this.f1736f.schedule(new bxl(this), ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    final void mo2205a(float f) {
        synchronized (this.f1732a) {
            if (f == this.f1737g) {
                return;
            }
            this.f1737g = f;
            for (bxm bxm : this.f1733b) {
                String str = f1731d;
                int i = bxm.f1739a;
                StringBuilder stringBuilder = new StringBuilder(62);
                stringBuilder.append("Setting HDR+ CPU usage to ");
                stringBuilder.append(f);
                stringBuilder.append(" for shot ");
                stringBuilder.append(i);
                bli.m894c(str, stringBuilder.toString());
                this.f1735e.LimitShotCpuUsage(bxm.f1739a, f);
            }
        }
    }
}

package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ise */
public final class ise {
    /* renamed from: a */
    private final ScheduledExecutorService f7749a;
    /* renamed from: b */
    private final Object f7750b = new Object();
    /* renamed from: c */
    private ikb f7751c;
    /* renamed from: d */
    private ijl f7752d;

    public ise(ScheduledExecutorService scheduledExecutorService) {
        this.f7749a = scheduledExecutorService;
        this.f7751c = new ikb();
        this.f7752d = m4195a(this.f7751c);
    }

    /* renamed from: a */
    public final iqo mo8939a() {
        iqo a;
        synchronized (this.f7750b) {
            a = this.f7752d.mo13665a();
            if (a == null) {
                this.f7751c = new ikb();
                this.f7752d = m4195a(this.f7751c);
                a = this.f7752d.mo13665a();
                jri.m13404b((Object) a);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final iqo mo8940a(iqo iqo) {
        iqo a;
        synchronized (this.f7750b) {
            a = this.f7751c.mo8557a(iqo);
        }
        return a;
    }

    /* renamed from: b */
    public final ikb mo8941b() {
        ikb b;
        synchronized (this.f7750b) {
            b = this.f7751c.mo8558b();
        }
        return b;
    }

    /* renamed from: a */
    private final ijl m4195a(ikb ikb) {
        ijl ijl;
        synchronized (this.f7750b) {
            ijl = new ijl(ikb, kpq.f8776a, new ikq(new ikp(this.f7749a, 1000, TimeUnit.MILLISECONDS)));
        }
        return ijl;
    }

    /* renamed from: c */
    public final boolean mo8942c() {
        boolean a;
        synchronized (this.f7750b) {
            a = this.f7751c.mo13666a();
        }
        return a;
    }
}

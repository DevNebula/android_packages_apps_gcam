package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bai */
public final class bai implements bam, ivw {
    /* renamed from: b */
    private static final String f11108b = bli.m887a("AppLifetime");
    /* renamed from: a */
    public final Object f11109a = new Object();
    /* renamed from: c */
    private final ikb f11110c = new ikb();
    /* renamed from: d */
    private final Executor f11111d;
    /* renamed from: e */
    private final ScheduledExecutorService f11112e;
    /* renamed from: f */
    private final long f11113f = 1000;
    /* renamed from: g */
    private ikb f11114g = this.f11116i.mo8558b();
    /* renamed from: h */
    private ijl f11115h = m7291c(this.f11114g);
    /* renamed from: i */
    private ikb f11116i = this.f11110c.mo8558b();
    /* renamed from: j */
    private ijl f11117j = m7291c(this.f11116i);
    /* renamed from: k */
    private bcl f11118k;
    /* renamed from: l */
    private bcl f11119l;

    public bai(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f11112e = scheduledExecutorService;
        this.f11111d = executor;
        this.f11110c.mo8557a(new bcl());
        this.f11119l = (bcl) this.f11116i.mo8557a(new bcl());
        this.f11118k = (bcl) this.f11114g.mo8557a(new bcl());
    }

    /* renamed from: a */
    public final ikb mo1881a(ikb ikb) {
        ikb b = ikb.mo8558b();
        synchronized (this.f11109a) {
            if (this.f11118k.f11172a.get()) {
                this.f11114g = this.f11116i.mo8558b();
                bli.m888a(f11108b, "Creating new ForegroundLifetime");
                this.f11114g.mo8557a(bbz.m811a(f11108b, "ForegroundLifetime.close()"));
                this.f11115h = m7291c(this.f11114g);
                this.f11118k = (bcl) this.f11114g.mo8557a(new bcl());
            }
            iqo a = this.f11115h.mo13665a();
            if (a != null) {
                b.mo8557a(a);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final ikb mo1880a() {
        return this.f11110c.mo8558b();
    }

    /* renamed from: c */
    private final ijl m7291c(ikb ikb) {
        return (ijl) ikb.mo8557a(new ijl(new baj(this, ikb), this.f11111d, new ikq(new ikp(this.f11112e, this.f11113f, TimeUnit.MILLISECONDS))));
    }

    /* renamed from: b */
    public final ikb mo1882b(ikb ikb) {
        ikb b = ikb.mo8558b();
        synchronized (this.f11109a) {
            if (this.f11119l.f11172a.get()) {
                this.f11116i = this.f11110c.mo8558b();
                bli.m888a(f11108b, "Creating new VisibleLifetime");
                this.f11116i.mo8557a(bbz.m811a(f11108b, "VisibleLifetime.close()"));
                this.f11117j = m7291c(this.f11116i);
                this.f11119l = (bcl) this.f11116i.mo8557a(new bcl());
                this.f11114g = this.f11116i.mo8558b();
                bli.m888a(f11108b, "Creating new ForegroundLifetime");
                this.f11114g.mo8557a(bbz.m811a(f11108b, "ForegroundLifetime.close()"));
                this.f11115h = m7291c(this.f11114g);
                this.f11118k = (bcl) this.f11114g.mo8557a(new bcl());
            }
            iqo a = this.f11117j.mo13665a();
            if (a != null) {
                b.mo8557a(a);
            }
        }
        return b;
    }

    /* renamed from: b */
    public final iji mo9110b() {
        return this.f11110c;
    }

    /* renamed from: c */
    public final iji mo9111c() {
        iji iji;
        synchronized (this.f11109a) {
            iji = this.f11114g;
        }
        return iji;
    }

    /* renamed from: d */
    public final iji mo9112d() {
        iji iji;
        synchronized (this.f11109a) {
            iji = this.f11116i;
        }
        return iji;
    }
}

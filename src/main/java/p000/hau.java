package p000;

import android.view.Window;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hau */
public final class hau implements emw, eof, eoh, eol, hat {
    /* renamed from: a */
    private static final String f19869a = bli.m887a("ScreenOnController");
    /* renamed from: b */
    private static final long f19870b = 120000;
    /* renamed from: c */
    private final Window f19871c;
    /* renamed from: d */
    private final ikp f19872d;
    /* renamed from: e */
    private final Runnable f19873e;
    /* renamed from: f */
    private boolean f19874f = true;
    /* renamed from: g */
    private int f19875g = C0252go.f5896bp;
    /* renamed from: h */
    private int f19876h = C0252go.f5896bp;

    public hau(ikd ikd, Window window, ScheduledExecutorService scheduledExecutorService) {
        this.f19871c = window;
        this.f19872d = new ikp(scheduledExecutorService, f19870b, TimeUnit.MILLISECONDS);
        this.f19873e = new haw(ikd, new hav(this));
    }

    /* renamed from: g */
    public final void mo6368g() {
        this.f19874f = true;
        this.f19876h = C0252go.f5896bp;
        mo13509d();
    }

    /* renamed from: h */
    public final void mo6370h() {
        this.f19874f = false;
        mo13509d();
    }

    /* renamed from: a */
    public final void mo6343a() {
        if (this.f19875g != C0252go.f5898br) {
            mo7618c();
        }
    }

    /* renamed from: b */
    public final void mo7617b() {
        this.f19876h = C0252go.f5898br;
        m11949e();
    }

    /* renamed from: c */
    public final void mo7618c() {
        this.f19876h = C0252go.f5897bq;
        m11949e();
    }

    /* renamed from: d */
    final void mo13509d() {
        ikd.m12501a();
        if (this.f19876h == C0252go.f5896bp && this.f19875g != C0252go.f5896bp) {
            this.f19871c.clearFlags(128);
            bli.m888a(f19869a, "Removed FLAG_KEEP_SCREEN_ON");
        }
        if (this.f19876h != C0252go.f5896bp && this.f19875g == C0252go.f5896bp) {
            this.f19871c.addFlags(128);
            bli.m888a(f19869a, "Added FLAG_KEEP_SCREEN_ON");
        }
        this.f19872d.mo13668a();
        if (this.f19876h == C0252go.f5897bq) {
            this.f19872d.execute(this.f19873e);
        }
        this.f19875g = this.f19876h;
    }

    /* renamed from: e */
    private final void m11949e() {
        if (!this.f19874f) {
            mo13509d();
        }
    }
}

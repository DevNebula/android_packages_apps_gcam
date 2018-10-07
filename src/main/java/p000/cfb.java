package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cfb */
public final class cfb implements ijk {
    /* renamed from: a */
    private final kwk f12301a;
    /* renamed from: b */
    private final kwk f12302b;
    /* renamed from: c */
    private final kwk f12303c;
    /* renamed from: d */
    private final kwk f12304d;
    /* renamed from: e */
    private final Executor f12305e;
    /* renamed from: f */
    private final AtomicBoolean f12306f = new AtomicBoolean(false);
    /* renamed from: g */
    private final iks f12307g;
    /* renamed from: h */
    private final ird f12308h;
    /* renamed from: i */
    private final iqz f12309i;
    /* renamed from: j */
    private final gvt f12310j;
    /* renamed from: k */
    private kpk f12311k;

    cfb(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, Executor executor, ira ira, iks iks, ird ird, gvt gvt) {
        this.f12301a = kwk;
        this.f12302b = kwk2;
        this.f12303c = kwk3;
        this.f12305e = executor;
        this.f12307g = iks;
        this.f12308h = ird;
        this.f12310j = gvt;
        this.f12304d = kwk4;
        this.f12309i = ira.mo8854a("ActivityUiStartup");
    }

    /* renamed from: a */
    public final kpk mo8560a() {
        if (this.f12306f.getAndSet(true)) {
            return this.f12311k;
        }
        this.f12308h.mo8856a("ActivityUiStartup");
        bax a = bax.m805a(this.f12305e);
        a.f1082d = this.f12307g;
        a.f1080b = this.f12308h;
        a.f1081c = this.f12309i;
        this.f12311k = a.mo1889a(this.f12301a, "ActivityStartup").mo1889a(this.f12302b, "ModeUiStartup").mo1889a(this.f12303c, "CameraActivityController").mo1891b(this.f12304d, "PostUiBehaviors").mo1890a();
        this.f12308h.mo8855a();
        this.f12308h.mo8857b();
        this.f12310j.mo7470a();
        return this.f12311k;
    }
}

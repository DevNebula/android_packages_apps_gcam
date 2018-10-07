package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fvz */
public final class fvz {
    /* renamed from: a */
    public final fbk f4974a;
    /* renamed from: b */
    public final ikd f4975b;
    /* renamed from: c */
    public final AtomicBoolean f4976c = new AtomicBoolean(false);
    /* renamed from: d */
    public final AtomicBoolean f4977d = new AtomicBoolean(true);
    /* renamed from: e */
    public final gkr f4978e;

    public fvz(fbk fbk, ikd ikd, gkr gkr) {
        this.f4974a = fbk;
        this.f4975b = ikd;
        this.f4978e = gkr;
    }

    /* renamed from: a */
    public final void mo6926a() {
        this.f4975b.execute(new fvv(this));
    }

    /* renamed from: b */
    public final iqt mo6927b() {
        jri.m13405b(this.f4976c.getAndSet(true) ^ 1);
        return new fvs(this);
    }
}

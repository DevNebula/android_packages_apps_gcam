package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: fvw */
public final class fvw implements iqt {
    /* renamed from: a */
    public final fbl f18829a;
    /* renamed from: b */
    public final int f18830b;
    /* renamed from: c */
    public final AtomicInteger f18831c = new AtomicInteger(0);
    /* renamed from: d */
    public final /* synthetic */ fvz f18832d;
    /* renamed from: e */
    private final ikd f18833e;

    public fvw(fvz fvz, fbl fbl, ikd ikd, int i) {
        this.f18832d = fvz;
        this.f18829a = fbl;
        this.f18833e = ikd;
        this.f18830b = i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        this.f18831c.incrementAndGet();
        this.f18833e.execute(new fvx(this));
    }
}

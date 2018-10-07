package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gop */
final class gop implements gol, iqo {
    /* renamed from: a */
    public final iqt f19422a;
    /* renamed from: b */
    private final Executor f19423b;
    /* renamed from: c */
    private final /* synthetic */ goo f19424c;

    gop(goo goo, iqt iqt, Executor executor) {
        this.f19424c = goo;
        this.f19422a = iqt;
        this.f19423b = executor;
    }

    public final void close() {
        this.f19424c.f24437a.mo7296b((gol) this);
    }

    /* renamed from: a */
    public final void mo7276a(String str) {
        if (this.f19424c.f24439c.equals(str)) {
            Object a = this.f19424c.mo14933a();
            if (a != null) {
                this.f19423b.execute(new goq(this, a));
            }
        }
    }
}

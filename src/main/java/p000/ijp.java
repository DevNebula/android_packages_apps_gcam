package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijp */
public final class ijp implements iqt {
    /* renamed from: a */
    public final iqt f21010a;
    /* renamed from: b */
    private final Executor f21011b;

    public ijp(iqt iqt, Executor executor) {
        this.f21010a = iqt;
        this.f21011b = executor;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        this.f21011b.execute(new ijq(this, obj));
    }
}

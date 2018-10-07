package p000;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: ffp */
public final class ffp implements Runnable {
    /* renamed from: a */
    private final fff f4761a;
    /* renamed from: b */
    private final ffe f4762b;
    /* renamed from: c */
    private final Object f4763c = new Object();
    /* renamed from: d */
    private Future f4764d = kow.m13873a(new Object());

    public ffp(fff fff, ffe ffe) {
        this.f4761a = fff;
        this.f4762b = ffe;
    }

    public final void run() {
        synchronized (this.f4763c) {
            this.f4764d.cancel(true);
            this.f4764d = this.f4761a.mo6772a(this.f4762b);
        }
    }
}

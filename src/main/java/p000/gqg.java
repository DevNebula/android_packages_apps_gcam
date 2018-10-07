package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gqg */
public final class gqg implements gqd {
    /* renamed from: a */
    private final Runnable f19484a;
    /* renamed from: b */
    private final AtomicBoolean f19485b = new AtomicBoolean(false);

    public gqg(Runnable runnable) {
        this.f19484a = runnable;
    }

    public final void run() {
        if (!this.f19485b.getAndSet(true)) {
            this.f19484a.run();
        }
    }
}

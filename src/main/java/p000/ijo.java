package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijo */
public final class ijo implements Runnable {
    /* renamed from: a */
    private final Runnable f7403a;
    /* renamed from: b */
    private final Executor f7404b;

    public ijo(Runnable runnable, Executor executor) {
        this.f7404b = executor;
        this.f7403a = runnable;
    }

    public final void run() {
        this.f7404b.execute(this.f7403a);
    }
}

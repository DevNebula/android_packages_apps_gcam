package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kpr */
public final class kpr extends knx {
    /* renamed from: a */
    private final Object f25353a = new Object();
    /* renamed from: b */
    private int f25354b = 0;
    /* renamed from: c */
    private boolean f25355c = false;

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        synchronized (this.f25353a) {
            while (true) {
                if (this.f25355c && this.f25354b == 0) {
                    return true;
                } else if (toNanos <= 0) {
                    return false;
                } else {
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f25353a, toNanos);
                    toNanos -= System.nanoTime() - nanoTime;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m16963a() {
        synchronized (this.f25353a) {
            int i = this.f25354b - 1;
            this.f25354b = i;
            if (i == 0) {
                this.f25353a.notifyAll();
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f25353a) {
            if (this.f25355c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.f25354b++;
        }
        try {
            runnable.run();
        } finally {
            m16963a();
        }
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this.f25353a) {
            z = this.f25355c;
        }
        return z;
    }

    public final boolean isTerminated() {
        boolean z = false;
        synchronized (this.f25353a) {
            if (this.f25355c && this.f25354b == 0) {
                z = true;
            }
        }
        return z;
    }

    public final void shutdown() {
        synchronized (this.f25353a) {
            this.f25355c = true;
            if (this.f25354b == 0) {
                this.f25353a.notifyAll();
            }
        }
    }

    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}

package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: jca */
final class jca implements kpk {
    /* renamed from: a */
    private final jbj f21426a;

    public jca(jbj jbj) {
        this.f21426a = jbj;
    }

    /* renamed from: a */
    public final void mo10200a(Runnable runnable, Executor executor) {
        if (this.f21426a.mo9285c()) {
            executor.execute(runnable);
            return;
        }
        synchronized (this.f21426a) {
            if (this.f21426a.mo9285c()) {
                executor.execute(runnable);
                return;
            }
            this.f21426a.mo13776a(executor, runnable, jcd.f21428b);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() {
        try {
            return this.f21426a.mo9284b();
        } catch (Throwable e) {
            throw new ExecutionException(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this.f21426a) {
            if (!isDone()) {
                timeUnit.timedWait(this.f21426a, j);
                if (!isDone()) {
                    throw new TimeoutException();
                }
            }
            jbj jbj = this.f21426a;
            obj = jbj.f21418a;
            if (obj != null) {
            } else {
                throw new ExecutionException(jbj.f21419b);
            }
        }
        return obj;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f21426a.mo9285c();
    }
}

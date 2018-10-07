package p000;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* renamed from: knx */
public abstract class knx extends AbstractExecutorService implements kpm {
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return kqb.m18490a(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable) {
        return kqb.m18491a(callable);
    }

    /* renamed from: a */
    public final kpk submit(Runnable runnable) {
        return (kpk) super.submit(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (kpk) super.submit(runnable, obj);
    }

    /* renamed from: a */
    public final kpk submit(Callable callable) {
        return (kpk) super.submit(callable);
    }
}

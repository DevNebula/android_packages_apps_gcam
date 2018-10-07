package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbv */
final class jbv {
    /* renamed from: a */
    public jbv f8042a;
    /* renamed from: b */
    public final Executor f8043b;
    /* renamed from: c */
    public final Runnable f8044c;
    /* renamed from: d */
    public final jbj f8045d;

    public jbv(Executor executor, Runnable runnable, jbj jbj, jcc jcc) {
        this.f8043b = executor;
        this.f8044c = runnable;
        this.f8045d = jbj;
    }

    public jbv(Executor executor, Runnable runnable, jcc jcc) {
        this.f8043b = executor;
        this.f8044c = runnable;
        this.f8045d = null;
    }
}

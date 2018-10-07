package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbu */
final class jbu implements Runnable {
    /* renamed from: a */
    private final Object f8037a;
    /* renamed from: b */
    private final Executor f8038b;
    /* renamed from: c */
    private final jbj f8039c;
    /* renamed from: d */
    private final jau f8040d;
    /* renamed from: e */
    private final jcc f8041e;

    public jbu(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        this.f8037a = obj;
        this.f8038b = executor;
        this.f8039c = jbj;
        this.f8040d = jau;
        this.f8041e = jcc;
    }

    public final void run() {
        jbj.m12999b(this.f8037a, this.f8040d, this.f8038b, this.f8039c, this.f8041e);
    }

    public final String toString() {
        return this.f8040d.toString();
    }
}

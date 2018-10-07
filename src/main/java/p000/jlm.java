package p000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jlm */
public final class jlm implements jll {
    /* renamed from: a */
    private final Queue f21625a = new LinkedList();
    /* renamed from: b */
    private final Executor f21626b;
    /* renamed from: c */
    private volatile boolean f21627c = false;

    public jlm(Executor executor) {
        jri.m13404b((Object) executor);
        this.f21626b = executor;
    }

    public final synchronized void execute(Runnable runnable) {
        this.f21625a.add(runnable);
        if (!this.f21627c) {
            m13208b(runnable);
        }
    }

    /* renamed from: a */
    public final synchronized void mo9514a() {
        this.f21627c = false;
        for (Runnable b : this.f21625a) {
            m13208b(b);
        }
    }

    /* renamed from: b */
    public final synchronized void mo9515b() {
        this.f21627c = true;
    }

    /* renamed from: a */
    final synchronized boolean mo13820a(Runnable runnable) {
        boolean z;
        if (this.f21627c) {
            z = false;
        } else if (this.f21625a.remove(runnable)) {
            z = true;
        } else {
            throw new RuntimeException("Task not in queue of submitted tasks.");
        }
        return z;
    }

    /* renamed from: b */
    private final void m13208b(Runnable runnable) {
        this.f21626b.execute(new jln(this, runnable));
    }
}

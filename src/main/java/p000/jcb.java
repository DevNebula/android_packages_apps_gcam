package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jcb */
public final class jcb implements jaq {
    /* renamed from: a */
    private final Object f21427a;

    public jcb(Object obj) {
        this.f21427a = obj;
    }

    /* renamed from: a */
    public final void mo9282a(izh izh) {
    }

    /* renamed from: a */
    public final kpk mo9281a() {
        return kow.m13873a(this.f21427a);
    }

    /* renamed from: b */
    public final Object mo9284b() {
        return this.f21427a;
    }

    /* renamed from: c */
    private final jaq m13022c(Executor executor, izi izi) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        jcb.m13020a(executor, new jal(this.f21427a, izi, d, jcc), d);
        return d;
    }

    /* renamed from: b */
    private final jaq m13021b(Executor executor, jau jau) {
        jcc jcc = jcd.f21428b;
        jbj d = jbj.m13001d();
        jcb.m13020a(executor, new jam(this.f21427a, jau, executor, d, jcc), d);
        return d;
    }

    /* renamed from: c */
    public final boolean mo9285c() {
        return true;
    }

    /* renamed from: a */
    private static void m13020a(Executor executor, Runnable runnable, jbj jbj) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    /* renamed from: a */
    public final jaq mo9275a(Executor executor, izi izi) {
        return m13022c(executor, izi);
    }

    /* renamed from: a */
    public final jaq mo9276a(Executor executor, izi izi, izi izi2) {
        return m13022c(executor, izi);
    }

    /* renamed from: a */
    public final jaq mo9277a(Executor executor, jau jau) {
        return m13021b(executor, jau);
    }

    /* renamed from: a */
    public final jaq mo9278a(Executor executor, jau jau, jau jau2) {
        return m13021b(executor, jau);
    }

    /* renamed from: a */
    public final jaq mo9279a(Executor executor, Runnable runnable) {
        jcc jcc = jcd.f21428b;
        Object d = jbj.m13001d();
        try {
            executor.execute(new jap(this.f21427a, runnable, d, jcc));
        } catch (Throwable th) {
            d.mo13777a(jar.m4449a(th));
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo9280a(Executor executor, jlf jlf) {
        return mo9278a(executor, new jea(jlf), new jiz(jlf));
    }

    /* renamed from: b */
    public final jaq mo9283b(Executor executor, izi izi) {
        return this;
    }
}

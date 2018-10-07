package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jam */
public final class jam implements Runnable {
    /* renamed from: a */
    private final Object f7984a;
    /* renamed from: b */
    private final Executor f7985b;
    /* renamed from: c */
    private final jbj f7986c;
    /* renamed from: d */
    private final jau f7987d;
    /* renamed from: e */
    private final jcc f7988e;

    public jam(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        this.f7984a = obj;
        this.f7985b = executor;
        this.f7986c = jbj;
        this.f7987d = jau;
        this.f7988e = jcc;
    }

    public final void run() {
        Object obj = this.f7984a;
        jau jau = this.f7987d;
        Executor executor = this.f7985b;
        jbj jbj = this.f7986c;
        try {
            jau.mo9286a(obj, executor).mo9276a(kpq.f8776a, new jao(jbj), new jan(jbj, this.f7988e)).mo9282a(izw.f21401a);
        } catch (jar e) {
            jbj.mo13777a(e);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    public final String toString() {
        return this.f7987d.toString();
    }
}

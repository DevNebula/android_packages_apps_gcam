package p000;

/* compiled from: PG */
/* renamed from: jap */
public final class jap implements Runnable {
    /* renamed from: a */
    private final Object f7989a;
    /* renamed from: b */
    private final jbj f7990b;
    /* renamed from: c */
    private final Runnable f7991c;
    /* renamed from: d */
    private final jcc f7992d;

    public jap(Object obj, Runnable runnable, jbj jbj, jcc jcc) {
        this.f7989a = obj;
        this.f7990b = jbj;
        this.f7991c = runnable;
        this.f7992d = jcc;
    }

    public final void run() {
        Object obj = this.f7989a;
        Runnable runnable = this.f7991c;
        jbj jbj = this.f7990b;
        try {
            runnable.run();
            jbj.mo13778a(obj);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    public final String toString() {
        return this.f7991c.toString();
    }
}

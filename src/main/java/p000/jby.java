package p000;

/* compiled from: PG */
/* renamed from: jby */
final class jby implements Runnable {
    /* renamed from: a */
    private final jar f8046a;
    /* renamed from: b */
    private final jbj f8047b;
    /* renamed from: c */
    private final Runnable f8048c;
    /* renamed from: d */
    private final jcc f8049d;

    public jby(jar jar, Runnable runnable, jbj jbj, jcc jcc) {
        this.f8046a = jar;
        this.f8047b = jbj;
        this.f8048c = runnable;
        this.f8049d = jcc;
    }

    public final void run() {
        jbj.m12992a(this.f8046a, this.f8048c, this.f8047b);
    }

    public final String toString() {
        return this.f8048c.toString();
    }
}

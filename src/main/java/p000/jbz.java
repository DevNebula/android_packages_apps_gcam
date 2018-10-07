package p000;

/* compiled from: PG */
/* renamed from: jbz */
final class jbz implements Runnable {
    /* renamed from: a */
    private final Object f8050a;
    /* renamed from: b */
    private final jbj f8051b;
    /* renamed from: c */
    private final Runnable f8052c;
    /* renamed from: d */
    private final jcc f8053d;

    public jbz(Object obj, Runnable runnable, jbj jbj, jcc jcc) {
        this.f8050a = obj;
        this.f8051b = jbj;
        this.f8052c = runnable;
        this.f8053d = jcc;
    }

    public final void run() {
        jbj.m12997a(this.f8050a, this.f8052c, this.f8051b);
    }

    public final String toString() {
        return this.f8052c.toString();
    }
}

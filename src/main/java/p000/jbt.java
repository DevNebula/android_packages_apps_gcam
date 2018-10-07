package p000;

/* compiled from: PG */
/* renamed from: jbt */
final class jbt implements Runnable {
    /* renamed from: a */
    private final Object f8033a;
    /* renamed from: b */
    private final jbj f8034b;
    /* renamed from: c */
    private final izi f8035c;
    /* renamed from: d */
    private final jcc f8036d;

    public jbt(Object obj, izi izi, jbj jbj, jcc jcc) {
        this.f8033a = obj;
        this.f8034b = jbj;
        this.f8035c = izi;
        this.f8036d = jcc;
    }

    public final void run() {
        jbj.m12994a(this.f8033a, this.f8035c, this.f8034b);
    }

    public final String toString() {
        return this.f8035c.toString();
    }
}

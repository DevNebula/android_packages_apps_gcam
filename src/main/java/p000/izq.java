package p000;

/* compiled from: PG */
/* renamed from: izq */
public abstract class izq implements ize {
    /* renamed from: a */
    private final Object f24722a = new Object();
    /* renamed from: b */
    private volatile jas f24723b = null;

    /* renamed from: b */
    public abstract void mo15027b();

    /* renamed from: c */
    public abstract jas mo15028c();

    public final void close() {
        jaq jaq = this.f24723b;
        if (jaq == null) {
            synchronized (this.f24722a) {
                jaq = this.f24723b;
                if (jaq == null) {
                    mo15027b();
                    jaq = jas.m12967d();
                    this.f24723b = jaq;
                }
            }
        }
        jli.m13202c(jaq);
    }

    /* renamed from: a */
    public final jas mo13767a() {
        jas jas = this.f24723b;
        if (jas == null) {
            synchronized (this.f24722a) {
                jas = this.f24723b;
                if (jas == null) {
                    jas = mo15028c();
                    this.f24723b = jas;
                }
            }
        }
        return jas;
    }
}

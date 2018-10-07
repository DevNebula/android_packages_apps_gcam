package p000;

/* compiled from: PG */
/* renamed from: jal */
public final class jal implements Runnable {
    /* renamed from: a */
    private final Object f7980a;
    /* renamed from: b */
    private final jbj f7981b;
    /* renamed from: c */
    private final izi f7982c;
    /* renamed from: d */
    private final jcc f7983d;

    public jal(Object obj, izi izi, jbj jbj, jcc jcc) {
        this.f7980a = obj;
        this.f7981b = jbj;
        this.f7982c = izi;
        this.f7983d = jcc;
    }

    public final void run() {
        Object obj = this.f7980a;
        izi izi = this.f7982c;
        jbj jbj = this.f7981b;
        try {
            jbj.mo13778a(izi.mo9217a(obj));
        } catch (jar e) {
            jbj.mo13777a(e);
        } catch (Throwable th) {
            jbj.mo13777a(jar.m4449a(th));
        }
    }

    public final String toString() {
        return this.f7982c.toString();
    }
}

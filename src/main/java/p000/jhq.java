package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jhq */
public final class jhq implements jhs {
    /* renamed from: a */
    private final AtomicReference f26564a;
    /* renamed from: b */
    private final jbj f26565b;
    /* renamed from: c */
    private final jas f26566c;

    public jhq(ize ize) {
        this((Object) ize);
    }

    private jhq(Object obj) {
        this.f26565b = jbj.m13001d();
        this.f26566c = jas.m12965a(this.f26565b);
        jri.m13404b(obj);
        this.f26564a = new AtomicReference(obj);
    }

    public final void close() {
        jli.m13202c(mo13767a());
    }

    /* renamed from: a */
    public final jas mo13767a() {
        Object d = m18042d();
        if (d != null) {
            jbj jbj = this.f26565b;
            ((ize) d).mo9286a().mo9276a(kpq.f8776a, new jbf(jbj), new jbe(jbj)).mo9282a(izw.f21401a);
        }
        return this.f26566c;
    }

    /* renamed from: b */
    public final Object mo15043b() {
        Object d = m18042d();
        if (d == null) {
            throw new jhu();
        }
        this.f26565b.mo13778a(izg.f7956a);
        jli.m13202c(this.f26566c);
        return d;
    }

    /* renamed from: c */
    public final Object mo15044c() {
        Object obj = this.f26564a.get();
        if (obj != null) {
            return obj;
        }
        throw new jhu();
    }

    /* renamed from: d */
    private final Object m18042d() {
        return this.f26564a.getAndSet(null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26564a.get());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("single-owner[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

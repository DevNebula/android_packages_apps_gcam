package p000;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jhr */
public abstract class jhr implements jhs {
    /* renamed from: a */
    private final AtomicReference f26567a;

    public jhr(Object obj) {
        jri.m13404b(obj);
        this.f26567a = new AtomicReference(obj);
    }

    /* renamed from: a */
    public abstract void mo15580a(Object obj);

    public final void close() {
        Object d = mo15581d();
        if (d != null) {
            mo15580a(d);
        }
    }

    /* renamed from: a */
    public final jas mo13767a() {
        close();
        return jas.m12967d();
    }

    /* renamed from: b */
    public final Object mo15043b() {
        Object d = mo15581d();
        if (d != null) {
            return d;
        }
        throw new jhu();
    }

    /* renamed from: c */
    public final Object mo15044c() {
        Object obj = this.f26567a.get();
        if (obj != null) {
            return obj;
        }
        throw new jhu();
    }

    /* renamed from: d */
    public final Object mo15581d() {
        return this.f26567a.getAndSet(null);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f26567a.get());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append("single-owner[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

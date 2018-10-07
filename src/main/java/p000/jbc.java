package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbc */
public final class jbc implements jau {
    /* renamed from: a */
    private final /* synthetic */ jau f21416a;

    public jbc(jau jau) {
        this.f21416a = jau;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        Iterable iterable = (Iterable) obj;
        jri.m13404b((Object) iterable);
        return jli.m13198b(iterable, executor, this.f21416a);
    }

    public final String toString() {
        return this.f21416a.toString();
    }
}

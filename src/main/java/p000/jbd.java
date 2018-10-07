package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbd */
public final class jbd implements jau {
    /* renamed from: a */
    private final /* synthetic */ izi f21417a;

    public jbd(izi izi) {
        this.f21417a = izi;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo9286a(Object obj, Executor executor) {
        Iterable iterable = (Iterable) obj;
        jri.m13404b((Object) iterable);
        return jli.m13197b(iterable, executor, this.f21417a);
    }

    public final String toString() {
        return this.f21417a.toString();
    }
}

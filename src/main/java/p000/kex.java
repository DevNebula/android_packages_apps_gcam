package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kex */
public final class kex extends kdu {
    /* renamed from: a */
    private final /* synthetic */ Iterable f21884a;
    /* renamed from: b */
    private final /* synthetic */ kbj f21885b;

    public kex(Iterable iterable, kbj kbj) {
        this.f21884a = iterable;
        this.f21885b = kbj;
    }

    public final Iterator iterator() {
        Object it = this.f21884a.iterator();
        Object obj = this.f21885b;
        jri.m13404b(it);
        jri.m13404b(obj);
        return new kfa(it, obj);
    }
}

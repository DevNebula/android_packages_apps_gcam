package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kfa */
final class kfa extends kbt {
    /* renamed from: a */
    private final /* synthetic */ Iterator f24916a;
    /* renamed from: b */
    private final /* synthetic */ kbj f24917b;

    kfa(Iterator it, kbj kbj) {
        this.f24916a = it;
        this.f24917b = kbj;
    }

    /* renamed from: a */
    protected final Object mo13911a() {
        while (this.f24916a.hasNext()) {
            Object next = this.f24916a.next();
            if (this.f24917b.mo9713a(next)) {
                return next;
            }
        }
        return mo13912b();
    }
}

package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgs */
final class kgs extends kbt {
    /* renamed from: a */
    private final Iterator f24947a = this.f24948b.f21903a.iterator();
    /* renamed from: b */
    private final /* synthetic */ kgr f24948b;

    kgs(kgr kgr) {
        this.f24948b = kgr;
    }

    /* renamed from: a */
    protected final Object mo13911a() {
        while (this.f24947a.hasNext()) {
            Object next = this.f24947a.next();
            if (!this.f24948b.f21904b.contains(next)) {
                return next;
            }
        }
        return mo13912b();
    }
}

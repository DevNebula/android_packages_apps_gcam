package p000;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcj */
final class kcj extends kcf implements Set {
    /* renamed from: e */
    private final /* synthetic */ kbv f21859e;

    kcj(kbv kbv, Object obj, Set set) {
        this.f21859e = kbv;
        super(kbv, obj, set, null);
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = khb.m4941a((Set) this.f8566b, collection);
        if (!a) {
            return a;
        }
        kbv.m16780a(this.f21859e, this.f8566b.size() - size);
        mo9731c();
        return a;
    }
}

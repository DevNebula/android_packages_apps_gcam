package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kbz */
final class kbz extends kfn {
    /* renamed from: a */
    private final /* synthetic */ kby f24901a;

    kbz(kby kby) {
        this.f24901a = kby;
    }

    public final boolean contains(Object obj) {
        return khb.m4937a(this.f24901a.f21855a.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new kca(this.f24901a);
    }

    /* renamed from: a */
    final Map mo14012a() {
        return this.f24901a;
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Entry entry = (Entry) obj;
        kbv kbv = this.f24901a.f21856b;
        Collection collection = (Collection) khb.m4954c(kbv.f24899a, entry.getKey());
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            kbv.f24900b -= size;
        }
        return true;
    }
}

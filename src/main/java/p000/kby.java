package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kby */
final class kby extends kfq {
    /* renamed from: a */
    public final transient Map f21855a;
    /* renamed from: b */
    public final /* synthetic */ kbv f21856b;

    kby(kbv kbv, Map map) {
        this.f21856b = kbv;
        this.f21855a = map;
    }

    public final void clear() {
        Map map = this.f21855a;
        kbv kbv = this.f21856b;
        if (map == kbv.f24899a) {
            kbv.mo9927c();
        } else {
            khb.m4936a(new kca(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return khb.m4939a(this.f21855a, obj);
    }

    /* renamed from: a */
    protected final Set mo9920a() {
        return new kbz(this);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f21855a.equals(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) khb.m4944b(this.f21855a, obj);
        if (collection == null) {
            return null;
        }
        return this.f21856b.mo15067a(obj, collection);
    }

    public final int hashCode() {
        return this.f21855a.hashCode();
    }

    public final Set keySet() {
        return this.f21856b.mo9931n();
    }

    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f21855a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.f21856b.mo15066a();
        a.addAll(collection);
        kbv.m16782b(this.f21856b, collection.size());
        collection.clear();
        return a;
    }

    public final int size() {
        return this.f21855a.size();
    }

    public final String toString() {
        return this.f21855a.toString();
    }
}

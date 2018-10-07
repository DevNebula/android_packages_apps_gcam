package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kfq */
abstract class kfq extends AbstractMap {
    /* renamed from: a */
    private transient Set f8640a;
    /* renamed from: b */
    private transient Set f8641b;
    /* renamed from: c */
    private transient Collection f8642c;

    kfq() {
    }

    /* renamed from: a */
    abstract Set mo9920a();

    public Set entrySet() {
        Set set = this.f8640a;
        if (set != null) {
            return set;
        }
        set = mo9920a();
        this.f8640a = set;
        return set;
    }

    public Set keySet() {
        Set set = this.f8641b;
        if (set != null) {
            return set;
        }
        set = new kfo(this);
        this.f8641b = set;
        return set;
    }

    public Collection values() {
        Collection collection = this.f8642c;
        if (collection != null) {
            return collection;
        }
        collection = new kfp(this);
        this.f8642c = collection;
        return collection;
    }
}

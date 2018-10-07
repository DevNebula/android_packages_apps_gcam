package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdh */
final class kdh extends AbstractSet {
    /* renamed from: a */
    private final /* synthetic */ kdb f8596a;

    kdh(kdb kdb) {
        this.f8596a = kdb;
    }

    public final void clear() {
        this.f8596a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f8596a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new kdc(this.f8596a);
    }

    public final boolean remove(Object obj) {
        int a = this.f8596a.mo9768a(obj);
        if (a == -1) {
            return false;
        }
        kdb kdb = this.f8596a;
        kdb.mo9769a(kdb.f8581b[a], (int) (kdb.f8580a[a] >>> 32));
        return true;
    }

    public final int size() {
        return this.f8596a.f8584e;
    }
}

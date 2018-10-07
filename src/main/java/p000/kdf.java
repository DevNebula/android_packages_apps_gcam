package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kdf */
final class kdf extends AbstractSet {
    /* renamed from: a */
    private final /* synthetic */ kdb f8591a;

    kdf(kdb kdb) {
        this.f8591a = kdb;
    }

    public final void clear() {
        this.f8591a.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f8591a.mo9768a(entry.getKey());
        if (a == -1 || !kbf.m16778b(this.f8591a.f8582c[a], entry.getValue())) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new kdd(this.f8591a);
    }

    public final boolean remove(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            int a = this.f8591a.mo9768a(entry.getKey());
            if (a != -1 && kbf.m16778b(this.f8591a.f8582c[a], entry.getValue())) {
                kdb kdb = this.f8591a;
                kdb.mo9769a(kdb.f8581b[a], (int) (kdb.f8580a[a] >>> 32));
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.f8591a.f8584e;
    }
}

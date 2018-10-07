package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kfp */
final class kfp extends AbstractCollection {
    /* renamed from: a */
    private final Map f8639a;

    kfp(Map map) {
        this.f8639a = (Map) jri.m13404b((Object) map);
    }

    public final void clear() {
        this.f8639a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f8639a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f8639a.isEmpty();
    }

    public final Iterator iterator() {
        return khb.m4964e(this.f8639a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException e) {
            for (Entry entry : this.f8639a.entrySet()) {
                if (kbf.m16778b(obj, entry.getValue())) {
                    this.f8639a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection) jri.m13404b((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection e2 = khb.m4963e();
            for (Entry entry : this.f8639a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    e2.add(entry.getKey());
                }
            }
            return this.f8639a.keySet().removeAll(e2);
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection) jri.m13404b((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection e2 = khb.m4963e();
            for (Entry entry : this.f8639a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    e2.add(entry.getKey());
                }
            }
            return this.f8639a.keySet().retainAll(e2);
        }
    }

    public final int size() {
        return this.f8639a.size();
    }
}

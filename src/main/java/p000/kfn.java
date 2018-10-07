package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kfn */
abstract class kfn extends kgt {
    kfn() {
    }

    /* renamed from: a */
    abstract Map mo14012a();

    public void clear() {
        mo14012a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object b = khb.m4944b(mo14012a(), key);
        if (!kbf.m16778b(b, entry.getValue())) {
            return false;
        }
        if (b != null) {
            return true;
        }
        if (mo14012a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return mo14012a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        return mo14012a().keySet().remove(((Entry) obj).getKey());
    }

    public boolean removeAll(Collection collection) {
        try {
            return super.removeAll((Collection) jri.m13404b((Object) collection));
        } catch (UnsupportedOperationException e) {
            return khb.m4942a((Set) this, collection.iterator());
        }
    }

    public boolean retainAll(Collection collection) {
        try {
            return super.retainAll((Collection) jri.m13404b((Object) collection));
        } catch (UnsupportedOperationException e) {
            Collection b = khb.m4946b(collection.size());
            for (Object next : collection) {
                if (contains(next)) {
                    b.add(((Entry) next).getKey());
                }
            }
            return mo14012a().keySet().retainAll(b);
        }
    }

    public int size() {
        return mo14012a().size();
    }
}

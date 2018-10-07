package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdv */
public abstract class kdv extends kdy implements Collection {
    protected kdv() {
    }

    /* renamed from: b */
    public abstract Collection mo9820F_();

    public boolean add(Object obj) {
        return mo9820F_().add(obj);
    }

    public boolean addAll(Collection collection) {
        return mo9820F_().addAll(collection);
    }

    public void clear() {
        mo9820F_().clear();
    }

    public boolean contains(Object obj) {
        return mo9820F_().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return mo9820F_().containsAll(collection);
    }

    public boolean isEmpty() {
        return mo9820F_().isEmpty();
    }

    public Iterator iterator() {
        return mo9820F_().iterator();
    }

    public boolean remove(Object obj) {
        return mo9820F_().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return mo9820F_().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return mo9820F_().retainAll(collection);
    }

    public int size() {
        return mo9820F_().size();
    }

    public Object[] toArray() {
        return mo9820F_().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return mo9820F_().toArray(objArr);
    }
}

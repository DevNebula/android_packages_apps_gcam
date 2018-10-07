package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: khd */
class khd extends khi implements Collection {
    public static final long serialVersionUID = 0;

    khd(Collection collection, Object obj) {
        super(collection, obj);
    }

    public boolean add(Object obj) {
        boolean add;
        synchronized (this.f8653a) {
            add = mo9985a().add(obj);
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f8653a) {
            addAll = mo9985a().addAll(collection);
        }
        return addAll;
    }

    public void clear() {
        synchronized (this.f8653a) {
            mo9985a().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f8653a) {
            contains = mo9985a().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f8653a) {
            containsAll = mo9985a().containsAll(collection);
        }
        return containsAll;
    }

    /* renamed from: b */
    Collection mo9985a() {
        return (Collection) super.mo9985a();
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f8653a) {
            isEmpty = mo9985a().isEmpty();
        }
        return isEmpty;
    }

    public Iterator iterator() {
        return mo9985a().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f8653a) {
            remove = mo9985a().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f8653a) {
            removeAll = mo9985a().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f8653a) {
            retainAll = mo9985a().retainAll(collection);
        }
        return retainAll;
    }

    public int size() {
        int size;
        synchronized (this.f8653a) {
            size = mo9985a().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] toArray;
        synchronized (this.f8653a) {
            toArray = mo9985a().toArray();
        }
        return toArray;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] toArray;
        synchronized (this.f8653a) {
            toArray = mo9985a().toArray(objArr);
        }
        return toArray;
    }
}

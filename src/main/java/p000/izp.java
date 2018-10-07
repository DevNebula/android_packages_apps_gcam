package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: izp */
public class izp implements List {
    /* renamed from: a */
    public final List f7957a;

    public izp(List list) {
        this.f7957a = list;
    }

    public void add(int i, Object obj) {
        this.f7957a.add(i, obj);
    }

    public boolean add(Object obj) {
        return this.f7957a.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        return this.f7957a.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        return this.f7957a.addAll(collection);
    }

    public void clear() {
        this.f7957a.clear();
    }

    public boolean contains(Object obj) {
        return this.f7957a.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.f7957a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f7957a.equals(obj);
    }

    public Object get(int i) {
        return this.f7957a.get(i);
    }

    public int hashCode() {
        return this.f7957a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f7957a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f7957a.isEmpty();
    }

    public Iterator iterator() {
        return this.f7957a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f7957a.lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        return this.f7957a.listIterator();
    }

    public ListIterator listIterator(int i) {
        return this.f7957a.listIterator(i);
    }

    public Object remove(int i) {
        return this.f7957a.remove(i);
    }

    public boolean remove(Object obj) {
        return this.f7957a.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return this.f7957a.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return this.f7957a.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        return this.f7957a.set(i, obj);
    }

    public int size() {
        return this.f7957a.size();
    }

    public List subList(int i, int i2) {
        return this.f7957a.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f7957a.toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f7957a.toArray(objArr);
    }
}

package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kff */
class kff extends AbstractList {
    /* renamed from: a */
    public final List f8631a;

    kff(List list) {
        this.f8631a = (List) jri.m13404b((Object) list);
    }

    public void add(int i, Object obj) {
        this.f8631a.add(mo9882a(i), obj);
    }

    public void clear() {
        this.f8631a.clear();
    }

    public Object get(int i) {
        return this.f8631a.get(m4878b(i));
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator(int i) {
        return new kfg(this, this.f8631a.listIterator(mo9882a(i)));
    }

    public Object remove(int i) {
        return this.f8631a.remove(m4878b(i));
    }

    protected void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    /* renamed from: b */
    private final int m4878b(int i) {
        int size = size();
        jri.m13390a(i, size);
        return (size - 1) - i;
    }

    /* renamed from: a */
    final int mo9882a(int i) {
        int size = size();
        jri.m13403b(i, size);
        return size - i;
    }

    public Object set(int i, Object obj) {
        return this.f8631a.set(m4878b(i), obj);
    }

    public int size() {
        return this.f8631a.size();
    }

    public List subList(int i, int i2) {
        jri.m13394a(i, i2, size());
        return khb.m4927a(this.f8631a.subList(mo9882a(i2), mo9882a(i)));
    }
}

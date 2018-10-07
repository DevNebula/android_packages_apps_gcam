package p000;

import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: khk */
class khk extends khf implements SortedMap {
    public static final long serialVersionUID = 0;

    khk(SortedMap sortedMap, Object obj) {
        super(sortedMap, obj);
    }

    public Comparator comparator() {
        Comparator comparator;
        synchronized (this.f8653a) {
            comparator = mo14080b().comparator();
        }
        return comparator;
    }

    /* renamed from: c */
    SortedMap mo14080b() {
        return (SortedMap) super.mo9985a();
    }

    public Object firstKey() {
        Object firstKey;
        synchronized (this.f8653a) {
            firstKey = mo14080b().firstKey();
        }
        return firstKey;
    }

    public SortedMap headMap(Object obj) {
        SortedMap a;
        synchronized (this.f8653a) {
            a = khb.m4931a(mo14080b().headMap(obj), this.f8653a);
        }
        return a;
    }

    public Object lastKey() {
        Object lastKey;
        synchronized (this.f8653a) {
            lastKey = mo14080b().lastKey();
        }
        return lastKey;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        SortedMap a;
        synchronized (this.f8653a) {
            a = khb.m4931a(mo14080b().subMap(obj, obj2), this.f8653a);
        }
        return a;
    }

    public SortedMap tailMap(Object obj) {
        SortedMap a;
        synchronized (this.f8653a) {
            a = khb.m4931a(mo14080b().tailMap(obj), this.f8653a);
        }
        return a;
    }
}

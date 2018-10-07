package p000;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: khg */
final class khg extends khk implements NavigableMap {
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private transient NavigableSet f26589b;
    /* renamed from: c */
    private transient NavigableMap f26590c;
    /* renamed from: d */
    private transient NavigableSet f26591d;

    khg(NavigableMap navigableMap, Object obj) {
        super(navigableMap, obj);
    }

    public final Entry ceilingEntry(Object obj) {
        Entry khe;
        synchronized (this.f8653a) {
            Entry ceilingEntry = ((NavigableMap) super.mo14080b()).ceilingEntry(obj);
            Object obj2 = this.f8653a;
            if (ceilingEntry != null) {
                khe = new khe(ceilingEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object ceilingKey(Object obj) {
        Object ceilingKey;
        synchronized (this.f8653a) {
            ceilingKey = ((NavigableMap) super.mo14080b()).ceilingKey(obj);
        }
        return ceilingKey;
    }

    /* renamed from: a */
    final /* synthetic */ Object mo9985a() {
        return (NavigableMap) super.mo14080b();
    }

    /* renamed from: b */
    final /* synthetic */ Map mo14080b() {
        return (NavigableMap) super.mo14080b();
    }

    /* renamed from: c */
    final /* synthetic */ SortedMap mo15134c() {
        return (NavigableMap) super.mo14080b();
    }

    public final NavigableSet descendingKeySet() {
        NavigableSet navigableSet;
        synchronized (this.f8653a) {
            navigableSet = this.f26589b;
            if (navigableSet != null) {
            } else {
                navigableSet = khb.m4930a(((NavigableMap) super.mo14080b()).descendingKeySet(), this.f8653a);
                this.f26589b = navigableSet;
            }
        }
        return navigableSet;
    }

    public final NavigableMap descendingMap() {
        NavigableMap navigableMap;
        synchronized (this.f8653a) {
            navigableMap = this.f26590c;
            if (navigableMap != null) {
            } else {
                navigableMap = khb.m4928a(((NavigableMap) super.mo14080b()).descendingMap(), this.f8653a);
                this.f26590c = navigableMap;
            }
        }
        return navigableMap;
    }

    public final Entry firstEntry() {
        Entry khe;
        synchronized (this.f8653a) {
            Entry firstEntry = ((NavigableMap) super.mo14080b()).firstEntry();
            Object obj = this.f8653a;
            if (firstEntry != null) {
                khe = new khe(firstEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Entry floorEntry(Object obj) {
        Entry khe;
        synchronized (this.f8653a) {
            Entry floorEntry = ((NavigableMap) super.mo14080b()).floorEntry(obj);
            Object obj2 = this.f8653a;
            if (floorEntry != null) {
                khe = new khe(floorEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object floorKey(Object obj) {
        Object floorKey;
        synchronized (this.f8653a) {
            floorKey = ((NavigableMap) super.mo14080b()).floorKey(obj);
        }
        return floorKey;
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        NavigableMap a;
        synchronized (this.f8653a) {
            a = khb.m4928a(((NavigableMap) super.mo14080b()).headMap(obj, z), this.f8653a);
        }
        return a;
    }

    public final Entry higherEntry(Object obj) {
        Entry khe;
        synchronized (this.f8653a) {
            Entry higherEntry = ((NavigableMap) super.mo14080b()).higherEntry(obj);
            Object obj2 = this.f8653a;
            if (higherEntry != null) {
                khe = new khe(higherEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object higherKey(Object obj) {
        Object higherKey;
        synchronized (this.f8653a) {
            higherKey = ((NavigableMap) super.mo14080b()).higherKey(obj);
        }
        return higherKey;
    }

    public final Set keySet() {
        return navigableKeySet();
    }

    public final Entry lastEntry() {
        Entry khe;
        synchronized (this.f8653a) {
            Entry lastEntry = ((NavigableMap) super.mo14080b()).lastEntry();
            Object obj = this.f8653a;
            if (lastEntry != null) {
                khe = new khe(lastEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Entry lowerEntry(Object obj) {
        Entry khe;
        synchronized (this.f8653a) {
            Entry lowerEntry = ((NavigableMap) super.mo14080b()).lowerEntry(obj);
            Object obj2 = this.f8653a;
            if (lowerEntry != null) {
                khe = new khe(lowerEntry, obj2);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Object lowerKey(Object obj) {
        Object lowerKey;
        synchronized (this.f8653a) {
            lowerKey = ((NavigableMap) super.mo14080b()).lowerKey(obj);
        }
        return lowerKey;
    }

    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet;
        synchronized (this.f8653a) {
            navigableSet = this.f26591d;
            if (navigableSet != null) {
            } else {
                navigableSet = khb.m4930a(((NavigableMap) super.mo14080b()).navigableKeySet(), this.f8653a);
                this.f26591d = navigableSet;
            }
        }
        return navigableSet;
    }

    public final Entry pollFirstEntry() {
        Entry khe;
        synchronized (this.f8653a) {
            Entry pollFirstEntry = ((NavigableMap) super.mo14080b()).pollFirstEntry();
            Object obj = this.f8653a;
            if (pollFirstEntry != null) {
                khe = new khe(pollFirstEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final Entry pollLastEntry() {
        Entry khe;
        synchronized (this.f8653a) {
            Entry pollLastEntry = ((NavigableMap) super.mo14080b()).pollLastEntry();
            Object obj = this.f8653a;
            if (pollLastEntry != null) {
                khe = new khe(pollLastEntry, obj);
            } else {
                khe = null;
            }
        }
        return khe;
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableMap a;
        synchronized (this.f8653a) {
            a = khb.m4928a(((NavigableMap) super.mo14080b()).subMap(obj, z, obj2, z2), this.f8653a);
        }
        return a;
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        NavigableMap a;
        synchronized (this.f8653a) {
            a = khb.m4928a(((NavigableMap) super.mo14080b()).tailMap(obj, z), this.f8653a);
        }
        return a;
    }
}

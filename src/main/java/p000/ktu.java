package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ktu */
class ktu extends AbstractMap {
    /* renamed from: a */
    public List f8917a;
    /* renamed from: b */
    public Map f8918b;
    /* renamed from: c */
    public boolean f8919c;
    /* renamed from: d */
    public Map f8920d;
    /* renamed from: e */
    private final int f8921e;
    /* renamed from: f */
    private volatile kud f8922f;
    /* renamed from: g */
    private volatile ktx f8923g;

    private ktu(int i) {
        this.f8921e = i;
        this.f8917a = Collections.emptyList();
        this.f8918b = Collections.emptyMap();
        this.f8920d = Collections.emptyMap();
    }

    /* synthetic */ ktu(int i, byte b) {
        this(i);
    }

    /* renamed from: a */
    private final int m5344a(Comparable comparable) {
        int compareTo;
        int i = 0;
        int size = this.f8917a.size() - 1;
        if (size >= 0) {
            compareTo = comparable.compareTo(((kub) this.f8917a.get(size)).f8931a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            compareTo = comparable.compareTo(((kub) this.f8917a.get(i2)).f8931a);
            if (compareTo < 0) {
                compareTo = i2 - 1;
                size = i;
            } else if (compareTo <= 0) {
                return i2;
            } else {
                int i3 = size;
                size = i2 + 1;
                compareTo = i3;
            }
            i = size;
            size = compareTo;
        }
        return -(i + 1);
    }

    /* renamed from: a */
    final void mo10372a() {
        if (this.f8919c) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo10372a();
        if (!this.f8917a.isEmpty()) {
            this.f8917a.clear();
        }
        if (!this.f8918b.isEmpty()) {
            this.f8918b.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m5344a(comparable) >= 0 || this.f8918b.containsKey(comparable);
    }

    /* renamed from: b */
    final Set mo10373b() {
        if (this.f8923g == null) {
            this.f8923g = new ktx(this);
        }
        return this.f8923g;
    }

    public Set entrySet() {
        if (this.f8922f == null) {
            this.f8922f = new kud(this);
        }
        return this.f8922f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktu)) {
            return super.equals(obj);
        }
        ktu ktu = (ktu) obj;
        int size = size();
        if (size != ktu.size()) {
            return false;
        }
        int c = mo10374c();
        if (c != ktu.mo10374c()) {
            return entrySet().equals(ktu.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo10371a(i).equals(ktu.mo10371a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f8918b.equals(ktu.f8918b);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m5344a(comparable);
        if (a >= 0) {
            return ((kub) this.f8917a.get(a)).getValue();
        }
        return this.f8918b.get(comparable);
    }

    /* renamed from: a */
    public final Entry mo10371a(int i) {
        return (Entry) this.f8917a.get(i);
    }

    /* renamed from: c */
    public final int mo10374c() {
        return this.f8917a.size();
    }

    /* renamed from: d */
    public final Iterable mo10378d() {
        if (this.f8918b.isEmpty()) {
            return kty.f8928b;
        }
        return this.f8918b.entrySet();
    }

    /* renamed from: f */
    private final SortedMap m5346f() {
        mo10372a();
        if (this.f8918b.isEmpty() && !(this.f8918b instanceof TreeMap)) {
            this.f8918b = new TreeMap();
            this.f8920d = ((TreeMap) this.f8918b).descendingMap();
        }
        return (SortedMap) this.f8918b;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo10374c(); i2++) {
            i += ((kub) this.f8917a.get(i2)).hashCode();
        }
        if (this.f8918b.size() > 0) {
            return this.f8918b.hashCode() + i;
        }
        return i;
    }

    /* renamed from: e */
    public void mo10379e() {
        if (!this.f8919c) {
            Map emptyMap;
            if (this.f8918b.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f8918b);
            }
            this.f8918b = emptyMap;
            if (this.f8920d.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f8920d);
            }
            this.f8920d = emptyMap;
            this.f8919c = true;
        }
    }

    /* renamed from: b */
    static ktu m5345b(int i) {
        return new ktv(i);
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        mo10372a();
        int a = m5344a(comparable);
        if (a >= 0) {
            return ((kub) this.f8917a.get(a)).setValue(obj);
        }
        mo10372a();
        if (this.f8917a.isEmpty() && !(this.f8917a instanceof ArrayList)) {
            this.f8917a = new ArrayList(this.f8921e);
        }
        int i = -(a + 1);
        if (i >= this.f8921e) {
            return m5346f().put(comparable, obj);
        }
        a = this.f8917a.size();
        int i2 = this.f8921e;
        if (a == i2) {
            kub kub = (kub) this.f8917a.remove(i2 - 1);
            m5346f().put(kub.f8931a, kub.getValue());
        }
        this.f8917a.add(i, new kub(this, comparable, obj));
        return null;
    }

    public Object remove(Object obj) {
        mo10372a();
        Comparable comparable = (Comparable) obj;
        int a = m5344a(comparable);
        if (a >= 0) {
            return mo10375c(a);
        }
        if (this.f8918b.isEmpty()) {
            return null;
        }
        return this.f8918b.remove(comparable);
    }

    /* renamed from: c */
    final Object mo10375c(int i) {
        mo10372a();
        Object value = ((kub) this.f8917a.remove(i)).getValue();
        if (!this.f8918b.isEmpty()) {
            Iterator it = m5346f().entrySet().iterator();
            this.f8917a.add(new kub(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public int size() {
        return this.f8917a.size() + this.f8918b.size();
    }
}

package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kgj */
final class kgj extends keu {
    /* renamed from: a */
    public final transient Object[] f24931a;
    /* renamed from: b */
    public final transient int f24932b;
    /* renamed from: c */
    public final transient int f24933c;
    /* renamed from: d */
    private final transient kes f24934d;

    kgj(kes kes, Object[] objArr, int i, int i2) {
        this.f24934d = kes;
        this.f24931a = objArr;
        this.f24932b = i;
        this.f24933c = i2;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f24934d.get(key))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    final int mo9832a(Object[] objArr, int i) {
        return mo9833a().mo9832a(objArr, i);
    }

    /* renamed from: e */
    final ken mo14003e() {
        return new kgk(this);
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return true;
    }

    /* renamed from: c */
    public final khy iterator() {
        return mo9833a().listIterator(0);
    }

    public final int size() {
        return this.f24933c;
    }
}

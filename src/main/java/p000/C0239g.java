package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: g */
public class C0239g implements Iterable {
    /* renamed from: b */
    public C0302j f5174b;
    /* renamed from: c */
    public C0302j f5175c;
    /* renamed from: d */
    public WeakHashMap f5176d = new WeakHashMap();
    /* renamed from: e */
    public int f5177e = 0;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0239g)) {
            return false;
        }
        C0239g c0239g = (C0239g) obj;
        if (this.f5177e != c0239g.f5177e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0239g.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || !(entry == null || entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: b */
    protected C0302j mo6985b(Object obj) {
        C0302j c0302j = this.f5174b;
        while (c0302j != null && !c0302j.f7959a.equals(obj)) {
            c0302j = c0302j.f7961c;
        }
        return c0302j;
    }

    public Iterator iterator() {
        Iterator c0819h = new C0819h(this.f5174b, this.f5175c);
        this.f5176d.put(c0819h, Boolean.valueOf(false));
        return c0819h;
    }

    /* renamed from: a */
    public final C0699k mo6984a() {
        C0699k c0699k = new C0699k(this);
        this.f5176d.put(c0699k, Boolean.valueOf(false));
        return c0699k;
    }

    /* renamed from: b */
    protected final C0302j mo6986b(Object obj, Object obj2) {
        C0302j c0302j = new C0302j(obj, obj2);
        this.f5177e++;
        C0302j c0302j2 = this.f5175c;
        if (c0302j2 == null) {
            this.f5174b = c0302j;
            this.f5175c = this.f5174b;
        } else {
            c0302j2.f7961c = c0302j;
            c0302j.f7962d = c0302j2;
            this.f5175c = c0302j;
        }
        return c0302j;
    }

    /* renamed from: a */
    public Object mo6983a(Object obj, Object obj2) {
        C0302j b = mo6985b(obj);
        if (b != null) {
            return b.f7960b;
        }
        mo6986b(obj, obj2);
        return null;
    }

    /* renamed from: c */
    public Object mo6987c(Object obj) {
        C0302j b = mo6985b(obj);
        if (b == null) {
            return null;
        }
        this.f5177e--;
        if (!this.f5176d.isEmpty()) {
            for (C0366m a_ : this.f5176d.keySet()) {
                a_.mo10664a_(b);
            }
        }
        C0302j c0302j = b.f7962d;
        if (c0302j != null) {
            c0302j.f7961c = b.f7961c;
        } else {
            this.f5174b = b.f7961c;
        }
        C0302j c0302j2 = b.f7961c;
        if (c0302j2 != null) {
            c0302j2.f7962d = c0302j;
        } else {
            this.f5175c = c0302j;
        }
        b.f7961c = null;
        b.f7962d = null;
        return b.f7960b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

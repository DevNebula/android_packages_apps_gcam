package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kbv */
abstract class kbv extends kcm implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    /* renamed from: a */
    public transient Map f24899a;
    /* renamed from: b */
    public transient int f24900b;

    protected kbv(Map map) {
        jri.m13395a(map.isEmpty());
        this.f24899a = map;
    }

    /* renamed from: a */
    abstract Collection mo15066a();

    /* renamed from: b */
    static /* synthetic */ int m16782b(kbv kbv, int i) {
        int i2 = kbv.f24900b - i;
        kbv.f24900b = i2;
        return i2;
    }

    /* renamed from: c */
    public void mo9927c() {
        for (Collection clear : this.f24899a.values()) {
            clear.clear();
        }
        this.f24899a.clear();
        this.f24900b = 0;
    }

    /* renamed from: d */
    final Map mo13940d() {
        return new kby(this, this.f24899a);
    }

    /* renamed from: e */
    final Collection mo13941e() {
        if (this instanceof kgq) {
            return new kcn(this);
        }
        return new kfs(this);
    }

    /* renamed from: f */
    final Set mo13943f() {
        return new kcc(this, this.f24899a);
    }

    /* renamed from: g */
    final Collection mo13944g() {
        return new kco(this);
    }

    /* renamed from: h */
    final Iterator mo13945h() {
        return new kbx(this);
    }

    /* renamed from: a */
    public Collection mo9924a(Object obj) {
        Collection collection = (Collection) this.f24899a.get(obj);
        if (collection == null) {
            collection = mo15066a();
        }
        return mo15067a(obj, collection);
    }

    /* renamed from: a */
    public boolean mo9925a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f24899a.get(obj);
        if (collection == null) {
            collection = mo15066a();
            if (collection.add(obj2)) {
                this.f24900b++;
                this.f24899a.put(obj, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f24900b++;
            return true;
        }
    }

    /* renamed from: a */
    final void mo15069a(Map map) {
        this.f24899a = map;
        this.f24900b = 0;
        for (Collection collection : map.values()) {
            jri.m13395a(collection.isEmpty() ^ 1);
            this.f24900b = collection.size() + this.f24900b;
        }
    }

    /* renamed from: i */
    public int mo9929i() {
        return this.f24900b;
    }

    /* renamed from: j */
    final Iterator mo13947j() {
        return new kbw(this);
    }

    /* renamed from: a */
    Collection mo15067a(Object obj, Collection collection) {
        return new kcf(this, obj, collection, null);
    }

    /* renamed from: a */
    final List mo15068a(Object obj, List list, kcf kcf) {
        if (list instanceof RandomAccess) {
            return new kce(this, obj, list, kcf);
        }
        return new kch(this, obj, list, kcf);
    }
}

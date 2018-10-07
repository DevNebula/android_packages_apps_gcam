package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ip */
public abstract class C0293ip {
    /* renamed from: a */
    public C0295ir f7629a;
    /* renamed from: b */
    public C0298iu f7630b;
    /* renamed from: c */
    private C0296is f7631c;

    C0293ip() {
    }

    /* renamed from: a */
    protected abstract int mo8693a(Object obj);

    /* renamed from: a */
    protected abstract Object mo8694a(int i, int i2);

    /* renamed from: a */
    protected abstract Object mo8695a(int i, Object obj);

    /* renamed from: a */
    protected abstract void mo8696a();

    /* renamed from: a */
    protected abstract void mo8697a(int i);

    /* renamed from: a */
    protected abstract void mo8698a(Object obj, Object obj2);

    /* renamed from: b */
    protected abstract int mo8700b(Object obj);

    /* renamed from: b */
    protected abstract Map mo8701b();

    /* renamed from: c */
    protected abstract int mo8703c();

    /* renamed from: a */
    public static boolean m4032a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: d */
    public final Set mo8704d() {
        if (this.f7631c == null) {
            this.f7631c = new C0296is(this);
        }
        return this.f7631c;
    }

    /* renamed from: a */
    public static boolean m4031a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public final Object[] mo8702b(int i) {
        int c = mo8703c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo8694a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public final Object[] mo8699a(Object[] objArr, int i) {
        Object[] objArr2;
        int c = mo8703c();
        if (objArr.length < c) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), c);
        } else {
            objArr2 = objArr;
        }
        for (int i2 = 0; i2 < c; i2++) {
            objArr2[i2] = mo8694a(i2, i);
        }
        if (objArr2.length > c) {
            objArr2[c] = null;
        }
        return objArr2;
    }
}

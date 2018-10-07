package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ken */
public abstract class ken extends keh implements List, RandomAccess {
    /* renamed from: a */
    private static final khz f21882a = new khz(kgh.f24928a, 0);

    ken() {
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    static ken m13714a(Object[] objArr) {
        return ken.m13716b(objArr, objArr.length);
    }

    /* renamed from: b */
    static ken m13716b(Object[] objArr, int i) {
        if (i != 0) {
            return new kgh(objArr, i);
        }
        return kgh.f24928a;
    }

    /* renamed from: a */
    public final ken mo9833a() {
        return this;
    }

    /* renamed from: d */
    public static keo m13718d() {
        return new keo();
    }

    /* renamed from: c */
    private static ken m13717c(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            khb.m4922a(objArr[i], i);
        }
        return ken.m13716b(objArr, objArr.length);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    int mo9832a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public static ken m13707a(Iterable iterable) {
        jri.m13404b((Object) iterable);
        if (iterable instanceof Collection) {
            return ken.m13713a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return kgh.f24928a;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return new keo().mo15104c(next).mo15103b(it).mo15102a();
        }
        return ken.m13708a(next);
    }

    /* renamed from: a */
    public static ken m13713a(Collection collection) {
        if (!(collection instanceof keh)) {
            return ken.m13717c(collection.toArray());
        }
        ken a = ((keh) collection).mo9833a();
        if (!a.mo9836b()) {
            return a;
        }
        Object[] toArray = a.toArray();
        return ken.m13716b(toArray, toArray.length);
    }

    /* renamed from: b */
    public static ken m13715b(Object[] objArr) {
        if (objArr.length != 0) {
            return ken.m13717c((Object[]) objArr.clone());
        }
        return kgh.f24928a;
    }

    public boolean equals(Object obj) {
        if (obj == jri.m13404b((Object) this)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        int i;
        if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
            for (i = 0; i < size; i++) {
                if (!kbf.m16778b(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        this = this;
        i = this.size();
        Iterator it = list.iterator();
        int i2 = 0;
        while (i2 < i) {
            if (!it.hasNext()) {
                return false;
            }
            Object obj2 = this.get(i2);
            i2++;
            if (!kbf.m16778b(obj2, it.next())) {
                return false;
            }
        }
        return it.hasNext() ^ 1;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (kbf.m16778b(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final khy mo9837c() {
        return listIterator(0);
    }

    public /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size;
        if (!(this instanceof RandomAccess)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (kbf.m16778b(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        } else if (obj == null) {
            for (size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
            return -1;
        } else {
            for (size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
            return -1;
        }
    }

    public /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: a */
    public final khz listIterator(int i) {
        jri.m13403b(i, size());
        if (isEmpty()) {
            return f21882a;
        }
        return new khz(this, i);
    }

    /* renamed from: e */
    public static ken m13719e() {
        return kgh.f24928a;
    }

    /* renamed from: a */
    public static ken m13708a(Object obj) {
        return ken.m13717c(obj);
    }

    /* renamed from: a */
    public static ken m13709a(Object obj, Object obj2) {
        return ken.m13717c(obj, obj2);
    }

    /* renamed from: a */
    public static ken m13710a(Object obj, Object obj2, Object obj3) {
        return ken.m13717c(obj, obj2, obj3);
    }

    /* renamed from: a */
    public static ken m13711a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ken.m13717c(obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    /* renamed from: a */
    public static ken m13712a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        boolean z;
        int length = objArr.length;
        if (length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "the total number of elements must fit in an int");
        Object obj13 = new Object[(length + 12)];
        obj13[0] = obj;
        obj13[1] = obj2;
        obj13[2] = obj3;
        obj13[3] = obj4;
        obj13[4] = obj5;
        obj13[5] = obj6;
        obj13[6] = obj7;
        obj13[7] = obj8;
        obj13[8] = obj9;
        obj13[9] = obj10;
        obj13[10] = obj11;
        obj13[11] = obj12;
        System.arraycopy(objArr, 0, obj13, 12, length);
        return ken.m13717c(obj13);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public ken mo13993f() {
        return size() > 1 ? new kep(this) : this;
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public ken subList(int i, int i2) {
        jri.m13394a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new ker(this, i, i3);
        }
        return kgh.f24928a;
    }

    Object writeReplace() {
        return new keq(toArray());
    }
}

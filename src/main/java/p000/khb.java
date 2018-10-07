package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: khb */
public class khb {
    /* renamed from: a */
    public Object[] f8651a;
    /* renamed from: b */
    public int f8652b;

    public khb() {
        this(4);
    }

    khb(int i) {
        this.f8651a = new Object[(i + i)];
        this.f8652b = 0;
    }

    /* renamed from: a */
    public static boolean m4938a(Collection collection, Iterator it) {
        jri.m13404b((Object) collection);
        jri.m13404b((Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public kes mo9981a() {
        return kgi.m13758a(this.f8652b, this.f8651a);
    }

    /* renamed from: a */
    static Object m4922a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("at index ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static void m4952b(Object obj, Object obj2) {
        String valueOf;
        StringBuilder stringBuilder;
        if (obj == null) {
            valueOf = String.valueOf(obj2);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("null key in entry: null=");
            stringBuilder.append(valueOf);
            throw new NullPointerException(stringBuilder.toString());
        } else if (obj2 == null) {
            valueOf = String.valueOf(obj);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("null value in entry: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("=null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static int m4919a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
        stringBuilder.append(str);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    static void m4936a(Iterator it) {
        jri.m13404b((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: a */
    static int m4918a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (1.0d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        highestOneBit += highestOneBit;
        if (highestOneBit <= 0) {
            return 1073741824;
        }
        return highestOneBit;
    }

    /* renamed from: a */
    public static kgu m4933a(Set set, Set set2) {
        jri.m13391a((Object) set, (Object) "set1");
        jri.m13391a((Object) set2, (Object) "set2");
        return new kgr(set, set2);
    }

    /* renamed from: b */
    static Iterator m4947b(Iterator it) {
        return new kfv(it);
    }

    /* renamed from: d */
    private final void m4962d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f8651a;
        int length = objArr.length;
        if (i2 > length) {
            this.f8651a = Arrays.copyOf(objArr, kej.m4861a(length, i2));
        }
    }

    /* renamed from: a */
    static boolean m4940a(Set set, Object obj) {
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

    /* renamed from: a */
    public static Object m4921a(Iterable iterable, int i) {
        int i2 = 0;
        jri.m13404b((Object) iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Object it = iterable.iterator();
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("position (");
            stringBuilder.append(i);
            stringBuilder.append(") must not be negative");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        boolean z;
        jri.m13404b(it);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder stringBuilder2 = new StringBuilder(91);
        stringBuilder2.append("position (");
        stringBuilder2.append(i);
        stringBuilder2.append(") must be less than the number of elements that remained (");
        stringBuilder2.append(i2);
        stringBuilder2.append(")");
        throw new IndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* renamed from: a */
    static int m4920a(Set set) {
        int i = 0;
        for (Object next : set) {
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            } else {
                hashCode = 0;
            }
            i = ((i + hashCode) ^ -1) ^ -1;
        }
        return i;
    }

    /* renamed from: b */
    public static kfu m4951b(Object obj, int i) {
        return new kfz(obj, i);
    }

    /* renamed from: c */
    public static Entry m4957c(Object obj, Object obj2) {
        return new kek(obj, obj2);
    }

    /* renamed from: a */
    public static keu m4932a(Enum enumR, Enum... enumArr) {
        return kel.m16829a(EnumSet.of(enumR, enumArr));
    }

    /* renamed from: b */
    public static keu m4950b(Iterable iterable) {
        if (iterable instanceof kel) {
            return (kel) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return kgn.f24941a;
            }
            return kel.m16829a(EnumSet.copyOf(collection));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return kgn.f24941a;
        }
        Collection of = EnumSet.of((Enum) it.next());
        khb.m4938a(of, it);
        return kel.m16829a(of);
    }

    /* renamed from: a */
    static Iterator m4926a(kft kft) {
        return new kga(kft, kft.mo9948g().iterator());
    }

    /* renamed from: a */
    public static NavigableMap m4928a(NavigableMap navigableMap, Object obj) {
        return new khg(navigableMap, obj);
    }

    /* renamed from: a */
    static NavigableSet m4930a(NavigableSet navigableSet, Object obj) {
        return new khh(navigableSet, obj);
    }

    /* renamed from: b */
    public static ArrayList m4945b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public static ArrayList m4955c(Iterable iterable) {
        jri.m13404b((Object) iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return khb.m4956c(iterable.iterator());
    }

    /* renamed from: c */
    public static ArrayList m4956c(Iterator it) {
        Collection b = khb.m4945b();
        khb.m4938a(b, it);
        return b;
    }

    @SafeVarargs
    /* renamed from: a */
    public static ArrayList m4924a(Object... objArr) {
        jri.m13404b((Object) objArr);
        int length = objArr.length;
        khb.m4919a(length, "arraySize");
        Object arrayList = new ArrayList(khx.m4994a(((long) (length / 10)) + (((long) length) + 5)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m4923a(int i) {
        khb.m4919a(i, "initialArraySize");
        return new ArrayList(i);
    }

    /* renamed from: c */
    public static ConcurrentMap m4958c() {
        return new ConcurrentHashMap();
    }

    /* renamed from: d */
    public static HashMap m4959d() {
        return new HashMap();
    }

    /* renamed from: e */
    public static HashSet m4963e() {
        return new HashSet();
    }

    /* renamed from: d */
    public static HashSet m4960d(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        Collection e = khb.m4963e();
        khb.m4938a(e, it);
        return e;
    }

    /* renamed from: b */
    public static HashSet m4946b(int i) {
        int i2;
        if (i < 3) {
            khb.m4919a(i, "expectedSize");
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : LfuScheduler.MAX_PRIORITY;
        }
        return new HashSet(i2);
    }

    /* renamed from: f */
    public static TreeSet m4965f() {
        return new TreeSet();
    }

    /* renamed from: a */
    public khb mo9983a(Object obj, Object obj2) {
        m4962d(this.f8652b + 1);
        khb.m4952b(obj, obj2);
        Object[] objArr = this.f8651a;
        int i = this.f8652b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f8652b = i + 1;
        return this;
    }

    /* renamed from: a */
    public khb mo9984a(Entry entry) {
        return mo9983a(entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    public khb mo9982a(Iterable iterable) {
        if (iterable instanceof Collection) {
            m4962d(((Collection) iterable).size() + this.f8652b);
        }
        for (Entry a : iterable) {
            mo9984a(a);
        }
        return this;
    }

    /* renamed from: a */
    static boolean m4941a(Set set, Collection collection) {
        Object collection2;
        jri.m13404b((Object) collection2);
        if (collection2 instanceof kft) {
            collection2 = ((kft) collection2).mo9946e();
        }
        if (!(collection2 instanceof Set) || collection2.size() <= set.size()) {
            return khb.m4942a(set, collection2.iterator());
        }
        Iterator it = set.iterator();
        jri.m13404b(collection2);
        boolean z = false;
        while (it.hasNext()) {
            if (collection2.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    static boolean m4942a(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static List m4927a(List list) {
        if (list instanceof ken) {
            return ((ken) list).mo13993f();
        }
        if (list instanceof kff) {
            return ((kff) list).f8631a;
        }
        if (list instanceof RandomAccess) {
            return new kfe(list);
        }
        return new kff(list);
    }

    /* renamed from: a */
    static boolean m4937a(Collection collection, Object obj) {
        jri.m13404b((Object) collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return false;
    }

    /* renamed from: a */
    static boolean m4939a(Map map, Object obj) {
        jri.m13404b((Object) map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return false;
    }

    /* renamed from: b */
    static Object m4944b(Map map, Object obj) {
        jri.m13404b((Object) map);
        try {
            return map.get(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return null;
    }

    /* renamed from: c */
    static Object m4954c(Map map, Object obj) {
        jri.m13404b((Object) map);
        try {
            return map.remove(obj);
        } catch (ClassCastException e) {
        } catch (NullPointerException e2) {
        }
        return null;
    }

    /* renamed from: b */
    static Set m4948b(Set set, Object obj) {
        return new khj(set, obj);
    }

    /* renamed from: a */
    public static khy m4935a(Object obj) {
        return new kfc(obj);
    }

    /* renamed from: c */
    static int m4953c(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m4943b(Object obj) {
        return khb.m4953c(obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: a */
    static SortedMap m4931a(SortedMap sortedMap, Object obj) {
        return new khk(sortedMap, obj);
    }

    /* renamed from: a */
    public static Iterator m4925a(Iterator it, kaw kaw) {
        jri.m13404b((Object) kaw);
        return new kfb(it, kaw);
    }

    /* renamed from: b */
    public static kes m4949b(Iterator it, kaw kaw) {
        jri.m13404b((Object) kaw);
        khb e = kes.m4869e();
        while (it.hasNext()) {
            Object next = it.next();
            e.mo9983a(kaw.mo9689a(next), next);
        }
        try {
            return e.mo9981a();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.valueOf(e2.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    /* renamed from: d */
    public static khy m4961d(Iterator it) {
        jri.m13404b((Object) it);
        if (it instanceof khy) {
            return (khy) it;
        }
        return new kez(it);
    }

    /* renamed from: a */
    public static NavigableSet m4929a(NavigableSet navigableSet) {
        return ((navigableSet instanceof keh) || (navigableSet instanceof kgv)) ? navigableSet : new kgv(navigableSet);
    }

    /* renamed from: a */
    public static kgx m4934a(kgx kgx) {
        return new kia((kgx) jri.m13404b((Object) kgx));
    }

    /* renamed from: e */
    static Iterator m4964e(Iterator it) {
        return new kfm(it);
    }
}

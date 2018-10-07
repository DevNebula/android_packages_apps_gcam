package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ij */
public final class C0288ij implements Collection, Set {
    /* renamed from: c */
    private static final int[] f7378c = new int[0];
    /* renamed from: d */
    private static final Object[] f7379d = new Object[0];
    /* renamed from: e */
    private static Object[] f7380e;
    /* renamed from: f */
    private static int f7381f;
    /* renamed from: g */
    private static Object[] f7382g;
    /* renamed from: h */
    private static int f7383h;
    /* renamed from: a */
    public Object[] f7384a;
    /* renamed from: b */
    public int f7385b;
    /* renamed from: i */
    private int[] f7386i;
    /* renamed from: j */
    private C0293ip f7387j;

    public C0288ij() {
        this((byte) 0);
    }

    private C0288ij(byte b) {
        this.f7386i = f7378c;
        this.f7384a = f7379d;
        this.f7385b = 0;
    }

    public final boolean add(Object obj) {
        int a;
        int i;
        int i2 = 8;
        if (obj == null) {
            a = m3822a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m3823a(obj, i);
        }
        if (a >= 0) {
            return false;
        }
        Object obj2;
        Object obj3;
        a ^= -1;
        int i3 = this.f7385b;
        Object obj4 = this.f7386i;
        int length = obj4.length;
        if (i3 >= length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            obj2 = this.f7384a;
            m3825b(i2);
            obj3 = this.f7386i;
            if (obj3.length > 0) {
                System.arraycopy(obj4, 0, obj3, 0, length);
                System.arraycopy(obj2, 0, this.f7384a, 0, obj2.length);
            }
            C0288ij.m3824a(obj4, obj2, this.f7385b);
        }
        i2 = this.f7385b;
        if (a < i2) {
            obj2 = this.f7386i;
            int i4 = a + 1;
            System.arraycopy(obj2, a, obj2, i4, i2 - a);
            obj3 = this.f7384a;
            System.arraycopy(obj3, a, obj3, i4, this.f7385b - a);
        }
        this.f7386i[a] = i;
        this.f7384a[a] = obj;
        this.f7385b++;
        return true;
    }

    public final boolean addAll(Collection collection) {
        boolean z = false;
        int size = this.f7385b + collection.size();
        Object obj = this.f7386i;
        if (obj.length < size) {
            Object obj2 = this.f7384a;
            m3825b(size);
            size = this.f7385b;
            if (size > 0) {
                System.arraycopy(obj, 0, this.f7386i, 0, size);
                System.arraycopy(obj2, 0, this.f7384a, 0, this.f7385b);
            }
            C0288ij.m3824a(obj, obj2, this.f7385b);
        }
        for (Object obj3 : collection) {
            z |= add(obj3);
        }
        return z;
    }

    /* renamed from: b */
    private final void m3825b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0288ij.class) {
                if (f7382g != null) {
                    objArr = f7382g;
                    this.f7384a = objArr;
                    f7382g = (Object[]) objArr[0];
                    this.f7386i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7383h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0288ij.class) {
                if (f7380e != null) {
                    objArr = f7380e;
                    this.f7384a = objArr;
                    f7380e = (Object[]) objArr[0];
                    this.f7386i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7381f--;
                    return;
                }
            }
        }
        this.f7386i = new int[i];
        this.f7384a = new Object[i];
    }

    public final void clear() {
        int i = this.f7385b;
        if (i != 0) {
            C0288ij.m3824a(this.f7386i, this.f7384a, i);
            this.f7386i = f7378c;
            this.f7384a = f7379d;
            this.f7385b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return mo8526a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f7385b) {
            try {
                if (!set.contains(this.f7384a[i])) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m3824a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (C0288ij.class) {
                if (f7383h < 10) {
                    objArr[0] = f7382g;
                    objArr[1] = iArr;
                    for (length = i - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7382g = objArr;
                    f7383h++;
                }
            }
        } else if (length == 4) {
            synchronized (C0288ij.class) {
                if (f7381f < 10) {
                    objArr[0] = f7380e;
                    objArr[1] = iArr;
                    for (length = i - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7380e = objArr;
                    f7381f++;
                }
            }
        }
    }

    public final int hashCode() {
        int i = 0;
        int[] iArr = this.f7386i;
        int i2 = 0;
        while (i < this.f7385b) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo8526a(Object obj) {
        return obj != null ? m3823a(obj, obj.hashCode()) : m3822a();
    }

    /* renamed from: a */
    private final int m3823a(Object obj, int i) {
        int i2 = this.f7385b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0289il.m3867a(this.f7386i, i2, i);
        if (a < 0 || obj.equals(this.f7384a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f7386i[i3] == i) {
            if (obj.equals(this.f7384a[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f7386i[a] == i) {
            if (obj.equals(this.f7384a[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private final int m3822a() {
        int i = this.f7385b;
        if (i == 0) {
            return -1;
        }
        int a = C0289il.m3867a(this.f7386i, i, 0);
        if (a < 0 || this.f7384a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f7386i[i2] == 0) {
            if (this.f7384a[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f7386i[a] == 0) {
            if (this.f7384a[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    public final boolean isEmpty() {
        return this.f7385b <= 0;
    }

    public final Iterator iterator() {
        if (this.f7387j == null) {
            this.f7387j = new C0693ik(this);
        }
        return this.f7387j.mo8704d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = mo8526a(obj);
        if (a < 0) {
            return false;
        }
        mo8527a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    /* renamed from: a */
    public final Object mo8527a(int i) {
        int i2 = 8;
        Object obj = this.f7384a;
        Object obj2 = obj[i];
        int i3 = this.f7385b;
        if (i3 <= 1) {
            C0288ij.m3824a(this.f7386i, obj, i3);
            this.f7386i = f7378c;
            this.f7384a = f7379d;
            this.f7385b = 0;
        } else {
            Object obj3 = this.f7386i;
            int length = obj3.length;
            if (length <= 8 || i3 >= length / 3) {
                this.f7385b = i3 - 1;
                i2 = this.f7385b;
                if (i < i2) {
                    int i4 = i + 1;
                    System.arraycopy(obj3, i4, obj3, i, i2 - i);
                    Object obj4 = this.f7384a;
                    System.arraycopy(obj4, i4, obj4, i, this.f7385b - i);
                }
                this.f7384a[this.f7385b] = null;
            } else {
                if (i3 > 8) {
                    i2 = (i3 >> 1) + i3;
                }
                m3825b(i2);
                this.f7385b--;
                if (i > 0) {
                    System.arraycopy(obj3, 0, this.f7386i, 0, i);
                    System.arraycopy(obj, 0, this.f7384a, 0, i);
                }
                i2 = this.f7385b;
                if (i < i2) {
                    i3 = i + 1;
                    System.arraycopy(obj3, i3, this.f7386i, i, i2 - i);
                    System.arraycopy(obj, i3, this.f7384a, i, this.f7385b - i);
                }
            }
        }
        return obj2;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f7385b - 1; i >= 0; i--) {
            if (!collection.contains(this.f7384a[i])) {
                mo8527a(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f7385b;
    }

    public final Object[] toArray() {
        int i = this.f7385b;
        Object obj = new Object[i];
        System.arraycopy(this.f7384a, 0, obj, 0, i);
        return obj;
    }

    public final Object[] toArray(Object[] objArr) {
        Object obj;
        if (objArr.length < this.f7385b) {
            obj = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f7385b);
        } else {
            obj = objArr;
        }
        System.arraycopy(this.f7384a, 0, obj, 0, this.f7385b);
        int length = obj.length;
        int i = this.f7385b;
        if (length > i) {
            obj[i] = null;
        }
        return obj;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7385b * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7385b; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0288ij c0288ij = this.f7384a[i];
            if (c0288ij != this) {
                stringBuilder.append(c0288ij);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

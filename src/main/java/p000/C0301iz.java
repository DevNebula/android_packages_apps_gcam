package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iz */
public class C0301iz {
    /* renamed from: c */
    private static Object[] f7939c;
    /* renamed from: d */
    private static int f7940d;
    /* renamed from: e */
    private static Object[] f7941e;
    /* renamed from: f */
    private static int f7942f;
    /* renamed from: a */
    public Object[] f7943a;
    /* renamed from: b */
    public int f7944b;
    /* renamed from: g */
    private int[] f7945g;

    public C0301iz() {
        this.f7945g = C0289il.f7438a;
        this.f7943a = C0289il.f7439b;
        this.f7944b = 0;
    }

    public C0301iz(int i) {
        if (i == 0) {
            this.f7945g = C0289il.f7438a;
            this.f7943a = C0289il.f7439b;
        } else {
            m4409e(i);
        }
        this.f7944b = 0;
    }

    public C0301iz(C0301iz c0301iz) {
        this();
        if (c0301iz != null) {
            mo9193a(c0301iz);
        }
    }

    /* renamed from: e */
    private final void m4409e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0691ih.class) {
                if (f7941e != null) {
                    objArr = f7941e;
                    this.f7943a = objArr;
                    f7941e = (Object[]) objArr[0];
                    this.f7945g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7942f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0691ih.class) {
                if (f7939c != null) {
                    objArr = f7939c;
                    this.f7943a = objArr;
                    f7939c = (Object[]) objArr[0];
                    this.f7945g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7940d--;
                    return;
                }
            }
        }
        this.f7945g = new int[i];
        this.f7943a = new Object[(i + i)];
    }

    /* renamed from: a */
    private static int m4407a(int[] iArr, int i, int i2) {
        try {
            return C0289il.m3867a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f7944b;
        if (i > 0) {
            int[] iArr = this.f7945g;
            Object[] objArr = this.f7943a;
            this.f7945g = C0289il.f7438a;
            this.f7943a = C0289il.f7439b;
            this.f7944b = 0;
            C0301iz.m4408a(iArr, objArr, i);
        }
        if (this.f7944b > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo9190a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo9194b(obj) >= 0;
    }

    /* renamed from: a */
    public final void mo9192a(int i) {
        int i2 = this.f7944b;
        int[] iArr = this.f7945g;
        if (iArr.length < i) {
            Object[] objArr = this.f7943a;
            m4409e(i);
            if (this.f7944b > 0) {
                System.arraycopy(iArr, 0, this.f7945g, 0, i2);
                System.arraycopy(objArr, 0, this.f7943a, 0, i2 + i2);
            }
            C0301iz.m4408a(iArr, objArr, i2);
        }
        if (this.f7944b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object d;
        Object obj2;
        if (obj instanceof C0301iz) {
            C0301iz c0301iz = (C0301iz) obj;
            if (size() != c0301iz.size()) {
                return false;
            }
            i = 0;
            while (i < this.f7944b) {
                try {
                    b = mo9195b(i);
                    d = mo9200d(i);
                    obj2 = c0301iz.get(b);
                    if (d == null) {
                        if (obj2 != null || !c0301iz.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f7944b) {
                try {
                    b = mo9195b(i);
                    d = mo9200d(i);
                    obj2 = map.get(b);
                    if (d == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static void m4408a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (C0691ih.class) {
                if (f7942f < 10) {
                    objArr[0] = f7941e;
                    objArr[1] = iArr;
                    for (length = (i + i) - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7941e = objArr;
                    f7942f++;
                }
            }
        } else if (length == 4) {
            synchronized (C0691ih.class) {
                if (f7940d < 10) {
                    objArr[0] = f7939c;
                    objArr[1] = iArr;
                    for (length = (i + i) - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7939c = objArr;
                    f7940d++;
                }
            }
        }
    }

    public Object get(Object obj) {
        int a = mo9190a(obj);
        return a >= 0 ? this.f7943a[(a + a) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f7945g;
        Object[] objArr = this.f7943a;
        int i = this.f7944b;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int hashCode;
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj != null) {
                hashCode = obj.hashCode();
            } else {
                hashCode = 0;
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: a */
    private final int m4406a(Object obj, int i) {
        int i2 = this.f7944b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0301iz.m4407a(this.f7945g, i2, i);
        if (a < 0 || obj.equals(this.f7943a[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f7945g[i3] == i) {
            if (obj.equals(this.f7943a[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f7945g[a] == i) {
            if (obj.equals(this.f7943a[a + a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public final int mo9190a(Object obj) {
        return obj != null ? m4406a(obj, obj.hashCode()) : m4405a();
    }

    /* renamed from: a */
    private final int m4405a() {
        int i = this.f7944b;
        if (i == 0) {
            return -1;
        }
        int a = C0301iz.m4407a(this.f7945g, i, 0);
        if (a < 0 || this.f7943a[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f7945g[i2] == 0) {
            if (this.f7943a[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f7945g[a] == 0) {
            if (this.f7943a[a + a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: b */
    final int mo9194b(Object obj) {
        int i = 1;
        int i2 = this.f7944b;
        i2 += i2;
        Object[] objArr = this.f7943a;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f7944b <= 0;
    }

    /* renamed from: b */
    public final Object mo9195b(int i) {
        return this.f7943a[i + i];
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = 8;
        int i3 = this.f7944b;
        if (obj == null) {
            a = m4405a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m4406a(obj, i);
        }
        int i4;
        Object obj3;
        if (a >= 0) {
            i4 = (a + a) + 1;
            Object[] objArr = this.f7943a;
            obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        Object[] objArr2;
        a ^= -1;
        int[] iArr = this.f7945g;
        int length = iArr.length;
        if (i3 >= length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            objArr2 = this.f7943a;
            m4409e(i2);
            if (i3 != this.f7944b) {
                throw new ConcurrentModificationException();
            }
            obj3 = this.f7945g;
            if (obj3.length > 0) {
                System.arraycopy(iArr, 0, obj3, 0, length);
                System.arraycopy(objArr2, 0, this.f7943a, 0, objArr2.length);
            }
            C0301iz.m4408a(iArr, objArr2, i3);
        }
        if (a < i3) {
            obj3 = this.f7945g;
            i4 = a + 1;
            System.arraycopy(obj3, a, obj3, i4, i3 - a);
            obj3 = this.f7943a;
            int i5 = this.f7944b - a;
            System.arraycopy(obj3, a + a, obj3, i4 + i4, i5 + i5);
        }
        i2 = this.f7944b;
        if (i3 == i2) {
            int[] iArr2 = this.f7945g;
            if (a < iArr2.length) {
                iArr2[a] = i;
                objArr2 = this.f7943a;
                a += a;
                objArr2[a] = obj;
                objArr2[a + 1] = obj2;
                this.f7944b = i2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    public void mo9193a(C0301iz c0301iz) {
        int i = 0;
        int i2 = c0301iz.f7944b;
        mo9192a(this.f7944b + i2);
        if (this.f7944b != 0) {
            while (i < i2) {
                put(c0301iz.mo9195b(i), c0301iz.mo9200d(i));
                i++;
            }
        } else if (i2 > 0) {
            System.arraycopy(c0301iz.f7945g, 0, this.f7945g, 0, i2);
            System.arraycopy(c0301iz.f7943a, 0, this.f7943a, 0, i2 + i2);
            this.f7944b = i2;
        }
    }

    public Object remove(Object obj) {
        int a = mo9190a(obj);
        return a >= 0 ? mo9196c(a) : null;
    }

    /* renamed from: c */
    public Object mo9196c(int i) {
        int i2 = 8;
        Object[] objArr = this.f7943a;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        int i4 = this.f7944b;
        if (i4 <= 1) {
            C0301iz.m4408a(this.f7945g, objArr, i4);
            this.f7945g = C0289il.f7438a;
            this.f7943a = C0289il.f7439b;
            i2 = 0;
        } else {
            int i5 = i4 - 1;
            Object obj2 = this.f7945g;
            int length = obj2.length;
            int i6;
            if (length <= 8 || i4 >= length / 3) {
                if (i < i5) {
                    i2 = i + 1;
                    i6 = i5 - i;
                    System.arraycopy(obj2, i2, obj2, i, i6);
                    Object obj3 = this.f7943a;
                    System.arraycopy(obj3, i2 + i2, obj3, i3, i6 + i6);
                }
                Object[] objArr2 = this.f7943a;
                i6 = i5 + i5;
                objArr2[i6] = null;
                objArr2[i6 + 1] = null;
                i2 = i5;
            } else {
                if (i4 > 8) {
                    i2 = (i4 >> 1) + i4;
                }
                m4409e(i2);
                if (i4 != this.f7944b) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(obj2, 0, this.f7945g, 0, i);
                    System.arraycopy(objArr, 0, this.f7943a, 0, i3);
                }
                if (i < i5) {
                    i2 = i + 1;
                    i6 = i5 - i;
                    System.arraycopy(obj2, i2, this.f7945g, i, i6);
                    System.arraycopy(objArr, i2 + i2, this.f7943a, i3, i6 + i6);
                    i2 = i5;
                } else {
                    i2 = i5;
                }
            }
        }
        if (i4 != this.f7944b) {
            throw new ConcurrentModificationException();
        }
        this.f7944b = i2;
        return obj;
    }

    /* renamed from: a */
    public Object mo9191a(int i, Object obj) {
        int i2 = (i + i) + 1;
        Object[] objArr = this.f7943a;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public int size() {
        return this.f7944b;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7944b * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7944b; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0301iz b = mo9195b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = mo9200d(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public final Object mo9200d(int i) {
        return this.f7943a[(i + i) + 1];
    }
}

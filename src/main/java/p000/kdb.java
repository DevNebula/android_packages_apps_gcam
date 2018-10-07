package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kdb */
final class kdb extends AbstractMap implements Serializable {
    /* renamed from: a */
    public transient long[] f8580a;
    /* renamed from: b */
    public transient Object[] f8581b;
    /* renamed from: c */
    public transient Object[] f8582c;
    /* renamed from: d */
    public transient int f8583d;
    /* renamed from: e */
    public transient int f8584e;
    /* renamed from: f */
    private transient int[] f8585f;
    /* renamed from: g */
    private transient float f8586g;
    /* renamed from: h */
    private transient int f8587h;
    /* renamed from: i */
    private transient Set f8588i;
    /* renamed from: j */
    private transient Set f8589j;
    /* renamed from: k */
    private transient Collection f8590k;

    kdb() {
        m4834a(3);
    }

    kdb(int i) {
        this(12, (byte) 0);
    }

    private kdb(int i, byte b) {
        m4834a(i);
    }

    public final void clear() {
        this.f8583d++;
        Arrays.fill(this.f8581b, 0, this.f8584e, null);
        Arrays.fill(this.f8582c, 0, this.f8584e, null);
        Arrays.fill(this.f8585f, -1);
        Arrays.fill(this.f8580a, -1);
        this.f8584e = 0;
    }

    public final boolean containsKey(Object obj) {
        return mo9768a(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        for (int i = 0; i < this.f8584e; i++) {
            if (kbf.m16778b(obj, this.f8582c[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f8589j;
        if (set != null) {
            return set;
        }
        set = new kdf(this);
        this.f8589j = set;
        return set;
    }

    public final Object get(Object obj) {
        int a = mo9768a(obj);
        return a != -1 ? this.f8582c[a] : null;
    }

    /* renamed from: a */
    final int mo9768a(Object obj) {
        int b = khb.m4943b(obj);
        int[] iArr = this.f8585f;
        int i = iArr[(iArr.length - 1) & b];
        while (i != -1) {
            long j = this.f8580a[i];
            if (((int) (j >>> 32)) == b && kbf.m16778b(obj, this.f8581b[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* renamed from: a */
    private final void m4834a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Initial capacity must be non-negative");
        jri.m13396a(true, (Object) "Illegal load factor");
        int a = khb.m4918a(i, 1.0d);
        this.f8585f = kdb.m4835b(a);
        this.f8586g = 1.0f;
        this.f8581b = new Object[i];
        this.f8582c = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f8580a = jArr;
        this.f8587h = Math.max(1, (int) ((float) a));
    }

    public final boolean isEmpty() {
        return this.f8584e == 0;
    }

    public final Set keySet() {
        Set set = this.f8588i;
        if (set != null) {
            return set;
        }
        set = new kdh(this);
        this.f8588i = set;
        return set;
    }

    /* renamed from: b */
    private static int[] m4835b(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        long[] jArr = this.f8580a;
        Object[] objArr = this.f8581b;
        Object[] objArr2 = this.f8582c;
        int b = khb.m4943b(obj);
        int[] iArr = this.f8585f;
        int length = b & (iArr.length - 1);
        int i2 = this.f8584e;
        int i3 = iArr[length];
        if (i3 == -1) {
            iArr[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) == b && kbf.m16778b(obj, objArr[i3])) {
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = obj2;
                    return obj3;
                }
                i = (int) j;
                if (i == -1) {
                    jArr[i3] = kdb.m4833a(j, i2);
                    break;
                }
                i3 = i;
            }
        }
        if (i2 == LfuScheduler.MAX_PRIORITY) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        i = i2 + 1;
        int length2 = this.f8580a.length;
        if (i > length2) {
            i3 = Math.max(1, length2 >>> 1) + length2;
            if (i3 < 0) {
                i3 = LfuScheduler.MAX_PRIORITY;
            }
            if (i3 != length2) {
                this.f8581b = Arrays.copyOf(this.f8581b, i3);
                this.f8582c = Arrays.copyOf(this.f8582c, i3);
                jArr = this.f8580a;
                int length3 = jArr.length;
                jArr = Arrays.copyOf(jArr, i3);
                if (i3 > length3) {
                    Arrays.fill(jArr, length3, i3, -1);
                }
                this.f8580a = jArr;
            }
        }
        this.f8580a[i2] = (((long) b) << 32) | 4294967295L;
        this.f8581b[i2] = obj;
        this.f8582c[i2] = obj2;
        this.f8584e = i;
        if (i2 >= this.f8587h) {
            i3 = this.f8585f.length;
            i = i3 + i3;
            if (i3 >= 1073741824) {
                this.f8587h = LfuScheduler.MAX_PRIORITY;
            } else {
                length2 = ((int) (((float) i) * this.f8586g)) + 1;
                iArr = kdb.m4835b(i);
                long[] jArr2 = this.f8580a;
                int length4 = iArr.length - 1;
                for (i3 = 0; i3 < this.f8584e; i3++) {
                    b = (int) (jArr2[i3] >>> 32);
                    length = b & length4;
                    i2 = iArr[length];
                    iArr[length] = i3;
                    jArr2[i3] = (((long) i2) & 4294967295L) | (((long) b) << 32);
                }
                this.f8587h = length2;
                this.f8585f = iArr;
            }
        }
        this.f8583d++;
        return null;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        m4834a(3);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    public final Object remove(Object obj) {
        return mo9769a(obj, khb.m4943b(obj));
    }

    /* renamed from: a */
    final Object mo9769a(Object obj, int i) {
        int[] iArr = this.f8585f;
        int length = i & (iArr.length - 1);
        int i2 = iArr[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f8580a[i2] >>> 32)) == i && kbf.m16778b(obj, this.f8581b[i2])) {
                Object obj2 = this.f8582c[i2];
                if (i3 == -1) {
                    this.f8585f[length] = (int) this.f8580a[i2];
                } else {
                    long[] jArr = this.f8580a;
                    jArr[i3] = kdb.m4833a(jArr[i3], (int) jArr[i2]);
                }
                int size = size() - 1;
                if (i2 < size) {
                    Object[] objArr = this.f8581b;
                    objArr[i2] = objArr[size];
                    Object[] objArr2 = this.f8582c;
                    objArr2[i2] = objArr2[size];
                    objArr[size] = null;
                    objArr2[size] = null;
                    long[] jArr2 = this.f8580a;
                    long j = jArr2[size];
                    jArr2[i2] = j;
                    jArr2[size] = -1;
                    int[] iArr2 = this.f8585f;
                    int length2 = (iArr2.length - 1) & ((int) (j >>> 32));
                    i3 = iArr2[length2];
                    if (i3 == size) {
                        iArr2[length2] = i2;
                    } else {
                        long[] jArr3;
                        while (true) {
                            jArr3 = this.f8580a;
                            j = jArr3[i3];
                            length = (int) j;
                            if (length == size) {
                                break;
                            }
                            i3 = length;
                        }
                        jArr3[i3] = kdb.m4833a(j, i2);
                    }
                } else {
                    this.f8581b[i2] = null;
                    this.f8582c[i2] = null;
                    this.f8580a[i2] = -1;
                }
                this.f8584e--;
                this.f8583d++;
                return obj2;
            }
            i3 = (int) this.f8580a[i2];
            if (i3 == -1) {
                return null;
            }
            int i4 = i2;
            i2 = i3;
            i3 = i4;
        }
    }

    public final int size() {
        return this.f8584e;
    }

    /* renamed from: a */
    private static long m4833a(long j, int i) {
        return (-4294967296L & j) | (((long) i) & 4294967295L);
    }

    public final Collection values() {
        Collection collection = this.f8590k;
        if (collection != null) {
            return collection;
        }
        collection = new kdj(this);
        this.f8590k = collection;
        return collection;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f8584e);
        for (int i = 0; i < this.f8584e; i++) {
            objectOutputStream.writeObject(this.f8581b[i]);
            objectOutputStream.writeObject(this.f8582c[i]);
        }
    }
}

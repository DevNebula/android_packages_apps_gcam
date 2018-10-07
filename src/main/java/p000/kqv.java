package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kqv */
final class kqv extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private boolean[] f25358b;
    /* renamed from: c */
    private int f25359c;

    static {
        new kqv().f21952a = false;
    }

    kqv() {
        this(new boolean[10], 0);
    }

    private kqv(boolean[] zArr, int i) {
        this.f25358b = zArr;
        this.f25359c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16971a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection collection) {
        mo14139a();
        ksd.m5192a((Object) collection);
        if (!(collection instanceof kqv)) {
            return super.addAll(collection);
        }
        kqv kqv = (kqv) collection;
        int i = kqv.f25359c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25359c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        boolean[] zArr = this.f25358b;
        if (i > zArr.length) {
            this.f25358b = Arrays.copyOf(zArr, i);
        }
        System.arraycopy(kqv.f25358b, 0, this.f25358b, this.f25359c, kqv.f25359c);
        this.f25359c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    private final void m16971a(int i, boolean z) {
        mo14139a();
        if (i >= 0) {
            int i2 = this.f25359c;
            if (i <= i2) {
                Object obj = this.f25358b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f25358b, i, obj2, i + 1, this.f25359c - i);
                    this.f25358b = obj2;
                }
                this.f25358b[i] = z;
                this.f25359c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16973c(i));
    }

    /* renamed from: a */
    public final void mo15160a(boolean z) {
        m16971a(this.f25359c, z);
    }

    /* renamed from: b */
    private final void m16972b(int i) {
        if (i < 0 || i >= this.f25359c) {
            throw new IndexOutOfBoundsException(m16973c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqv)) {
            return super.equals(obj);
        }
        kqv kqv = (kqv) obj;
        if (this.f25359c != kqv.f25359c) {
            return false;
        }
        boolean[] zArr = kqv.f25358b;
        for (int i = 0; i < this.f25359c; i++) {
            if (this.f25358b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16972b(i);
        return Boolean.valueOf(this.f25358b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25359c; i2++) {
            i = (i * 31) + ksd.m5190a(this.f25358b[i2]);
        }
        return i;
    }

    /* renamed from: c */
    private final String m16973c(int i) {
        int i2 = this.f25359c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final boolean remove(Object obj) {
        mo14139a();
        for (int i = 0; i < this.f25359c; i++) {
            if (obj.equals(Boolean.valueOf(this.f25358b[i]))) {
                Object obj2 = this.f25358b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f25359c - i);
                this.f25359c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    protected final void removeRange(int i, int i2) {
        mo14139a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        Object obj = this.f25358b;
        System.arraycopy(obj, i2, obj, i, this.f25359c - i2);
        this.f25359c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14139a();
        m16972b(i);
        boolean[] zArr = this.f25358b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f25359c;
    }
}

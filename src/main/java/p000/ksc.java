package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ksc */
final class ksc extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private int[] f25368b;
    /* renamed from: c */
    private int f25369c;

    static {
        new ksc().f21952a = false;
    }

    ksc() {
        this(new int[10], 0);
    }

    private ksc(int[] iArr, int i) {
        this.f25368b = iArr;
        this.f25369c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m17020a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection collection) {
        mo14139a();
        ksd.m5192a((Object) collection);
        if (!(collection instanceof ksc)) {
            return super.addAll(collection);
        }
        ksc ksc = (ksc) collection;
        int i = ksc.f25369c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25369c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        int[] iArr = this.f25368b;
        if (i > iArr.length) {
            this.f25368b = Arrays.copyOf(iArr, i);
        }
        System.arraycopy(ksc.f25368b, 0, this.f25368b, this.f25369c, ksc.f25369c);
        this.f25369c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final void mo15173b(int i) {
        m17020a(this.f25369c, i);
    }

    /* renamed from: a */
    private final void m17020a(int i, int i2) {
        mo14139a();
        if (i >= 0) {
            int i3 = this.f25369c;
            if (i <= i3) {
                Object obj = this.f25368b;
                if (i3 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i3 - i);
                } else {
                    Object obj2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f25368b, i, obj2, i + 1, this.f25369c - i);
                    this.f25368b = obj2;
                }
                this.f25368b[i] = i2;
                this.f25369c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17022e(i));
    }

    /* renamed from: d */
    private final void m17021d(int i) {
        if (i < 0 || i >= this.f25369c) {
            throw new IndexOutOfBoundsException(m17022e(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksc)) {
            return super.equals(obj);
        }
        ksc ksc = (ksc) obj;
        if (this.f25369c != ksc.f25369c) {
            return false;
        }
        int[] iArr = ksc.f25368b;
        for (int i = 0; i < this.f25369c; i++) {
            if (this.f25368b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo15174c(i));
    }

    /* renamed from: c */
    public final int mo15174c(int i) {
        m17021d(i);
        return this.f25368b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25369c; i2++) {
            i = (i * 31) + this.f25368b[i2];
        }
        return i;
    }

    /* renamed from: e */
    private final String m17022e(int i) {
        int i2 = this.f25369c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo10279a(int i) {
        if (i >= this.f25369c) {
            return new ksc(Arrays.copyOf(this.f25368b, i), this.f25369c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean remove(Object obj) {
        mo14139a();
        for (int i = 0; i < this.f25369c; i++) {
            if (obj.equals(Integer.valueOf(this.f25368b[i]))) {
                Object obj2 = this.f25368b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f25369c - i);
                this.f25369c--;
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
        Object obj = this.f25368b;
        System.arraycopy(obj, i2, obj, i, this.f25369c - i2);
        this.f25369c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo14139a();
        m17021d(i);
        int[] iArr = this.f25368b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f25369c;
    }
}

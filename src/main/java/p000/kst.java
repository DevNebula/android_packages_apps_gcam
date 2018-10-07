package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kst */
final class kst extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private long[] f25371b;
    /* renamed from: c */
    private int f25372c;

    static {
        new kst().f21952a = false;
    }

    kst() {
        this(new long[10], 0);
    }

    private kst(long[] jArr, int i) {
        this.f25371b = jArr;
        this.f25372c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m17033a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection collection) {
        mo14139a();
        ksd.m5192a((Object) collection);
        if (!(collection instanceof kst)) {
            return super.addAll(collection);
        }
        kst kst = (kst) collection;
        int i = kst.f25372c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25372c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        long[] jArr = this.f25371b;
        if (i > jArr.length) {
            this.f25371b = Arrays.copyOf(jArr, i);
        }
        System.arraycopy(kst.f25371b, 0, this.f25371b, this.f25372c, kst.f25372c);
        this.f25372c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    private final void m17033a(int i, long j) {
        mo14139a();
        if (i >= 0) {
            int i2 = this.f25372c;
            if (i <= i2) {
                Object obj = this.f25371b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f25371b, i, obj2, i + 1, this.f25372c - i);
                    this.f25371b = obj2;
                }
                this.f25371b[i] = j;
                this.f25372c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17035d(i));
    }

    /* renamed from: a */
    public final void mo15180a(long j) {
        m17033a(this.f25372c, j);
    }

    /* renamed from: c */
    private final void m17034c(int i) {
        if (i < 0 || i >= this.f25372c) {
            throw new IndexOutOfBoundsException(m17035d(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kst)) {
            return super.equals(obj);
        }
        kst kst = (kst) obj;
        if (this.f25372c != kst.f25372c) {
            return false;
        }
        long[] jArr = kst.f25371b;
        for (int i = 0; i < this.f25372c; i++) {
            if (this.f25371b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo15181b(i));
    }

    /* renamed from: b */
    public final long mo15181b(int i) {
        m17034c(i);
        return this.f25371b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25372c; i2++) {
            i = (i * 31) + ksd.m5189a(this.f25371b[i2]);
        }
        return i;
    }

    /* renamed from: d */
    private final String m17035d(int i) {
        int i2 = this.f25372c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final boolean remove(Object obj) {
        mo14139a();
        for (int i = 0; i < this.f25372c; i++) {
            if (obj.equals(Long.valueOf(this.f25371b[i]))) {
                Object obj2 = this.f25371b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f25372c - i);
                this.f25372c--;
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
        Object obj = this.f25371b;
        System.arraycopy(obj, i2, obj, i, this.f25372c - i2);
        this.f25372c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo14139a();
        m17034c(i);
        long[] jArr = this.f25371b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f25372c;
    }
}

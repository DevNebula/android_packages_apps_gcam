package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: krk */
final class krk extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private double[] f25364b;
    /* renamed from: c */
    private int f25365c;

    static {
        new krk().f21952a = false;
    }

    krk() {
        this(new double[10], 0);
    }

    private krk(double[] dArr, int i) {
        this.f25364b = dArr;
        this.f25365c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m17010a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection collection) {
        mo14139a();
        ksd.m5192a((Object) collection);
        if (!(collection instanceof krk)) {
            return super.addAll(collection);
        }
        krk krk = (krk) collection;
        int i = krk.f25365c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25365c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        double[] dArr = this.f25364b;
        if (i > dArr.length) {
            this.f25364b = Arrays.copyOf(dArr, i);
        }
        System.arraycopy(krk.f25364b, 0, this.f25364b, this.f25365c, krk.f25365c);
        this.f25365c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    public final void mo15165a(double d) {
        m17010a(this.f25365c, d);
    }

    /* renamed from: a */
    private final void m17010a(int i, double d) {
        mo14139a();
        if (i >= 0) {
            int i2 = this.f25365c;
            if (i <= i2) {
                Object obj = this.f25364b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f25364b, i, obj2, i + 1, this.f25365c - i);
                    this.f25364b = obj2;
                }
                this.f25364b[i] = d;
                this.f25365c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17012c(i));
    }

    /* renamed from: b */
    private final void m17011b(int i) {
        if (i < 0 || i >= this.f25365c) {
            throw new IndexOutOfBoundsException(m17012c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krk)) {
            return super.equals(obj);
        }
        krk krk = (krk) obj;
        if (this.f25365c != krk.f25365c) {
            return false;
        }
        double[] dArr = krk.f25364b;
        for (int i = 0; i < this.f25365c; i++) {
            if (this.f25364b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m17011b(i);
        return Double.valueOf(this.f25364b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25365c; i2++) {
            i = (i * 31) + ksd.m5189a(Double.doubleToLongBits(this.f25364b[i2]));
        }
        return i;
    }

    /* renamed from: c */
    private final String m17012c(int i) {
        int i2 = this.f25365c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final boolean remove(Object obj) {
        mo14139a();
        for (int i = 0; i < this.f25365c; i++) {
            if (obj.equals(Double.valueOf(this.f25364b[i]))) {
                Object obj2 = this.f25364b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f25365c - i);
                this.f25365c--;
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
        Object obj = this.f25364b;
        System.arraycopy(obj, i2, obj, i, this.f25365c - i2);
        this.f25365c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo14139a();
        m17011b(i);
        double[] dArr = this.f25364b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f25365c;
    }
}

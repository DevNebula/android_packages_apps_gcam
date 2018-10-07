package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: krv */
final class krv extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private float[] f25366b;
    /* renamed from: c */
    private int f25367c;

    static {
        new krv().f21952a = false;
    }

    krv() {
        this(new float[10], 0);
    }

    private krv(float[] fArr, int i) {
        this.f25366b = fArr;
        this.f25367c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m17015a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection collection) {
        mo14139a();
        ksd.m5192a((Object) collection);
        if (!(collection instanceof krv)) {
            return super.addAll(collection);
        }
        krv krv = (krv) collection;
        int i = krv.f25367c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f25367c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        float[] fArr = this.f25366b;
        if (i > fArr.length) {
            this.f25366b = Arrays.copyOf(fArr, i);
        }
        System.arraycopy(krv.f25366b, 0, this.f25366b, this.f25367c, krv.f25367c);
        this.f25367c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    public final void mo15169a(float f) {
        m17015a(this.f25367c, f);
    }

    /* renamed from: a */
    private final void m17015a(int i, float f) {
        mo14139a();
        if (i >= 0) {
            int i2 = this.f25367c;
            if (i <= i2) {
                Object obj = this.f25366b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f25366b, i, obj2, i + 1, this.f25367c - i);
                    this.f25366b = obj2;
                }
                this.f25366b[i] = f;
                this.f25367c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17017c(i));
    }

    /* renamed from: b */
    private final void m17016b(int i) {
        if (i < 0 || i >= this.f25367c) {
            throw new IndexOutOfBoundsException(m17017c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krv)) {
            return super.equals(obj);
        }
        krv krv = (krv) obj;
        if (this.f25367c != krv.f25367c) {
            return false;
        }
        float[] fArr = krv.f25366b;
        for (int i = 0; i < this.f25367c; i++) {
            if (this.f25366b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m17016b(i);
        return Float.valueOf(this.f25366b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f25367c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f25366b[i2]);
        }
        return i;
    }

    /* renamed from: c */
    private final String m17017c(int i) {
        int i2 = this.f25367c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final boolean remove(Object obj) {
        mo14139a();
        for (int i = 0; i < this.f25367c; i++) {
            if (obj.equals(Float.valueOf(this.f25366b[i]))) {
                Object obj2 = this.f25366b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f25367c - i);
                this.f25367c--;
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
        Object obj = this.f25366b;
        System.arraycopy(obj, i2, obj, i, this.f25367c - i2);
        this.f25367c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo14139a();
        m17016b(i);
        float[] fArr = this.f25366b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f25367c;
    }
}

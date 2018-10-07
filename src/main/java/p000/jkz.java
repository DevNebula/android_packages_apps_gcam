package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* renamed from: jkz */
public final class jkz implements Iterator {
    /* renamed from: a */
    private final int[] f8270a;
    /* renamed from: b */
    private int f8271b;
    /* renamed from: c */
    private final /* synthetic */ jkx f8272c;

    jkz(jkx jkx, AtomicIntegerArray atomicIntegerArray, int i) {
        this.f8272c = jkx;
        this.f8270a = new int[atomicIntegerArray.length()];
        for (int i2 = 0; i2 < atomicIntegerArray.length(); i2++) {
            this.f8270a[i2] = atomicIntegerArray.get(i2);
        }
        this.f8271b = i;
    }

    public final boolean hasNext() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo9482a() {
        Iterator it = this.f8272c.f21602a.iterator();
        while (it.hasNext()) {
            if (this.f8271b <= this.f8270a[((jza) it.next()).f8497z]) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        jky jky = new jky(this.f8272c, this.f8270a, this.f8271b);
        this.f8271b++;
        return jky;
    }

    public final void remove() {
        throw new UnsupportedOperationException("RowIterator does not allow removing rows!");
    }
}

package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: iqh */
public final class iqh {
    /* renamed from: a */
    private final ArrayDeque f7681a = new ArrayDeque();
    /* renamed from: b */
    private final long f7682b = 1000000;
    /* renamed from: c */
    private float f7683c = 0.0f;

    /* renamed from: a */
    public final synchronized float mo8769a(iqi iqi) {
        jri.m13396a(true, (Object) "Sample cannot be null");
        this.f7683c += iqi.f7685b;
        this.f7681a.add(iqi);
        Iterator it = this.f7681a.iterator();
        while (it.hasNext()) {
            iqi iqi2 = (iqi) it.next();
            if (iqi2.f7684a + this.f7682b < iqi.f7684a) {
                it.remove();
                this.f7683c -= iqi2.f7685b;
            }
        }
        return this.f7683c;
    }
}

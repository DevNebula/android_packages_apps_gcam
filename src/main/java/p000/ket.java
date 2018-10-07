package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ket */
class ket implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object[] f8625a;
    /* renamed from: b */
    private final Object[] f8626b;

    ket(kes kes) {
        this.f8625a = new Object[kes.size()];
        this.f8626b = new Object[kes.size()];
        Iterator c = kes.entrySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (c.hasNext()) {
                Entry entry = (Entry) c.next();
                this.f8625a[i2] = entry.getKey();
                this.f8626b[i2] = entry.getValue();
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    final Object mo9875a(khb khb) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f8625a;
            if (i >= objArr.length) {
                return khb.mo9981a();
            }
            khb.mo9983a(objArr[i], this.f8626b[i]);
            i++;
        }
    }

    Object readResolve() {
        return mo9875a(new khb(this.f8625a.length));
    }
}

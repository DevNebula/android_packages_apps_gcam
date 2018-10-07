package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: fxz */
final class fxz implements kaw {
    /* renamed from: a */
    private final /* synthetic */ int f18890a;

    fxz(int i) {
        this.f18890a = i;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        bbo bbo = (bbo) obj;
        bbo bbo2 = new bbo();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f18890a) {
                return bbo2;
            }
            List arrayList = new ArrayList();
            Iterator it = bbo.iterator();
            while (it.hasNext()) {
                arrayList.add((fyr) ((List) it.next()).get(i2));
            }
            bbo2.add(new fya(arrayList));
            i = i2 + 1;
        }
    }
}

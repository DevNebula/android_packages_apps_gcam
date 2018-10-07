package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: fym */
final /* synthetic */ class fym implements kaw {
    /* renamed from: a */
    public static final kaw f18907a = new fym();

    private fym() {
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        Iterator it = ((List) obj).iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return Integer.valueOf(i2);
            }
            i = ((Integer) it.next()).intValue() + i2;
        }
    }
}

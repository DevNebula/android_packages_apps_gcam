package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ixs */
public final class ixs implements ixq {
    /* renamed from: a */
    private final Object f21353a = new Object();
    /* renamed from: b */
    private final Map f21354b;

    public ixs(Map map) {
        this.f21354b = map;
    }

    /* renamed from: a */
    public final float mo9163a(iwp iwp) {
        float f;
        synchronized (this.f21353a) {
            Iterator it = this.f21354b.entrySet().iterator();
            float f2 = 0.0f;
            while (true) {
                f = f2;
                if (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    f2 = (((Float) entry.getValue()).floatValue() * ((ixq) entry.getKey()).mo9163a(iwp)) + f;
                }
            }
        }
        return f;
    }
}

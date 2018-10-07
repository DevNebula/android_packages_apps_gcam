package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aea */
public final class aea {
    /* renamed from: b */
    private static final adz f344b = new aeb();
    /* renamed from: a */
    private final Map f345a = new HashMap();

    /* renamed from: a */
    public final synchronized ady mo197a(Object obj) {
        adz adz;
        aqe.m610a(obj, "Argument must not be null");
        adz = (adz) this.f345a.get(obj.getClass());
        if (adz == null) {
            for (adz adz2 : this.f345a.values()) {
                if (adz2.mo196a().isAssignableFrom(obj.getClass())) {
                    adz = adz2;
                    break;
                }
            }
        }
        if (adz == null) {
            adz = f344b;
        }
        return adz.mo195a(obj);
    }

    /* renamed from: a */
    public final synchronized void mo198a(adz adz) {
        this.f345a.put(adz.mo196a(), adz);
    }
}

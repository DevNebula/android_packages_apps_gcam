package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gtg */
public final class gtg {
    /* renamed from: a */
    private final Map f6051a = new HashMap();

    gtg() {
    }

    /* renamed from: a */
    public final gtf mo7440a(gsx gsx) {
        gtf gtf;
        synchronized (this.f6051a) {
            String b = gsx.mo7426b();
            if (this.f6051a.containsKey(b)) {
                gtf = (gtf) this.f6051a.get(b);
            } else {
                gtf = new gtf(gsx);
                this.f6051a.put(b, gtf);
            }
        }
        return gtf;
    }
}

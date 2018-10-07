package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: frj */
public final class frj {
    /* renamed from: a */
    public iqm f4895a = iqm.CLOCKWISE_0;
    /* renamed from: b */
    private final iwz f4896b;
    /* renamed from: c */
    private final kpk f4897c;
    /* renamed from: d */
    private final Map f4898d;

    frj(iwz iwz, kpk kpk) {
        this.f4896b = iwz;
        this.f4897c = kpk;
        this.f4898d = new HashMap();
    }

    /* renamed from: a */
    public final fri mo6875a() {
        return new fri(this.f4896b, this.f4897c, this.f4895a, this.f4898d.values());
    }

    /* renamed from: a */
    public final frj mo6876a(Collection collection) {
        for (fin fin : collection) {
            this.f4898d.put(fin.f4800a, fin);
        }
        return this;
    }
}

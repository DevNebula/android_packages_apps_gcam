package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ixw */
public final class ixw implements iqc {
    /* renamed from: a */
    private final /* synthetic */ ixv f21358a;
    /* renamed from: b */
    private final /* synthetic */ iqc f21359b;

    public ixw(ixv ixv, iqc iqc) {
        this.f21358a = ixv;
        this.f21359b = iqc;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo8766a(Set set) {
        Long l = null;
        float f = Float.MAX_VALUE;
        for (Long l2 : set) {
            float f2;
            Long l3;
            Float a = this.f21358a.mo9167a(l2.longValue());
            if (a == null) {
                f2 = f;
                l3 = l;
            } else if (a.floatValue() < f) {
                l3 = l2;
                f2 = a.floatValue();
            } else {
                f2 = f;
                l3 = l;
            }
            l = l3;
            f = f2;
        }
        if (l != null) {
            return l;
        }
        return (Long) this.f21359b.mo8766a(set);
    }
}

package p000;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jua */
public final class jua implements jtv {
    /* renamed from: a */
    private final jwq f21750a;
    /* renamed from: b */
    private final HashSet f21751b = khb.m4963e();

    public jua(jwq jwq) {
        this.f21750a = jwq;
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        Iterator it = this.f21751b.iterator();
        float f = Float.MAX_VALUE;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (longValue != j) {
                float a = this.f21750a.mo9582a(j, longValue);
                if (a < f) {
                    f = a;
                }
            }
        }
        return new jzc(f);
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
        this.f21751b.remove(Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
        this.f21751b.add(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo9555a() {
        this.f21751b.clear();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21750a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("MinDistanceScorer[distanceMetric=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

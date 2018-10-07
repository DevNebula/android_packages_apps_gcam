package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvf */
public final class jvf extends jum {
    /* renamed from: a */
    private final jtv f24846a;
    /* renamed from: b */
    private final int f24847b = 5;

    public jvf(jtv jtv) {
        this.f24846a = jtv;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        if (juh.mo9563b()) {
            return juh;
        }
        List c = khb.m4955c((Iterable) juh);
        Collection b = khb.m4945b();
        while (b.size() < this.f24847b && !c.isEmpty()) {
            int size = c.size();
            float f = Float.NEGATIVE_INFINITY;
            int i = 0;
            long j = -1;
            while (i < size) {
                float f2;
                int i2 = i + 1;
                long longValue = ((Long) c.get(i)).longValue();
                float a = this.f24846a.mo9554a(longValue).mo9629a();
                if (a > f) {
                    f2 = a;
                } else {
                    f2 = f;
                }
                if (a <= f) {
                    longValue = j;
                }
                j = longValue;
                f = f2;
                i = i2;
            }
            if (j == -1) {
                break;
            }
            Long valueOf = Long.valueOf(j);
            b.add(valueOf);
            c.remove(valueOf);
        }
        return new juh(b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24846a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
        stringBuilder.append("TopNScoreSegmentFilter[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jvd */
public final class jvd extends jum {
    /* renamed from: a */
    private final jtv f24840a;
    /* renamed from: b */
    private final float f24841b;

    public jvd(jtv jtv, float f) {
        jri.m13404b((Object) jtv);
        this.f24840a = jtv;
        this.f24841b = f;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        this.f24840a.mo9555a();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            this.f24840a.mo9557c(((Long) it.next()).longValue());
        }
        Iterable d = khb.m4960d((Iterable) juh);
        while (d.size() > 0) {
            Iterator it2 = d.iterator();
            long j = -1;
            float f = Float.MAX_VALUE;
            while (it2.hasNext()) {
                float f2;
                long longValue = ((Long) it2.next()).longValue();
                float a = this.f24840a.mo9554a(longValue).mo9629a();
                if (a >= f) {
                    longValue = j;
                }
                if (a < f) {
                    f2 = a;
                } else {
                    f2 = f;
                }
                f = f2;
                j = longValue;
            }
            if (f >= this.f24841b) {
                break;
            } else if (j != -1) {
                d.remove(Long.valueOf(j));
                this.f24840a.mo9556b(j);
            }
        }
        return new juh(khb.m4955c(d));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24840a);
        float f = this.f24841b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 80);
        stringBuilder.append("ScoreThresholdSegmentFilter[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", threshold=");
        stringBuilder.append(f);
        stringBuilder.append(", min=");
        stringBuilder.append(0);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: juw */
public final class juw extends jum {
    /* renamed from: a */
    private final jwa f24828a;
    /* renamed from: b */
    private final int f24829b;

    public juw(jwa jwa, int i) {
        this.f24828a = jwa;
        this.f24829b = i;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        Collection d = khb.m4960d((Iterable) juh);
        this.f24828a.mo13881c();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            this.f24828a.mo9576b(((Long) it.next()).longValue());
        }
        while (d.size() > this.f24829b) {
            long d2 = this.f24828a.mo13882d();
            d.remove(Long.valueOf(d2));
            this.f24828a.mo9575a(d2);
        }
        return new juh(d, juh.f8351b);
    }

    public final String toString() {
        int i = this.f24829b;
        String valueOf = String.valueOf(this.f24828a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
        stringBuilder.append("FrameDropperSegmentFilter[size=");
        stringBuilder.append(i);
        stringBuilder.append(", dropper=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

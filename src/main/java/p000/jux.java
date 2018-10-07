package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jux */
public final class jux extends jum {
    /* renamed from: a */
    private final jwb f24830a;

    public jux(jwb jwb) {
        jri.m13404b((Object) jwb);
        this.f24830a = jwb;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        Collection b = khb.m4945b();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (this.f24830a.mo9574a(longValue)) {
                b.add(Long.valueOf(longValue));
            }
        }
        return new juh(b, juh.f8351b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24830a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
        stringBuilder.append("FrameFilterSegmentFilter[filter=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

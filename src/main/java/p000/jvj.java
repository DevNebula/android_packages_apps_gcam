package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvj */
public final class jvj extends juo {
    /* renamed from: a */
    private final jum f24848a;

    public jvj(jum jum) {
        jri.m13404b((Object) jum);
        this.f24848a = jum;
    }

    /* renamed from: a */
    public final List mo13873a(juh juh) {
        List b = khb.m4945b();
        if (juh.mo9563b()) {
            return b;
        }
        juh a = this.f24848a.mo13869a(juh);
        Collection b2 = khb.m4945b();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            List a2 = ken.m13713a(a.f8350a);
            Long valueOf = Long.valueOf(longValue);
            if (!(a2.contains(valueOf) || b2.isEmpty())) {
                b.add(new juh(b2, juh.f8351b));
                b2.clear();
            }
            b2.add(valueOf);
        }
        if (!b2.isEmpty()) {
            b.add(new juh(b2, juh.f8351b));
        }
        return b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24848a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("FilteredSegmenter [filter=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvb */
public final class jvb extends jum {
    /* renamed from: a */
    private final jxm f24837a;
    /* renamed from: b */
    private final int f24838b;

    public jvb(jxm jxm) {
        this(jxm, 1);
    }

    public jvb(jxm jxm, int i) {
        jri.m13404b((Object) jxm);
        this.f24837a = jxm;
        this.f24838b = i;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        jri.m13404b((Object) juh);
        Collection b = khb.m4945b();
        ken a = ken.m13713a(juh.f8350a);
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            long longValue = ((Long) a.get(i)).longValue();
            jxa a2 = this.f24837a.mo9599a(longValue);
            if (!a2.mo9592b(jxa.f8412c)) {
                i = i2;
            } else if (((List) a2.mo9589a(jxa.f8412c)).size() >= this.f24838b) {
                b.add(Long.valueOf(longValue));
                i = i2;
            } else {
                i = i2;
            }
        }
        return new juh(b);
    }

    public final String toString() {
        return "MinFaceCountSegmentFilter";
    }
}

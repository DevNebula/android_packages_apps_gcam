package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jue */
public final class jue implements juk {
    /* renamed from: a */
    private final jtv f21761a;

    public jue(jtv jtv) {
        jri.m13404b((Object) jtv);
        this.f21761a = jtv;
    }

    /* renamed from: a */
    public final List mo9570a(List list) {
        if (list.isEmpty() || list.size() == 1) {
            return list;
        }
        juh juh = (juh) list.get(0);
        juh juh2 = juh;
        float f = Float.NEGATIVE_INFINITY;
        for (juh juh3 : list) {
            float f2;
            Iterator it = juh3.iterator();
            float f3 = 0.0f;
            while (true) {
                f2 = f3;
                if (!it.hasNext()) {
                    break;
                }
                f3 = this.f21761a.mo9554a(((Long) it.next()).longValue()).mo9629a() + f2;
            }
            f3 = (((float) juh3.mo9565d()) * 3.0f) + f2;
            if (f3 <= f) {
                juh3 = juh2;
            }
            if (f3 > f) {
                juh2 = juh3;
                f = f3;
            } else {
                juh2 = juh3;
            }
        }
        return Collections.singletonList(juh2);
    }

    public final String toString() {
        return "BestSegmentSelector[scorer=BestSegmentSelector][segment size = 3.0]";
    }
}

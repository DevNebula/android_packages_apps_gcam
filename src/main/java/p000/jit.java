package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: jit */
final class jit implements Comparator {
    /* renamed from: a */
    private final /* synthetic */ Comparator f8221a;

    jit(Comparator comparator) {
        this.f8221a = comparator;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        jip jip = (jip) obj;
        jip jip2 = (jip) obj2;
        int compare = Integer.compare(jip2.f21538b, jip.f21538b);
        if (compare == 0) {
            return this.f8221a.compare(jip, jip2);
        }
        return compare;
    }
}

package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kgo */
final class kgo extends kgd implements Serializable {
    /* renamed from: a */
    public static final kgo f21901a = new kgo();
    public static final long serialVersionUID = 0;

    private kgo() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        jri.m13404b((Object) comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9963a(Object obj, Object obj2) {
        return (Comparable) kgc.f21893a.mo9967b((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo9967b(Object obj, Object obj2) {
        return (Comparable) kgc.f21893a.mo9963a((Comparable) obj, (Comparable) obj2);
    }

    private final Object readResolve() {
        return f21901a;
    }

    /* renamed from: a */
    public final kgd mo9965a() {
        return kgc.f21893a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

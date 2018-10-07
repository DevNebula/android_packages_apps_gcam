package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kgc */
public final class kgc extends kgd implements Serializable {
    /* renamed from: a */
    public static final kgc f21893a = new kgc();
    public static final long serialVersionUID = 0;

    private kgc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        obj = (Comparable) obj;
        obj2 = (Comparable) obj2;
        jri.m13404b(obj);
        jri.m13404b(obj2);
        return obj.compareTo(obj2);
    }

    private final Object readResolve() {
        return f21893a;
    }

    /* renamed from: a */
    public final kgd mo9965a() {
        return kgo.f21901a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

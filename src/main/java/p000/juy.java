package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: juy */
public final class juy implements Comparator {
    /* renamed from: a */
    private final jtv f8359a;

    public juy(jtv jtv) {
        jri.m13404b((Object) jtv);
        this.f8359a = jtv;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(this.f8359a.mo9554a(((Long) obj).longValue()).mo9629a(), this.f8359a.mo9554a(((Long) obj2).longValue()).mo9629a());
    }
}

package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: cie */
final class cie implements Comparator {
    /* renamed from: a */
    private final iqp f2210a;

    public cie(iqp iqp) {
        this.f2210a = iqp;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return (Math.abs(((iqp) obj).mo8812a() - this.f2210a.mo8812a()) > Math.abs(((iqp) obj2).mo8812a() - this.f2210a.mo8812a()) ? 1 : (Math.abs(((iqp) obj).mo8812a() - this.f2210a.mo8812a()) == Math.abs(((iqp) obj2).mo8812a() - this.f2210a.mo8812a()) ? 0 : -1));
    }
}

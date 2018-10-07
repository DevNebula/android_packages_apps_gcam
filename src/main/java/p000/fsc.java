package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fsc */
public final class fsc implements fsa {
    /* renamed from: a */
    public final fuc f18749a;
    /* renamed from: b */
    private final fsa f18750b;

    public fsc(fuc fuc, fsa fsa) {
        this.f18749a = fuc;
        this.f18750b = fsa;
    }

    /* renamed from: a */
    public final kpk mo6881a(List list, iqm iqm) {
        List arrayList = new ArrayList();
        for (iwz f : list) {
            arrayList.add(Long.valueOf(f.mo13744f()));
        }
        return kny.m18475a(this.f18750b.mo6881a(list, iqm), new fsd(this, arrayList), kpq.f8776a);
    }
}

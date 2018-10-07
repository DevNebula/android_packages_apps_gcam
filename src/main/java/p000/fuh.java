package p000;

import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: fuh */
public final class fuh implements fue {
    /* renamed from: a */
    public final iqz f18790a;

    fuh(ira ira) {
        this.f18790a = ira.mo8854a("TuningDataLogger");
    }

    /* renamed from: a */
    private final kpk m10967a(Collection collection) {
        return kny.m18475a(kow.m13872a((Iterable) collection), new fuj(this), kpq.f8776a);
    }

    /* renamed from: a */
    public final void mo6913a(fub fub) {
        kpk a = m10967a(Collections.unmodifiableMap(fub.f4946d).values());
        kpk a2 = m10967a(Collections.unmodifiableList(fub.f4951i));
        kow.m13878a(kow.m13877a(a, a2), new fui(this, fub), kpq.f8776a);
    }
}

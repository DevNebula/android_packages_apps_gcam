package p000;

import java.util.NavigableMap;

/* compiled from: PG */
/* renamed from: bod */
final class bod extends iww {
    /* renamed from: a */
    private final /* synthetic */ fkp f25503a;
    /* renamed from: b */
    private final /* synthetic */ boc f25504b;

    bod(boc boc, iwz iwz, fkp fkp) {
        this.f25504b = boc;
        this.f25503a = fkp;
        super(iwz);
    }

    public final void close() {
        long f = this.f25503a.mo13744f();
        NavigableMap navigableMap = this.f25504b.f11645a.f21343a;
        Long valueOf = Long.valueOf(f);
        fkp fkp = (fkp) ((iqo) navigableMap.remove(valueOf));
        if (fkp != null) {
            ixi ixi = this.f25504b.f11645a;
            synchronized (ixi.f21343a) {
                ixi.f21344b.remove(valueOf);
            }
            fkp.close();
        }
    }
}

package p000;

/* compiled from: PG */
/* renamed from: ejz */
final class ejz implements emc {
    /* renamed from: a */
    private final /* synthetic */ ejy f17482a;

    ejz(ejy ejy) {
        this.f17482a = ejy;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6325a(Object obj) {
        Float f = (Float) obj;
        ekm ekm = this.f17482a.f3922I;
        ekm.f4036a = f.floatValue();
        ekm.mo6287a();
        bwb bwb = this.f17482a.f3952w;
        if (bwb != null) {
            synchronized (bwb.f1678k) {
                if (!bwb.f1675h) {
                    bwb.f1676i.post(bwb.f1679l);
                    bwb.f1675h = true;
                }
            }
        }
    }
}

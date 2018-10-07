package p000;

/* compiled from: PG */
/* renamed from: dfj */
final class dfj implements emc {
    /* renamed from: a */
    private final /* synthetic */ des f13732a;

    dfj(des des) {
        this.f13732a = des;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6325a(Object obj) {
        try {
            this.f13732a.f25990y.join();
        } catch (InterruptedException e) {
            bli.m891b(des.f25916c, e.toString());
        }
        des des = this.f13732a;
        des.f25980o.f4165b.mo13364a(des.f25981p.mo12490u().mo7915d());
        this.f13732a.f25920D.sendEmptyMessage(104);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: ipq */
public final class ipq implements iju {
    /* renamed from: a */
    private final /* synthetic */ ios f21199a;

    public ipq(ios ios) {
        this.f21199a = ios;
    }

    /* renamed from: a */
    private final kpk m12592a() {
        this.f21199a.f21143e.mo13684b();
        ios ios = this.f21199a;
        iop iop = ios.f21147i;
        if (iop != null) {
            ios.f21143e.f21108d.remove(iop);
        }
        ior ior = this.f21199a.f21144f;
        if (ior != null) {
            ior.close();
        }
        iow iow = this.f21199a.f21145g;
        if (iow != null) {
            iow.close();
        }
        this.f21199a.f21143e.close();
        synchronized (this.f21199a.f21139a) {
            this.f21199a.f21140b = ipr.CLOSED;
        }
        return kow.m13873a(this.f21199a.f21141c);
    }
}

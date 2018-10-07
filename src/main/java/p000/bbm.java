package p000;

/* compiled from: PG */
/* renamed from: bbm */
public final class bbm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bbi f1092a;
    /* renamed from: b */
    private final /* synthetic */ bcp f1093b;
    /* renamed from: c */
    private final /* synthetic */ kaw f1094c;

    public bbm(bbi bbi, bcp bcp, kaw kaw) {
        this.f1092a = bbi;
        this.f1093b = bcp;
        this.f1094c = kaw;
    }

    public final void run() {
        if (this.f1092a.mo12348a() != null) {
            this.f1093b.mo14559a(this.f1092a.mo12348a());
            return;
        }
        iqo c = this.f1092a.mo12351c();
        if (c == null) {
            this.f1093b.close();
            return;
        }
        c = (iqo) this.f1094c.mo9689a(c);
        jri.m13404b((Object) c);
        this.f1093b.mo14558a(c);
    }
}

package p000;

/* compiled from: PG */
/* renamed from: gjk */
public final class gjk implements fel {
    /* renamed from: a */
    public static final String f19237a = bli.m887a("SelfieFlashSwitch");
    /* renamed from: b */
    public final gkb f19238b;
    /* renamed from: c */
    public kpw f19239c;
    /* renamed from: d */
    public boolean f19240d = false;
    /* renamed from: e */
    private final ikd f19241e;
    /* renamed from: f */
    private int f19242f;
    /* renamed from: g */
    private final Object f19243g = new Object();

    public gjk(gkb gkb, ikd ikd) {
        this.f19238b = gkb;
        this.f19241e = ikd;
        this.f19239c = kpw.m18486d();
        this.f19239c.mo15641a(new gkc());
    }

    /* renamed from: a */
    public final fem mo6765a(fip fip, fim fim) {
        Object gjp = new gjp(this, fip, new fio(fim));
        try {
            bli.m894c(f19237a, "acquiring selfie flash");
            synchronized (this.f19243g) {
                this.f19242f++;
                if (this.f19242f == 1) {
                    bli.m894c(f19237a, "first active selfie flash request");
                    kpk d = kpw.m18486d();
                    this.f19241e.execute(new gjm(this, d));
                    gkc gkc = (gkc) d.get();
                    this.f19239c = kpw.m18486d();
                    fyu.m2474a(gkc.f5518a, gjp.mo13234a(fim), fip);
                }
            }
        } catch (Throwable e) {
            bli.m892b(f19237a, "Couldn't turn on selfie flash", e);
            gjp.close();
        }
        return gjp;
    }

    /* renamed from: c */
    public final void mo6766c() {
        synchronized (this.f19243g) {
            bli.m894c(f19237a, "resetting selfie flash");
            this.f19242f--;
            if (this.f19242f == 0) {
                bli.m894c(f19237a, "no more active selfie flash requests");
                this.f19241e.execute(new gjl(this));
            }
        }
    }
}

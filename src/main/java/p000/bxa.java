package p000;

/* compiled from: PG */
/* renamed from: bxa */
public final class bxa implements kbn {
    /* renamed from: a */
    private final Object f11896a = new Object();
    /* renamed from: b */
    private final boolean f11897b;
    /* renamed from: c */
    private final fwa f11898c;
    /* renamed from: d */
    private fqv f11899d;
    /* renamed from: e */
    private final /* synthetic */ ccy f11900e;

    public bxa(ccy ccy, fwa fwa, boolean z) {
        this.f11900e = ccy;
        this.f11897b = z;
        this.f11898c = fwa;
    }

    /* renamed from: a */
    public final fqv mo9715b() {
        fqv fqv;
        jri.m13406b(this.f11897b, (Object) "Started RAW session when not requested");
        jri.m13406b(this.f11900e.f12193e.mo9709b(), (Object) "Starting RAW session with no image saver");
        synchronized (this.f11896a) {
            if (this.f11899d == null) {
                this.f11899d = ((fqu) this.f11900e.f12193e.mo9706a()).mo6917b(this.f11898c);
            }
            fqv = this.f11899d;
        }
        return fqv;
    }
}

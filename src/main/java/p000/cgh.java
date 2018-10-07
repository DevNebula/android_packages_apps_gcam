package p000;

/* compiled from: PG */
/* renamed from: cgh */
public final class cgh extends bcs {
    /* renamed from: d */
    private static final String f23193d = bli.m887a("CamActvtyCtrInit");
    /* renamed from: e */
    private final kwk f23194e;
    /* renamed from: f */
    private final ird f23195f;
    /* renamed from: g */
    private final enr f23196g;
    /* renamed from: h */
    private boolean f23197h = false;

    public cgh(kwk kwk, ikd ikd, enr enr, ird ird) {
        super(null, ikd);
        this.f23194e = kwk;
        this.f23195f = ird;
        this.f23196g = enr;
    }

    /* renamed from: d */
    final boolean mo14588d() {
        if (this.f23197h) {
            return true;
        }
        this.f23195f.mo8856a("CameraActivityControllerInitializer#initialize");
        cfh cfh = (cfh) this.f23194e.mo10566a();
        this.f23195f.mo8855a();
        this.f23197h = cfh.mo12462D();
        this.f23195f.mo8855a();
        this.f23195f.mo8857b();
        return this.f23197h;
    }

    /* renamed from: c */
    protected final void mo12354c() {
        if (!mo14588d()) {
            bli.m894c(f23193d, "Postponing controller initialization to onStart");
            this.f23196g.mo6355a(new cgi(this));
        }
        mo12353b();
    }
}

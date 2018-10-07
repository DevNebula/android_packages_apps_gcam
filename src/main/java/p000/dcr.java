package p000;

/* compiled from: PG */
/* renamed from: dcr */
public final class dcr extends dbx {
    /* renamed from: c */
    public static final String f23822c = bli.m887a("StateReadyCap");
    /* renamed from: d */
    public final bco f23823d;
    /* renamed from: e */
    public boolean f23824e;
    /* renamed from: f */
    public boolean f23825f;
    /* renamed from: g */
    public boolean f23826g;
    /* renamed from: h */
    private ikb f23827h;
    /* renamed from: i */
    private final dbw f23828i = new dcx(this);
    /* renamed from: j */
    private final dbw f23829j = new dcz(this);
    /* renamed from: k */
    private final fbl f23830k = new ddb(this);
    /* renamed from: l */
    private final glq f23831l = new ddc(this);

    public dcr(dbx dbx, bco bco) {
        super((bug) dbx);
        this.f23823d = bco;
        this.f23824e = false;
        this.f23825f = false;
        this.f23826g = false;
        mo2149a(dbd.class, new dcs(this));
        mo2149a(daq.class, this.f23828i);
        mo2149a(das.class, this.f23829j);
        mo2149a(dbi.class, new ddi(this));
        mo2149a(dbk.class, new ddj(this));
        mo2149a(dbj.class, new ddk(this));
        mo2149a(dbl.class, new ddl(this));
        mo2149a(dba.class, new ddm(this));
        mo2149a(dbb.class, new ddo(this));
        mo2149a(dat.class, new ddq(this));
        mo2149a(dar.class, new dds(this));
        mo2149a(dau.class, new dcu(this));
    }

    /* renamed from: f */
    final void mo14842f() {
        this.f23824e = false;
        ((dbu) mo2152d()).mo12977G().execute(new ddf(this));
    }

    /* renamed from: e */
    public final dbx mo2150b() {
        Object G = ((dbu) mo2152d()).mo12977G();
        this.f23827h = new ikb();
        fbj a = ((dbm) this.f23823d.f11173a).mo12962c().mo12964a();
        this.f23827h.mo8557a(a.mo13214a().f4682a.mo13672a(new dcv(this), G));
        ((dbu) mo2152d()).mo12987Q().mo7250a(this.f23831l);
        G.execute(new dcw(this));
        if (((dbu) mo2152d()).mo13018y().mo9709b()) {
            ((fbd) ((dbu) mo2152d()).mo13018y().mo9706a()).mo6714a(a.mo13214a().f4689h);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo2151c() {
        ((dbu) mo2152d()).mo12984N().f20208a = null;
        ((dbu) mo2152d()).mo12983M();
        ((dbu) mo2152d()).mo12987Q().mo7252b(this.f23831l);
        if (!this.f23825f) {
            this.f23823d.close();
        }
        this.f23827h.close();
        if (((dbu) mo2152d()).mo13018y().mo9709b()) {
            ((fbd) ((dbu) mo2152d()).mo13018y().mo9706a()).mo6713a();
        }
    }

    /* renamed from: a */
    final void mo14841a(dbn dbn) {
        this.f23825f = true;
        ((dbm) this.f23823d.f11173a).mo12960a(this.f23830k, dbn);
        this.f1624b.remove(dbi.class);
    }
}

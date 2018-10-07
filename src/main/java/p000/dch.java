package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dch */
public final class dch extends dbx {
    /* renamed from: c */
    public static final String f23808c = bli.m887a("StateOpeningCamera");
    /* renamed from: d */
    public final iut f23809d;
    /* renamed from: e */
    public final iur f23810e;
    /* renamed from: f */
    public final ffc f23811f;
    /* renamed from: g */
    public iqp f23812g;
    /* renamed from: h */
    public boolean f23813h = false;
    /* renamed from: i */
    public fxg f23814i;
    /* renamed from: j */
    private final String f23815j = gos.m2721a(this.f23810e.f7848b);
    /* renamed from: k */
    private final ilp f23816k = ((dbu) mo2152d()).mo12993W();
    /* renamed from: l */
    private final ilp f23817l;
    /* renamed from: m */
    private final ilp f23818m;

    public dch(dbx dbx, iut iut, iur iur, ffc ffc) {
        super((bug) dbx);
        dci dci = new dci();
        this.f23809d = iut;
        this.f23810e = iur;
        this.f23811f = ffc;
        Object valueOf = Boolean.valueOf(false);
        this.f23817l = new ilb(valueOf);
        this.f23818m = new ilb(valueOf);
        mo2149a(daz.class, new dcj(this));
        mo2149a(daw.class, new dck(this));
        mo2149a(dav.class, new dcn(this));
    }

    /* renamed from: e */
    public final dbx mo2150b() {
        if (this.f23811f == null) {
            bli.m891b(f23808c, "mCameraCharacteristics is null");
            return new dca(this);
        }
        fha dcq = new dcq(this);
        ((dbu) mo2152d()).mo12973C().f3109a = dcq;
        this.f23812g = ((dbu) mo2152d()).mo12985O().mo6160a(this.f23810e, this.f23809d);
        ilp fxd = new fxd(((dbu) mo2152d()).mo13019z(), this.f23811f, fxi.AUTO);
        this.f23814i = fxg.m2462a(this.f23812g, new dco(this, this.f23818m), ilq.m3876a(Boolean.valueOf(false)), fxd, dcq, this.f23817l);
        ((dbu) mo2152d()).mo13001h().mo14869a(this.f23809d);
        List q = ((dbu) mo2152d()).mo12979I().mo9088a(this.f23810e).mo9078q();
        if (q.isEmpty()) {
            return new dca(this);
        }
        iqp a = ((dbu) mo2152d()).mo12985O().mo6160a(this.f23810e, this.f23809d);
        iqp a2 = ((dbu) mo2152d()).mo12992V().mo7777a(q, a, this.f23809d);
        heo heo = new heo(this.f23809d, a2, ipz.m4077b(a2));
        dof dof = new dof(a2, ((dbu) mo2152d()).mo12991U().mo7769a(heo), new ciq(), new bnb(), ((dbu) mo2152d()).mo13010q(), ((dbu) mo2152d()).mo12986P(), new etg(false));
        dof dof2 = dof;
        ((dbu) mo2152d()).mo12977G().execute(new dcp(this, ((dbu) mo2152d()).mo12980J().mo6035a(this.f23810e, new bcl(), dof2, this.f23814i, ((dbu) mo2152d()).mo12981K()), new cwc(this.f23810e, this.f23809d, ipz.m4077b(a), a, heo)));
        return null;
    }
}

package p000;

import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: cwz */
public final class cwz implements cwy {
    /* renamed from: a */
    public static final String f13382a = bli.m887a("CptrCamDvOpener");
    /* renamed from: b */
    public ikb f13383b;
    /* renamed from: c */
    public kpk f13384c;
    /* renamed from: d */
    public fbj f13385d;
    /* renamed from: e */
    public czg f13386e;
    /* renamed from: f */
    public cwc f13387f;
    /* renamed from: g */
    public ffc f13388g;
    /* renamed from: h */
    private final ise f13389h;
    /* renamed from: i */
    private final czb f13390i;
    /* renamed from: j */
    private final fbn f13391j;
    /* renamed from: k */
    private final gjk f13392k;
    /* renamed from: l */
    private final hek f13393l;
    /* renamed from: m */
    private final hjf f13394m;
    /* renamed from: n */
    private final bsn f13395n;
    /* renamed from: o */
    private final Runnable f13396o = new cxb(this);

    public cwz(ise ise, czb czb, fbn fbn, gjk gjk, hek hek, hjf hjf, bsn bsn) {
        this.f13389h = ise;
        this.f13390i = czb;
        this.f13391j = fbn;
        this.f13392k = gjk;
        this.f13393l = hek;
        this.f13394m = hjf;
        this.f13395n = bsn;
        this.f13383b = ise.mo8941b();
    }

    /* renamed from: a */
    public final cwi mo5880a(dzh dzh, czg czg) {
        jri.m13404b((Object) czg);
        cwi cwi = new cwi(this.f13396o);
        this.f13387f = this.f13390i.mo5895a(bmt.m919a(this.f13391j, this.f13394m, dzh.mo6125b()));
        this.f13386e = czg;
        cwc cwc = this.f13387f;
        this.f13383b.close();
        ikb b = this.f13389h.mo8941b();
        this.f13383b = b;
        this.f13388g = this.f13391j.mo13218b(cwc.f3020a);
        bcl bcl = (bcl) b.mo8557a(new bcl());
        this.f13384c = this.f13386e.mo5899a(cwc, kow.m13873a(this.f13393l), this.f13392k, new etg(false));
        kow.m13878a(this.f13384c, new cxa(this, bcl, cwi, b), Executors.newSingleThreadExecutor(iel.m3778c("CCDevMngr", 0)));
        return cwi;
    }
}

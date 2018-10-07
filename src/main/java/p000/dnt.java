package p000;

/* compiled from: PG */
/* renamed from: dnt */
public final class dnt extends doc {
    /* renamed from: c */
    public static final String f24037c = bli.m887a("VidIntStartPreview");
    /* renamed from: d */
    public final ffc f24038d;
    /* renamed from: e */
    public final iur f24039e;
    /* renamed from: f */
    public final bfe f24040f;
    /* renamed from: g */
    public final iwl f24041g;
    /* renamed from: h */
    public djz f24042h;
    /* renamed from: i */
    private final iut f24043i;

    public dnt(doc doc, bfe bfe, iur iur, iut iut, ffc ffc, djz djz, iwl iwl) {
        super((bug) doc);
        this.f24038d = ffc;
        this.f24039e = iur;
        this.f24043i = iut;
        this.f24040f = bfe;
        this.f24042h = djz;
        this.f24041g = iwl;
        mo2149a(dbd.class, new dnv(this));
        mo2149a(dlp.class, new dnw(this));
        mo2149a(dax.class, new dny(this));
    }

    /* renamed from: e */
    public final doc mo2150b() {
        boolean z;
        boolean z2;
        boolean b;
        boolean z3;
        boolean z4 = false;
        ine a = ((doa) mo2152d()).f14243j.mo5997a(this.f24043i, (bez) ((doa) mo2152d()).f14251r.mo12367b(this.f24039e).mo9706a(), inc.FPS_30, false);
        iqp a2 = new heh(this.f24038d, ((doa) mo2152d()).f14245l).mo7763a(ipz.f7670b, inc.FPS_30, a);
        ((doa) mo2152d()).f14249p.mo8826a(ipz.m4077b(a2));
        jri.m13404b((Object) a2);
        kpk a3 = ((doa) mo2152d()).f14244k.mo7769a(new heo(this.f24043i, a2, ipz.m4077b(a2)));
        ilb ilb = new ilb(this.f24038d.mo9075n());
        fze fze = new fze(((doa) mo2152d()).f14222A, this.f24038d);
        imy imy = ((doa) mo2152d()).f14227F;
        iut iut = this.f24043i;
        iun iun = this.f24038d;
        inc a4 = ((doa) mo2152d()).f14228G.mo13673b();
        if (!imy.f7471a.mo7904b()) {
            z = false;
        } else if (iut == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        if (imy.f7471a.mo7905c()) {
            z = true;
        } else if (imy.f7471a.mo7906d()) {
            z = true;
        }
        hjf hjf = imy.f7471a;
        ivy ivy = hjf.f6633b;
        if (ivy.f7874d) {
            z2 = true;
        } else if (ivy.f7875e) {
            z2 = true;
        } else if (hjf.mo7905c()) {
            z2 = true;
        } else if (imy.f7471a.mo7906d()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iun.mo9054A()) {
            b = imy.f7472b.mo6001b();
        } else {
            b = false;
        }
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("Video Stabilization Enabled: ");
        stringBuilder.append(b);
        bli.m894c("LightCycle-debug", stringBuilder.toString());
        if (!imy.f7471a.mo7905c()) {
            z3 = false;
        } else if (a4 != inc.FPS_30) {
            z3 = false;
        } else if (a != ine.RES_2160P) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((imy.f7471a.mo7904b() || imy.f7471a.mo7905c() || imy.f7471a.mo7906d()) && iut == iut.BACK) {
            z4 = true;
        }
        kow.m13878a(kny.m18476a(a3, new dnu(this, fze, ilb, imw.m3904h().mo8618b(z2).mo8620d(z4).mo8619c(z).mo8621e(b).mo8623g(imy.f7472b.mo6004d()).mo8622f(z3).mo8616a()), kpq.f8776a), new dnz(this), kpq.f8776a);
        return null;
    }
}

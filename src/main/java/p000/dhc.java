package p000;

/* compiled from: PG */
/* renamed from: dhc */
public final class dhc implements dhs {
    /* renamed from: c */
    private static final String f13845c = bli.m887a("CdrSlowMoDevOp");
    /* renamed from: a */
    public final asu f13846a;
    /* renamed from: b */
    public final dim f13847b;
    /* renamed from: d */
    private final ipv f13848d;
    /* renamed from: e */
    private final bfk f13849e;
    /* renamed from: f */
    private final dzh f13850f;
    /* renamed from: g */
    private final hjw f13851g;
    /* renamed from: h */
    private final ilp f13852h;
    /* renamed from: i */
    private final fbn f13853i;
    /* renamed from: j */
    private final gci f13854j;
    /* renamed from: k */
    private final djq f13855k;
    /* renamed from: l */
    private final dkb f13856l;
    /* renamed from: m */
    private final heq f13857m;
    /* renamed from: n */
    private final ilp f13858n;
    /* renamed from: o */
    private final ipz f13859o = ipz.f7670b;
    /* renamed from: p */
    private final how f13860p;
    /* renamed from: q */
    private final hjf f13861q;

    public dhc(hjf hjf, bfk bfk, dzh dzh, hjw hjw, ilb ilb, fbn fbn, gci gci, djq djq, dkb dkb, heq heq, asu asu, dim dim, ilp ilp, ipv ipv, how how) {
        this.f13848d = ipv;
        this.f13849e = bfk;
        this.f13850f = dzh;
        this.f13851g = hjw;
        this.f13852h = ilb;
        this.f13853i = fbn;
        this.f13854j = gci;
        this.f13855k = djq;
        this.f13856l = dkb;
        this.f13857m = heq;
        this.f13858n = ilp;
        this.f13847b = dim;
        this.f13846a = asu;
        this.f13860p = how;
        this.f13861q = hjf;
    }

    /* renamed from: a */
    public final kpk mo5969a() {
        bli.m888a(f13845c, "openCamcorderDevice");
        this.f13860p.mo8006e();
        this.f13860p.mo8010i();
        iut b = this.f13850f.mo6125b();
        iur b2 = this.f13853i.mo9091b(b);
        String valueOf;
        if (b2 == null) {
            valueOf = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Fail to find camera for facing ");
            stringBuilder.append(valueOf);
            return kow.m13874a(new IllegalStateException(stringBuilder.toString()));
        }
        kbg b3 = this.f13849e.mo12367b(b2);
        if (!b3.mo9709b()) {
            return kow.m13874a(new IllegalStateException("CamcorderCharacteristics is not available."));
        }
        boolean z;
        bez bez = (bez) b3.mo9706a();
        ffc ffc = bez.f1141a;
        inc inc = (inc) this.f13852h.mo13673b();
        ine a = this.f13856l.mo5997a(b, bez, inc, false);
        String str = f13845c;
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
        stringBuilder2.append("Video Resolution: ");
        stringBuilder2.append(valueOf2);
        bli.m894c(str, stringBuilder2.toString());
        jri.m13405b(bez.mo1933a(inc, a));
        jri.m13405b(inc.mo8637d());
        String str2 = f13845c;
        str = String.valueOf(inc);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 14);
        stringBuilder3.append("Capture Rate: ");
        stringBuilder3.append(str);
        bli.m894c(str2, stringBuilder3.toString());
        iqp a2 = new heh(ffc, this.f13857m).mo7763a(this.f13859o, inc, a);
        str = f13845c;
        valueOf2 = String.valueOf(a2);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
        stringBuilder2.append("Preview Size: ");
        stringBuilder2.append(valueOf2);
        bli.m894c(str, stringBuilder2.toString());
        kbg kbg = kau.f21835a;
        djz djz = new djz(b, ffc, this.f13854j);
        boolean a3 = this.f13856l.mo5999a(inc, a, this.f13855k.f14122a);
        str = f13845c;
        stringBuilder3 = new StringBuilder(20);
        stringBuilder3.append("Torch Enabled: ");
        stringBuilder3.append(a3);
        bli.m894c(str, stringBuilder3.toString());
        ilb ilb = new ilb(Boolean.valueOf(a3));
        kbg kbg2 = kau.f21835a;
        if (this.f13856l.mo6003c()) {
            kbg2 = kbg.m4804c(this.f13851g);
        }
        valueOf = f13845c;
        stringBuilder3 = new StringBuilder(20);
        stringBuilder3.append("H.265 enabled: ");
        stringBuilder3.append(false);
        bli.m894c(valueOf, stringBuilder3.toString());
        int a4 = this.f13856l.mo5996a(inc, a);
        valueOf = f13845c;
        stringBuilder3 = new StringBuilder(45);
        stringBuilder3.append("Max Recording Duration (Seconds): ");
        stringBuilder3.append(a4);
        bli.m894c(valueOf, stringBuilder3.toString());
        int b4 = this.f13856l.mo6000b(inc, a);
        valueOf = f13845c;
        stringBuilder3 = new StringBuilder(51);
        stringBuilder3.append("Max Torch Recording Duration (Seconds): ");
        stringBuilder3.append(b4);
        bli.m894c(valueOf, stringBuilder3.toString());
        if (this.f13861q.mo7905c()) {
            z = true;
        } else if (this.f13861q.mo7904b()) {
            z = true;
        } else {
            z = false;
        }
        bli.m888a(f13845c, "issue an openCamcorder request.");
        jri.m13395a(inc.mo8637d());
        return kny.m18475a(this.f13849e.mo12365a(inc, this.f13848d, a, b2, kau.f21835a, ilb, djz.f14125a, kbg2, z, false, a4, b4, kau.f21835a), new dhd(this, b3, ilb, b, djz, inc, a, new heo(b, a2, ipz.m4077b(a2)), b2, kbg), kpq.f8776a);
    }
}

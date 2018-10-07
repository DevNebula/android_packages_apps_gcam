package p000;

/* compiled from: PG */
/* renamed from: dhu */
public final class dhu implements dhs {
    /* renamed from: c */
    private static final String f13939c = bli.m887a("CdrFastDevOp");
    /* renamed from: a */
    public final asu f13940a;
    /* renamed from: b */
    public final dim f13941b;
    /* renamed from: d */
    private final hjf f13942d;
    /* renamed from: e */
    private final ipv f13943e;
    /* renamed from: f */
    private final bfk f13944f;
    /* renamed from: g */
    private final dzh f13945g;
    /* renamed from: h */
    private final hjw f13946h;
    /* renamed from: i */
    private final ilp f13947i;
    /* renamed from: j */
    private final fbn f13948j;
    /* renamed from: k */
    private final gci f13949k;
    /* renamed from: l */
    private final djq f13950l;
    /* renamed from: m */
    private final dkb f13951m;
    /* renamed from: n */
    private final heq f13952n;
    /* renamed from: o */
    private final ilp f13953o;
    /* renamed from: p */
    private final ipz f13954p = ipz.f7670b;
    /* renamed from: q */
    private final bsn f13955q;
    /* renamed from: r */
    private final how f13956r;

    public dhu(hjf hjf, bfk bfk, dzh dzh, hjw hjw, div div, fbn fbn, gci gci, djq djq, dkb dkb, heq heq, asu asu, dim dim, how how, ilp ilp, ipv ipv, bsn bsn) {
        this.f13942d = hjf;
        this.f13943e = ipv;
        this.f13944f = bfk;
        this.f13945g = dzh;
        this.f13946h = hjw;
        this.f13947i = div;
        this.f13948j = fbn;
        this.f13949k = gci;
        this.f13950l = djq;
        this.f13951m = dkb;
        this.f13952n = heq;
        this.f13953o = ilp;
        this.f13941b = dim;
        this.f13940a = asu;
        this.f13955q = bsn;
        this.f13956r = how;
    }

    /* renamed from: a */
    public final kpk mo5969a() {
        bli.m888a(f13939c, "openCamcorderDevice");
        iut b = this.f13945g.mo6125b();
        iur a = bmt.m919a(this.f13948j, this.f13942d, b);
        String valueOf;
        if (a == null) {
            valueOf = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Fail to find camera for facing ");
            stringBuilder.append(valueOf);
            return kow.m13874a(new IllegalStateException(stringBuilder.toString()));
        }
        this.f13956r.mo8002b(bmt.m917a(this.f13948j.mo9088a(a)));
        kbg b2 = this.f13944f.mo12367b(a);
        if (!b2.mo9709b()) {
            return kow.m13874a(new IllegalStateException("CamcorderCharacteristics is not available."));
        }
        String str;
        bez bez = (bez) b2.mo9706a();
        ffc ffc = bez.f1141a;
        inc inc = (inc) this.f13947i.mo13673b();
        ine a2 = this.f13951m.mo5997a(b, bez, inc, false);
        String str2 = f13939c;
        String valueOf2 = String.valueOf(a2);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
        stringBuilder2.append("Video Resolution: ");
        stringBuilder2.append(valueOf2);
        bli.m894c(str2, stringBuilder2.toString());
        if (!bez.mo1933a(inc, a2)) {
            str = f13939c;
            valueOf = String.valueOf(inc);
            str2 = String.valueOf(a2);
            stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 41) + String.valueOf(str2).length());
            stringBuilder2.append("Fallback to 30 FPS. [");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(",");
            stringBuilder2.append(str2);
            stringBuilder2.append("] is not supported.");
            bli.m894c(str, stringBuilder2.toString());
            inc = inc.FPS_30;
        }
        str = f13939c;
        str2 = String.valueOf(inc);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 14);
        stringBuilder3.append("Capture Rate: ");
        stringBuilder3.append(str2);
        bli.m894c(str, stringBuilder3.toString());
        iqp a3 = new heh(ffc, this.f13952n).mo7763a(this.f13954p, inc, a2);
        str = f13939c;
        str2 = String.valueOf(a3);
        stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 14);
        stringBuilder3.append("Preview Size: ");
        stringBuilder3.append(str2);
        bli.m894c(str, stringBuilder3.toString());
        kbg kbg = kau.f21835a;
        if (inc.mo8636c()) {
            kbg = dkt.m1700a(inc, a2, ffc.mo9063b(256));
            if (kbg.mo9709b()) {
                str = f13939c;
                str2 = String.valueOf(kbg.mo9706a());
                stringBuilder3 = new StringBuilder(String.valueOf(str2).length() + 15);
                stringBuilder3.append("Snapshot Size: ");
                stringBuilder3.append(str2);
                bli.m894c(str, stringBuilder3.toString());
            }
        }
        djz djz = new djz(b, ffc, this.f13949k);
        boolean a4 = this.f13951m.mo5999a(inc, a2, this.f13950l.f14122a);
        String str3 = f13939c;
        StringBuilder stringBuilder4 = new StringBuilder(20);
        stringBuilder4.append("Torch Enabled: ");
        stringBuilder4.append(a4);
        bli.m894c(str3, stringBuilder4.toString());
        ilp ilb = new ilb(Boolean.valueOf(a4));
        kbg kbg2 = kau.f21835a;
        if (this.f13951m.mo6003c()) {
            kbg2 = kbg.m4804c(this.f13946h);
        }
        str = f13939c;
        StringBuilder stringBuilder5 = new StringBuilder(20);
        stringBuilder5.append("H.265 enabled: ");
        stringBuilder5.append(false);
        bli.m894c(str, stringBuilder5.toString());
        int a5 = this.f13951m.mo5996a(inc, a2);
        str = f13939c;
        stringBuilder5 = new StringBuilder(45);
        stringBuilder5.append("Max Recording Duration (Seconds): ");
        stringBuilder5.append(a5);
        bli.m894c(str, stringBuilder5.toString());
        int b3 = this.f13951m.mo6000b(inc, a2);
        str = f13939c;
        stringBuilder5 = new StringBuilder(51);
        stringBuilder5.append("Max Torch Recording Duration (Seconds): ");
        stringBuilder5.append(b3);
        bli.m894c(str, stringBuilder5.toString());
        boolean z = inc.mo8637d() ? !this.f13942d.mo7905c() ? this.f13942d.mo7904b() : true : true;
        bli.m888a(f13939c, "issue an openCamcorder request.");
        jri.m13395a(inc.mo8636c());
        bsn bsn = this.f13951m.f3319a;
        kpk a6 = kny.m18475a(this.f13944f.mo12365a(inc, this.f13943e, a2, a, kau.f21835a, ilb, djz.f14125a, kbg2, z, false, a5, b3, kau.f21835a), new dhv(this, b2, ilb, b, djz, inc, a2, new heo(b, a3, ipz.m4077b(a3)), a, kbg), kpq.f8776a);
        kow.m13878a(a6, new dhw(djz), kpq.f8776a);
        return a6;
    }
}

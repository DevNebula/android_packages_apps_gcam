package p000;

/* compiled from: PG */
/* renamed from: czb */
public final class czb {
    /* renamed from: a */
    private final cvv f3053a;
    /* renamed from: b */
    private final iqz f3054b;

    czb(cvv cvv, ira ira) {
        this.f3053a = cvv;
        this.f3054b = ira.mo8854a("CptModuleCfgBldr");
    }

    /* renamed from: a */
    public final cwc mo5895a(iur iur) {
        cvv cvv = this.f3053a;
        jri.m13404b((Object) iur);
        cvv.f3013a.mo8856a("OneConfig#create");
        cvv.f3013a.mo8856a("OneConfig#oneCharacteristics");
        ffc b = cvv.f3014b.mo13218b(iur);
        iut c = b.mo9064c();
        cvv.f3013a.mo8858b("OneConfig#pictureSize");
        iqp a = cvv.f3015c.mo6160a(iur, c);
        cvv.f3013a.mo8858b("OneConfig#selectViewfinder");
        iqp a2 = cvv.f3016d.mo7777a(b.mo9078q(), a, c);
        heo heo = new heo(c, a2, ipz.m4077b(a2));
        cvv.f3013a.mo8857b();
        cwc cwc = new cwc(iur, c, ipz.m4077b(a), a, heo);
        cvv.f3013a.mo8857b();
        iqz iqz = this.f3054b;
        String valueOf = String.valueOf(iur);
        String valueOf2 = String.valueOf(cwc);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(valueOf2).length());
        stringBuilder.append("Selected configuration for camera (");
        stringBuilder.append(valueOf);
        stringBuilder.append("): ");
        stringBuilder.append(valueOf2);
        iqz.mo8836d(stringBuilder.toString());
        return cwc;
    }
}

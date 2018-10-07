package p000;

/* compiled from: PG */
/* renamed from: asy */
public final class asy {
    /* renamed from: a */
    private final kwk f983a;
    /* renamed from: b */
    private final kwk f984b;
    /* renamed from: c */
    private final kwk f985c;
    /* renamed from: d */
    private final kwk f986d;
    /* renamed from: e */
    private final kwk f987e;

    public asy(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        asy.m713a(kwk, 1);
        this.f983a = (kwk) asy.m713a(kwk2, 2);
        this.f984b = (kwk) asy.m713a(kwk3, 3);
        this.f985c = (kwk) asy.m713a(kwk4, 4);
        this.f986d = (kwk) asy.m713a(kwk5, 5);
        this.f987e = (kwk) asy.m713a(kwk6, 6);
    }

    /* renamed from: a */
    private static Object m713a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ asx mo1789a(asn asn, ilp ilp, ffc ffc) {
        hig hig = (hig) asy.m713a((hig) this.f983a.mo10566a(), 2);
        hik hik = (hik) asy.m713a((hik) this.f984b.mo10566a(), 3);
        ilp ilp2 = (ilp) asy.m713a((ilp) this.f985c.mo10566a(), 4);
        irs irs = (irs) asy.m713a((irs) this.f986d.mo10566a(), 5);
        asy.m713a((ikd) this.f987e.mo10566a(), 6);
        asn asn2 = (asn) asy.m713a(asn, 7);
        asy.m713a(ilp, 8);
        asy.m713a(ffc, 9);
        return new asx(hig, hik, ilp2, irs, asn2);
    }
}

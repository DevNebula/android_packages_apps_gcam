package p000;

/* compiled from: PG */
/* renamed from: awg */
public final class awg implements asu {
    /* renamed from: a */
    private final kwk f10933a;
    /* renamed from: b */
    private final kwk f10934b;
    /* renamed from: c */
    private final kwk f10935c;
    /* renamed from: d */
    private final kwk f10936d;
    /* renamed from: e */
    private final kwk f10937e;
    /* renamed from: f */
    private final kwk f10938f;
    /* renamed from: g */
    private final kwk f10939g;

    public awg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        this.f10933a = (kwk) awg.m7161a(kwk, 1);
        this.f10934b = (kwk) awg.m7161a(kwk2, 2);
        this.f10935c = (kwk) awg.m7161a(kwk3, 3);
        this.f10936d = (kwk) awg.m7161a(kwk4, 4);
        this.f10937e = (kwk) awg.m7161a(kwk5, 5);
        this.f10938f = (kwk) awg.m7161a(kwk6, 6);
        this.f10939g = (kwk) awg.m7161a(kwk7, 7);
    }

    /* renamed from: a */
    private static Object m7161a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ ast mo1787a(asn asn, ffc ffc, ilp ilp, kbg kbg, ilp ilp2) {
        asl asl = (asl) awg.m7161a((asl) this.f10933a.mo10566a(), 1);
        aso aso = (aso) awg.m7161a((aso) this.f10934b.mo10566a(), 2);
        asy asy = (asy) awg.m7161a((asy) this.f10935c.mo10566a(), 3);
        atb atb = (atb) awg.m7161a((atb) this.f10936d.mo10566a(), 4);
        hnh hnh = (hnh) awg.m7161a((hnh) this.f10937e.mo10566a(), 5);
        hnf hnf = (hnf) awg.m7161a((hnf) this.f10938f.mo10566a(), 6);
        ikd ikd = (ikd) awg.m7161a((ikd) this.f10939g.mo10566a(), 7);
        asn asn2 = (asn) awg.m7161a(asn, 8);
        ffc ffc2 = (ffc) awg.m7161a(ffc, 9);
        ilp ilp3 = (ilp) awg.m7161a(ilp, 10);
        awg.m7161a(kbg, 11);
        return new awe(asl, aso, asy, atb, hnh, hnf, ikd, asn2, ffc2, ilp3, (ilp) awg.m7161a(ilp2, 12));
    }
}

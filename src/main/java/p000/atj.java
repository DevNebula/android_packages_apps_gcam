package p000;

/* compiled from: PG */
/* renamed from: atj */
public final class atj implements asu {
    /* renamed from: a */
    private final kwk f10725a;

    public atj(kwk kwk) {
        this.f10725a = (kwk) atj.m7042a(kwk, 1);
    }

    /* renamed from: a */
    private static Object m7042a(Object obj, int i) {
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
        aso aso = (aso) atj.m7042a((aso) this.f10725a.mo10566a(), 1);
        atj.m7042a(asn, 2);
        atj.m7042a(ffc, 3);
        atj.m7042a(ilp, 4);
        atj.m7042a(kbg, 5);
        atj.m7042a(ilp2, 6);
        return new ati(aso);
    }
}

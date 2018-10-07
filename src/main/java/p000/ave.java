package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ave */
public final class ave implements asu {
    /* renamed from: a */
    private final kwk f10847a;
    /* renamed from: b */
    private final kwk f10848b;
    /* renamed from: c */
    private final kwk f10849c;
    /* renamed from: d */
    private final kwk f10850d;
    /* renamed from: e */
    private final kwk f10851e;
    /* renamed from: f */
    private final kwk f10852f;
    /* renamed from: g */
    private final kwk f10853g;
    /* renamed from: h */
    private final kwk f10854h;
    /* renamed from: i */
    private final kwk f10855i;

    public ave(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        this.f10847a = (kwk) ave.m7115a(kwk, 1);
        this.f10848b = (kwk) ave.m7115a(kwk2, 2);
        this.f10849c = (kwk) ave.m7115a(kwk3, 3);
        this.f10850d = (kwk) ave.m7115a(kwk4, 4);
        this.f10851e = (kwk) ave.m7115a(kwk5, 5);
        this.f10852f = (kwk) ave.m7115a(kwk6, 6);
        this.f10853g = (kwk) ave.m7115a(kwk7, 7);
        this.f10854h = (kwk) ave.m7115a(kwk8, 8);
        ave.m7115a(kwk9, 9);
        this.f10855i = (kwk) ave.m7115a(kwk10, 10);
    }

    /* renamed from: a */
    private static Object m7115a(Object obj, int i) {
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
        asl asl = (asl) ave.m7115a((asl) this.f10847a.mo10566a(), 1);
        aso aso = (aso) ave.m7115a((aso) this.f10848b.mo10566a(), 2);
        asy asy = (asy) ave.m7115a((asy) this.f10849c.mo10566a(), 3);
        atb atb = (atb) ave.m7115a((atb) this.f10850d.mo10566a(), 4);
        atn atn = (atn) ave.m7115a((atn) this.f10851e.mo10566a(), 5);
        hnh hnh = (hnh) ave.m7115a((hnh) this.f10852f.mo10566a(), 6);
        hnf hnf = (hnf) ave.m7115a((hnf) this.f10853g.mo10566a(), 7);
        ikd ikd = (ikd) ave.m7115a((ikd) this.f10854h.mo10566a(), 8);
        Set set = (Set) ave.m7115a((Set) this.f10855i.mo10566a(), 10);
        asn asn2 = (asn) ave.m7115a(asn, 11);
        ffc ffc2 = (ffc) ave.m7115a(ffc, 12);
        ilp ilp3 = (ilp) ave.m7115a(ilp, 13);
        ave.m7115a(kbg, 14);
        return new avc(asl, aso, asy, atb, atn, hnh, hnf, ikd, set, asn2, ffc2, ilp3, (ilp) ave.m7115a(ilp2, 15));
    }
}

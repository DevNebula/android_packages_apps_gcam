package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: auc */
public final class auc implements asu {
    /* renamed from: a */
    private final kwk f10763a;
    /* renamed from: b */
    private final kwk f10764b;
    /* renamed from: c */
    private final kwk f10765c;
    /* renamed from: d */
    private final kwk f10766d;
    /* renamed from: e */
    private final kwk f10767e;
    /* renamed from: f */
    private final kwk f10768f;
    /* renamed from: g */
    private final kwk f10769g;
    /* renamed from: h */
    private final kwk f10770h;
    /* renamed from: i */
    private final kwk f10771i;

    public auc(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        this.f10763a = (kwk) auc.m7077a(kwk, 1);
        this.f10764b = (kwk) auc.m7077a(kwk2, 2);
        this.f10765c = (kwk) auc.m7077a(kwk3, 3);
        this.f10766d = (kwk) auc.m7077a(kwk4, 4);
        this.f10767e = (kwk) auc.m7077a(kwk5, 5);
        this.f10768f = (kwk) auc.m7077a(kwk6, 6);
        this.f10769g = (kwk) auc.m7077a(kwk7, 7);
        this.f10770h = (kwk) auc.m7077a(kwk8, 8);
        auc.m7077a(kwk9, 9);
        this.f10771i = (kwk) auc.m7077a(kwk10, 10);
    }

    /* renamed from: a */
    private static Object m7077a(Object obj, int i) {
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
        asl asl = (asl) auc.m7077a((asl) this.f10763a.mo10566a(), 1);
        aso aso = (aso) auc.m7077a((aso) this.f10764b.mo10566a(), 2);
        asy asy = (asy) auc.m7077a((asy) this.f10765c.mo10566a(), 3);
        atb atb = (atb) auc.m7077a((atb) this.f10766d.mo10566a(), 4);
        atn atn = (atn) auc.m7077a((atn) this.f10767e.mo10566a(), 5);
        hnh hnh = (hnh) auc.m7077a((hnh) this.f10768f.mo10566a(), 6);
        hnf hnf = (hnf) auc.m7077a((hnf) this.f10769g.mo10566a(), 7);
        ikd ikd = (ikd) auc.m7077a((ikd) this.f10770h.mo10566a(), 8);
        Set set = (Set) auc.m7077a((Set) this.f10771i.mo10566a(), 10);
        asn asn2 = (asn) auc.m7077a(asn, 11);
        ffc ffc2 = (ffc) auc.m7077a(ffc, 12);
        ilp ilp3 = (ilp) auc.m7077a(ilp, 13);
        auc.m7077a(kbg, 14);
        return new avc(asl, aso, asy, atb, atn, hnh, hnf, ikd, set, asn2, ffc2, ilp3, (ilp) auc.m7077a(ilp2, 15), (byte) 0);
    }
}

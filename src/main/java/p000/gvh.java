package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gvh */
public final class gvh implements asu {
    /* renamed from: a */
    private final kwk f19653a;
    /* renamed from: b */
    private final kwk f19654b;
    /* renamed from: c */
    private final kwk f19655c;
    /* renamed from: d */
    private final kwk f19656d;
    /* renamed from: e */
    private final kwk f19657e;
    /* renamed from: f */
    private final kwk f19658f;
    /* renamed from: g */
    private final kwk f19659g;
    /* renamed from: h */
    private final kwk f19660h;
    /* renamed from: i */
    private final kwk f19661i;
    /* renamed from: j */
    private final kwk f19662j;
    /* renamed from: k */
    private final kwk f19663k;

    public gvh(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12) {
        this.f19653a = (kwk) gvh.m11799a(kwk, 1);
        this.f19654b = (kwk) gvh.m11799a(kwk2, 2);
        this.f19655c = (kwk) gvh.m11799a(kwk3, 3);
        this.f19656d = (kwk) gvh.m11799a(kwk4, 4);
        this.f19657e = (kwk) gvh.m11799a(kwk5, 5);
        this.f19658f = (kwk) gvh.m11799a(kwk6, 6);
        this.f19659g = (kwk) gvh.m11799a(kwk7, 7);
        this.f19660h = (kwk) gvh.m11799a(kwk8, 8);
        gvh.m11799a(kwk9, 9);
        this.f19661i = (kwk) gvh.m11799a(kwk10, 10);
        this.f19662j = (kwk) gvh.m11799a(kwk11, 11);
        this.f19663k = (kwk) gvh.m11799a(kwk12, 12);
    }

    /* renamed from: a */
    private static Object m11799a(Object obj, int i) {
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
        asl asl = (asl) gvh.m11799a((asl) this.f19653a.mo10566a(), 1);
        aso aso = (aso) gvh.m11799a((aso) this.f19654b.mo10566a(), 2);
        asy asy = (asy) gvh.m11799a((asy) this.f19655c.mo10566a(), 3);
        atb atb = (atb) gvh.m11799a((atb) this.f19656d.mo10566a(), 4);
        atn atn = (atn) gvh.m11799a((atn) this.f19657e.mo10566a(), 5);
        hnh hnh = (hnh) gvh.m11799a((hnh) this.f19658f.mo10566a(), 6);
        gvh.m11799a((hnf) this.f19659g.mo10566a(), 7);
        ikd ikd = (ikd) gvh.m11799a((ikd) this.f19660h.mo10566a(), 8);
        hig hig = (hig) gvh.m11799a((hig) this.f19661i.mo10566a(), 10);
        hik hik = (hik) gvh.m11799a((hik) this.f19662j.mo10566a(), 11);
        Set set = (Set) gvh.m11799a((Set) this.f19663k.mo10566a(), 12);
        asn asn2 = (asn) gvh.m11799a(asn, 13);
        ffc ffc2 = (ffc) gvh.m11799a(ffc, 14);
        ilp ilp3 = (ilp) gvh.m11799a(ilp, 15);
        gvh.m11799a(kbg, 16);
        return new gvf(asl, aso, asy, atb, atn, hnh, ikd, hig, hik, set, asn2, ffc2, ilp3, (ilp) gvh.m11799a(ilp2, 17));
    }
}

package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: avg */
public final class avg implements asn {
    /* renamed from: a */
    public static final String f10866a = bli.m887a("TouchToFocus");
    /* renamed from: b */
    public final iqt f10867b;
    /* renamed from: c */
    public final ilb f10868c;
    /* renamed from: d */
    public final ikp f10869d;
    /* renamed from: e */
    public final fbr f10870e;
    /* renamed from: f */
    public kpk f10871f;
    /* renamed from: g */
    public kpw f10872g;
    /* renamed from: h */
    private final int f10873h;
    /* renamed from: i */
    private final fdy f10874i;
    /* renamed from: j */
    private final kwk f10875j;
    /* renamed from: k */
    private final fff f10876k;
    /* renamed from: l */
    private final ilp f10877l;

    avg(ikb ikb, ilb ilb, ffc ffc, fdy fdy, kwk kwk, fff fff, ilb ilb2, ikp ikp, fbr fbr, bps bps) {
        this.f10867b = ilb;
        this.f10876k = fff;
        this.f10868c = ilb2;
        this.f10869d = ikp;
        this.f10873h = ffc.mo9076o();
        this.f10874i = fdy;
        this.f10875j = kwk;
        this.f10870e = fbr;
        this.f10877l = bps.f1443a;
        ikb.mo8557a(fbr.f4692b.mo13672a(new avh(this), kpq.f8776a));
        ikb.mo8557a(this.f10877l.mo13672a(new avi(ikp), kpq.f8776a));
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        ikd.m12501a();
        this.f10869d.mo13668a();
        kpk kpk = this.f10871f;
        if (!(kpk == null || kpk.isDone())) {
            this.f10871f.cancel(true);
        }
        iqt iqt = this.f10867b;
        PointF pointF = asw.f977a;
        iqt.mo8826a(atz.m7074a(pointF, pointF, this.f10873h, this.f10874i));
        this.f10868c.mo8826a(gig.AUTO);
        ash ash = (ash) this.f10875j.mo10566a();
        this.f10871f = ash.mo1779a(this.f10876k);
        kow.m13878a(ash.mo1778a(), new avj(this), kpq.f8776a);
        kpw d = kpw.m18486d();
        this.f10872g = d;
        return new avk(this, ash, d, asw);
    }
}

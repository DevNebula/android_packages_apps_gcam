package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: auj */
public final class auj implements asn {
    /* renamed from: a */
    public static final String f10798a = bli.m887a("SmartTouchToFocus");
    /* renamed from: b */
    public final ilb f10799b;
    /* renamed from: c */
    public final fbr f10800c;
    /* renamed from: d */
    public final ilb f10801d;
    /* renamed from: e */
    public final ikp f10802e;
    /* renamed from: f */
    public final aug f10803f;
    /* renamed from: g */
    public kpk f10804g;
    /* renamed from: h */
    public kpw f10805h;
    /* renamed from: i */
    public final Runnable f10806i = new aum(this);
    /* renamed from: j */
    private final ffc f10807j;
    /* renamed from: k */
    private final fff f10808k;
    /* renamed from: l */
    private final fdy f10809l;
    /* renamed from: m */
    private final kwk f10810m;

    auj(ilb ilb, ikp ikp, ffc ffc, fff fff, ilb ilb2, fdy fdy, kwk kwk, aug aug, fbr fbr) {
        this.f10799b = ilb;
        this.f10807j = ffc;
        this.f10808k = fff;
        this.f10801d = ilb2;
        this.f10809l = fdy;
        this.f10810m = kwk;
        this.f10802e = ikp;
        this.f10803f = aug;
        this.f10800c = fbr;
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        boolean z = true;
        this.f10802e.mo13668a();
        this.f10803f.f10785b = null;
        kpk kpk = this.f10804g;
        if (!(kpk == null || kpk.isDone())) {
            this.f10804g.cancel(true);
        }
        ilb ilb = this.f10801d;
        PointF pointF = asw.f977a;
        ilb.mo8826a(atz.m7074a(pointF, pointF, this.f10807j.mo9076o(), this.f10809l));
        this.f10799b.mo8826a(gig.AUTO);
        ash ash = (ash) this.f10810m.mo10566a();
        this.f10804g = ash.mo1779a(this.f10808k);
        if (this.f10804g == null) {
            z = false;
        }
        jqk.m13347a(z);
        kpw d = kpw.m18486d();
        this.f10805h = d;
        kow.m13878a(ash.mo1778a(), new auk(this), kpq.f8776a);
        return new aul(this, ash, d, asw);
    }
}

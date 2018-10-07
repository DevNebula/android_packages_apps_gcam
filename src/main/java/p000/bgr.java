package p000;

import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bgr */
final class bgr implements kov {
    /* renamed from: a */
    private final /* synthetic */ biw f11317a;
    /* renamed from: b */
    private final /* synthetic */ bhs f11318b;
    /* renamed from: c */
    private final /* synthetic */ bhr f11319c;
    /* renamed from: d */
    private final /* synthetic */ bhu f11320d;
    /* renamed from: e */
    private final /* synthetic */ Surface f11321e;
    /* renamed from: f */
    private final /* synthetic */ ffc f11322f;
    /* renamed from: g */
    private final /* synthetic */ ilb f11323g;
    /* renamed from: h */
    private final /* synthetic */ ilb f11324h;
    /* renamed from: i */
    private final /* synthetic */ ilp f11325i;
    /* renamed from: j */
    private final /* synthetic */ imw f11326j;
    /* renamed from: k */
    private final /* synthetic */ ilp f11327k;
    /* renamed from: l */
    private final /* synthetic */ ilb f11328l;
    /* renamed from: m */
    private final /* synthetic */ kwk f11329m;
    /* renamed from: n */
    private final /* synthetic */ bhl f11330n;
    /* renamed from: o */
    private final /* synthetic */ ilp f11331o;
    /* renamed from: p */
    private final /* synthetic */ ilp f11332p;
    /* renamed from: q */
    private final /* synthetic */ ilp f11333q;
    /* renamed from: r */
    private final /* synthetic */ iqt f11334r;
    /* renamed from: s */
    private final /* synthetic */ fiw f11335s;
    /* renamed from: t */
    private final /* synthetic */ kpw f11336t;
    /* renamed from: u */
    private final /* synthetic */ bgp f11337u;

    bgr(bgp bgp, biw biw, bhs bhs, bhr bhr, bhu bhu, Surface surface, ffc ffc, ilb ilb, ilb ilb2, ilp ilp, imw imw, ilp ilp2, ilp ilp3, ilb ilb3, kwk kwk, bhl bhl, ilp ilp4, ilp ilp5, ilp ilp6, iqt iqt, fiw fiw, kpw kpw) {
        this.f11337u = bgp;
        this.f11317a = biw;
        this.f11318b = bhs;
        this.f11319c = bhr;
        this.f11320d = bhu;
        this.f11321e = surface;
        this.f11322f = ffc;
        this.f11323g = ilb;
        this.f11324h = ilb2;
        this.f11325i = ilp;
        this.f11326j = imw;
        this.f11327k = ilp2;
        this.f11328l = ilb3;
        this.f11329m = kwk;
        this.f11330n = bhl;
        this.f11331o = ilp4;
        this.f11332p = ilp5;
        this.f11333q = ilp6;
        this.f11334r = iqt;
        this.f11335s = fiw;
        this.f11336t = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = bgp.f22738a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append("CamcorderCaptureSession-initialization sequence fails: ");
        stringBuilder.append(valueOf);
        bli.m894c(str, stringBuilder.toString());
        this.f11336t.mo15642a(th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bhj bhj = (bhj) obj;
        if (bhj != null) {
            synchronized (this.f11337u.f22750m) {
                bli.m894c(bgp.f22738a, "Preview-starting task is done successfully.");
                boolean z = this.f11337u.f22752o;
                if (z) {
                    bli.m898e(bgp.f22738a, "CamcorderDevice has been closed.");
                    return;
                }
                bjr bjr;
                bhe bie;
                jri.m13405b(z ^ 1);
                jri.m13404b(this.f11317a);
                jri.m13404b(this.f11318b);
                bic bic = new bic(this.f11319c, this.f11320d, this.f11337u.f22742e, this.f11321e);
                bjl bjl = new bjl(this.f11317a, bic);
                if (this.f11337u.f22743f.mo12385b()) {
                    bjr = new bjr(this.f11337u.f22740c, this.f11317a, new bhx(this.f11337u.f22747j, bhj, this.f11321e, this.f11318b));
                } else {
                    bgp bgp = this.f11337u;
                    Object bjr2 = new bjo(bgp.f22742e, bgp.f22740c, this.f11317a);
                }
                bjj bjj = new bjj(this.f11317a);
                bjg bjh = new bjh(this.f11317a);
                bgw bgx = new bgx(this.f11319c, this.f11320d, this.f11337u.f22742e, this.f11322f, new fdy(), this.f11323g, this.f11324h, this.f11325i);
                if (this.f11326j.mo8612d()) {
                    bgw bgw = bgx;
                    bie = new bie(bgw, this.f11337u.f22748k, new ikp(iel.m3780e("CamcorderEx", 1), 2, TimeUnit.SECONDS), this.f11323g, this.f11324h, this.f11327k, this.f11325i, this.f11328l, (aug) this.f11329m.mo10566a());
                } else {
                    bie = new bhf(bgx, new ikp(iel.m3780e("CamcorderEx", 1), 8, TimeUnit.SECONDS), this.f11323g, this.f11324h);
                }
                this.f11337u.f22749l.mo8856a(String.valueOf(bgp.f22738a).concat("#CamcorderCaptureSessionImpl"));
                Object obj2 = this.f11337u;
                obj2.f22751n = new bea(obj2, bie, obj2.f22739b, this.f11330n, obj2.f22740c, obj2.f22741d, obj2.f22743f, bjl, bjr2, bjj, bjh, this.f11331o, this.f11332p, obj2.f22744g, obj2.f22745h, this.f11333q, obj2.f22746i, obj2.f22747j, bic, this.f11321e, this.f11334r, bhj, this.f11318b, this.f11317a, this.f11335s);
                this.f11337u.f22749l.mo8857b();
                this.f11336t.mo15641a(kbg.m4804c(this.f11337u.f22751n));
                return;
            }
        }
        bli.m898e(bgp.f22738a, "Preview-starting task is failed.");
    }
}

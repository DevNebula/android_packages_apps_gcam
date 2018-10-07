package p000;

import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bgo */
final class bgo implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f11293a;
    /* renamed from: b */
    private final /* synthetic */ ios f11294b;
    /* renamed from: c */
    private final /* synthetic */ bhs f11295c;
    /* renamed from: d */
    private final /* synthetic */ bhr f11296d;
    /* renamed from: e */
    private final /* synthetic */ bhu f11297e;
    /* renamed from: f */
    private final /* synthetic */ Surface f11298f;
    /* renamed from: g */
    private final /* synthetic */ ffc f11299g;
    /* renamed from: h */
    private final /* synthetic */ ilb f11300h;
    /* renamed from: i */
    private final /* synthetic */ ilb f11301i;
    /* renamed from: j */
    private final /* synthetic */ ilp f11302j;
    /* renamed from: k */
    private final /* synthetic */ imw f11303k;
    /* renamed from: l */
    private final /* synthetic */ ilp f11304l;
    /* renamed from: m */
    private final /* synthetic */ ilb f11305m;
    /* renamed from: n */
    private final /* synthetic */ kwk f11306n;
    /* renamed from: o */
    private final /* synthetic */ bhl f11307o;
    /* renamed from: p */
    private final /* synthetic */ ilp f11308p;
    /* renamed from: q */
    private final /* synthetic */ ilp f11309q;
    /* renamed from: r */
    private final /* synthetic */ ilp f11310r;
    /* renamed from: s */
    private final /* synthetic */ iqt f11311s;
    /* renamed from: t */
    private final /* synthetic */ fiw f11312t;
    /* renamed from: u */
    private final /* synthetic */ bgm f11313u;

    bgo(bgm bgm, kpw kpw, ios ios, bhs bhs, bhr bhr, bhu bhu, Surface surface, ffc ffc, ilb ilb, ilb ilb2, ilp ilp, imw imw, ilp ilp2, ilp ilp3, ilb ilb3, kwk kwk, bhl bhl, ilp ilp4, ilp ilp5, ilp ilp6, iqt iqt, fiw fiw) {
        this.f11313u = bgm;
        this.f11293a = kpw;
        this.f11294b = ios;
        this.f11295c = bhs;
        this.f11296d = bhr;
        this.f11297e = bhu;
        this.f11298f = surface;
        this.f11299g = ffc;
        this.f11300h = ilb;
        this.f11301i = ilb2;
        this.f11302j = ilp;
        this.f11303k = imw;
        this.f11304l = ilp2;
        this.f11305m = ilb3;
        this.f11306n = kwk;
        this.f11307o = bhl;
        this.f11308p = ilp4;
        this.f11309q = ilp5;
        this.f11310r = ilp6;
        this.f11311s = iqt;
        this.f11312t = fiw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = bgm.f22714a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 55);
        stringBuilder.append("CamcorderCaptureSession-initialization sequence fails: ");
        stringBuilder.append(valueOf);
        bli.m894c(str, stringBuilder.toString());
        this.f11293a.mo15642a(th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bhj bhj = (bhj) obj;
        if (bhj != null) {
            synchronized (this.f11313u.f22726m) {
                bli.m894c(bgm.f22714a, "Preview-starting task is done successfully.");
                boolean z = this.f11313u.f22728o;
                if (z) {
                    bli.m898e(bgm.f22714a, "CamcorderDevice has been closed.");
                    this.f11294b.close();
                    this.f11293a.mo15641a(kau.f21835a);
                    return;
                }
                bhe bie;
                jri.m13405b(z ^ 1);
                jri.m13404b(this.f11294b);
                jri.m13404b(this.f11295c);
                bic bic = new bic(this.f11296d, this.f11297e, this.f11313u.f22718e, this.f11298f);
                bgw bgx = new bgx(this.f11296d, this.f11297e, this.f11313u.f22718e, this.f11299g, new fdy(), this.f11300h, this.f11301i, this.f11302j);
                if (this.f11303k.mo8612d()) {
                    bgw bgw = bgx;
                    bie = new bie(bgw, this.f11313u.f22724k, new ikp(iel.m3780e("CamcorderEx", 1), 2, TimeUnit.SECONDS), this.f11300h, this.f11301i, this.f11304l, this.f11302j, this.f11305m, (aug) this.f11306n.mo10566a());
                } else {
                    bie = new bhf(bgx, new ikp(iel.m3780e("CamcorderEx", 1), 8, TimeUnit.SECONDS), this.f11300h, this.f11301i);
                }
                this.f11313u.f22725l.mo8856a(String.valueOf(bgm.f22714a).concat("#CamcorderCaptureSessionImpl"));
                Object obj2 = this.f11313u;
                obj2.f22727n = new bem(obj2, bie, obj2.f22715b, this.f11307o, obj2.f22716c, obj2.f22717d, obj2.f22719f, this.f11308p, this.f11309q, obj2.f22720g, obj2.f22721h, this.f11310r, obj2.f22722i, obj2.f22723j, bic, this.f11298f, this.f11311s, bhj, this.f11295c, this.f11294b, this.f11312t);
                this.f11313u.f22725l.mo8857b();
                this.f11293a.mo15641a(kbg.m4804c(this.f11313u.f22727n));
                return;
            }
        }
        bli.m898e(bgm.f22714a, "Preview-starting task is failed.");
        this.f11293a.mo15641a(kau.f21835a);
    }
}

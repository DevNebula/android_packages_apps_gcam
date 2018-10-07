package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: dgl */
public final class dgl implements ezx, hfk {
    /* renamed from: a */
    public static final String f23868a = bli.m887a("GoudaModule");
    /* renamed from: A */
    public ikb f23869A;
    /* renamed from: B */
    public BottomBarController f23870B;
    /* renamed from: C */
    public hcd f23871C;
    /* renamed from: D */
    public gdl f23872D;
    /* renamed from: E */
    public czp f23873E;
    /* renamed from: F */
    public ilp f23874F;
    /* renamed from: G */
    public final hjm f23875G = new hjm(5);
    /* renamed from: H */
    public final cze f23876H;
    /* renamed from: I */
    public final ilp f23877I;
    /* renamed from: J */
    public final BottomBarListener f23878J = new dgs(this);
    /* renamed from: K */
    public iqt f23879K = new dgm(this);
    /* renamed from: L */
    public final hnz f23880L = new dgv(this);
    /* renamed from: M */
    private final ird f23881M;
    /* renamed from: N */
    private final cwy f23882N;
    /* renamed from: O */
    private final czg f23883O;
    /* renamed from: P */
    private final czm f23884P;
    /* renamed from: Q */
    private final fbg f23885Q;
    /* renamed from: R */
    private final gvr f23886R;
    /* renamed from: S */
    private final fbn f23887S;
    /* renamed from: T */
    private final hjf f23888T;
    /* renamed from: U */
    private Timer f23889U;
    /* renamed from: V */
    private cwi f23890V;
    /* renamed from: W */
    private final ilp f23891W;
    /* renamed from: X */
    private final dha f23892X;
    /* renamed from: Y */
    private final edk f23893Y;
    /* renamed from: Z */
    private final fbl f23894Z = new dgt(this);
    /* renamed from: aa */
    private final fbm f23895aa = dgn.f13804a;
    /* renamed from: b */
    public final dzh f23896b;
    /* renamed from: c */
    public final cfh f23897c;
    /* renamed from: d */
    public final ikd f23898d;
    /* renamed from: e */
    public final hch f23899e;
    /* renamed from: f */
    public final gpn f23900f;
    /* renamed from: g */
    public final gds f23901g;
    /* renamed from: h */
    public final asu f23902h;
    /* renamed from: i */
    public final hny f23903i;
    /* renamed from: j */
    public final hdm f23904j;
    /* renamed from: k */
    public final kbg f23905k;
    /* renamed from: l */
    public final ilb f23906l;
    /* renamed from: m */
    public final Context f23907m;
    /* renamed from: n */
    public final eby f23908n;
    /* renamed from: o */
    public final bmb f23909o;
    /* renamed from: p */
    public final bsn f23910p;
    /* renamed from: q */
    public final gci f23911q;
    /* renamed from: r */
    public final AccessibilityManager f23912r;
    /* renamed from: s */
    public final bqq f23913s;
    /* renamed from: t */
    public final brp f23914t;
    /* renamed from: u */
    public final gdj f23915u;
    /* renamed from: v */
    public final how f23916v;
    /* renamed from: w */
    public final ilb f23917w;
    /* renamed from: x */
    public boolean f23918x = true;
    /* renamed from: y */
    public boolean f23919y;
    /* renamed from: z */
    public cwh f23920z;

    public dgl(ird ird, dzh dzh, cwy cwy, cfh cfh, czg czg, ikd ikd, czm czm, gpn gpn, kbg kbg, fbg fbg, asu asu, hny hny, hdm hdm, kbg kbg2, Context context, eby eby, bmb bmb, bsn bsn, gci gci, AccessibilityManager accessibilityManager, bqq bqq, brp brp, gdj gdj, gvr gvr, how how, ilp ilp, ena ena, ilp ilp2, cze cze, edk edk, fbn fbn, hjf hjf) {
        Object valueOf = Boolean.valueOf(false);
        this.f23906l = new ilb(valueOf);
        this.f23917w = new ilb(valueOf);
        this.f23881M = ird;
        this.f23882N = cwy;
        this.f23896b = dzh;
        this.f23897c = cfh;
        this.f23883O = czg;
        this.f23898d = ikd;
        this.f23884P = czm;
        this.f23900f = gpn;
        this.f23885Q = fbg;
        this.f23902h = asu;
        this.f23903i = hny;
        this.f23904j = hdm;
        this.f23905k = kbg2;
        this.f23907m = context;
        this.f23908n = eby;
        this.f23909o = bmb;
        this.f23910p = bsn;
        this.f23911q = gci;
        this.f23912r = accessibilityManager;
        this.f23913s = bqq;
        this.f23914t = brp;
        this.f23915u = gdj;
        this.f23886R = gvr;
        this.f23916v = how;
        this.f23891W = ilp;
        this.f23877I = ilp2;
        this.f23876H = cze;
        this.f23893Y = edk;
        this.f23887S = fbn;
        this.f23888T = hjf;
        jri.m13395a(kbg.mo9709b());
        this.f23901g = (gds) kbg.mo9706a();
        this.f23892X = new dha(this.f23901g);
        ena.mo6355a(this.f23892X);
        this.f23899e = new dgw(this);
    }

    /* renamed from: a */
    final void mo14848a() {
        if (this.f23876H.f3057c.mo13532b()) {
            this.f23893Y.mo13452t();
            this.f23876H.f3057c.mo13529a();
        }
    }

    public final void close() {
        mo14849a(false);
    }

    /* renamed from: a */
    public final void mo13206a(BottomBarController bottomBarController, hcd hcd) {
        this.f23870B = bottomBarController;
        this.f23871C = hcd;
        this.f23901g.mo7052a();
    }

    /* renamed from: b */
    static final /* synthetic */ void m15670b() {
    }

    /* renamed from: J */
    public final boolean mo6333J() {
        return false;
    }

    /* renamed from: q */
    public final void mo7789q() {
        if (!this.f23918x) {
            this.f23893Y.mo13452t();
            mo14851h();
        }
    }

    /* renamed from: r */
    public final void mo7790r() {
        if (!this.f23918x) {
            this.f23893Y.mo13453u();
            this.f23900f.mo7328a(R.raw.timer_start);
        }
    }

    /* renamed from: c */
    public final void mo13207c() {
    }

    /* renamed from: d */
    public final void mo13208d() {
    }

    /* renamed from: e */
    public final void mo13209e() {
        if (this.f23918x) {
            int a;
            this.f23891W.mo8826a(Boolean.valueOf(true));
            bli.m888a(f23868a, "Starting Camera...");
            this.f23918x = false;
            this.f23869A = new ikb();
            this.f23881M.mo8856a("GoudaModule#start");
            mo14850g();
            mo14849a(true);
            this.f23870B.addListener(this.f23878J);
            this.f23869A.mo8557a(new dgo(this));
            this.f23869A.mo8557a(this.f23871C.mo7668a(this.f23899e));
            this.f23914t.mo2095a();
            float f = this.f23907m.getResources().getConfiguration().fontScale;
            DisplayMetrics displayMetrics = this.f23907m.getResources().getDisplayMetrics();
            boolean a2;
            if (f > 1.0f) {
                a2 = false;
            } else if (displayMetrics.densityDpi <= DisplayMetrics.DENSITY_DEVICE_STABLE) {
                a2 = this.f23886R.mo7468a() ^ 1;
            } else {
                a2 = false;
            }
            this.f23889U = new Timer();
            this.f23872D = new gdl(this.f23885Q, this.f23901g, this.f23898d, this.f23906l, this.f23907m, this.f23889U);
            this.f23869A.mo8557a(this.f23872D);
            this.f23903i.mo13554a(this.f23880L);
            this.f23869A.mo8557a(new dgp(this));
            this.f23901g.mo7054a(new gdu(this));
            if (a2 != 0) {
                this.f23901g.mo7057c();
            }
            this.f23881M.mo8857b();
            return;
        }
        bli.m888a(f23868a, "Attempting to start GoudaModule while it is already started.");
    }

    /* renamed from: f */
    public final void mo13210f() {
        if (this.f23918x) {
            bli.m888a(f23868a, "Attempting to stop GoudaModule while it is already stopped.");
            return;
        }
        this.f23918x = true;
        if (this.f23890V.isDone()) {
            cwh cwh = this.f23920z;
            if (cwh != null) {
                cwh.close();
                this.f23920z = null;
            }
        } else {
            this.f23890V.cancel(true);
        }
        this.f23883O.mo5901a();
        mo14848a();
        if (this.f23905k.mo9709b()) {
            ((fbd) this.f23905k.mo9706a()).mo6713a();
        }
        this.f23914t.mo2096b();
        this.f23883O.f3062d.mo8826a(Float.valueOf(1.0f));
        this.f23901g.mo7054a(null);
        this.f23869A.close();
    }

    /* renamed from: b */
    public final void mo7788b(int i) {
        if (i == 1) {
            this.f23900f.mo7328a(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f23900f.mo7328a(R.raw.timer_increment);
        }
    }

    /* renamed from: a */
    final void mo14849a(boolean z) {
        if (!this.f23918x) {
            this.f23897c.mo12481l().mo13115a(z);
            this.f23897c.mo12481l().mo13122c(z);
        }
    }

    /* renamed from: g */
    final void mo14850g() {
        float a = bmt.m917a(this.f23887S.mo13218b(bmt.m919a(this.f23887S, this.f23888T, this.f23896b.mo6125b())));
        if (this.f23896b.mo6126c()) {
            this.f23916v.mo8004c(a * 1.5f);
            this.f23916v.mo8010i();
        } else {
            this.f23916v.mo8004c(a * 1.2f);
            this.f23916v.mo8010i();
        }
        gdl gdl = this.f23872D;
        if (gdl != null) {
            gdl.mo13327a();
        }
        this.f23920z = null;
        this.f23890V = this.f23882N.mo5880a(this.f23896b, this.f23883O);
        kow.m13878a(this.f23890V, new dgx(this), this.f23898d);
    }

    /* renamed from: h */
    final void mo14851h() {
        bli.m894c(f23868a, "takePictureNow invoked");
        this.f23881M.mo8856a("GoudaModule#takePictureNow");
        cwh cwh = this.f23920z;
        if (cwh == null) {
            bli.m898e(f23868a, "Not taking picture since Camera is closed.");
        } else if (((Boolean) cwh.mo14832b().mo13673b()).booleanValue()) {
            mo14849a(false);
            this.f23884P.mo5905a(this.f23920z, this.f23894Z, this.f23895aa, this.f23919y).mo10200a(new dgq(this), this.f23898d);
        } else {
            bli.m898e(f23868a, "Not taking picture since the Camera is not ready to take a picture.");
        }
    }
}

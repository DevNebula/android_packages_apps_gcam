package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: cyd */
public final class cyd extends cvs implements chy, cvx, fbl, hfk, hob {
    /* renamed from: c */
    public static final String f25814c = bli.m887a("CaptureModule");
    /* renamed from: A */
    public bqq f25815A;
    /* renamed from: B */
    public czp f25816B;
    /* renamed from: C */
    public bsn f25817C;
    /* renamed from: D */
    public AccessibilityManager f25818D;
    /* renamed from: E */
    public final kwk f25819E;
    /* renamed from: F */
    public boolean f25820F = true;
    /* renamed from: G */
    public boolean f25821G = true;
    /* renamed from: H */
    public boolean f25822H = false;
    /* renamed from: I */
    public boolean f25823I = false;
    /* renamed from: J */
    public final cws f25824J;
    /* renamed from: K */
    public volatile boolean f25825K = false;
    /* renamed from: L */
    public ikb f25826L;
    /* renamed from: M */
    public volatile boolean f25827M = false;
    /* renamed from: N */
    public volatile boolean f25828N = false;
    /* renamed from: O */
    public Executor f25829O = new bbv("FilterHDR+Ind", 150);
    /* renamed from: P */
    public final Instrumentation f25830P;
    /* renamed from: Q */
    public iqo f25831Q;
    /* renamed from: R */
    public final eby f25832R;
    /* renamed from: S */
    public final gho f25833S;
    /* renamed from: T */
    public final irs f25834T;
    /* renamed from: U */
    public final ilb f25835U = new ilb(Boolean.valueOf(true));
    /* renamed from: V */
    public ilb f25836V;
    /* renamed from: W */
    public final asu f25837W;
    /* renamed from: X */
    private final Executor f25838X;
    /* renamed from: Y */
    private final czg f25839Y;
    /* renamed from: Z */
    private final aws f25840Z;
    /* renamed from: aA */
    private long f25841aA = 0;
    /* renamed from: aB */
    private final gvt f25842aB;
    /* renamed from: aC */
    private final hek f25843aC;
    /* renamed from: aD */
    private final gal f25844aD;
    /* renamed from: aE */
    private final hjf f25845aE;
    /* renamed from: aF */
    private final hny f25846aF;
    /* renamed from: aG */
    private final hnz f25847aG = new cyh(this);
    /* renamed from: aH */
    private final iqt f25848aH = new cyr(this);
    /* renamed from: aI */
    private final haq f25849aI = new cyw();
    /* renamed from: aJ */
    private final fbm f25850aJ = new cyx(this);
    /* renamed from: aa */
    private final Resources f25851aa;
    /* renamed from: ab */
    private final fhc f25852ab;
    /* renamed from: ac */
    private final fbn f25853ac;
    /* renamed from: ad */
    private final gbv f25854ad;
    /* renamed from: ae */
    private final SensorManager f25855ae;
    /* renamed from: af */
    private final ird f25856af;
    /* renamed from: ag */
    private final awr f25857ag;
    /* renamed from: ah */
    private final hat f25858ah;
    /* renamed from: ai */
    private final BottomBarController f25859ai;
    /* renamed from: aj */
    private final BottomBarListener f25860aj;
    /* renamed from: ak */
    private final bpt f25861ak;
    /* renamed from: al */
    private final gwp f25862al;
    /* renamed from: am */
    private final ecd f25863am;
    /* renamed from: an */
    private final gjk f25864an;
    /* renamed from: ao */
    private final czm f25865ao;
    /* renamed from: ap */
    private final kbg f25866ap;
    /* renamed from: aq */
    private final chx f25867aq;
    /* renamed from: ar */
    private czb f25868ar;
    /* renamed from: as */
    private gke f25869as;
    /* renamed from: at */
    private final kwk f25870at;
    /* renamed from: au */
    private final ilp f25871au;
    /* renamed from: av */
    private final edk f25872av;
    /* renamed from: aw */
    private boolean f25873aw = false;
    /* renamed from: ax */
    private final ikb f25874ax;
    /* renamed from: ay */
    private ikb f25875ay;
    /* renamed from: az */
    private Executor f25876az = new bbv("DelHDR+Ind", 1000);
    /* renamed from: d */
    public final fxe f25877d;
    /* renamed from: e */
    public final ikd f25878e;
    /* renamed from: f */
    public final gci f25879f;
    /* renamed from: g */
    public final gos f25880g;
    /* renamed from: h */
    public final cjp f25881h;
    /* renamed from: i */
    public final cwa f25882i;
    /* renamed from: j */
    public final hoc f25883j;
    /* renamed from: k */
    public final hcd f25884k;
    /* renamed from: l */
    public final hch f25885l;
    /* renamed from: m */
    public final how f25886m;
    /* renamed from: n */
    public final bmb f25887n;
    /* renamed from: o */
    public final dzh f25888o;
    /* renamed from: p */
    public final kbg f25889p;
    /* renamed from: q */
    public final czw f25890q;
    /* renamed from: r */
    public final ise f25891r;
    /* renamed from: s */
    public cfh f25892s;
    /* renamed from: t */
    public gpn f25893t;
    /* renamed from: u */
    public cwc f25894u;
    /* renamed from: v */
    public kpk f25895v;
    /* renamed from: w */
    public fbj f25896w;
    /* renamed from: x */
    public ffc f25897x;
    /* renamed from: y */
    public fha f25898y;
    /* renamed from: z */
    public cze f25899z;

    public cyd(ikd ikd, Executor executor, Resources resources, aws aws, SensorManager sensorManager, ird ird, bag bag, bah bah, fhc fhc, fbn fbn, gos gos, gci gci, gbv gbv, czb czb, gpn gpn, czg czg, cwa cwa, ilp ilp, fxe fxe, hoc hoc, Instrumentation instrumentation, gvt gvt, eby eby, hny hny, hek hek, bsn bsn, AccessibilityManager accessibilityManager, bqq bqq, edk edk, kwk kwk, kwk kwk2, awr awr, hat hat, BottomBarController bottomBarController, hcd hcd, how how, bpt bpt, gal gal, gwp gwp, ecd ecd, gjk gjk, gho gho, irs irs, bmb bmb, kbg kbg, asu asu, dzh dzh, kbg kbg2, czm czm, ise ise, chx chx, czw czw, hjf hjf, cze cze) {
        super(bag, bah);
        this.f25852ab = (fhc) jri.m13404b((Object) fhc);
        this.f25853ac = (fbn) jri.m13404b((Object) fbn);
        this.f25868ar = (czb) jri.m13404b((Object) czb);
        this.f25878e = ikd;
        this.f25838X = executor;
        this.f25840Z = aws;
        this.f25851aa = resources;
        this.f25855ae = sensorManager;
        this.f25856af = ird;
        this.f25879f = gci;
        this.f25854ad = gbv;
        this.f25880g = gos;
        this.f25893t = gpn;
        this.f25839Y = czg;
        this.f25871au = ilp;
        this.f25877d = fxe;
        this.f25882i = cwa;
        this.f25883j = hoc;
        this.f25830P = instrumentation;
        this.f25842aB = gvt;
        this.f25832R = eby;
        this.f25846aF = hny;
        this.f25843aC = hek;
        this.f25817C = bsn;
        this.f25818D = accessibilityManager;
        this.f25815A = bqq;
        this.f25872av = edk;
        this.f25819E = kwk;
        this.f25870at = kwk2;
        this.f25857ag = awr;
        this.f25858ah = hat;
        this.f25859ai = bottomBarController;
        this.f25884k = hcd;
        this.f25886m = how;
        this.f25861ak = bpt;
        this.f25862al = gwp;
        this.f25844aD = gal;
        this.f25863am = ecd;
        this.f25864an = gjk;
        this.f25833S = gho;
        this.f25834T = irs;
        this.f25887n = bmb;
        this.f25837W = asu;
        this.f25888o = dzh;
        this.f25889p = kbg2;
        this.f25865ao = czm;
        this.f25866ap = kbg;
        this.f25867aq = chx;
        this.f25890q = czw;
        this.f25836V = new ilb(Boolean.valueOf(false));
        this.f25891r = ise;
        this.f25874ax = new ikb();
        this.f25824J = new cws();
        this.f25881h = new cjp(chx);
        this.f25826L = ise.mo8941b();
        this.f25845aE = hjf;
        this.f25899z = cze;
        Object bbv = new bbv("FilterHDR+Ind", 150);
        Object bbv2 = new bbv("DelHDR+Ind", 1000);
        this.f25840Z.mo1824a().mo8557a(bbv);
        this.f25840Z.mo1824a().mo8557a(bbv2);
        this.f25829O = bbv;
        this.f25876az = bbv2;
        this.f25874ax.mo8557a(this.f25824J);
        this.f25874ax.mo8557a(this.f25824J.mo13672a(new cys(this), this.f25878e));
        cws cws = this.f25824J;
        cws.f23705b.execute(new cwu(cws, chx.mo2305a()));
        this.f25874ax.mo8557a(fxe.mo13672a(this.f25848aH, this.f25878e));
        this.f25860aj = new cyt(this);
        this.f25885l = new cyu(this, chx);
    }

    /* renamed from: m */
    final void mo15487m() {
        if (awl.m736a(this.f25857ag)) {
            m17299c(awl.m738b(this.f25857ag.f1017a.getIntent()));
            Intent intent = new Intent();
            intent.setAction(this.f25857ag.f1017a.getIntent().getAction());
            this.f25857ag.mo1821a(intent);
        }
    }

    /* renamed from: n */
    final void mo15488n() {
        if (this.f25899z.f3057c.mo13532b()) {
            this.f25872av.mo13452t();
            this.f25899z.f3057c.mo13529a();
            this.f25892s.mo12481l().mo13127f(false);
        }
    }

    public final void close() {
        this.f25874ax.close();
    }

    /* renamed from: a */
    public final void mo2312a() {
        this.f25835U.mo8826a(Boolean.valueOf(true));
        how how = this.f25886m;
        if (how != null) {
            how.mo7996a();
        }
        bpt bpt = this.f25861ak;
        if (bpt != null) {
            ((bqo) jqk.m13331a(bpt.f1447c, "EvCompViewController must be first initialized", new Object[0])).f1477b = true;
        }
        this.f25892s.mo12481l().f17180l.setSideButtonsClickable(false);
        this.f25844aD.f5222b.mo14607b();
        this.f25892s.mo12481l().f17188t.setClickable(false);
        this.f25892s.mo12481l().mo13119b(false);
        this.f25862al.mo13473a(false);
        this.f25899z.f3055a.f2635d = false;
    }

    /* renamed from: o */
    final void mo15489o() {
        this.f25892s.mo12481l().mo13132l();
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        return this.f25898y;
    }

    /* renamed from: b */
    public final String mo12925b() {
        return this.f25851aa.getString(R.string.photo_accessibility_peek);
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        if (!this.f25873aw) {
            this.f25873aw = true;
            this.f25856af.mo8856a("CaptureModule#initialize");
            this.f25892s = cfh;
            this.f25869as = new gke(this.f25855ae, this.f25838X);
            ((ayb) this.f25819E.mo10566a()).mo1840a((ayx) this.f25870at.mo10566a());
            this.f25874ax.mo8557a(new cye(this));
            this.f25874ax.mo8557a(this.f25842aB.mo7469a(new cyv(this)));
            this.f25867aq.mo2308a(cfh, this.f25899z, this.f25884k, this.f25854ad);
            ((grt) this.f25830P.modeSwitch().getCurrentSession()).mo13464b();
            this.f25856af.mo8857b();
        }
    }

    /* renamed from: p */
    final void mo15490p() {
        this.f25827M = false;
        mo15484a(fxo.NORMAL);
        this.f25876az.execute(new cyz(this));
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo12929e() {
        return true;
    }

    /* renamed from: g_ */
    public final boolean mo2313g_() {
        return this.f25825K;
    }

    /* renamed from: x */
    private final void m17301x() {
        this.f25878e.execute(new cyp(this));
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
    }

    /* renamed from: q */
    public final void mo7789q() {
        this.f25892s.mo12481l().mo13127f(false);
        if (!this.f25820F) {
            if (this.f25866ap.mo9709b()) {
                ((cdb) this.f25866ap.mo9706a()).mo2258a();
            }
            this.f25872av.mo13452t();
            m17302y();
        }
    }

    /* renamed from: r */
    public final void mo7790r() {
        if (!this.f25820F) {
            if (this.f25866ap.mo9709b()) {
                ((cdb) this.f25866ap.mo9706a()).mo2259b();
            }
            this.f25872av.mo13453u();
            this.f25893t.mo7328a(R.raw.timer_start);
        }
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        if (mo15491v()) {
            switch (i) {
                case 23:
                case 27:
                    if (this.f25899z.f3057c.mo13532b()) {
                        mo15488n();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        this.f25885l.onShutterButtonClick();
                    }
                    return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo12927b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final void mo12926b(boolean z) {
        bli.m888a(f25814c, "onLayoutOrientationChanged");
    }

    /* renamed from: s */
    public final void mo6728s() {
        cze cze = this.f25899z;
        hfl hfl = cze.f3056b;
        AnimatorSet animatorSet = hfl.f6523j;
        if (animatorSet != null && animatorSet.isRunning()) {
            hfl.f6523j.cancel();
        }
        hfl.mo7791a();
        cze.f3055a.f2635d = true;
        this.f25892s.mo12481l().mo13142s();
    }

    /* renamed from: t */
    public final void mo6729t() {
        this.f25878e.execute(new cyj(this));
    }

    /* renamed from: b */
    public final void mo7788b(int i) {
        if (i == 1) {
            this.f25893t.mo7328a(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f25893t.mo7328a(R.raw.timer_increment);
        }
    }

    /* renamed from: u */
    public final void mo7992u() {
        bli.m888a(f25814c, "onRemoteShutterPress");
        m17302y();
    }

    /* renamed from: a */
    public final void mo6727a(float f) {
        cze cze = this.f25899z;
        int i = (int) (100.0f * f);
        hfl hfl = cze.f3056b;
        int min = Math.min(100, Math.max(i, 0));
        if (min == 0) {
            AnimatorSet animatorSet = hfl.f6524k;
            if (animatorSet != null && animatorSet.isRunning()) {
                hfl.f6524k.cancel();
            }
            hfl.f6522i = 0;
            animatorSet = hfl.f6523j;
            if (animatorSet != null && animatorSet.isRunning()) {
                hfl.f6523j.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{hfl.f6514a, hfl.f6515b});
            ofInt.setDuration(167);
            ofInt.setInterpolator(hfl.f6518e);
            ofInt.addUpdateListener(new hfm(hfl));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) hfl.f6516c});
            ofFloat.setDuration(167);
            ofFloat.setInterpolator(hfl.f6518e);
            ofFloat.addUpdateListener(new hfn(hfl));
            hfl.f6523j = new AnimatorSet();
            hfl.f6523j.playTogether(new Animator[]{ofInt, ofFloat});
            hfl.f6523j.addListener(new hfo(hfl));
            hfl.f6523j.start();
        } else {
            AnimatorSet animatorSet2 = hfl.f6523j;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                hfl.f6523j.cancel();
            }
            hfl.f6519f = C0252go.f5905by;
            hfl.f6522i = (int) (((float) min) * 3.6f);
            hfl.invalidate();
            if (min == 100) {
                hfl.mo7791a();
            }
        }
        if (i == 100) {
            cze.f3055a.f2635d = true;
        } else {
            cze.f3055a.f2635d = false;
        }
        if (f == 0.0f) {
            this.f25892s.mo12481l().mo13141r();
            bli.m888a(f25814c, "take picture progress started");
        } else if (f == 1.0f) {
            this.f25892s.mo12481l().mo13142s();
            this.f25893t.mo7328a(R.raw.camera_shutter);
            this.f25835U.mo8826a(Boolean.valueOf(false));
            bli.m888a(f25814c, "take picture progress stopped");
        }
    }

    /* renamed from: a_ */
    public final void mo12924a_(boolean z) {
        if (z) {
            this.f25825K = false;
        }
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
        this.f25867aq.mo2310b();
        ((ayb) this.f25819E.mo10566a()).mo1839a();
    }

    /* renamed from: a */
    final void mo15485a(boolean z, boolean z2) {
        bli.m896d(f25814c, "Switching Camera...");
        if (z) {
            mo15488n();
        }
        if (!this.f25820F) {
            m17300d(z2);
        }
    }

    /* renamed from: h_ */
    public final void mo2314h_() {
        this.f25835U.mo8826a(Boolean.valueOf(false));
        how how = this.f25886m;
        if (how != null) {
            how.mo8003c();
        }
        bpt bpt = this.f25861ak;
        if (bpt != null) {
            ((bqo) jqk.m13331a(bpt.f1447c, "EvCompViewController must be first initialized", new Object[0])).f1477b = false;
        }
        this.f25899z.f3055a.f2635d = true;
        this.f25862al.mo13473a(true);
        this.f25892s.mo12481l().mo13119b(true);
        this.f25892s.mo12481l().mo13140q();
        this.f25892s.mo12481l().f17180l.setSideButtonsClickable(true);
        this.f25844aD.f5222b.mo14609c();
        this.f25892s.mo12481l().mo13123d();
    }

    /* renamed from: j */
    public final void mo12934j() {
        boolean z = false;
        bli.m888a(f25814c, "Resuming Camera...");
        this.f25835U.mo8826a(Boolean.valueOf(false));
        if (this.f25896w != null && awl.m736a(this.f25857ag)) {
            if (this.f25897x.mo9064c() == iut.FRONT) {
                z = true;
            }
            if (z != awl.m741d(this.f25857ag.f1017a.getIntent())) {
                mo15485a(true, true);
            } else {
                mo15487m();
            }
        }
        fbj fbj = this.f25896w;
        if (fbj != null && fbj.mo13216c()) {
            mo15485a(true, true);
        }
        czw czw = this.f25890q;
        gtx gtx = czw.f3100c;
        gtx.f6057c = -1;
        gtx.mo7452b();
        czw.mo5907a();
        this.f25862al.mo13473a(true);
        this.f25844aD.f5222b.mo14609c();
        this.f25892s.mo12481l().mo13123d();
        ((ayb) this.f25819E.mo10566a()).mo1843b();
    }

    /* renamed from: c */
    final void mo15486c(boolean z) {
        if (!this.f25820F) {
            this.f25892s.mo12481l().mo13115a(z);
            this.f25892s.mo12481l().mo13122c(z);
        }
    }

    /* renamed from: v */
    final boolean mo15491v() {
        this.f25892s.mo12481l();
        ebd.m9760f();
        if (!this.f25824J.mo13673b().booleanValue() || this.f25899z.f3057c.mo13532b()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo12935k() {
        if (this.f25820F) {
            bli.m888a(f25814c, "Starting Camera...");
            this.f25875ay = new ikb();
            this.f25875ay.mo8557a(this.f25884k.mo7668a(this.f25885l));
            this.f25859ai.addListener(this.f25860aj);
            this.f25820F = false;
            this.f25884k.mo7672b(false);
            this.f25856af.mo8856a("CaptureModule#resume");
            m17300d(true);
            this.f25856af.mo8856a("RemoteShutterListener#onModuleReady");
            this.f23696a.f1071c.mo13557a((hob) this);
            this.f25856af.mo8857b();
            this.f25856af.mo8856a("CaptureModule#ui-resume");
            this.f25833S.mo7134c();
            this.f25899z.mo5896a();
            this.f25856af.mo8857b();
            this.f25856af.mo8856a("Setup CameraAppUI");
            this.f25892s.mo12481l().mo13134o();
            ebd l = this.f25892s.mo12481l();
            chx chx = this.f25867aq;
            eiu eiu = l.f17140C;
            if (eiu != null) {
                eiu.f3851c = new chc(chx);
            }
            this.f25892s.mo12481l().f17181m.mo2095a();
            this.f25856af.mo8857b();
            this.f25892s.mo12472a(this.f25849aI, true);
            this.f25863am.mo14869a(this.f25888o.mo6125b());
            this.f25886m.mo8006e();
            this.f25844aD.mo7000a();
            this.f25869as.mo7163a();
            this.f25846aF.mo13554a(this.f25847aG);
            this.f25893t.mo7333f();
            this.f25890q.mo5907a();
            this.f25856af.mo8857b();
            return;
        }
        bli.m888a(f25814c, "Attempting to start CaptureModule while it is already started.");
    }

    /* JADX WARNING: Missing block: B:14:0x0060, code:
            if (r0.mo13216c() != false) goto L_0x0076;
     */
    /* renamed from: d */
    private final void m17300d(boolean r9) {
        /*
        r8 = this;
        r0 = f25814c;
        r1 = new java.lang.StringBuilder;
        r2 = 47;
        r1.<init>(r2);
        r2 = "getOneModuleConfigFromSetting resetZoom = ";
        r1.append(r2);
        r1.append(r9);
        r1 = r1.toString();
        p000.bli.m896d(r0, r1);
        r0 = r8.f25888o;
        r0 = r0.mo6125b();
        r1 = r8.f25853ac;
        r2 = r8.f25845aE;
        r0 = p000.bmt.m919a(r1, r2, r0);
        if (r9 == 0) goto L_0x0037;
    L_0x0028:
        r1 = r8.f25886m;
        r2 = r8.f25853ac;
        r2 = r2.mo9088a(r0);
        r2 = p000.bmt.m917a(r2);
        r1.mo8002b(r2);
    L_0x0037:
        r1 = r8.f25868ar;
        r1 = r1.mo5895a(r0);
        p000.jri.m13404b(r1);
        r0 = r8.f25820F;
        if (r0 != 0) goto L_0x0062;
    L_0x0044:
        r0 = r8.f25839Y;
        r0 = r0.mo5902a(r1);
        if (r0 == 0) goto L_0x0076;
    L_0x004c:
        r0 = r8.f25821G;
        if (r0 != 0) goto L_0x0076;
    L_0x0050:
        r0 = r8.f25826L;
        r0 = r0.mo13666a();
        if (r0 != 0) goto L_0x0076;
    L_0x0058:
        r0 = r8.f25896w;
        if (r0 == 0) goto L_0x0062;
    L_0x005c:
        r0 = r0.mo13216c();
        if (r0 != 0) goto L_0x0076;
    L_0x0062:
        r8.m17301x();
        r8.mo15489o();
        r0 = r8.f25877d;
        r0 = r0.mo13673b();
        r1 = p000.fxj.AUTO;
        if (r0 != r1) goto L_0x0075;
    L_0x0072:
        r8.mo15490p();
    L_0x0075:
        return;
    L_0x0076:
        r0 = r8.f25856af;
        r2 = "CaptureModule#startCamera";
        r0.mo8856a(r2);
        r0 = r8.f25892s;
        r0 = r0.mo12481l();
        r0 = r0.f17186r;
        r2 = r0.f2618e;
        if (r2 == 0) goto L_0x0094;
    L_0x0089:
        r2 = r2.isRunning();
        if (r2 == 0) goto L_0x0094;
    L_0x008f:
        r2 = r0.f2618e;
        r2.cancel();
    L_0x0094:
        r2 = p000.C0252go.f5899bs;
        r0.f2614a = r2;
        r2 = 4;
        r0.setVisibility(r2);
        r0 = r8.f25826L;
        r0.close();
        r0 = r8.f25889p;
        r0 = r0.mo9709b();
        if (r0 == 0) goto L_0x00b4;
    L_0x00a9:
        r0 = r8.f25889p;
        r0 = r0.mo9706a();
        r0 = (p000.fbd) r0;
        r0.mo6713a();
    L_0x00b4:
        r0 = r8.f25891r;
        r0 = r0.mo8941b();
        r8.f25826L = r0;
        r8.f25894u = r1;
        r0 = r8.f25853ac;
        r2 = r8.f25894u;
        r2 = r2.f3020a;
        r0 = r0.mo13218b(r2);
        r8.f25897x = r0;
        r0 = new czd;
        r2 = r8.f25852ab;
        r3 = r8.f25894u;
        r4 = r8.f25897x;
        r0.<init>(r2, r3, r4);
        r8.f25898y = r0;
        r0 = r8.f25867aq;
        r2 = r8.f25894u;
        r3 = r8.f25897x;
        r0.mo2309a(r2, r3);
        r8.m17301x();
        r0 = r8.f25897x;
        p000.jri.m13404b(r0);
        r0 = r8.f25892s;
        r0 = r0.mo12481l();
        p000.jri.m13404b(r0);
        r2 = r8.f25826L;
        r0 = new bcl;
        r0.<init>();
        r0 = r2.mo8557a(r0);
        r0 = (p000.bcl) r0;
        r3 = r8.f25839Y;
        r4 = r8.f25843aC;
        r4 = p000.kow.m13873a(r4);
        r5 = r8.f25864an;
        r6 = new etg;
        r7 = 1;
        r6.<init>(r7);
        r1 = r3.mo5899a(r1, r4, r5, r6);
        r3 = new cyq;
        r3.<init>(r8, r0, r2);
        r0 = r8.f25878e;
        p000.kow.m13878a(r1, r3, r0);
        r8.f25895v = r1;
        r0 = r8.f25856af;
        r0.mo8857b();
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: cyd.d(boolean):void");
    }

    /* renamed from: c */
    private final void m17299c(int i) {
        this.f25892s.mo12481l().mo13127f(true);
        this.f25899z.mo5898a((hfk) this);
        this.f25899z.mo5897a(i);
    }

    /* renamed from: l */
    public final void mo12936l() {
        this.f25856af.mo8856a("CaptureModule#stop");
        this.f25875ay.close();
        this.f25859ai.removeListener(this.f25860aj);
        if (((Boolean) this.f25835U.f24630c).booleanValue()) {
            this.f25835U.mo8826a(Boolean.valueOf(false));
            mo6728s();
        }
        this.f25833S.mo7133b();
        this.f25822H = false;
        this.f25820F = true;
        mo15488n();
        this.f25869as.mo7164b();
        this.f23696a.f1071c.mo13556a();
        this.f25867aq.mo2311c();
        this.f25856af.mo8856a("CaptureModule#closeCamera");
        kpk kpk = this.f25895v;
        if (!(kpk == null || kpk.isDone())) {
            this.f25895v.cancel(false);
            this.f25895v = null;
        }
        if (this.f25896w != null) {
            this.f25856af.mo8856a("CameraDevice#close");
            this.f25896w.close();
            this.f25896w = null;
            this.f25856af.mo8857b();
        }
        this.f25839Y.mo5901a();
        this.f25824J.mo14837c(ilq.m3876a(Boolean.valueOf(false)));
        this.f25856af.mo8856a("CameraLifetime#close");
        this.f25826L.close();
        this.f25856af.mo8857b();
        if (this.f25889p.mo9709b()) {
            ((fbd) this.f25889p.mo9706a()).mo6713a();
        }
        this.f25856af.mo8857b();
        this.f25892s.mo12481l().f17181m.mo2096b();
        this.f25893t.mo7327a();
        this.f25846aF.mo13555b(this.f25847aG);
        this.f25856af.mo8857b();
    }

    /* renamed from: i_ */
    public final void mo2315i_() {
        fbj fbj = this.f25896w;
        if (fbj != null) {
            ilq.m3885a(fbj.mo13214a().f4682a, this.f25826L).mo10200a(new cyf(this), this.f25878e);
        }
    }

    /* renamed from: y */
    private final void m17302y() {
        bli.m894c(f25814c, "takePictureNow invoked");
        this.f25856af.mo8856a("CaptureModule#takePictureNow");
        if (this.f25896w == null) {
            bli.m898e(f25814c, "Not taking picture since Camera is closed.");
            return;
        }
        this.f25858ah.mo7616a();
        if (((Boolean) this.f25896w.mo13214a().f4682a.mo13673b()).booleanValue()) {
            if (this.f25841aA == 0) {
                this.f25841aA = SystemClock.elapsedRealtime();
            } else {
                String str = f25814c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f25841aA;
                StringBuilder stringBuilder = new StringBuilder(48);
                stringBuilder.append("Time between capture shots: ");
                stringBuilder.append(elapsedRealtime - j);
                bli.m896d(str, stringBuilder.toString());
                this.f25841aA = SystemClock.elapsedRealtime();
            }
            mo15486c(false);
            this.f25835U.mo8826a(Boolean.valueOf(true));
            bli.m888a(f25814c, "take picture started");
            this.f25865ao.mo5906a(this.f25896w, this.f25894u, this, this.f25850aJ, this.f25897x, this.f25822H).mo10200a(new cyi(this), this.f25878e);
            this.f25822H = false;
            this.f25856af.mo8857b();
            return;
        }
        bli.m898e(f25814c, "Not taking picture since the Camera is not ready to take a picture.");
    }

    /* renamed from: w */
    final void mo15492w() {
        if (this.f25899z.f3057c.mo13532b()) {
            mo15488n();
            return;
        }
        this.f25892s.mo12481l().f17187s.mo13525a();
        int intValue = ((Integer) this.f25871au.mo13673b()).intValue();
        if (intValue > 0) {
            m17299c(intValue);
        } else {
            m17302y();
        }
    }

    /* renamed from: a */
    final void mo15484a(fxo fxo) {
        if (!this.f25828N && this.f25877d.mo13673b() == fxj.AUTO) {
            boolean z;
            if (fxo == fxo.HDR_PLUS) {
                z = true;
            } else if (fxo != fxo.HDR_PLUS_WITH_TORCH) {
                z = false;
            } else {
                z = true;
            }
            gal gal = this.f25844aD;
            if (gal.f5225e.mo13673b() == fxj.AUTO && !((Boolean) gal.f5226f.mo13673b()).booleanValue()) {
                gal.f5224d.execute(new gas(gal, z));
            }
        }
    }
}

package p000;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.support.p001v4.app.ActionBarDrawerToggle;
import android.support.p001v4.app.NotificationCompatJellybean;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0091R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.faceboxes.FaceView;
import com.google.android.apps.camera.legacy.app.activity.TrampolineActivity;
import com.google.android.apps.camera.legacy.app.filmstrip.FilmstripFragmentImpl;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.ExternalViewerButton;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p005ui.tutorialoverlay.TutorialOverlayWrapper;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.p005ui.wirers.PreviewOverlay;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;
import com.google.common.p006io.ByteStreams;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: cfk */
public final class cfk implements cfh, csf, emm, emn, emp, emq, emr, emy, eny, enz, eoa, eob, eoc, eoe, eof, eog, eoh, eoj, eok, eol, gyr {
    /* renamed from: a */
    public static final String f23052a = bli.m887a("CameraActivity");
    /* renamed from: A */
    public csh f23053A;
    /* renamed from: B */
    public het f23054B;
    /* renamed from: C */
    public ebd f23055C;
    /* renamed from: D */
    public csw f23056D;
    /* renamed from: E */
    public FrameLayout f23057E;
    /* renamed from: F */
    public cqb f23058F;
    /* renamed from: G */
    public hfz f23059G;
    /* renamed from: H */
    public cvx f23060H;
    /* renamed from: I */
    public eja f23061I;
    /* renamed from: J */
    public cqm f23062J;
    /* renamed from: K */
    public cqx f23063K;
    /* renamed from: L */
    public hfy f23064L;
    /* renamed from: M */
    public csp f23065M;
    /* renamed from: N */
    public crt f23066N;
    /* renamed from: O */
    public final ecd f23067O;
    /* renamed from: P */
    public final ScheduledExecutorService f23068P;
    /* renamed from: Q */
    public final irs f23069Q;
    /* renamed from: R */
    public hhx f23070R;
    /* renamed from: S */
    public boolean f23071S = false;
    /* renamed from: T */
    public boolean f23072T = false;
    /* renamed from: U */
    public boolean f23073U = false;
    /* renamed from: V */
    public boolean f23074V = false;
    /* renamed from: W */
    public boolean f23075W = false;
    /* renamed from: X */
    public boolean f23076X;
    /* renamed from: Y */
    public boolean f23077Y;
    /* renamed from: Z */
    public boolean f23078Z;
    /* renamed from: aA */
    private final Resources f23079aA;
    /* renamed from: aB */
    private final hat f23080aB;
    /* renamed from: aC */
    private final gor f23081aC;
    /* renamed from: aD */
    private final Window f23082aD;
    /* renamed from: aE */
    private final WindowManager f23083aE;
    /* renamed from: aF */
    private final enr f23084aF;
    /* renamed from: aG */
    private final bfk f23085aG;
    /* renamed from: aH */
    private final gvr f23086aH;
    /* renamed from: aI */
    private final awm f23087aI;
    /* renamed from: aJ */
    private final kwk f23088aJ;
    /* renamed from: aK */
    private final kwk f23089aK;
    /* renamed from: aL */
    private final cwd f23090aL;
    /* renamed from: aM */
    private final kwk f23091aM;
    /* renamed from: aN */
    private final bmb f23092aN;
    /* renamed from: aO */
    private hdm f23093aO;
    /* renamed from: aP */
    private ActionBar f23094aP;
    /* renamed from: aQ */
    private kwa f23095aQ;
    /* renamed from: aR */
    private cpl f23096aR;
    /* renamed from: aS */
    private cpl f23097aS;
    /* renamed from: aT */
    private FragmentManager f23098aT;
    /* renamed from: aU */
    private kbg f23099aU;
    /* renamed from: aV */
    private Menu f23100aV;
    /* renamed from: aW */
    private int f23101aW;
    /* renamed from: aX */
    private gev f23102aX;
    /* renamed from: aY */
    private iqo f23103aY;
    /* renamed from: aZ */
    private final edb f23104aZ;
    /* renamed from: aa */
    public boolean f23105aa;
    /* renamed from: ab */
    public final ebq f23106ab;
    /* renamed from: ac */
    public final Runnable f23107ac = new cfn(this);
    /* renamed from: ad */
    public final iqt f23108ad = new cfp(this);
    /* renamed from: ae */
    public final glq f23109ae = new cfr(this);
    /* renamed from: af */
    private final cbr f23110af;
    /* renamed from: ag */
    private final awi f23111ag;
    /* renamed from: ah */
    private final cbu f23112ah;
    /* renamed from: ai */
    private final dzg f23113ai;
    /* renamed from: aj */
    private final BottomBarController f23114aj;
    /* renamed from: ak */
    private final kwk f23115ak;
    /* renamed from: al */
    private final cgu f23116al;
    /* renamed from: am */
    private final gyi f23117am;
    /* renamed from: an */
    private final glj f23118an;
    /* renamed from: ao */
    private final hkg f23119ao;
    /* renamed from: ap */
    private final ContentResolver f23120ap;
    /* renamed from: aq */
    private final bpq f23121aq;
    /* renamed from: ar */
    private final awr f23122ar;
    /* renamed from: as */
    private final LayoutInflater f23123as;
    /* renamed from: at */
    private final hjw f23124at;
    /* renamed from: au */
    private final Looper f23125au;
    /* renamed from: av */
    private final cvy f23126av;
    /* renamed from: aw */
    private final fhc f23127aw;
    /* renamed from: ax */
    private final fbn f23128ax;
    /* renamed from: ay */
    private final gci f23129ay;
    /* renamed from: az */
    private final hek f23130az;
    /* renamed from: b */
    public final chu f23131b;
    /* renamed from: bA */
    private final ilp f23132bA;
    /* renamed from: bB */
    private final cdq f23133bB;
    /* renamed from: bC */
    private final gnh f23134bC;
    /* renamed from: bD */
    private final gyl f23135bD;
    /* renamed from: bE */
    private final boolean f23136bE;
    /* renamed from: bF */
    private final crx f23137bF = new crx(this);
    /* renamed from: bG */
    private final csj f23138bG = new csz(new cgf(this));
    /* renamed from: bH */
    private final cst f23139bH = new cst(this);
    /* renamed from: bI */
    private final cqc f23140bI = new cqc(this);
    /* renamed from: bJ */
    private final abn f23141bJ = new cfv(this);
    /* renamed from: ba */
    private final edf f23142ba;
    /* renamed from: bb */
    private final edo f23143bb;
    /* renamed from: bc */
    private final ehu f23144bc;
    /* renamed from: bd */
    private final gwo f23145bd;
    /* renamed from: be */
    private final hhj f23146be;
    /* renamed from: bf */
    private final kbg f23147bf;
    /* renamed from: bg */
    private hny f23148bg;
    /* renamed from: bh */
    private final bkw f23149bh;
    /* renamed from: bi */
    private final gal f23150bi;
    /* renamed from: bj */
    private hhx f23151bj;
    /* renamed from: bk */
    private boolean f23152bk = false;
    /* renamed from: bl */
    private boolean f23153bl;
    /* renamed from: bm */
    private boolean f23154bm;
    /* renamed from: bn */
    private boolean f23155bn = true;
    /* renamed from: bo */
    private boolean f23156bo = false;
    /* renamed from: bp */
    private final boolean f23157bp;
    /* renamed from: bq */
    private iqo f23158bq;
    /* renamed from: br */
    private boolean f23159br = false;
    /* renamed from: bs */
    private boolean f23160bs = false;
    /* renamed from: bt */
    private abi f23161bt;
    /* renamed from: bu */
    private final gyz f23162bu;
    /* renamed from: bv */
    private final gwp f23163bv;
    /* renamed from: bw */
    private ebm f23164bw;
    /* renamed from: bx */
    private final gzy f23165bx;
    /* renamed from: by */
    private final ilp f23166by;
    /* renamed from: bz */
    private final ilp f23167bz;
    /* renamed from: c */
    public final bag f23168c;
    /* renamed from: d */
    public final gln f23169d;
    /* renamed from: e */
    public final Context f23170e;
    /* renamed from: f */
    public final Context f23171f;
    /* renamed from: g */
    public final ikd f23172g;
    /* renamed from: h */
    public final Handler f23173h;
    /* renamed from: i */
    public final Instrumentation f23174i = Instrumentation.instance();
    /* renamed from: j */
    public final CameraActivitySession f23175j;
    /* renamed from: k */
    public final erh f23176k;
    /* renamed from: l */
    public final irh f23177l;
    /* renamed from: m */
    public final gos f23178m;
    /* renamed from: n */
    public final gsp f23179n;
    /* renamed from: o */
    public final ird f23180o;
    /* renamed from: p */
    public final AtomicBoolean f23181p = new AtomicBoolean(false);
    /* renamed from: q */
    public final Uri[] f23182q = new Uri[1];
    /* renamed from: r */
    public final WeakReference f23183r;
    /* renamed from: s */
    public final aws f23184s;
    /* renamed from: t */
    public final gst f23185t;
    /* renamed from: u */
    public final Executor f23186u;
    /* renamed from: v */
    public final ikp f23187v;
    /* renamed from: w */
    public final Intent f23188w;
    /* renamed from: x */
    public final boolean f23189x;
    /* renamed from: y */
    public gvt f23190y;
    /* renamed from: z */
    public crw f23191z;

    public cfk(Context context, Context context2, Resources resources, Window window, ContentResolver contentResolver, LayoutInflater layoutInflater, Handler handler, awr awr, hkg hkg, enr enr, Activity activity, aws aws, awi awi, ikd ikd, WindowManager windowManager, cvy cvy, fhc fhc, hat hat, boolean z, gci gci, fbn fbn, chz chz, cgu cgu, erh erh, irh irh, hjw hjw, gos gos, gor gor, gsp gsp, gyi gyi, gln gln, glj glj, bag bag, hek hek, het het, ActionBar actionBar, kwa kwa, dzg dzg, bpq bpq, ScheduledExecutorService scheduledExecutorService, gst gst, Executor executor, bfk bfk, gvr gvr, hjf hjf, awm awm, gev gev, cqb cqb, cqm cqm, cqx cqx, kwk kwk, cbu cbu, cbr cbr, ird ird, CameraActivitySession cameraActivitySession, kwk kwk2, kwk kwk3, edb edb, edf edf, edo edo, ecd ecd, ehu ehu, gwo gwo, hhj hhj, cwd cwd, Intent intent, BottomBarController bottomBarController, kwk kwk4, bmb bmb, ebq ebq, kbg kbg, hny hny, irs irs, bkw bkw, kbg kbg2, gyz gyz, gwp gwp, ebm ebm, gal gal, gzy gzy, ilp ilp, ilp ilp2, ilp ilp3, cdq cdq, kbg kbg3, gnh gnh, gyl gyl, kbg kbg4) {
        this.f23171f = (Context) jri.m13404b((Object) context);
        this.f23170e = (Context) jri.m13404b((Object) context2);
        this.f23079aA = (Resources) jri.m13404b((Object) resources);
        this.f23082aD = (Window) jri.m13404b((Object) window);
        this.f23114aj = bottomBarController;
        this.f23115ak = kwk4;
        this.f23120ap = (ContentResolver) jri.m13404b((Object) contentResolver);
        this.f23172g = (ikd) jri.m13404b((Object) ikd);
        this.f23123as = (LayoutInflater) jri.m13404b((Object) layoutInflater);
        this.f23173h = (Handler) jri.m13404b((Object) handler);
        this.f23125au = (Looper) jri.m13404b(handler.getLooper());
        this.f23122ar = (awr) jri.m13404b((Object) awr);
        this.f23119ao = (hkg) jri.m13404b((Object) hkg);
        this.f23083aE = (WindowManager) jri.m13404b((Object) windowManager);
        this.f23098aT = (FragmentManager) jri.m13404b(activity.getFragmentManager());
        this.f23080aB = (hat) jri.m13404b((Object) hat);
        this.f23126av = (cvy) jri.m13404b((Object) cvy);
        this.f23127aw = (fhc) jri.m13404b((Object) fhc);
        this.f23184s = (aws) jri.m13404b((Object) aws);
        this.f23084aF = (enr) jri.m13404b((Object) enr);
        this.f23111ag = (awi) jri.m13404b((Object) awi);
        this.f23189x = z;
        this.f23129ay = (gci) jri.m13404b((Object) gci);
        this.f23128ax = (fbn) jri.m13404b((Object) fbn);
        this.f23116al = (cgu) jri.m13404b((Object) cgu);
        this.f23086aH = (gvr) jri.m13404b((Object) gvr);
        this.f23176k = (erh) jri.m13404b((Object) erh);
        this.f23177l = (irh) jri.m13404b((Object) irh);
        this.f23124at = (hjw) jri.m13404b((Object) hjw);
        this.f23178m = (gos) jri.m13404b((Object) gos);
        this.f23081aC = (gor) jri.m13404b((Object) gor);
        this.f23179n = (gsp) jri.m13404b((Object) gsp);
        this.f23117am = (gyi) jri.m13404b((Object) gyi);
        this.f23168c = (bag) jri.m13404b((Object) bag);
        this.f23169d = (gln) jri.m13404b((Object) gln);
        this.f23118an = (glj) jri.m13404b((Object) glj);
        this.f23130az = (hek) jri.m13404b((Object) hek);
        this.f23113ai = (dzg) jri.m13404b((Object) dzg);
        this.f23121aq = (bpq) jri.m13404b((Object) bpq);
        this.f23185t = (gst) jri.m13404b((Object) gst);
        this.f23186u = (Executor) jri.m13404b((Object) executor);
        this.f23085aG = (bfk) jri.m13404b((Object) bfk);
        this.f23094aP = (ActionBar) jri.m13404b((Object) actionBar);
        this.f23054B = (het) jri.m13404b((Object) het);
        this.f23095aQ = (kwa) jri.m13404b((Object) kwa);
        this.f23104aZ = (edb) jri.m13404b((Object) edb);
        this.f23142ba = (edf) jri.m13404b((Object) edf);
        this.f23143bb = (edo) jri.m13404b((Object) edo);
        this.f23067O = (ecd) jri.m13404b((Object) ecd);
        this.f23145bd = (gwo) jri.m13404b((Object) gwo);
        this.f23146be = (hhj) jri.m13404b((Object) hhj);
        this.f23144bc = (ehu) jri.m13404b((Object) ehu);
        this.f23131b = (chu) jri.m13404b((Object) chz);
        jri.m13404b((Object) hjf);
        this.f23087aI = (awm) jri.m13404b((Object) awm);
        this.f23102aX = (gev) jri.m13404b((Object) gev);
        this.f23058F = (cqb) jri.m13404b((Object) cqb);
        this.f23062J = (cqm) jri.m13404b((Object) cqm);
        this.f23063K = (cqx) jri.m13404b((Object) cqx);
        this.f23088aJ = (kwk) jri.m13404b((Object) kwk);
        this.f23112ah = (cbu) jri.m13404b((Object) cbu);
        this.f23180o = (ird) jri.m13404b((Object) ird);
        this.f23110af = (cbr) jri.m13404b((Object) cbr);
        this.f23175j = cameraActivitySession;
        this.f23089aK = (kwk) jri.m13404b((Object) kwk2);
        this.f23091aM = (kwk) jri.m13404b((Object) kwk3);
        this.f23090aL = cwd;
        this.f23188w = intent;
        this.f23078Z = intent.getBooleanExtra("open_filmstrip", false);
        this.f23092aN = bmb;
        this.f23106ab = ebq;
        this.f23147bf = kbg;
        this.f23148bg = (hny) jri.m13404b((Object) hny);
        this.f23068P = scheduledExecutorService;
        this.f23069Q = irs;
        this.f23149bh = bkw;
        this.f23162bu = gyz;
        this.f23163bv = gwp;
        this.f23164bw = ebm;
        this.f23150bi = gal;
        this.f23165bx = gzy;
        this.f23166by = ilp;
        this.f23167bz = ilp2;
        this.f23132bA = ilp3;
        this.f23133bB = cdq;
        this.f23135bD = gyl;
        this.f23157bp = kbg3.mo9709b();
        this.f23134bC = gnh;
        this.f23136bE = kbg4.mo9709b();
        this.f23183r = new WeakReference(activity);
        this.f23187v = new ikp(scheduledExecutorService, 1000, TimeUnit.MILLISECONDS);
        this.f23161bt = new abi(this.f23141bJ, handler);
        gyz.f6194b = this;
        this.f23151bj = hhx.UNINITIALIZED;
    }

    /* renamed from: a */
    public final void mo12471a(ham ham) {
        this.f23055C.mo13114a(ham);
    }

    /* renamed from: G */
    public final void mo14579G() {
        ikd.m12501a();
        bli.m896d(f23052a, "cancelPreviewStop");
        this.f23073U = false;
        this.f23074V = false;
        this.f23187v.mo13668a();
    }

    /* renamed from: a */
    final void mo14585a(cvx cvx) {
        cvx.mo12937m_();
        cvx.mo12936l();
        ebd ebd = this.f23055C;
        FrameLayout frameLayout = ebd.f17178j;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ebd.f17182n.mo2737a();
        ebd.mo13122c(true);
        ebd.f17191w = null;
        PreviewOverlay previewOverlay = ebd.f17185q;
        previewOverlay.f2632a = null;
        previewOverlay.f2633b = null;
    }

    /* renamed from: H */
    public final int mo14580H() {
        int i;
        if (this.f23070R != hhx.PHOTO) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.f23070R == hhx.VIDEO) {
            i = 8;
        }
        if (this.f23070R == hhx.LENS_BLUR) {
            i = 6;
        }
        if (this.f23070R == hhx.PHOTO_SPHERE) {
            i = 5;
        }
        if (this.f23070R == hhx.PANORAMA) {
            i = 11;
        }
        if (this.f23070R == hhx.PORTRAIT) {
            i = 21;
        }
        if (this.f23070R == hhx.IMAGE_INTENT) {
            i = 19;
        }
        if (this.f23070R == hhx.VIDEO_INTENT) {
            i = 20;
        }
        if (m15194V()) {
            return 2;
        }
        return i;
    }

    /* renamed from: a */
    private final void m15200a(hhx hhx, int i) {
        if (this.f23152bk || this.f23070R != hhx) {
            this.f23152bk = false;
            this.f23174i.modeSwitch().create();
            if ((this.f23070R == hhx.PHOTO || this.f23070R == hhx.VIDEO || this.f23070R == hhx.PORTRAIT || this.f23070R == hhx.LENS_BLUR) && (hhx == hhx.PHOTO || hhx == hhx.VIDEO || hhx == hhx.PORTRAIT || hhx == hhx.LENS_BLUR)) {
                this.f23178m.mo7289a("default_scope", "pref_mode_switch_camera_id_key", i);
            }
            mo14585a(this.f23060H);
            if (!m15212d(this.f23070R) && m15212d(hhx)) {
                String str = f23052a;
                String valueOf = String.valueOf(hhx);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("cameraDeviceManager is shutdown as selected mode is ");
                stringBuilder.append(valueOf);
                bli.m888a(str, stringBuilder.toString());
                this.f23177l.mo8869a(true);
            }
            m15213e(hhx);
            if (!this.f23060H.mo12929e()) {
                hek hek = this.f23130az;
                synchronized (hek.f6457a) {
                    hek.mo7770a();
                }
            }
            m15206b(this.f23060H);
            if (((Boolean) this.f23166by.mo13673b()).booleanValue()) {
                this.f23165bx.mo13434af();
            }
        }
    }

    /* renamed from: b */
    public static float m15202b(cre cre) {
        if (cre == cre.f2792c) {
            return 0.0f;
        }
        return ((float) (System.currentTimeMillis() - new File(cre.mo5692e().mo6541g().f4383g).lastModified())) * 0.001f;
    }

    /* renamed from: c */
    public static String m15209c(cre cre) {
        if (cre == cre.f2792c) {
            return "";
        }
        return new File(cre.mo5692e().mo6541g().f4383g).getName();
    }

    /* renamed from: a */
    public final void mo12465a() {
        m15198a(0, new Intent());
    }

    /* renamed from: a */
    public final void mo12467a(Intent intent) {
        m15198a(-1, intent);
    }

    /* renamed from: a */
    private final void m15198a(int i, Intent intent) {
        awr awr = this.f23122ar;
        jri.m13404b((Object) intent);
        awr.f1017a.setResult(i, intent);
        mo12474a("CameraActivityController: Intent completed with a valid result. Closing activity.");
    }

    /* renamed from: a */
    public final void mo12474a(String str) {
        this.f23111ag.mo1814a(str);
    }

    /* renamed from: b */
    public final Context mo12475b() {
        return this.f23170e;
    }

    /* renamed from: c */
    public final cbr mo12477c() {
        return this.f23110af;
    }

    /* renamed from: d */
    public final Window mo12478d() {
        return this.f23082aD;
    }

    /* renamed from: e */
    public final WindowManager mo12479e() {
        return this.f23083aE;
    }

    /* renamed from: k */
    public final Context mo12480k() {
        return this.f23171f;
    }

    /* renamed from: R */
    private final hhx m15190R() {
        String action = this.f23122ar.f1017a.getIntent().getAction();
        if ("android.media.action.VIDEO_CAMERA".equals(action)) {
            return hhx.VIDEO;
        }
        if ("android.media.action.VIDEO_CAPTURE".equals(action)) {
            return hhx.VIDEO_INTENT;
        }
        if ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) {
            return hhx.IMAGE_INTENT;
        }
        if (!this.f23153bl && !"android.media.action.STILL_IMAGE_CAMERA".equals(action) && !"android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) && !"android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) {
            return m15193U();
        }
        hhx U = m15193U();
        if (this.f23178m.mo7293a("default_scope", "pref_user_selected_aspect_ratio")) {
            return U;
        }
        return m15193U();
    }

    /* renamed from: l */
    public final ebd mo12481l() {
        return this.f23055C;
    }

    /* renamed from: m */
    public final fhc mo12482m() {
        return this.f23127aw;
    }

    /* renamed from: n */
    public final bah mo12483n() {
        return this.f23116al;
    }

    /* renamed from: o */
    public final String mo12484o() {
        return gos.m2721a(this.f23116al.f12464e.mo8859a().f7848b);
    }

    /* renamed from: p */
    public final hkg mo12485p() {
        return this.f23119ao;
    }

    /* renamed from: q */
    public final ContentResolver mo12486q() {
        return this.f23120ap;
    }

    /* renamed from: r */
    public final hhx mo12487r() {
        return this.f23070R;
    }

    /* renamed from: s */
    public final cvx mo12488s() {
        return this.f23060H;
    }

    /* renamed from: S */
    private final synchronized kbg m15191S() {
        if (this.f23099aU == null) {
            this.f23099aU = axh.m755a(this.f23171f);
        }
        return this.f23099aU;
    }

    /* renamed from: t */
    public final LayoutInflater mo12489t() {
        return this.f23123as;
    }

    /* renamed from: u */
    public final hjw mo12490u() {
        return this.f23124at;
    }

    /* renamed from: v */
    public final Looper mo12491v() {
        return this.f23125au;
    }

    /* renamed from: c */
    private final cvx m15208c(hhx hhx) {
        Throwable e;
        ikd.m12501a();
        if (!mo12462D()) {
            return null;
        }
        cvz a = this.f23126av.mo5866a(hhx);
        if (a == null) {
            return null;
        }
        try {
            return (cvx) a.mo5869a().get();
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        throw new IllegalStateException(e);
    }

    /* renamed from: w */
    public final String mo12492w() {
        return gos.m2723b(this.f23126av.mo5866a(this.f23070R).mo5870b().f3018b);
    }

    /* renamed from: x */
    public final gci mo12493x() {
        return this.f23129ay;
    }

    /* renamed from: T */
    private final int m15192T() {
        if (this.f23072T) {
            return 2;
        }
        return 0;
    }

    /* renamed from: y */
    public final Resources mo12494y() {
        return this.f23079aA;
    }

    /* renamed from: z */
    public final hat mo12495z() {
        return this.f23080aB;
    }

    /* renamed from: A */
    public final bag mo12459A() {
        return this.f23168c;
    }

    /* renamed from: B */
    public final gos mo12460B() {
        return this.f23178m;
    }

    /* renamed from: U */
    private final hhx m15193U() {
        try {
            hhx hhx = (hhx) awl.m735a(this.f23122ar.f1017a.getIntent()).mo9708a(cfl.f12330a).mo9707a(hhx.PHOTO);
            if (hhx.m3205a(hhx, this.f23157bp)) {
                return hhx;
            }
            bli.m898e(f23052a, String.format("Cannot launch directly into %s mode, defaulting to PHOTO", new Object[]{hhx.PHOTO}));
            return hhx.PHOTO;
        } catch (Throwable e) {
            bli.m892b(f23052a, "Error deserializing mode from Intent extra", e);
            return hhx.PHOTO;
        }
    }

    /* renamed from: C */
    public final WeakReference mo12461C() {
        return this.f23183r;
    }

    /* renamed from: I */
    public final void mo14581I() {
        crt crt = this.f23066N;
        crt.f2808b = false;
        crt.mo5699a();
    }

    /* renamed from: D */
    public final boolean mo12462D() {
        ikd.m12501a();
        if (!(this.f23156bo || this.f23184s.mo1828e())) {
            Object obj;
            String string;
            boolean z;
            this.f23156bo = true;
            bli.m894c(f23052a, "Begin initializeOnce() of CameraActivityController");
            this.f23180o.mo8856a("CameraActivityController#init");
            this.f23180o.mo8856a("CameraActivityUi#inflate");
            hes hes = (hes) this.f23095aQ.mo10562a();
            this.f23180o.mo8858b("AppUpgrader#upgrade");
            this.f23113ai.mo6164a(this.f23178m, this.f23128ax);
            gos gos = this.f23178m;
            Context context = this.f23171f;
            fbn fbn = this.f23128ax;
            bfk bfk = this.f23085aG;
            gos.mo7288a("pref_camera_countdown_duration_key", 0, context.getResources().getIntArray(R.array.pref_countdown_duration));
            for (FeatureInfo featureInfo : context.getPackageManager().getSystemAvailableFeatures()) {
                if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                string = context.getString(R.string.pref_camera_id_default_arc);
            } else {
                string = context.getString(R.string.pref_camera_id_default);
            }
            gos.mo7291a("pref_camera_id_key", string, context.getResources().getStringArray(R.array.camera_id_entryvalues));
            gos.mo7291a("pref_camera_scenemode_key", context.getString(R.string.pref_camera_scenemode_default), context.getResources().getStringArray(R.array.pref_camera_scenemode_entryvalues));
            gos.mo7291a("pref_camera_flashmode_key", context.getString(R.string.pref_camera_flashmode_default), context.getResources().getStringArray(R.array.pref_camera_flashmode_entryvalues));
            gos.mo7291a("pref_hdr_support_mode_back_camera", context.getString(R.string.pref_camera_hdr_supportmode_none), context.getResources().getStringArray(R.array.pref_camera_hdr_supportmode_entryvalues));
            gos.mo7292a("pref_camera_hdr_key", false);
            gos.mo7292a("pref_camera_selfie_flashmode_key", false);
            iur b = fbn.mo9091b(iut.BACK);
            if (b != null) {
                fbn.mo13218b(b);
                gos.mo7291a("pref_camera_hdr_plus_key", context.getString(R.string.pref_camera_hdr_plus_default_auto), context.getResources().getStringArray(R.array.pref_camera_hdrplus_entryvalues));
            } else {
                gos.mo7291a("pref_camera_hdr_plus_key", context.getString(R.string.pref_camera_hdr_plus_default), context.getResources().getStringArray(R.array.pref_camera_hdrplus_entryvalues));
            }
            gos.mo7292a("pref_camera_first_use_hint_shown_key", true);
            gos.mo7291a("pref_camera_focusmode_key", context.getString(R.string.pref_camera_focusmode_default), context.getResources().getStringArray(R.array.pref_camera_focusmode_entryvalues));
            String string2 = context.getString(R.string.pref_video_quality_large);
            if (b != null) {
                kbg b2 = bfk.mo12367b(b);
                string = b2.mo9709b() ? ((bez) b2.mo9706a()).mo1933a(inc.FPS_30, ine.RES_2160P) ? context.getResources().getString(R.string.pref_video_quality_medium) : string2 : string2;
            } else {
                string = string2;
            }
            gos.mo7291a("pref_video_quality_back_key", string, context.getResources().getStringArray(R.array.pref_video_quality_entryvalues));
            if (!gos.mo7302e("default_scope", "pref_video_quality_back_key")) {
                gos.mo7304g("default_scope", "pref_video_quality_back_key");
            }
            gos.mo7291a("pref_video_quality_front_key", context.getResources().getString(R.string.pref_video_quality_large), context.getResources().getStringArray(R.array.pref_video_quality_entryvalues));
            if (!gos.mo7302e("default_scope", "pref_video_quality_front_key")) {
                gos.mo7304g("default_scope", "pref_video_quality_front_key");
            }
            gos.mo7292a("pref_video_stabilization_key", true);
            gos.mo7291a("pref_video_encoding_key", context.getResources().getString(R.string.pref_video_encoding_default), context.getResources().getStringArray(R.array.pref_video_encoding_entryvalues));
            gos.mo7291a("pref_camera_jpegquality_key", context.getString(R.string.pref_camera_jpeg_quality_normal), context.getResources().getStringArray(R.array.pref_camera_jpeg_quality_entryvalues));
            gos.mo7291a("pref_camera_video_flashmode_key", context.getString(R.string.pref_camera_video_flashmode_default), context.getResources().getStringArray(R.array.pref_camera_video_flashmode_entryvalues));
            gos.mo7291a("pref_video_fps_key", gom.FPS_30.name(), new String[]{gom.FPS_30.name(), gom.FPS_60.name(), gom.FPS_AUTO.name()});
            gos.mo7291a("pref_video_effect_key", context.getString(R.string.pref_video_effect_default), context.getResources().getStringArray(R.array.pref_video_effect_entryvalues));
            gos.mo7292a("pref_video_first_use_hint_shown_key", true);
            gos.mo7291a("pref_camera_pano_orientation", context.getString(R.string.pano_orientation_horizontal), context.getResources().getStringArray(R.array.pref_camera_pano_orientation_entryvalues));
            gos.mo7291a("pref_camera_photosphere_orientation", context.getString(R.string.pano_orientation_photosphere), context.getResources().getStringArray(R.array.pref_camera_pano_orientation_entryvalues));
            gos.mo7292a("pref_camera_grid_lines", false);
            gos.mo7288a("pref_camera_grid_lines_mode", gxk.OFF.f6131e, gxk.m2919a());
            gos.mo7292a("pref_should_show_refocus_viewer_cling", true);
            gos.mo7292a("pref_should_show_settings_button_cling", true);
            gos.mo7292a("pref_dirty_lens_detector_key", true);
            gos.mo7292a("pref_auto_generate_artifacts", true);
            this.f23180o.mo8858b("UiWirer#wire");
            this.f23146be.mo7877a();
            this.f23180o.mo8858b("UiControllerInitializer#init");
            gwo gwo = this.f23145bd;
            switch (gwo.f6096i.ordinal()) {
                case 9:
                    gwo.f6090c.mo10566a();
                    gwo.f6089b.mo10566a();
                    efk efk = (efk) gwo.f6092e.mo10566a();
                    efp efp = efk.f3798a;
                    efp.f3802b.mo6214a();
                    efp.f3801a.mo14877a(efp.f3803c, efp.f3804d, efp.f3805e, efp.f3806f, efp.f3807g, efp.f3808h, efp.f3809i);
                    efk.f3799b.mo6213a();
                    efk.f3800c.mo13174b();
                    ((gqj) gwo.f6093f.mo10566a()).mo7343a();
                    break;
                case 10:
                    gwo.f6090c.mo10566a();
                    gwo.f6089b.mo10566a();
                    egp egp = (egp) gwo.f6094g.mo10566a();
                    egp.f3829a.mo6219a();
                    egv egv = egp.f3830b;
                    egv.f3832a.mo15524a(egv.f3833b, egv.f3834c, egv.f3835d, egv.f3836e, egv.f3837f, egv.f3838g, egv.f3839h);
                    egp.f3831c.mo13174b();
                    ((eia) gwo.f6095h.mo10566a()).mo7343a();
                    break;
                default:
                    edw edw = (edw) gwo.f6088a.mo10566a();
                    eek eek = edw.f3740a;
                    eer eer = eek.f3748b;
                    efc efc = eer.f3757b;
                    efu efu = efc.f3779b;
                    efu.f3810a.mo14878a(efu.f3811b, efu.f3812c, efu.f3813d, efu.f3814e);
                    egg egg = efc.f3780c;
                    egg.f3820b.mo6214a();
                    ehe ehe = egg.f3821c;
                    ehe.f3840a.mo15525a(ehe.f3841b, ehe.f3842c, ehe.f3843d, ehe.f3844e, ehe.f3845f, ehe.f3846g, ehe.f3847h);
                    egg.f3819a.mo14880a(egg.f3822d, egg.f3823e, egg.f3824f, egg.f3825g);
                    gzt gzt = efc.f3781d;
                    gzt.f6235a.mo14936a(gzt.f6236b);
                    efc.f3782e.mo6214a();
                    efc.f3778a.mo15523a(efc.f3783f, efc.f3784g, efc.f3785h, efc.f3786i, efc.f3787j, efc.f3788k, efc.f3789l, efc.f3790m, efc.f3791n, efc.f3792o);
                    eer.f3758c.mo13174b();
                    egb egb = eer.f3759d;
                    egb.f3815a.mo14879a(egb.f3816b, egb.f3817c, egb.f3818d);
                    efh efh = eer.f3760e;
                    efh.f3793a.mo14876a(efh.f3794b, efh.f3795c, efh.f3796d, efh.f3797e);
                    eer.f3756a.mo14872a(eer.f3761f, eer.f3762g, eer.f3763h, eer.f3764i, eer.f3765j, eer.f3766k, eer.f3767l, eer.f3768m);
                    eek.f3747a.mo14871a(eek.f3749c, eek.f3750d, eek.f3751e, eek.f3752f, eek.f3753g, eek.f3754h, eek.f3755i);
                    edw.f3741b.mo6213a();
                    edw.f3742c.mo6219a();
                    ((gqj) gwo.f6091d.mo10566a()).mo7343a();
                    break;
            }
            this.f23180o.mo8858b("CameraController#init");
            cgu cgu = this.f23116al;
            if (cgu.f12465f == null) {
                z = true;
            } else {
                z = false;
            }
            jri.m13405b(z);
            cgu.f12465f = this;
            this.f23116al.mo1874a(this.f23161bt);
            this.f23180o.mo8858b("FilmstripData#init");
            this.f23059G = (hfz) this.f23088aJ.mo10566a();
            this.f23059G.mo7819a(this.f23140bI);
            this.f23059G.mo7822a(this.f23138bG);
            this.f23065M = (FilmstripFragmentImpl) jri.m13404b(this.f23098aT.findFragmentById(R.id.filmstrip_fragment));
            cpx cpx = new cpx(this);
            this.f23065M.mo5748h();
            this.f23191z = this.f23065M.mo5737a();
            this.f23066N = this.f23065M.mo5741b();
            this.f23053A = this.f23065M.mo5743d();
            this.f23180o.mo8858b("FilmstripUi#init");
            this.f23065M.mo5739a(this, cpx, this.f23059G, this.f23054B.f6493g);
            this.f23056D = this.f23065M.mo5744e();
            this.f23057E = hes.f6479c;
            this.f23180o.mo8858b("Filmstrip#observers");
            this.f23096aR = new cpl();
            this.f23097aS = new cpl();
            this.f23120ap.registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this.f23096aR);
            this.f23120ap.registerContentObserver(Video.Media.EXTERNAL_CONTENT_URI, true, this.f23097aS);
            this.f23180o.mo8858b("CameraAppUI#init");
            this.f23190y = (gvt) this.f23089aK.mo10566a();
            this.f23093aO = (hdm) this.f23091aM.mo10566a();
            this.f23191z.f2819c = this.f23137bF;
            this.f23130az.f6458b = new hen(this);
            this.f23055C = new ebd(this, this.f23054B.f6489c, hes, this.f23117am, this.f23130az, this.f23086aH, this.f23184s, (DisplayManager) cbu.m1124a(this.f23112ah.f1865a, "display"), this.f23083aE, awl.m739b(this.f23122ar), this.f23190y, this.f23093aO, this.f23142ba, this.f23143bb, this.f23090aL, this.f23065M, this.f23114aj, (hcd) this.f23115ak.mo10566a(), this.f23148bg, this.f23106ab, this.f23149bh, this.f23069Q, this.f23162bu, this.f23163bv, this.f23164bw, this.f23150bi, this.f23133bB, this.f23167bz, this.f23132bA, this.f23135bD);
            ebd ebd = this.f23055C;
            obj = this.f23054B;
            jri.m13404b(obj);
            jri.m13404b(ebd.f17172d);
            ebd.f17179k = (ShutterButton) obj.f6494h.mo7919a((int) R.id.shutter_button);
            hkg a = hkg.m3276a(ebd.f17172d);
            hkg a2 = hkg.m3276a(ebd.f17173e);
            ebd.f17178j = (FrameLayout) a.mo7919a((int) R.id.module_layout);
            ebd.f17185q = (PreviewOverlay) a.mo7919a((int) R.id.preview_overlay);
            ebd.f17182n = (TutorialOverlayWrapper) a2.mo7919a((int) R.id.tutorials_placeholder_wrapper);
            ebd.f17186r = (CaptureAnimationOverlay) a.mo7919a((int) R.id.capture_animation_overlay);
            ebd.f17181m = new brp((FaceView) a.mo7919a((int) R.id.face_view));
            ebd.f17144G = ebu.m9805a(ebd.f17176h, ebd, ebd.f17150M, ebd.f17194z, ebd.f17138A);
            ebd.f17141D = ebd.f17144G;
            ebd.f17142E = new hao("Viewfinder", new hap(ebd.f17145H));
            ebd.f17143F = ebd.f17142E;
            if (((Boolean) this.f23166by.mo13673b()).booleanValue()) {
                this.f23165bx.mo13433ae();
            }
            this.f23134bC.mo7250a(this.f23109ae);
            this.f23180o.mo8858b("PanoramaViewHelper#init");
            this.f23061I = new eja(this, (Activity) this.f23183r.get(), this.f23069Q);
            eja eja = this.f23061I;
            eja.f17459b = new hji(new hur(eja.f17462e.mo12480k(), eja, eja).mo8146a(ifq.f7353b).mo8145a());
            hfz hfz = this.f23059G;
            this.f23064L = new hfy(hfz, hfz);
            this.f23055C.f17192x.mo5726a(this.f23139bH);
            this.f23180o.mo8858b("Settings#config");
            this.f23153bl = true;
            m15195W();
            m15196X();
            m15213e(m15190R());
            this.f23114aj.resetCameraSwitch(this.f23178m.mo7299c(mo12492w(), "pref_camera_id_key"));
            this.f23114aj.addListener(new cfx(this));
            this.f23180o.mo8858b("CameraUi#prepareModuleUi");
            ebd ebd2 = this.f23055C;
            obj = this.f23054B;
            jri.m13404b(obj);
            jri.m13404b(ebd2.f17172d);
            hkg hkg = obj.f6494h;
            ViewStub viewStub = (ViewStub) hkg.mo7919a((int) R.id.burst_chip_viewstub);
            RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) hkg.mo7919a(C0091R.C0089id.thumbnail_button);
            ebd2.f17141D.mo7602a(ebd2.f17193y);
            cjq cjq = ebd2.f17171c;
            cjq.f12641b = viewStub;
            cjq.f12643d = roundedThumbnailView;
            ebd2.f17140C = new eiu(ebd2.f17139B, ebd2.f17151N);
            if (ebd2.f17170b.mo12487r() == hhx.PHOTO) {
                ebd2.mo13119b(true);
                ebd2.mo13124d(true);
            } else if (ebd2.f17170b.mo12487r() == hhx.VIDEO) {
                ebd2.mo13119b(true);
                ebd2.mo13124d(false);
            } else {
                ebd2.mo13119b(false);
            }
            if (!(ebd2.f17170b.mo12487r() == hhx.PHOTO || ebd2.f17170b.mo12487r() == hhx.VIDEO)) {
                ebd2.mo13118b(ebd2.f17170b.mo12487r());
            }
            if (!(this.f23189x || awl.m739b(this.f23122ar) || this.f23184s.mo1828e())) {
                this.f23059G.mo7823a(new cfy(this));
            }
            this.f23180o.mo8858b("MemoryQuery#runMemoryReport");
            this.f23068P.execute(new cfz(this));
            if (!awl.m739b(this.f23122ar)) {
                if (!this.f23189x) {
                    Executor a3;
                    this.f23180o.mo8858b("CaptureIndicator#load");
                    kpk a4 = this.f23185t.mo7421a();
                    if (a4.isDone()) {
                        a3 = khx.m5000a();
                    } else {
                        a3 = this.f23172g;
                    }
                    kow.m13878a(a4, new cga(this), a3);
                }
                epf a5 = epf.m1992a();
                if (a5.f4232c == 0) {
                    a5.f4232c = SystemClock.elapsedRealtimeNanos();
                }
            }
            this.f23180o.mo8858b("ActivityUi#initCallbacks");
            ((ShutterButton) this.f23054B.f6494h.mo7919a((int) R.id.shutter_button)).setOnDrawListener(new hbe(this));
            this.f23180o.mo8858b("ActivityLifecycle#observe");
            this.f23084aF.mo6355a((eol) this);
            this.f23180o.mo8857b();
            this.f23180o.mo8857b();
            bli.m894c(f23052a, "CameraActivityController initialization completed");
            CameraActivitySession cameraActivitySession = this.f23175j;
            if (cameraActivitySession.f12857h == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13406b(z, (Object) "Accidental session reuse.");
            iya iya = cameraActivitySession.f2599m;
            cameraActivitySession.f12857h = SystemClock.elapsedRealtimeNanos();
            cameraActivitySession.mo2697a("CameraActivity Initialized", cameraActivitySession.f12857h);
        }
        return this.f23156bo;
    }

    /* renamed from: V */
    private final boolean m15194V() {
        if (this.f23092aN.mo2020b()) {
            return this.f23106ab.f17203c;
        }
        return this.f23076X;
    }

    /* renamed from: E */
    public final boolean mo12463E() {
        return this.f23077Y;
    }

    /* renamed from: b */
    public final void mo12476b(Intent intent) {
        this.f23155bn = false;
        intent.addFlags(ByteStreams.ZERO_COPY_CHUNK_SIZE);
        this.f23087aI.mo1817b(intent);
    }

    /* renamed from: d */
    private final boolean m15212d(hhx hhx) {
        Object a = this.f23126av.mo5866a(hhx);
        jri.m13404b(a);
        return a.mo5870b().f3019c;
    }

    /* renamed from: J */
    public final boolean mo6333J() {
        boolean z = true;
        ebd ebd = this.f23055C;
        if (ebd.f17177i.mo5751k()) {
            z = ebd.f17192x.mo5727b();
        } else if (ebd.f17187s.f19934a.mo10582c() || ebd.f17189u.f5222b.f23291e != null) {
            ebd.f17187s.mo13525a();
            ebd.f17189u.f5222b.mo14600a();
        } else if (!ebd.f17170b.mo12488s().mo12930f()) {
            if (ebd.f17190v.getVisibility() == 0) {
                ebd.mo13117b();
            } else {
                z = false;
            }
        }
        if (z) {
            return z;
        }
        return this.f23060H.mo12930f();
    }

    /* renamed from: a */
    public final void mo11602a(int i) {
        String str = f23052a;
        StringBuilder stringBuilder = new StringBuilder(28);
        stringBuilder.append("Camera disabled: ");
        stringBuilder.append(i);
        bli.m898e(str, stringBuilder.toString());
        this.f23121aq.mo12416a();
    }

    /* renamed from: a */
    public final void mo11604a(aah aah) {
        bli.m896d(f23052a, "onCameraOpened");
        if (this.f23077Y) {
            bli.m896d(f23052a, "received onCameraOpened but activity is stopped, closing Camera");
            this.f23116al.mo12499a(false);
        } else if (this.f23126av.mo5866a(this.f23070R).mo5870b().f3019c) {
            if (this.f23060H == null) {
                bli.m896d(f23052a, "mCurrentModule null, not invoking onCameraAvailable");
            } else {
                abo i = aah.mo28i();
                i.f149o = 0;
                aah.mo18a(i);
                try {
                    this.f23060H.mo12920a(aah);
                } catch (Throwable e) {
                    bli.m892b(f23052a, "Error connecting to camera", e);
                    this.f23121aq.mo8946a(e);
                }
            }
            bli.m896d(f23052a, "invoking onChangeCamera");
            this.f23055C.mo13128g();
        } else {
            this.f23116al.mo12499a(false);
            throw new IllegalStateException("Camera opened but the module shouldn't be requesting");
        }
    }

    /* renamed from: a */
    public final void mo6334a(Configuration configuration) {
        int e = this.f23129ay.mo7040e();
        if (this.f23101aW != e) {
            cvx cvx = this.f23060H;
            if (cvx != null) {
                this.f23101aW = e;
                cvx.mo12926b(gcb.m2523a(this.f23101aW));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6361a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.tiny_planet_editor) {
            crx crx = this.f23137bF;
            cre a = crx.mo5714a();
            if (a != cre.f2792c) {
                err e = a.mo5692e();
                Object obj = crx.f2836a;
                eaq eaq = new eaq(obj, obj.f23169d, obj.f23118an);
                Bundle bundle = new Bundle();
                bundle.putString("uri", e.mo6541g().f4384h.toString());
                bundle.putString(NotificationCompatJellybean.KEY_TITLE, e.mo6541g().f4379c);
                eaq.setArguments(bundle);
                eaq.show(((Activity) obj.f23183r.get()).getFragmentManager(), "tiny_planet");
            } else {
                bli.m898e(f23052a, "Cannot edit tiny planet on INVALID node.");
            }
            return true;
        } else if (itemId != R.id.photo_editor) {
            return false;
        } else {
            this.f23137bF.mo5715b();
            return true;
        }
    }

    /* renamed from: K */
    public final void mo6362K() {
        this.f23080aB.mo7618c();
    }

    /* renamed from: a */
    public final void mo6363a(ContextMenu contextMenu) {
        ((Activity) this.f23183r.get()).getMenuInflater().inflate(R.menu.filmstrip_context_menu, contextMenu);
    }

    /* renamed from: a */
    public final boolean mo6364a(Menu menu) {
        ((Activity) this.f23183r.get()).getMenuInflater().inflate(R.menu.filmstrip_menu, menu);
        this.f23100aV = menu;
        if (!this.f23189x) {
            axh.m756a(this.f23171f, menu, m15191S());
        }
        return true;
    }

    /* renamed from: f */
    public final void mo6365f() {
        cgu cgu = this.f23116al;
        cgu.f12465f = null;
        cgu.mo1876b(this.f23161bt);
        this.f23120ap.unregisterContentObserver(this.f23096aR);
        this.f23120ap.unregisterContentObserver(this.f23097aS);
        this.f23134bC.mo7252b(this.f23109ae);
        ebd ebd = this.f23055C;
        ebd.f17149L.unregisterDisplayListener(ebd.f17183o);
        aay.m29a(C0252go.f5933e);
        aay.m29a(C0252go.f5932d);
    }

    /* renamed from: a */
    public final void mo11603a(int i, String str) {
        String str2 = f23052a;
        String valueOf = String.valueOf(str);
        String str3 = "Camera open failure: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            valueOf = str3.concat(valueOf);
        }
        bli.m898e(str2, valueOf);
        this.f23121aq.mo8946a(null);
    }

    /* renamed from: b */
    public final void mo11606b(int i, String str) {
        String str2 = f23052a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 33);
        stringBuilder.append("Camera open already: ");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(str);
        bli.m898e(str2, stringBuilder.toString());
        this.f23121aq.mo12418c();
    }

    /* renamed from: a */
    public final boolean mo6336a(int i, KeyEvent keyEvent) {
        if (!this.f23076X) {
            if (this.f23060H.mo12923a(i, keyEvent)) {
                return true;
            }
            if ((i == 84 || i == 82) && keyEvent.isLongPress()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6337b(int i, KeyEvent keyEvent) {
        if (this.f23076X) {
            if (i == 22) {
                this.f23056D.mo5762d();
                return true;
            } else if (i == 21) {
                if (this.f23056D.mo5763e()) {
                    return true;
                }
                this.f23065M.mo5746g();
                return true;
            }
        } else if (this.f23060H.mo12927b(i, keyEvent) || i == 82 || i == 21) {
            return true;
        } else {
            if (i == 22) {
                this.f23065M.mo5752l();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo12473a(hhx hhx) {
        if (!this.f23154bm) {
            gqj gqj;
            switch (hhx.ordinal()) {
                case 1:
                    gqj = this.f23144bc;
                    if (gqj.f24198k) {
                        gqj.mo13408K();
                        break;
                    }
                    return;
                case 2:
                    gqj = this.f23144bc;
                    if (gqj.f24198k) {
                        gqj.mo13409L();
                        break;
                    }
                    return;
                case 3:
                    if (!this.f23136bE) {
                        this.f23142ba.mo13427a(true);
                        break;
                    } else {
                        this.f23142ba.mo13448q();
                        break;
                    }
                case 5:
                    this.f23142ba.mo13427a(false);
                    break;
                case 6:
                    this.f23142ba.mo13449r();
                    break;
                case 7:
                    this.f23143bb.mo14874o_();
                    break;
                case 8:
                    this.f23143bb.mo14875p_();
                    break;
                default:
                    return;
            }
            int c = this.f23178m.mo7299c(mo12492w(), "pref_camera_id_key");
            this.f23180o.mo8856a("doSelectMode");
            m15200a(hhx, c);
            this.f23180o.mo8857b();
            this.f23151bj = hhx.UNINITIALIZED;
        }
    }

    /* renamed from: c */
    public final void mo6338c(Intent intent) {
        int c;
        this.f23122ar.mo1821a(intent);
        String action = intent.getAction();
        bli.m894c(f23052a, "Resetting to default settings");
        this.f23153bl = true;
        this.f23155bn = true;
        TrampolineActivity.m1265a();
        this.f23104aZ.mo7344b();
        gqh.m2777a(this.f23104aZ);
        this.f23104aZ.mo7343a();
        if (this.f23178m.mo7299c(mo12492w(), "pref_camera_id_key") == 1 || awl.m740c(intent)) {
            this.f23152bk = true;
        }
        hhx R = m15190R();
        if (R == hhx.PHOTO || R == hhx.VIDEO) {
            this.f23055C.mo13119b(true);
        }
        if (R == hhx.VIDEO) {
            this.f23055C.mo13126e(false);
            this.f23152bk = true;
        }
        m15195W();
        Object a = this.f23126av.mo5866a(R);
        jri.m13404b(a);
        iur b = m15204b(gos.m2723b(a.mo5870b().f3018b));
        if (b == null) {
            c = this.f23178m.mo7299c(mo12492w(), "pref_camera_id_key");
        } else {
            c = b.mo9096a();
        }
        m15200a(R, c);
        this.f23055C.mo13124d(true);
        if (!this.f23077Y && this.f23155bn) {
            this.f23055C.mo13131k();
            this.f23155bn = false;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.f23170e.getSystemService(ShortcutManager.class);
        if (awl.m741d(this.f23122ar.f1017a.getIntent())) {
            shortcutManager.reportShortcutUsed("selfie");
        }
        if (action != null && action.equals("android.media.action.VIDEO_CAMERA")) {
            shortcutManager.reportShortcutUsed("video");
        }
    }

    /* renamed from: b */
    public final boolean mo6367b(MenuItem menuItem) {
        if (menuItem.getItemId() != ActionBarDrawerToggle.ID_HOME) {
            return false;
        }
        mo6333J();
        return true;
    }

    /* renamed from: g */
    public final void mo6368g() {
        this.f23180o.mo8856a("CameraActivityController.onPause");
        this.f23154bm = true;
        if (!(m15194V() || this.f23117am.f19825a.isInMultiWindowMode() || this.f23189x || this.f23060H.mo12929e())) {
            bli.m896d(f23052a, "Covering preview on SurfaceView preview transitions.");
            ebd ebd = this.f23055C;
            ebd.f17175g.f12887b.setVisibility(8);
            ebd.f17175g.mo12642a();
            this.f23159br = true;
            this.f23180o.mo8855a();
        }
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f23055C.f17182n;
        tutorialOverlayWrapper.f2613a = tutorialOverlayWrapper.getVisibility();
        tutorialOverlayWrapper.setVisibility(8);
        cpl cpl = this.f23096aR;
        cpl.f2746a = null;
        cpl.mo5661a(true);
        this.f23097aS.mo5661a(true);
        this.f23060H.mo12937m_();
        this.f23180o.mo8857b();
    }

    /* renamed from: L */
    public final boolean mo6369L() {
        return true;
    }

    /* renamed from: a */
    public final void mo11605a(C0619zs c0619zs, String str) {
        String str2 = f23052a;
        String valueOf = String.valueOf(str);
        String str3 = "Camera reconnection failure:";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            valueOf = str3.concat(valueOf);
        }
        bli.m898e(str2, valueOf);
        this.f23121aq.mo12417b();
    }

    /* renamed from: h */
    public final void mo6370h() {
        this.f23180o.mo8856a("CameraActivityController.onResume");
        this.f23154bm = false;
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f23055C.f17182n;
        tutorialOverlayWrapper.setVisibility(tutorialOverlayWrapper.f2613a);
        ebq ebq = this.f23106ab;
        String str = ebq.f17201a;
        boolean z = ebq.f17203c;
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("onResumeReceived called, gallery visible = ");
        stringBuilder.append(z);
        bli.m888a(str, stringBuilder.toString());
        if (ebq.f17203c) {
            ((csp) ((FragmentManager) jri.m13404b(ebq.f17204d.getFragmentManager())).findFragmentById(R.id.filmstrip_fragment)).mo5746g();
            ebq.f17203c = false;
        }
        this.f23104aZ.mo13456x();
        if (!(m15194V() || this.f23075W)) {
            if (this.f23105aa) {
                this.f23060H.mo12935k();
            }
            this.f23060H.mo12934j();
        }
        this.f23105aa = false;
        if (this.f23159br) {
            bli.m888a(f23052a, "Explicitly hiding mode cover in onResume()");
            this.f23055C.mo13129h();
            this.f23159br = false;
        }
        this.f23191z.mo5712e(true);
        if (!this.f23155bn) {
            cre a = this.f23056D.mo5754a();
            if (a != cre.f2792c) {
                this.f23059G.mo7837d(a.mo5692e().mo6541g().f4384h);
            }
        }
        this.f23155bn = false;
        if (!((!this.f23097aS.f2747b && !this.f23096aR.f2747b) || this.f23184s.mo1828e() || this.f23189x)) {
            this.f23059G.mo7838e();
        }
        this.f23096aR.mo5661a(false);
        this.f23097aS.mo5661a(false);
        if (this.f23160bs) {
            ((Activity) this.f23170e).overridePendingTransition(0, 0);
        }
        this.f23180o.mo8857b();
    }

    /* renamed from: M */
    public final void mo7553M() {
        String str = f23052a;
        String valueOf = String.valueOf(this.f23151bj);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Select mode : ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" canceled");
        bli.m888a(str, stringBuilder.toString());
        if (this.f23151bj != hhx.UNINITIALIZED) {
            cvx c = m15208c(this.f23151bj);
            if (c != null) {
                c.mo12933h();
                this.f23151bj = hhx.UNINITIALIZED;
            }
        }
    }

    /* renamed from: F */
    public final void mo12464F() {
        this.f23069Q.mo8878a(5);
        this.f23087aI.mo1817b(new Intent(this.f23171f, CameraSettingsActivity.class));
    }

    /* renamed from: i */
    public final void mo6372i() {
        this.f23180o.mo8856a("CameraActivityController.onStart");
        this.f23077Y = false;
        if (mo12462D()) {
            if (this.f23155bn || !m15194V()) {
                if (this.f23075W) {
                    m15195W();
                    m15196X();
                    m15213e(m15190R());
                    mo14582O();
                }
                this.f23055C.mo13131k();
            }
            this.f23080aB.mo7618c();
            this.f23180o.mo8856a("CameraActivityController.start");
            String str = f23052a;
            String valueOf = String.valueOf(Build.DISPLAY);
            String str2 = "Build info: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m896d(str, valueOf);
            this.f23101aW = this.f23129ay.mo7040e();
            m15191S();
            this.f23094aP.setDisplayShowHomeEnabled(false);
            this.f23180o.mo8855a();
            this.f23060H.mo12922a(this.f23178m);
            if (!(this.f23076X || this.f23075W)) {
                this.f23104aZ.mo13456x();
                this.f23060H.mo12935k();
            }
            this.f23069Q.mo8879a(mo14580H(), 1);
            this.f23180o.mo8855a();
            if (!this.f23189x) {
                this.f23096aR.f2746a = new cpm();
            }
            Activity activity = (Activity) this.f23183r.get();
            if (this.f23100aV == null && activity != null) {
                activity.invalidateOptionsMenu();
            }
            eja eja = this.f23061I;
            eja.f17461d = hud.m12226b(eja.f17462e.mo12480k());
            hji hji = eja.f17459b;
            if (hji != null && eja.f17460c == null) {
                eja.f17460c = hji.mo13541a();
            }
            this.f23180o.mo8855a();
            if (this.f23147bf.mo9709b() && !this.f23069Q.mo8910b()) {
                bof bof = (bof) this.f23147bf.mo9706a();
                this.f23081aC.mo7284b("pref_release_dialog_last_shown_version", "");
                bof.mo2066a();
            }
            m15210c(m15192T());
            this.f23103aY = this.f23131b.mo2303b().mo13672a(this.f23108ad, this.f23172g);
            this.f23180o.mo8857b();
            this.f23180o.mo8857b();
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        this.f23180o.mo8856a("CameraActivityController.onStop");
        this.f23159br = false;
        this.f23077Y = true;
        this.f23180o.mo8855a();
        this.f23060H.mo12936l();
        this.f23105aa = false;
        this.f23180o.mo8855a();
        this.f23055C.mo13130j();
        this.f23064L.mo7810a();
        iqo iqo = this.f23103aY;
        if (iqo != null) {
            iqo.close();
        }
        if (this.f23071S) {
            mo12474a("CameraActivityController: Fatal error during onPause!");
        } else {
            bli.m896d(f23052a, "onPause closing camera");
            this.f23116al.mo12499a(true);
            this.f23180o.mo8855a();
            if (this.f23073U) {
                this.f23075W = true;
                mo14579G();
            }
            epf.m1992a().f4236g.mo6442a(eph.f4243h);
        }
        this.f23153bl = false;
        this.f23180o.mo8855a();
        eja eja = this.f23061I;
        kpk kpk = eja.f17460c;
        if (kpk != null) {
            kow.m13878a(kpk, new ejb(eja), kpq.f8776a);
        }
        this.f23180o.mo8857b();
    }

    /* renamed from: a */
    public final void mo6345a(boolean z) {
        cvx cvx = this.f23060H;
        if (cvx != null) {
            cvx.mo12924a_(z);
        }
    }

    /* renamed from: b */
    private final void m15206b(cvx cvx) {
        cvx.mo12922a(this.f23178m);
        eiu eiu = this.f23055C.f17140C;
        ikd.m12501a();
        eiu.f3849a.setVisibility(8);
        if (!this.f23077Y) {
            cvx.mo12935k();
            cvx.mo12934j();
            iqo iqo = this.f23158bq;
            if (iqo != null) {
                iqo.close();
                this.f23158bq = null;
            }
            int H = mo14580H();
            if (H == 1 || H == 8) {
                AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(ilq.m3881a(this.f23055C.f17179k.getClickEnabledObservable(), new cfw(this, H, atomicReference)));
                this.f23158bq = (iqo) atomicReference.get();
                this.f23184s.mo1825b().mo8557a(this.f23158bq);
            } else {
                this.f23069Q.mo8879a(mo14580H(), 1);
            }
            mo14584Q();
        }
    }

    /* renamed from: a */
    public final void mo12468a(Uri uri) {
        this.f23061I.mo13151a((Activity) this.f23170e, uri);
    }

    /* renamed from: a */
    public final void mo12469a(Uri uri, String str) {
        try {
            if (this.f23189x) {
                this.f23170e.startActivity(new Intent(this.f23170e, VideoPlayerActivity.class).setDataAndType(uri, "video/*"));
                ((Activity) this.f23170e).overridePendingTransition(0, 0);
                this.f23160bs = true;
                return;
            }
            Intent putExtra = awl.m734a(uri).putExtra("android.intent.extra.TITLE", str).putExtra("treat-up-as-back", true);
            this.f23155bn = false;
            this.f23087aI.mo1817b(putExtra);
            ((Activity) this.f23170e).overridePendingTransition(0, 0);
            this.f23160bs = true;
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f23170e, this.f23079aA.getString(R.string.video_err), 0).show();
        }
    }

    /* renamed from: N */
    public final void mo5724N() {
        this.f23185t.mo7423b();
    }

    /* renamed from: W */
    private final void m15195W() {
        for (cvz b : this.f23126av.mo5867a()) {
            this.f23178m.mo7304g(gos.m2723b(b.mo5870b().f3018b), "pref_camera_id_key");
        }
        this.f23178m.mo7304g("default_scope", "pref_camera_countdown_duration_key");
    }

    /* renamed from: O */
    public final void mo14582O() {
        ikd.m12501a();
        this.f23073U = false;
        if (this.f23075W) {
            bli.m896d(f23052a, "restartPreviewWhenLeavingFilmstrip");
            this.f23174i.modeSwitch().create();
            this.f23075W = false;
            m15213e(this.f23070R);
            m15206b(this.f23060H);
        }
    }

    /* renamed from: e */
    private final void m15213e(hhx hhx) {
        Throwable e;
        ikd.m12501a();
        int c = this.f23178m.mo7299c(mo12492w(), "pref_camera_id_key");
        if (mo12462D()) {
            cvz a = this.f23126av.mo5866a(hhx);
            if (a != null) {
                String str;
                String valueOf;
                if (!m15212d(hhx)) {
                    str = f23052a;
                    valueOf = String.valueOf(hhx);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    stringBuilder.append("Closing v1 Camera before using mode ");
                    stringBuilder.append(valueOf);
                    bli.m888a(str, stringBuilder.toString());
                    this.f23116al.mo12499a(true);
                }
                hhx hhx2 = this.f23070R;
                valueOf = f23052a;
                str = String.valueOf(hhx2);
                String valueOf2 = String.valueOf(hhx);
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(valueOf2).length());
                stringBuilder2.append("Change Capture Mode from:");
                stringBuilder2.append(str);
                stringBuilder2.append(" to:");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append(" with camera ");
                stringBuilder2.append(c);
                bli.m894c(valueOf, stringBuilder2.toString());
                this.f23070R = hhx;
                try {
                    this.f23060H = (cvx) a.mo5869a().get();
                    this.f23184s.mo1824a().mo8557a(this.f23060H);
                    this.f23060H.mo12921a((cfh) this, new ezy(this));
                    if (this.f23070R == hhx.VIDEO) {
                        this.f23144bc.mo13409L();
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (ExecutionException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12472a(haq haq, boolean z) {
        if (z && haq.mo7614n_()) {
            this.f23055C.mo13113a(ebk.SURFACE_VIEW, haq);
        } else {
            this.f23055C.mo13113a(ebk.TEXTURE_VIEW_LEGACY, haq);
        }
    }

    /* renamed from: X */
    private final iur m15196X() {
        return m15204b(mo12492w());
    }

    /* renamed from: b */
    private final iur m15204b(String str) {
        iur iur = null;
        if (awl.m740c(this.f23122ar.f1017a.getIntent())) {
            if (awl.m741d(this.f23122ar.f1017a.getIntent())) {
                iur = this.f23128ax.mo9091b(iut.FRONT);
                this.f23067O.mo13445n();
            }
            if (iur == null) {
                iur = this.f23128ax.mo9091b(iut.BACK);
            }
            jri.m13404b(r0);
            this.f23178m.mo7290a(str, "pref_camera_id_key", r0.f7848b);
        }
        return iur;
    }

    /* renamed from: a */
    public final void mo12470a(cre cre) {
        csh csh = this.f23053A;
        cop ckx = new ckx(csh.f2850g, csh.f2851h, new File(cre.mo5692e().mo6541g().f4383g), csh.f2847d, csh.f2849f, csh.f2853j, csh.f2854k);
        if (csh.f2852i.findFragmentByTag("burst_editor_fragment") == null) {
            ckx.mo5651b();
            cls cls = (cls) csh.f2845b.mo10562a();
            ikd.m12501a();
            if (cre.mo5692e() instanceof cou) {
                cls.f12720r = cre;
                cls.f12708f = ckx;
                cls.f12706d = new gqy(cls.mo12533c().f13139e.f4383g, cls.f12719q);
                cls.f12713k = new cmp(cls.f12711i);
                cls.f12710h = cls.mo12533c().mo14824b();
                cls.f12713k.f2355k = cls.f12716n;
                try {
                    ((cls) csh.f2845b.mo10562a()).show(csh.f2852i, "burst_editor_fragment");
                    return;
                } catch (IllegalStateException e) {
                    String str = csh.f2844a;
                    String valueOf = String.valueOf(e.getMessage());
                    String str2 = "showBurstEditor ";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    bli.m898e(str, valueOf);
                    return;
                }
            }
            throw new RuntimeException("Burst editor opened for non-burst");
        }
    }

    /* renamed from: a */
    public final void m15205b(err err) {
        int i;
        cum cum;
        this.f23191z.mo5710c(err.mo6540f().f4362a.contains(ert.CAN_EDIT));
        this.f23191z.mo5711d(err.mo6540f().mo6549b());
        this.f23191z.mo5707a(err.mo6540f().mo6548a());
        if (err.mo6540f().mo6552e()) {
            this.f23191z.mo5709b(false);
        } else {
            this.f23191z.mo5709b(err.mo6544j().mo9709b());
        }
        Uri uri = err.mo6541g().f4384h;
        gln gln = this.f23168c.f1069a;
        this.f23191z.mo5708b();
        gkr b = gln.mo7201b(uri);
        if (b != null) {
            i = b.mo13380i();
            if (i < 0) {
                mo14581I();
            } else {
                this.f23066N.mo5701a(b.mo13381j().mo7762a(this.f23171f.getResources()));
                this.f23191z.mo5708b();
                crt crt = this.f23066N;
                crt.f2808b = true;
                crt.mo5699a();
                mo14587b(i);
            }
        } else {
            mo14581I();
        }
        if (err.mo6545k().f4343b.f4351h) {
            cum = cum.PHOTO_SPHERE;
        } else if (err.mo6545k().f4343b.f4352i) {
            cum = cum.REFOCUS;
        } else {
            cum = cum.INVISIBLE;
        }
        this.f23191z.f2825i = err.mo6545k().f4343b.f4350g;
        crw crw = this.f23191z;
        ExternalViewerButton externalViewerButton = crw.f2821e;
        externalViewerButton.f2520b = cum;
        if (cum != cum.INVISIBLE) {
            externalViewerButton.setImageResource(ExternalViewerButton.m1278a(cum));
            i = 0;
        } else {
            i = 8;
        }
        if (i != externalViewerButton.getVisibility()) {
            externalViewerButton.setVisibility(i);
        } else if (i == 0) {
            externalViewerButton.mo2625a();
        }
        if (cum == cum.INVISIBLE) {
            crw.f2822f.setVisibility(8);
        } else {
            crw.f2822f.setVisibility(0);
        }
    }

    /* renamed from: P */
    public final void mo14583P() {
        ikd.m12501a();
        if (this.f23059G.mo7835d() == 0) {
            this.f23191z.mo5706a();
        } else {
            this.f23191z.f2820d.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo12466a(float f) {
        this.f23055C.f17141D.mo7600a(f);
    }

    /* renamed from: c */
    private final void m15210c(int i) {
        if (i == 2) {
            this.f23055C.f17172d.setVisibility(4);
        } else {
            this.f23055C.f17172d.setVisibility(0);
        }
    }

    /* renamed from: Q */
    public final void mo14584Q() {
        if (this.f23060H != null) {
            int T = m15192T();
            m15210c(T);
            this.f23060H.mo12919a(T);
        }
    }

    /* renamed from: b */
    final void mo14587b(int i) {
        boolean z;
        crt crt = this.f23066N;
        if (i < 0) {
            z = false;
        } else if (i <= 100) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (i > 0) {
            crt.f2807a.setIndeterminate(false);
            crt.f2807a.setProgress(i);
            return;
        }
        crt.f2807a.setIndeterminate(true);
    }

    /* renamed from: b */
    public final void mo7555b(hhx hhx) {
        cvx c = m15208c(hhx);
        if (c == null) {
            String str = f23052a;
            String valueOf = String.valueOf(hhx);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Fail to obtain module for mode ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            return;
        }
        if ((this.f23070R == hhx.PHOTO || this.f23070R == hhx.VIDEO || this.f23070R == hhx.PORTRAIT) && (hhx == hhx.PHOTO || hhx == hhx.VIDEO || hhx == hhx.PORTRAIT)) {
            this.f23178m.mo7289a("default_scope", "pref_mode_switch_camera_id_key", this.f23178m.mo7299c(mo12492w(), "pref_camera_id_key"));
        }
        this.f23180o.mo8856a(String.valueOf(f23052a).concat("#prewarm"));
        c.mo12932g();
        this.f23151bj = hhx;
        this.f23180o.mo8857b();
    }
}

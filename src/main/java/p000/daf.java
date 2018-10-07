package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: daf */
public final class daf extends cvs {
    /* renamed from: c */
    public boolean f25900c;
    /* renamed from: d */
    public buh f25901d;
    /* renamed from: e */
    public final hch f25902e;
    /* renamed from: f */
    public hin f25903f;
    /* renamed from: g */
    public final how f25904g;
    /* renamed from: h */
    private dak f25905h;
    /* renamed from: i */
    private ikb f25906i;
    /* renamed from: j */
    private final BottomBarController f25907j;
    /* renamed from: k */
    private final hcd f25908k;
    /* renamed from: l */
    private final BottomBarListener f25909l;
    /* renamed from: m */
    private final dbv f25910m;
    /* renamed from: n */
    private final hny f25911n;
    /* renamed from: o */
    private final hnz f25912o = new dag(this);
    /* renamed from: p */
    private final haq f25913p = new daj();

    static {
        bli.m887a("ImgIntModule");
    }

    public daf(Context context, fbn fbn, don don, hjw hjw, gci gci, cbu cbu, gyi gyi, bpt bpt, gtf gtf, gsl gsl, bkw bkw, awr awr, ikd ikd, gpn gpn, cbr cbr, hek hek, heq heq, bpq bpq, hny hny, eby eby, ehj ehj, aws aws, ilp ilp, hnh hnh, hnf hnf, gos gos, gor gor, BottomBarController bottomBarController, hcd hcd, edk edk, ecd ecd, kbg kbg, ilp ilp2, gjk gjk, asu asu, dzh dzh, irs irs, grg grg, dpa dpa, ilp ilp3, how how, bmb bmb, ise ise, gnh gnh, bag bag, bah bah, Executor executor, bqq bqq, AccessibilityManager accessibilityManager, bsn bsn) {
        super(bag, bah);
        eae eae = new eae(gos, fbn, bkw);
        dae dae = new dae();
        HandlerThread handlerThread = new HandlerThread("ImageCaptureIntentModule.CameraHandler");
        handlerThread.start();
        dbv dbv = new dbv((byte) 0);
        dbv.f3181u = handlerThread;
        dbv.f3180t = new Handler(handlerThread.getLooper());
        Intent intent = awr.f1017a.getIntent();
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        dbv.f3162b = intent;
        if (ikd == null) {
            throw new NullPointerException("Null mainThread");
        }
        dbv.f3164d = ikd;
        if (context == null) {
            throw new NullPointerException("Null androidContext");
        }
        dbv.f3165e = context;
        if (bpt == null) {
            throw new NullPointerException("Null evCompViewController");
        }
        dbv.f3166f = bpt;
        if (gtf == null) {
            throw new NullPointerException("Null fileNamer");
        }
        dbv.f3167g = gtf;
        if (gsl == null) {
            throw new NullPointerException("Null filesProxy");
        }
        dbv.f3168h = gsl;
        if (gyi == null) {
            throw new NullPointerException("Null captureLayoutHelper");
        }
        dbv.f3169i = gyi;
        if (don == null) {
            throw new NullPointerException("Null oneCameraOpener");
        }
        dbv.f3171k = don;
        if (fbn == null) {
            throw new NullPointerException("Null oneCameraManager");
        }
        dbv.f3170j = fbn;
        if (hjw == null) {
            throw new NullPointerException("Null locationProvider");
        }
        dbv.f3172l = hjw;
        if (gci == null) {
            throw new NullPointerException("Null orientationManager");
        }
        dbv.f3173m = gci;
        if (gor == null) {
            throw new NullPointerException("Null settings");
        }
        dbv.f3174n = gor;
        if (gos == null) {
            throw new NullPointerException("Null settingsManager");
        }
        dbv.f3175o = gos;
        if (gpn == null) {
            throw new NullPointerException("Null cameraSoundPlayer");
        }
        dbv.f3182v = gpn;
        if (dzh == null) {
            throw new NullPointerException("Null cameraFacingSetting");
        }
        dbv.f3176p = dzh;
        dbv.f3177q = eae;
        if (bpq == null) {
            throw new NullPointerException("Null fatalErrorHandler");
        }
        dbv.f3184x = bpq;
        DisplayMetrics a = eag.m1775a(cbr.mo2249a());
        if (a == null) {
            throw new NullPointerException("Null displayMetrics");
        }
        dbv.f3185y = a;
        if (hek == null) {
            throw new NullPointerException("Null viewfinder");
        }
        dbv.f3178r = hek;
        if (heq == null) {
            throw new NullPointerException("Null viewfinderSizeSelector");
        }
        dbv.f3179s = heq;
        dbv.f3186z = dae;
        if (cbu == null) {
            throw new NullPointerException("Null androidServices");
        }
        dbv.f3183w = cbu;
        if (eby == null) {
            throw new NullPointerException("Null cameraDeviceStatechart");
        }
        dbv.f3138A = eby;
        if (ehj == null) {
            throw new NullPointerException("Null imageIntentStatechart");
        }
        dbv.f3139B = ehj;
        if (aws == null) {
            throw new NullPointerException("Null activityLifetime");
        }
        dbv.f3142E = aws;
        if (ilp == null) {
            throw new NullPointerException("Null gridLinesProperty");
        }
        dbv.f3143F = ilp;
        if (hnh == null) {
            throw new NullPointerException("Null previewTapListener");
        }
        dbv.f3144G = hnh;
        if (hnf == null) {
            throw new NullPointerException("Null previewLongPressListener");
        }
        dbv.f3145H = hnf;
        if (edk == null) {
            throw new NullPointerException("Null countdownStatechart");
        }
        dbv.f3140C = edk;
        if (ecd == null) {
            throw new NullPointerException("Null cameraFacingStatechart");
        }
        dbv.f3141D = ecd;
        if (kbg == null) {
            throw new NullPointerException("Null flashIndicatorChipOptional");
        }
        dbv.f3146I = kbg;
        if (ilp2 == null) {
            throw new NullPointerException("Null flashMode");
        }
        dbv.f3147J = ilp2;
        if (gjk == null) {
            throw new NullPointerException("Null selfieFlashTorchSwitch");
        }
        dbv.f3148K = gjk;
        if (asu == null) {
            throw new NullPointerException("Null focusControllerFactory");
        }
        dbv.f3149L = asu;
        if (irs == null) {
            throw new NullPointerException("Null usageStatistics");
        }
        dbv.f3150M = irs;
        if (grg == null) {
            throw new NullPointerException("Null captureSessionStatsCollector");
        }
        dbv.f3151N = grg;
        if (dpa == null) {
            throw new NullPointerException("Null oneCameraSelector");
        }
        dbv.f3152O = dpa;
        if (ilp3 == null) {
            throw new NullPointerException("Null zoomProperty");
        }
        dbv.f3154Q = ilp3;
        if (bmb == null) {
            throw new NullPointerException("Null debugPropertyHelper");
        }
        dbv.f3155R = bmb;
        if (ise == null) {
            throw new NullPointerException("Null cameraWakeLock");
        }
        dbv.f3156S = ise;
        if (gnh == null) {
            throw new NullPointerException("Null sessionNotifier");
        }
        dbv.f3153P = gnh;
        if (executor == null) {
            throw new NullPointerException("Null executor");
        }
        dbv.f3157T = executor;
        if (bqq == null) {
            throw new NullPointerException("Null faceAnnouncer");
        }
        dbv.f3158U = bqq;
        if (accessibilityManager == null) {
            throw new NullPointerException("Null accessibilityManager");
        }
        dbv.f3159V = accessibilityManager;
        if (bsn == null) {
            throw new NullPointerException("Null flags");
        }
        dbv.f3160W = bsn;
        this.f25910m = dbv;
        this.f25911n = hny;
        this.f25907j = bottomBarController;
        this.f25908k = hcd;
        this.f25909l = new dah(this);
        this.f25902e = new dai(this);
        this.f25904g = how;
    }

    public final void close() {
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        Object obj = ((dbu) this.f25901d.mo2153a()).mo12973C().f3109a;
        jri.m13391a(obj, (Object) "Hardware spec is queried before Camera is open");
        return obj;
    }

    /* renamed from: b */
    public final String mo12925b() {
        return ((dbu) this.f25901d.mo2153a()).mo12996c().getResources().getString(R.string.photo_accessibility_peek);
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        ebd l = cfh.mo12481l();
        gyi gyi = this.f25910m.f3169i;
        if (gyi == null) {
            throw new IllegalStateException("Property \"captureLayoutHelper\" has not been set");
        }
        View view = cfh.mo12481l().f17176h;
        Executor executor = this.f25910m.f3157T;
        if (executor == null) {
            throw new IllegalStateException("Property \"executor\" has not been set");
        }
        this.f25905h = new dak(l, gyi, view, executor);
        dbv dbv = this.f25910m;
        dak dak = this.f25905h;
        if (dak == null) {
            throw new NullPointerException("Null moduleUI");
        }
        dbv.f3163c = dak;
        if (cfh == null) {
            throw new NullPointerException("Null appController");
        }
        dbv.f3161a = cfh;
        String str = "";
        if (dbv.f3161a == null) {
            str = String.valueOf(str).concat(" appController");
        }
        if (dbv.f3162b == null) {
            str = String.valueOf(str).concat(" intent");
        }
        if (dbv.f3163c == null) {
            str = String.valueOf(str).concat(" moduleUI");
        }
        if (dbv.f3164d == null) {
            str = String.valueOf(str).concat(" mainThread");
        }
        if (dbv.f3165e == null) {
            str = String.valueOf(str).concat(" androidContext");
        }
        if (dbv.f3166f == null) {
            str = String.valueOf(str).concat(" evCompViewController");
        }
        if (dbv.f3167g == null) {
            str = String.valueOf(str).concat(" fileNamer");
        }
        if (dbv.f3168h == null) {
            str = String.valueOf(str).concat(" filesProxy");
        }
        if (dbv.f3169i == null) {
            str = String.valueOf(str).concat(" captureLayoutHelper");
        }
        if (dbv.f3170j == null) {
            str = String.valueOf(str).concat(" oneCameraManager");
        }
        if (dbv.f3171k == null) {
            str = String.valueOf(str).concat(" oneCameraOpener");
        }
        if (dbv.f3172l == null) {
            str = String.valueOf(str).concat(" locationProvider");
        }
        if (dbv.f3173m == null) {
            str = String.valueOf(str).concat(" orientationManager");
        }
        if (dbv.f3174n == null) {
            str = String.valueOf(str).concat(" settings");
        }
        if (dbv.f3175o == null) {
            str = String.valueOf(str).concat(" settingsManager");
        }
        if (dbv.f3176p == null) {
            str = String.valueOf(str).concat(" cameraFacingSetting");
        }
        if (dbv.f3177q == null) {
            str = String.valueOf(str).concat(" resolutionSetting");
        }
        if (dbv.f3178r == null) {
            str = String.valueOf(str).concat(" viewfinder");
        }
        if (dbv.f3179s == null) {
            str = String.valueOf(str).concat(" viewfinderSizeSelector");
        }
        if (dbv.f3180t == null) {
            str = String.valueOf(str).concat(" cameraHandler");
        }
        if (dbv.f3181u == null) {
            str = String.valueOf(str).concat(" cameraHandlerThread");
        }
        if (dbv.f3182v == null) {
            str = String.valueOf(str).concat(" cameraSoundPlayer");
        }
        if (dbv.f3183w == null) {
            str = String.valueOf(str).concat(" androidServices");
        }
        if (dbv.f3184x == null) {
            str = String.valueOf(str).concat(" fatalErrorHandler");
        }
        if (dbv.f3185y == null) {
            str = String.valueOf(str).concat(" displayMetrics");
        }
        if (dbv.f3186z == null) {
            str = String.valueOf(str).concat(" imageIntentHardwareSpecProvider");
        }
        if (dbv.f3138A == null) {
            str = String.valueOf(str).concat(" cameraDeviceStatechart");
        }
        if (dbv.f3139B == null) {
            str = String.valueOf(str).concat(" imageIntentStatechart");
        }
        if (dbv.f3140C == null) {
            str = String.valueOf(str).concat(" countdownStatechart");
        }
        if (dbv.f3141D == null) {
            str = String.valueOf(str).concat(" cameraFacingStatechart");
        }
        if (dbv.f3142E == null) {
            str = String.valueOf(str).concat(" activityLifetime");
        }
        if (dbv.f3143F == null) {
            str = String.valueOf(str).concat(" gridLinesProperty");
        }
        if (dbv.f3144G == null) {
            str = String.valueOf(str).concat(" previewTapListener");
        }
        if (dbv.f3145H == null) {
            str = String.valueOf(str).concat(" previewLongPressListener");
        }
        if (dbv.f3147J == null) {
            str = String.valueOf(str).concat(" flashMode");
        }
        if (dbv.f3148K == null) {
            str = String.valueOf(str).concat(" selfieFlashTorchSwitch");
        }
        if (dbv.f3149L == null) {
            str = String.valueOf(str).concat(" focusControllerFactory");
        }
        if (dbv.f3150M == null) {
            str = String.valueOf(str).concat(" usageStatistics");
        }
        if (dbv.f3151N == null) {
            str = String.valueOf(str).concat(" captureSessionStatsCollector");
        }
        if (dbv.f3152O == null) {
            str = String.valueOf(str).concat(" oneCameraSelector");
        }
        if (dbv.f3153P == null) {
            str = String.valueOf(str).concat(" sessionNotifier");
        }
        if (dbv.f3154Q == null) {
            str = String.valueOf(str).concat(" zoomProperty");
        }
        if (dbv.f3155R == null) {
            str = String.valueOf(str).concat(" debugPropertyHelper");
        }
        if (dbv.f3156S == null) {
            str = String.valueOf(str).concat(" cameraWakeLock");
        }
        if (dbv.f3157T == null) {
            str = String.valueOf(str).concat(" executor");
        }
        if (dbv.f3158U == null) {
            str = String.valueOf(str).concat(" faceAnnouncer");
        }
        if (dbv.f3159V == null) {
            str = String.valueOf(str).concat(" accessibilityManager");
        }
        if (dbv.f3160W == null) {
            str = String.valueOf(str).concat(" flags");
        }
        if (str.isEmpty()) {
            this.f25901d = new bui(new dbt(dbv.f3161a, dbv.f3162b, dbv.f3163c, dbv.f3164d, dbv.f3165e, dbv.f3166f, dbv.f3167g, dbv.f3168h, dbv.f3169i, dbv.f3170j, dbv.f3171k, dbv.f3172l, dbv.f3173m, dbv.f3174n, dbv.f3175o, dbv.f3176p, dbv.f3177q, dbv.f3178r, dbv.f3179s, dbv.f3180t, dbv.f3181u, dbv.f3182v, dbv.f3183w, dbv.f3184x, dbv.f3185y, dbv.f3186z, dbv.f3138A, dbv.f3139B, dbv.f3140C, dbv.f3141D, dbv.f3142E, dbv.f3143F, dbv.f3144G, dbv.f3145H, dbv.f3146I, dbv.f3147J, dbv.f3148K, dbv.f3149L, dbv.f3150M, dbv.f3151N, dbv.f3152O, dbv.f3153P, dbv.f3154Q, dbv.f3155R, dbv.f3156S, dbv.f3157T, dbv.f3158U, dbv.f3159V, dbv.f3160W));
            buh buh = this.f25901d;
            buh.mo2155a(new dbx(buh, (byte) 0));
            return;
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo12929e() {
        return true;
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        if (mo15493m()) {
            switch (i) {
                case 23:
                case 27:
                    this.f25901d.mo2154a(new dau(i, keyEvent));
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
    }

    /* renamed from: a */
    public final void mo12919a(int i) {
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
        this.f25901d.mo2154a(new daz());
    }

    /* renamed from: j */
    public final void mo12934j() {
    }

    /* renamed from: m */
    final boolean mo15493m() {
        return this.f25905h.f3111b.mo13532b() ^ 1;
    }

    /* renamed from: k */
    public final void mo12935k() {
        this.f25906i = new ikb();
        this.f25906i.mo8557a(this.f25908k.mo7668a(this.f25902e));
        this.f25907j.addListener(this.f25909l);
        ((dbu) this.f25901d.mo2153a()).mo12998e().mo12472a(this.f25913p, true);
        ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).mo13464b();
        dak dak = this.f25905h;
        ikd.m12501a();
        dak.f3110a.mo13114a(dak.f3116g);
        this.f25901d.mo2154a(new dbc());
        this.f25911n.mo13554a(this.f25912o);
    }

    /* renamed from: l */
    public final void mo12936l() {
        this.f25905h.mo5913a(null);
        dak dak = this.f25905h;
        ikd.m12501a();
        ebd ebd = dak.f3110a;
        ebd.f17141D.mo7605b(dak.f3116g);
        this.f25907j.removeListener(this.f25909l);
        this.f25901d.mo2154a(new dbd());
        this.f25906i.close();
        this.f25911n.mo13555b(this.f25912o);
    }
}

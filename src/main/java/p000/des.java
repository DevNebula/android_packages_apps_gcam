package p000;

import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.legacy.lightcycle.p004ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.concurrent.ExecutionException;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* renamed from: des */
public final class des extends cvs implements bwg, cvx {
    /* renamed from: Q */
    private static boolean f25915Q;
    /* renamed from: c */
    public static final String f25916c = bli.m887a("PanoramaModule");
    /* renamed from: A */
    public int f25917A;
    /* renamed from: B */
    public int f25918B;
    /* renamed from: C */
    public final ehp f25919C;
    /* renamed from: D */
    public final Handler f25920D = new dfz(this);
    /* renamed from: E */
    public ezy f25921E;
    /* renamed from: F */
    public final bvm f25922F;
    /* renamed from: G */
    public final bus f25923G;
    /* renamed from: H */
    public boolean f25924H = false;
    /* renamed from: I */
    public Handler f25925I;
    /* renamed from: J */
    public bwb f25926J;
    /* renamed from: K */
    public AlertDialog f25927K;
    /* renamed from: L */
    public AlertDialog f25928L;
    /* renamed from: M */
    public final OnTouchListener f25929M = new dfi(this);
    /* renamed from: N */
    public int f25930N = 0;
    /* renamed from: O */
    public long f25931O = 0;
    /* renamed from: P */
    public int f25932P = 2;
    /* renamed from: R */
    private final gev f25933R;
    /* renamed from: S */
    private final gtf f25934S;
    /* renamed from: T */
    private final gtl f25935T;
    /* renamed from: U */
    private final BottomBarController f25936U;
    /* renamed from: V */
    private final hcd f25937V;
    /* renamed from: W */
    private final BottomBarListener f25938W;
    /* renamed from: X */
    private int f25939X = C0252go.f5834ag;
    /* renamed from: Y */
    private Context f25940Y;
    /* renamed from: Z */
    private bkw f25941Z;
    /* renamed from: aA */
    private final Runnable f25942aA = new dfn(this);
    /* renamed from: aa */
    private ViewGroup f25943aa;
    /* renamed from: ab */
    private View f25944ab;
    /* renamed from: ac */
    private elq f25945ac;
    /* renamed from: ad */
    private DisplayListener f25946ad;
    /* renamed from: ae */
    private ekr f25947ae;
    /* renamed from: af */
    private PhotoSphereMessageOverlay f25948af;
    /* renamed from: ag */
    private irs f25949ag;
    /* renamed from: ah */
    private boolean f25950ah = true;
    /* renamed from: ai */
    private final ilp f25951ai;
    /* renamed from: aj */
    private ikb f25952aj;
    /* renamed from: ak */
    private final boolean f25953ak;
    /* renamed from: al */
    private final gmn f25954al;
    /* renamed from: am */
    private final gnu f25955am;
    /* renamed from: an */
    private final gci f25956an;
    /* renamed from: ao */
    private final ilp f25957ao;
    /* renamed from: ap */
    private HandlerThread f25958ap;
    /* renamed from: aq */
    private final OnClickListener f25959aq = new det(this);
    /* renamed from: ar */
    private final haq f25960ar = new dfs(this);
    /* renamed from: as */
    private final iqt f25961as = new dft(this);
    /* renamed from: at */
    private final emc f25962at = new dfu(this);
    /* renamed from: au */
    private final emc f25963au = new dfv(this);
    /* renamed from: av */
    private final emc f25964av = new dhg(this);
    /* renamed from: aw */
    private final eak f25965aw = new dfy("panorama_upgrade_version");
    /* renamed from: ax */
    private final hny f25966ax;
    /* renamed from: ay */
    private final hnz f25967ay = new dqr(this);
    /* renamed from: az */
    private final Runnable f25968az = new dfm(this);
    /* renamed from: d */
    public final eld f25969d;
    /* renamed from: e */
    public final boolean f25970e;
    /* renamed from: f */
    public final gey f25971f;
    /* renamed from: g */
    public final gpn f25972g;
    /* renamed from: h */
    public final hch f25973h;
    /* renamed from: i */
    public ejx f25974i;
    /* renamed from: j */
    public eje f25975j;
    /* renamed from: k */
    public boolean f25976k;
    /* renamed from: l */
    public boolean f25977l;
    /* renamed from: m */
    public boolean f25978m;
    /* renamed from: n */
    public elo f25979n;
    /* renamed from: o */
    public eln f25980o;
    /* renamed from: p */
    public cfh f25981p;
    /* renamed from: q */
    public cbr f25982q;
    /* renamed from: r */
    public boolean f25983r = false;
    /* renamed from: s */
    public int f25984s = 0;
    /* renamed from: t */
    public eki f25985t;
    /* renamed from: u */
    public boolean f25986u = true;
    /* renamed from: v */
    public ejy f25987v;
    /* renamed from: w */
    public final cfh f25988w;
    /* renamed from: x */
    public final hat f25989x;
    /* renamed from: y */
    public Thread f25990y;
    /* renamed from: z */
    public int f25991z;

    public des(bag bag, bah bah, cfh cfh, boolean z, gpn gpn, bkw bkw, gey gey, gev gev, gtf gtf, iji iji, ikd ikd, ilp ilp, hny hny, ehp ehp, gtl gtl, BottomBarController bottomBarController, hcd hcd, irs irs, bvm bvm, bus bus, boolean z2, gmn gmn, gnu gnu, gci gci, ilp ilp2) {
        super(bag, bah);
        jri.m13404b((Object) bah);
        this.f25988w = (cfh) jri.m13404b((Object) cfh);
        this.f25989x = (hat) jri.m13404b(cfh.mo12495z());
        this.f25970e = z;
        this.f25972g = (gpn) jri.m13404b((Object) gpn);
        this.f25941Z = (bkw) jri.m13404b((Object) bkw);
        this.f25971f = (gey) jri.m13404b((Object) gey);
        this.f25933R = gev;
        this.f25934S = (gtf) jri.m13404b((Object) gtf);
        this.f25966ax = (hny) jri.m13404b((Object) hny);
        this.f25919C = (ehp) jri.m13404b((Object) ehp);
        this.f25935T = gtl;
        this.f25951ai = ilp;
        this.f25936U = (BottomBarController) jri.m13404b((Object) bottomBarController);
        this.f25937V = (hcd) jri.m13404b((Object) hcd);
        this.f25949ag = irs;
        this.f25922F = bvm;
        this.f25923G = bus;
        this.f25953ak = z2;
        this.f25954al = gmn;
        this.f25955am = gnu;
        this.f25956an = gci;
        this.f25957ao = ilp2;
        this.f25969d = new eld(bah);
        this.f25965aw.mo6164a(this.f25988w.mo12460B(), null);
        iji.mo8557a(ilp.mo13672a(this.f25961as, ikd));
        this.f25938W = new deu(this);
        this.f25973h = new dev(this, ehp);
    }

    /* renamed from: v */
    private final void m17362v() {
        if (!this.f25953ak && this.f25986u) {
            int i;
            Context context = this.f25940Y;
            if (this.f25957ao.mo13673b() == hhx.PHOTO_SPHERE) {
                i = R.string.mode_photosphere;
            } else {
                i = R.string.mode_panorama;
            }
            if (!this.f25988w.mo12481l().mo13116a(new els(context, i, new dfo(this)), LayoutInflater.from(this.f25940Y))) {
                this.f25986u = false;
                mo12919a(0);
            }
            mo15496m();
        }
    }

    /* renamed from: m */
    final void mo15496m() {
        int i = this.f25984s;
        this.f25988w.mo12481l().mo13112a();
        if (i != 0) {
            this.f25956an.mo7038c();
        } else {
            this.f25956an.mo7042g();
        }
    }

    /* renamed from: n */
    final void mo15497n() {
        mo15495c(false);
        m17364x();
        if (this.f25974i.isInterrupted() || !this.f25974i.isAlive()) {
            this.f25920D.sendEmptyMessage(105);
        } else {
            this.f25974i.mo6263a(new dfa(this));
        }
        m17359d(true);
        mo15496m();
    }

    public final void close() {
    }

    /* renamed from: o */
    final synchronized void mo15498o() {
        if (this.f25958ap == null) {
            this.f25958ap = new HandlerThread("PhotoSphereGLThread");
            this.f25958ap.start();
            this.f25925I = new dga(this, this.f25958ap.getLooper());
        }
    }

    /* renamed from: p */
    final void mo15499p() {
        eki eki = this.f25985t;
        if (eki != null && eki.f4027s) {
            bli.m898e(f25916c, "Not finishing capture since photo taking is in progress.");
            return;
        }
        this.f25972g.mo7328a(R.raw.staged_shot_complete);
        mo15496m();
        mo15495c(false);
        String d = this.f25981p.mo12460B().mo7301d("default_scope", "pref_lightcycle_quality_key");
        if (this.f25940Y.getResources().getString(R.string.camera_quality_low).equals(d)) {
            LightCycle.m1345p();
        } else if (this.f25940Y.getResources().getString(R.string.camera_quality_high).equals(d)) {
            LightCycle.m1344o();
        } else if (this.f25940Y.getResources().getString(R.string.camera_quality_max).equals(d)) {
            LightCycle.m1343n();
        } else {
            LightCycle.m1344o();
        }
        elq elq = this.f25945ac;
        View view = this.f25944ab;
        ObjectAnimator objectAnimator = elq.f4173a;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            elq.f4173a.cancel();
        }
        elq.f4173a = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.3f, 0.0f});
        elq.f4173a.setDuration(300);
        elq.f4173a.addListener(new elr(elq, view));
        elq.f4173a.start();
        this.f25990y = new dfh(this);
        this.f25990y.start();
        m17364x();
        this.f25974i.mo6263a(new dfj(this));
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        return new dex();
    }

    /* renamed from: w */
    private final int m17363w() {
        String d = this.f25981p.mo12460B().mo7301d("default_scope", "pref_lightcycle_quality_key");
        if (this.f25940Y.getResources().getString(R.string.camera_quality_low).equals(d)) {
            return C0252go.f5847at;
        }
        if (this.f25940Y.getResources().getString(R.string.camera_quality_high).equals(d)) {
            return C0252go.f5846as;
        }
        if (this.f25940Y.getResources().getString(R.string.camera_quality_max).equals(d)) {
            return C0252go.f5845ar;
        }
        return C0252go.f5846as;
    }

    /* renamed from: b */
    public final String mo12925b() {
        int i;
        switch (this.f25939X - 1) {
            case 0:
                i = R.string.photosphere_accessibility_peek;
                break;
            case 1:
                i = R.string.horizontal_panorama_accessibility_peek;
                break;
            case 2:
                i = R.string.vertical_panorama_accessibility_peek;
                break;
            case 3:
                i = R.string.wide_angle_accessibility_peek;
                break;
            case 4:
                i = R.string.fisheye_accessibility_peek;
                break;
            default:
                i = R.string.media_accessibility_peek;
                break;
        }
        return this.f25988w.mo12480k().getResources().getString(i);
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        this.f25981p = cfh;
        this.f25982q = cfh.mo12477c();
        this.f25940Y = cfh.mo12480k();
        this.f25921E = ezy;
        this.f25988w.mo12460B().mo7291a("pref_lightcycle_quality_key", this.f25940Y.getResources().getString(R.string.camera_quality_high), this.f25940Y.getResources().getStringArray(R.array.pref_lightcycle_quality_entryvalues));
        try {
            iqm b;
            eio.f3848a = new ell(this.f23696a.f1069a, this.f25934S, this.f25954al, this.f25955am);
            this.f25979n = eio.f3848a;
            mo15495c(false);
            mo14830i();
            this.f25943aa = this.f25981p.mo12481l().f17176h;
            LayoutInflater.from(this.f25940Y).inflate(R.layout.pano_module, (ViewGroup) this.f25943aa.findViewById(R.id.module_layout), true);
            this.f25981p.mo12472a(this.f25960ar, false);
            switch (this.f25982q.mo2249a().getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4097b(0);
                    break;
                case 1:
                    b = iqm.m4097b(90);
                    break;
                case 2:
                    b = iqm.m4097b(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            this.f25918B = b.mo8806a();
            this.f25948af = (PhotoSphereMessageOverlay) this.f25943aa.findViewById(R.id.photosphere_calibration_overlay);
            this.f25948af.mo2667a(this.f25918B);
            this.f25944ab = this.f25943aa.findViewById(R.id.flash_overlay);
            this.f25986u = this.f25981p.mo12460B().mo7294a("default_scope", "photosphere_show_help_overlay", true);
            this.f25945ac = new elq();
            m17362v();
            switch (this.f25982q.mo2249a().getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4097b(0);
                    break;
                case 1:
                    b = iqm.m4097b(90);
                    break;
                case 2:
                    b = iqm.m4097b(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            this.f25918B = b.mo8806a();
            this.f25946ad = new dew(this);
            ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).mo13464b();
        } catch (Throwable e) {
            throw new IllegalStateException("Cannot instantiate PanoramaModule.", e);
        }
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo12929e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo12930f() {
        if (this.f25978m) {
            mo15500q();
            return true;
        }
        this.f25919C.mo13405H();
        return false;
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
        this.f25981p.mo12483n();
        this.f25975j = new eje(aah, this.f25920D);
        if (!f25915Q) {
            bli.m894c(f25916c, "Initializing Lightcycle");
            abw b = ejh.m1818b(aah.mo24e());
            float a = ejh.m1813a(aah);
            Point point = b.f178a;
            int i = point.x;
            int i2 = point.y;
            synchronized (LightCycle.f2562a) {
                LightCycleNative.Init(i, i2, a, LightCycle.f2565d);
                LightCycle.f2563b = Boolean.valueOf(false);
            }
            f25915Q = true;
        }
        bli.m888a(f25916c, "Camera available.");
        if (this.f25926J == null) {
            ebd l = this.f25981p.mo12481l();
            SurfaceTexture surfaceTexture = l.f17146I;
            if (surfaceTexture != null) {
                aah.mo29j();
                this.f25960ar.onSurfaceTextureAvailable(surfaceTexture, l.f17147J, l.f17148K);
                bli.m888a(f25916c, "Reusing an existing surface texture.");
                return;
            }
            bli.m888a(f25916c, "Awaiting renderer initialization.");
            return;
        }
        mo15504u();
        this.f25988w.mo12481l();
        ebd.m9761i();
    }

    /* renamed from: q */
    final void mo15500q() {
        this.f25920D.post(new dfb(this));
    }

    /* renamed from: r */
    final void mo15501r() {
        if (!this.f25976k) {
            return;
        }
        if (this.f25939X != C0252go.f5838ak) {
            mo15499p();
            return;
        }
        if (LightCycle.m1335f() < LightCycle.m1336g()) {
            this.f25920D.post(new dfe(this));
        } else {
            mo15499p();
        }
    }

    /* renamed from: a */
    public final void mo2186a(GL10 gl10) {
        eki eki = this.f25985t;
        if (eki != null) {
            eki.onDrawFrame(gl10);
        }
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 23:
                this.f25973h.onShutterButtonClick();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean mo12927b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                return this.f25978m;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void mo12926b(boolean z) {
        iqm b;
        String str = f25916c;
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("onLayoutOrientationChanged, isLandscape: ");
        stringBuilder.append(z);
        bli.m896d(str, stringBuilder.toString());
        switch (this.f25982q.mo2249a().getDefaultDisplay().getRotation()) {
            case 0:
                b = iqm.m4097b(0);
                break;
            case 1:
                b = iqm.m4097b(90);
                break;
            case 2:
                b = iqm.m4097b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.CLOCKWISE_0;
                break;
        }
        this.f25918B = b.mo8806a();
        this.f25948af.mo2667a(this.f25918B);
        mo15496m();
        m17362v();
    }

    /* renamed from: a */
    final void mo15494a(String str) {
        if (!this.f25950ah && !this.f25978m) {
            ejy ejy;
            eki eki;
            if (str.equals(this.f25940Y.getString(R.string.pano_orientation_horizontal))) {
                if (this.f25939X != C0252go.f5835ah) {
                    this.f25939X = C0252go.f5835ah;
                    ejy = this.f25987v;
                    if (ejy != null) {
                        ejy.mo6267a(this.f25939X);
                    }
                    eki = this.f25985t;
                    if (eki != null) {
                        eki.mo6280a(this.f25939X);
                    }
                }
            } else if (str.equals(this.f25940Y.getString(R.string.pano_orientation_vertical))) {
                if (this.f25939X != C0252go.f5836ai) {
                    this.f25939X = C0252go.f5836ai;
                    ejy = this.f25987v;
                    if (ejy != null) {
                        ejy.mo6267a(this.f25939X);
                    }
                    eki = this.f25985t;
                    if (eki != null) {
                        eki.mo6280a(this.f25939X);
                    }
                }
            } else if (str.equals(this.f25940Y.getString(R.string.pano_orientation_wide))) {
                if (this.f25939X != C0252go.f5837aj) {
                    this.f25939X = C0252go.f5837aj;
                    ejy = this.f25987v;
                    if (ejy != null) {
                        ejy.mo6267a(this.f25939X);
                    }
                    eki = this.f25985t;
                    if (eki != null) {
                        eki.mo6280a(this.f25939X);
                    }
                }
            } else if (str.equals(this.f25940Y.getString(R.string.pano_orientation_fisheye))) {
                if (this.f25939X != C0252go.f5838ak) {
                    this.f25939X = C0252go.f5838ak;
                    ejy = this.f25987v;
                    if (ejy != null) {
                        ejy.mo6267a(this.f25939X);
                    }
                    eki = this.f25985t;
                    if (eki != null) {
                        eki.mo6280a(this.f25939X);
                    }
                }
            } else if (str.equals(this.f25940Y.getString(R.string.pano_orientation_photosphere)) && this.f25939X != C0252go.f5834ag) {
                this.f25939X = C0252go.f5834ag;
                ejy = this.f25987v;
                if (ejy != null) {
                    ejy.mo6267a(this.f25939X);
                }
                eki = this.f25985t;
                if (eki != null) {
                    eki.mo6280a(this.f25939X);
                }
            }
            eln eln = this.f25980o;
            if (eln != null) {
                eln.f4170g = this.f25939X;
            }
        }
    }

    /* renamed from: a */
    public final void mo12919a(int i) {
        boolean z = true;
        this.f25932P = i;
        eki eki = this.f25985t;
        if (eki != null) {
            boolean z2;
            if (i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            eki.f4029u = z2;
            if (!(z2 || i == 1 || this.f25986u)) {
                z = false;
            }
            eki.f4030v = z;
        }
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
    }

    /* renamed from: x */
    private final void m17364x() {
        ejy ejy = this.f25987v;
        if (ejy != null) {
            ejy.mo6270d();
        }
        this.f25969d.mo6303d();
        knk d = kpw.m18486d();
        Handler handler = this.f25925I;
        if (handler != null) {
            handler.post(new dfk(this, d));
        }
        try {
            d.get();
            return;
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        bli.m891b(f25916c, "Fail to wait freeGLMemory to finish");
    }

    /* renamed from: d */
    private final void m17359d(boolean z) {
        this.f25984s = 0;
        if (z) {
            this.f25942aA.run();
        } else {
            this.f25968az.run();
        }
        this.f25920D.postDelayed(new dez(this), 1400);
        this.f25978m = false;
        ilp ilp = this.f25951ai;
        if (ilp != null) {
            mo15494a((String) ilp.mo13673b());
        }
    }

    /* renamed from: s */
    final synchronized void mo15502s() {
        if (!this.f25950ah) {
            m17365y();
            mo15504u();
        }
    }

    /* renamed from: j */
    public final void mo12934j() {
        this.f25935T.mo7446f(this.f25959aq);
    }

    /* renamed from: c */
    final void mo15495c(boolean z) {
        this.f25988w.mo12481l().mo13122c(z);
        this.f25976k = z;
    }

    /* renamed from: t */
    final void mo15503t() {
        m17365y();
        int a = this.f23697b.mo1873a();
        if (a != -1) {
            this.f23697b.mo1878c(a);
        }
        ejy ejy = this.f25987v;
        if (ejy != null) {
            ejy.f3916C.quitSafely();
            this.f25987v = null;
        }
        bwb bwb = this.f25926J;
        if (bwb != null) {
            bwb.f1676i.post(new bwd(bwb));
            this.f25926J = null;
        }
    }

    /* renamed from: k */
    public final void mo12935k() {
        this.f25950ah = false;
        this.f25952aj = new ikb();
        this.f25952aj.mo8557a(this.f25937V.mo7668a(this.f25973h));
        this.f25952aj.mo8557a(this.f25919C.f24184j.mo13672a(new dfp(this), kpq.f8776a));
        this.f25936U.addListener(this.f25938W);
        this.f25988w.mo12472a(this.f25960ar, false);
        mo14830i();
        mo15498o();
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" (");
        stringBuilder.append(str2);
        stringBuilder.append(")");
        str = String.valueOf(stringBuilder.toString());
        str2 = "Model is: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
        if (this.f25981p.mo12483n().mo1873a() != -1) {
            Process.setThreadPriority(-19);
            this.f25979n.mo6312a(gtu.m2875a().mo7426b());
            ((DisplayManager) this.f25988w.mo12480k().getSystemService("display")).registerDisplayListener(this.f25946ad, null);
            this.f25947ae = new ekr();
            this.f25966ax.mo13554a(this.f25967ay);
            return;
        }
        mo12936l();
        Builder builder = new Builder(this.f25981p.mo12475b(), 16974546);
        builder.setMessage(R.string.photosphere_no_back_camera).setCancelable(false).setPositiveButton(R.string.ok, new dfl(this));
        builder.create().show();
    }

    /* renamed from: u */
    final void mo15504u() {
        boolean z = true;
        if (this.f25975j == null) {
            bli.m898e(f25916c, "startCapture: camera device not open yet.");
            return;
        }
        if (this.f25977l) {
            m17365y();
        }
        this.f25984s = 0;
        this.f25989x.mo7618c();
        this.f25930N = 0;
        try {
            int i;
            this.f25980o = this.f25979n.mo6310a();
            eln eln = this.f25980o;
            String str = eln.f4168e;
            String str2 = eln.f4169f;
            String str3 = eln.f4166c;
            String str4 = eln.f4164a;
            String str5 = eln.f4167d;
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            int length3 = String.valueOf(str3).length();
            StringBuilder stringBuilder = new StringBuilder(((((length + 14) + length2) + length3) + String.valueOf(str4).length()) + String.valueOf(str5).length());
            stringBuilder.append("storage : ");
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            stringBuilder.append(" ");
            stringBuilder.append(str3);
            stringBuilder.append(" ");
            stringBuilder.append(str4);
            stringBuilder.append(" ");
            stringBuilder.append(str5);
            this.f25980o.f4170g = this.f25939X;
            this.f25974i = new ejx();
            this.f25985t = new eki(this.f25940Y, this.f25947ae, this.f25948af, this.f25988w.mo12493x());
            this.f25985t.mo6280a(this.f25939X);
            eld eld = this.f25969d;
            Context context = this.f25940Y;
            bkw bkw = this.f25941Z;
            if (!eld.f4146r) {
                eld.f4146r = true;
                bah bah = eld.f4131c;
                eld.f4143o = (float) bah.mo1875b(bah.mo1873a()).mo54a();
                str3 = String.valueOf(Build.MODEL);
                str4 = "Model is ";
                if (str3.length() == 0) {
                    str3 = new String(str4);
                } else {
                    str4.concat(str3);
                }
                if (Build.MODEL.startsWith("Nexus 7")) {
                    eld.f4143o = 90.0f;
                }
                if (bkw.mo1998a(bkw.f1283a, "camera:use_gyro_sensor_delay_fastest_for_panorama", false)) {
                    bli.m896d(eld.f4129a, "Using GServices Override SENSOR_DELAY_FASTEST for Gyro");
                    i = 0;
                } else {
                    i = 1;
                }
                eld.f4132d = (SensorManager) context.getSystemService("sensor");
                eld.f4147s = new ele(eld, "sensor thread", i);
                eld.f4147s.start();
                eld.f4135g = false;
                eld.mo6302c();
                eld.f4142n.mo6297b();
            }
            this.f25987v = new ejy(this.f25940Y, this.f25975j, this.f25969d, this.f25980o, this.f25974i, this.f25985t, this.f25981p.mo12490u(), this.f25982q);
            ejy ejy = this.f25987v;
            ejy.f3918E = this.f25962at;
            ejy.f3952w = this.f25926J;
            ejy.f3955z = this.f25963au;
            ejy.f3914A = this.f25964av;
            Window d = this.f25981p.mo12478d();
            LayoutParams attributes = d.getAttributes();
            attributes.systemUiVisibility = 1;
            d.setAttributes(attributes);
            if (this.f25957ao.mo13673b() != hhx.PHOTO_SPHERE) {
                length = C0252go.f5845ar;
            } else {
                length = m17363w();
            }
            abw a = this.f25975j.mo6233a(this.f25982q.mo2249a(), this.f25940Y, this.f25987v.f3925L, true, length);
            this.f25987v.mo6272f();
            ejy ejy2 = this.f25987v;
            Point point = a.f178a;
            i = point.x;
            int i2 = point.y;
            eki eki = ejy2.f3931b;
            eki.f3962D = i;
            eki.f3963E = i2;
            i2 = this.f25939X;
            if (ejy2.f3932c != null) {
                ejg a2;
                PackageInfo packageInfo;
                if (ejy2.mo6268b() <= 0.0f) {
                    i2 = C0252go.f5839al;
                }
                aaz e = ejy2.f3932c.f3862b.mo24e();
                if (i2 == C0252go.f5834ag || i2 == C0252go.f5839al || i2 == C0252go.f5838ak) {
                    a2 = ejf.m1811a(e, length);
                } else {
                    a2 = ejf.m1810a(e);
                }
                i = a2.f3873b.f178a.x;
                ejy2.f3931b.mo6280a(i2);
                ejy2.mo6267a(i2);
                try {
                    packageInfo = ejy2.f3946q.getPackageManager().getPackageInfo(ejy2.f3946q.getPackageName(), 0);
                } catch (NameNotFoundException e2) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    str5 = packageInfo.versionName;
                    str = String.valueOf(str5);
                    str3 = "Setting version to ";
                    if (str.length() == 0) {
                        str = new String(str3);
                    } else {
                        str3.concat(str);
                    }
                    LightCycle.m1326b(str5);
                }
                ejy2.mo6269c();
            } else {
                z = false;
            }
            if (z) {
                this.f25975j.f3862b.mo13a(this.f25920D, new dey(this));
                return;
            }
            bli.m898e(f25916c, "Can't setup LightCycleController for startPreview.");
        } catch (Throwable e3) {
            bli.m892b(f25916c, "Cannot start capture, local session storage not ready.", e3);
        }
    }

    /* renamed from: l */
    public final void mo12936l() {
        if (this.f25950ah) {
            bli.m898e(f25916c, "Cannot pause already paused PanoramaModule");
            return;
        }
        this.f25952aj.close();
        this.f25936U.removeListener(this.f25938W);
        this.f25950ah = true;
        m17359d(true);
        ((DisplayManager) this.f25988w.mo12480k().getSystemService("display")).unregisterDisplayListener(this.f25946ad);
        mo15503t();
        HandlerThread handlerThread = this.f25958ap;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f25958ap = null;
            this.f25925I = null;
        }
        this.f25969d.mo6303d();
        ejx ejx = this.f25974i;
        if (!(ejx == null || ejx.isInterrupted())) {
            this.f25974i.interrupt();
        }
        this.f25920D.post(new dfr(this));
        this.f25975j = null;
        this.f25966ax.mo13555b(this.f25967ay);
    }

    /* renamed from: y */
    private final void m17365y() {
        this.f25983r = false;
        gev gev = this.f25933R;
        synchronized (gev.f5356b) {
            iqz iqz = gev.f5355a;
            int size = gev.f5357c.size();
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("Resume processing. Queue size: ");
            stringBuilder.append(size);
            iqz.mo8832b(stringBuilder.toString());
            if (gev.f5360f) {
                gev.f5360f = false;
                if (!gev.f5357c.isEmpty()) {
                    gev.mo7084a();
                }
            }
        }
        ejy ejy = this.f25987v;
        if (ejy != null) {
            ejy.mo6270d();
        }
        this.f25984s = 0;
        this.f25977l = false;
        m17359d(false);
        this.f25981p.mo12495z().mo7618c();
        if (this.f25988w.mo12481l() != null) {
            mo15496m();
        }
    }
}

package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.GestureDetector.OnGestureListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.refocus.RefocusProgressView;
import com.google.android.apps.refocus.capture.TrackerStats;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.apps.refocus.processing.ProcessingNative;
import com.google.android.apps.refocus.processing.SelectedFrame;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: dwd */
public final class dwd extends cvs implements cvx, dxm, gek, gww, haq {
    /* renamed from: d */
    public static final String f26171d = bli.m887a("RefocusModule");
    /* renamed from: A */
    public boolean f26172A = false;
    /* renamed from: B */
    public ExecutorService f26173B;
    /* renamed from: C */
    public final AtomicInteger f26174C = new AtomicInteger(0);
    /* renamed from: D */
    public final ilb f26175D = new ilb(Integer.valueOf(0));
    /* renamed from: E */
    public final Runnable f26176E = new dwe(this);
    /* renamed from: F */
    public final Runnable f26177F = new dwr(this);
    /* renamed from: G */
    public final how f26178G;
    /* renamed from: H */
    private final bkw f26179H;
    /* renamed from: I */
    private final hjf f26180I;
    /* renamed from: J */
    private final gtf f26181J;
    /* renamed from: K */
    private final cbu f26182K;
    /* renamed from: L */
    private final Context f26183L;
    /* renamed from: M */
    private final gtl f26184M;
    /* renamed from: N */
    private final BottomBarController f26185N;
    /* renamed from: O */
    private final hcd f26186O;
    /* renamed from: P */
    private final BottomBarListener f26187P;
    /* renamed from: Q */
    private final ecd f26188Q;
    /* renamed from: R */
    private cbr f26189R;
    /* renamed from: S */
    private ezy f26190S;
    /* renamed from: T */
    private ViewGroup f26191T;
    /* renamed from: U */
    private hrm f26192U;
    /* renamed from: V */
    private float f26193V = 0.0f;
    /* renamed from: W */
    private cwd f26194W;
    /* renamed from: X */
    private final dwz f26195X = new dwz(this);
    /* renamed from: Y */
    private final dxa f26196Y = new dxa(this);
    /* renamed from: Z */
    private hjw f26197Z;
    /* renamed from: aa */
    private Location f26198aa = null;
    /* renamed from: ab */
    private aaz f26199ab;
    /* renamed from: ac */
    private abi f26200ac;
    /* renamed from: ad */
    private ikb f26201ad;
    /* renamed from: ae */
    private final int f26202ae;
    /* renamed from: af */
    private final gho f26203af;
    /* renamed from: ag */
    private final irs f26204ag;
    /* renamed from: ah */
    private final aat f26205ah = new dws(this);
    /* renamed from: ai */
    private final TextWatcher f26206ai = new dwt(this);
    /* renamed from: aj */
    private final eak f26207aj = new dwv("refocus_upgrade_version");
    /* renamed from: ak */
    private final OnClickListener f26208ak = new dww(this);
    /* renamed from: al */
    private final hny f26209al;
    /* renamed from: am */
    private final hnz f26210am = new dwx(this);
    /* renamed from: an */
    private final atb f26211an;
    /* renamed from: ao */
    private final gnu f26212ao;
    /* renamed from: ap */
    private final gnf f26213ap;
    /* renamed from: aq */
    private final OnGestureListener f26214aq = new dwj(this);
    /* renamed from: c */
    public final gey f26215c;
    /* renamed from: e */
    public final gpn f26216e;
    /* renamed from: f */
    public final gev f26217f;
    /* renamed from: g */
    public final ehm f26218g;
    /* renamed from: h */
    public final hch f26219h;
    /* renamed from: i */
    public final dzh f26220i;
    /* renamed from: j */
    public cfh f26221j;
    /* renamed from: k */
    public cfh f26222k;
    /* renamed from: l */
    public Handler f26223l;
    /* renamed from: m */
    public dxj f26224m = null;
    /* renamed from: n */
    public RefocusProgressView f26225n;
    /* renamed from: o */
    public ImageView f26226o;
    /* renamed from: p */
    public TextView f26227p = null;
    /* renamed from: q */
    public hrj f26228q = null;
    /* renamed from: r */
    public gwv f26229r;
    /* renamed from: s */
    public hrg f26230s = null;
    /* renamed from: t */
    public final hrl f26231t = new hrl();
    /* renamed from: u */
    public dxo f26232u;
    /* renamed from: v */
    public ColorImage f26233v;
    /* renamed from: w */
    public int f26234w;
    /* renamed from: x */
    public int f26235x;
    /* renamed from: y */
    public final hru f26236y = new hru();
    /* renamed from: z */
    public dxn f26237z;

    public dwd(Context context, bag bag, bah bah, gos gos, gpn gpn, bkw bkw, hjf hjf, cbu cbu, gey gey, gci gci, gev gev, gtf gtf, hny hny, ehm ehm, gtl gtl, BottomBarController bottomBarController, hcd hcd, ecd ecd, gho gho, irs irs, dzh dzh, atb atb, how how, gnu gnu, gnf gnf) {
        super(bag, bah);
        this.f26183L = context;
        this.f26216e = (gpn) jri.m13404b((Object) gpn);
        this.f26179H = (bkw) jri.m13404b((Object) bkw);
        this.f26180I = (hjf) jri.m13404b((Object) hjf);
        this.f26215c = (gey) jri.m13404b((Object) gey);
        this.f26181J = (gtf) jri.m13404b((Object) gtf);
        this.f26217f = (gev) jri.m13404b((Object) gev);
        this.f26182K = (cbu) jri.m13404b((Object) cbu);
        this.f26209al = (hny) jri.m13404b((Object) hny);
        this.f26218g = ehm;
        this.f26184M = gtl;
        this.f26185N = bottomBarController;
        this.f26186O = hcd;
        this.f26188Q = ecd;
        this.f26203af = gho;
        this.f26204ag = irs;
        this.f26220i = dzh;
        this.f26211an = atb;
        this.f26178G = how;
        this.f26212ao = gnu;
        this.f26213ap = gnf;
        this.f26194W = new cwd(gci);
        this.f26207aj.mo6164a(gos, null);
        this.f26187P = new dwy(this);
        this.f26219h = new dwf(this);
        this.f26202ae = ije.m3829a(bkw.f1283a, "camera:max_lens_blur_count", 3);
    }

    /* renamed from: x */
    private final void m17455x() {
        hrm hrm = this.f26192U;
        if (hrm != null) {
            hrm.mo7758c();
            this.f26192U = null;
        }
        if (this.f26172A) {
            this.f26192U = new hrm(new dwo(this), this.f26222k.mo12480k());
            if (!this.f26222k.mo12481l().mo13116a(this.f26192U, LayoutInflater.from(this.f26183L))) {
                this.f26172A = false;
            }
        }
    }

    /* renamed from: a */
    static void m17453a(boolean z, View view) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        } else {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(axl.f1036a);
        ofFloat.addUpdateListener(new dwp(view));
        ofFloat.addListener(new dwq(z, view));
        ofFloat.start();
    }

    /* renamed from: m */
    public final void mo7484m() {
        dxj dxj = this.f26224m;
        if (dxj != null && dxj.f16934b != null) {
            if (this.f26234w == C0252go.f5833af) {
                this.f26224m.f16934b.mo14a(this.f26223l, this.f26195X);
            } else {
                this.f26229r.mo13479a(false);
            }
        }
    }

    /* renamed from: n */
    public final void mo7485n() {
        dxj dxj = this.f26224m;
        if (dxj != null) {
            aah aah = dxj.f16934b;
            if (aah != null) {
                aah.mo20b().sendMessageAtFrontOfQueue(aah.mo20b().obtainMessage(302));
                aah.mo20b().sendEmptyMessage(305);
                abo abo = this.f26224m.f16938f;
                gwv gwv = this.f26229r;
                gwv.f19762m = null;
                abo.f151q = gwv.mo13474a(abo.f151q);
                this.f26224m.mo13085a(abo);
            }
        }
    }

    /* renamed from: o */
    public final boolean mo7486o() {
        if (this.f26234w != C0252go.f5833af) {
            return false;
        }
        aas dwk = new dwk(this);
        aaf dwl = new dwl(this);
        this.f26234w = C0252go.f5831ad;
        this.f26233v = null;
        this.f26224m.mo13087a(false);
        dxj dxj = this.f26224m;
        synchronized (dxj.f16941i) {
            if (dxj.f16936d) {
                new dxl(dxj, dwk, dwl).start();
            }
        }
        return true;
    }

    public final void close() {
    }

    /* renamed from: y */
    private final DepthmapTask m17456y() {
        try {
            hri a = hri.m3358a(this.f23696a.f1069a.mo7197a("refocus"), this.f26181J);
            era era = this.f26221j.mo12459A().f1070b;
            List a2 = this.f26228q.mo8057a();
            ColorImage colorImage = this.f26233v;
            dxj dxj = this.f26224m;
            return new DepthmapTask(era, a, a2, colorImage, axm.m758a(dxj.f16935c.mo54a(), dxj.f16939g.mo12493x().mo7034a().f7692e, dxj.f16935c.mo57c()), this.f26224m.mo13088b(), this.f26224m.f16935c.mo57c(), m17447A(), this.f26198aa, this.f23696a.f1069a, new eqy(this.f26179H, this.f26180I, this.f26182K), this.f26179H, this.f26204ag, this.f26212ao, this.f26213ap);
        } catch (IOException e) {
            bli.m891b(f26171d, e.getMessage());
            return null;
        }
    }

    /* renamed from: z */
    private final void m17457z() {
        this.f26228q = null;
        this.f26233v = null;
        this.f26237z = null;
    }

    /* renamed from: A */
    private final String m17447A() {
        try {
            PackageInfo packageInfo = this.f26221j.mo12480k().getPackageManager().getPackageInfo(this.f26221j.mo12480k().getPackageName(), 128);
            String str = packageInfo.packageName;
            String str2 = packageInfo.versionName;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final OnGestureListener mo7610a() {
        return this.f26214aq;
    }

    /* renamed from: f_ */
    public final fha mo12931f_() {
        aaz aaz = this.f26199ab;
        if (aaz == null) {
            return null;
        }
        fhc m = this.f26222k.mo12482m();
        this.f26222k.mo12483n().mo1875b(this.f26235x).mo57c();
        return new fhb(aaz, m);
    }

    /* renamed from: b */
    public final String mo12925b() {
        return "";
    }

    /* renamed from: k_ */
    public final OnTouchListener mo7612k_() {
        return null;
    }

    /* renamed from: a */
    public final void mo12922a(gos gos) {
    }

    /* renamed from: B */
    private final void m17448B() {
        this.f26216e.mo7328a(R.raw.staged_shot_complete);
        this.f26185N.announceAccessibilityForThumbnail(this.f26183L.getResources().getString(R.string.refocus_accessibility_peek));
    }

    /* renamed from: a */
    public final void mo12921a(cfh cfh, ezy ezy) {
        this.f26234w = C0252go.f5830ac;
        this.f26221j = cfh;
        this.f26189R = cfh.mo12477c();
        this.f26222k = cfh;
        this.f26190S = ezy;
        this.f26223l = new Handler(Looper.getMainLooper());
        m17449C();
        this.f26191T = this.f26222k.mo12481l().f17176h;
        this.f26221j.mo12489t().inflate(R.layout.refocus_module, (ViewGroup) this.f26191T.findViewById(R.id.module_layout), true);
        this.f26225n = (RefocusProgressView) this.f26191T.findViewById(R.id.refocus_progress);
        this.f26226o = (ImageView) this.f26191T.findViewById(R.id.refocus_success_indicator);
        this.f26225n.setVisibility(8);
        this.f26226o.setVisibility(8);
        this.f26227p = (TextView) this.f26191T.findViewById(R.id.refocus_instructions);
        this.f26227p.setTypeface(Typeface.create("sans-serif-light", 0));
        this.f26227p.setVisibility(4);
        this.f26197Z = this.f26221j.mo12490u();
        this.f26172A = this.f26221j.mo12460B().mo7294a("default_scope", "refocus_show_tutorial", true);
        mo15516r();
        ((grt) Instrumentation.instance().modeSwitch().getCurrentSession()).mo13464b();
        this.f26215c.mo7092a((gek) this);
        this.f26203af.mo7134c();
        mo15522w();
        this.f26175D.mo13672a(new dwg(this), kpq.f8776a);
    }

    /* renamed from: c */
    public final boolean mo12928c() {
        return false;
    }

    /* renamed from: p */
    final boolean mo15515p() {
        String str = f26171d;
        int i = this.f26202ae;
        int b = this.f26215c.mo7095b();
        int i2 = this.f26174C.get();
        StringBuilder stringBuilder = new StringBuilder(83);
        stringBuilder.append("max queue size=");
        stringBuilder.append(i);
        stringBuilder.append(", tasks in queue=");
        stringBuilder.append(b);
        stringBuilder.append(", tasks to submit=");
        stringBuilder.append(i2);
        bli.m888a(str, stringBuilder.toString());
        return this.f26202ae > this.f26215c.mo7095b() + this.f26174C.get();
    }

    /* renamed from: e */
    public final boolean mo12929e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo12930f() {
        return false;
    }

    /* renamed from: a */
    public final void mo12920a(aah aah) {
        int i = 5;
        this.f26235x = aah.mo22c();
        bkw bkw = this.f26179H;
        hjf hjf = bkw.f1284b;
        ivy ivy = hjf.f6633b;
        if (!(ivy.f7874d || ivy.f7875e || hjf.mo7905c() || bkw.f1284b.mo7906d())) {
            i = 3;
        }
        i = ije.m3829a(bkw.f1283a, "lens_blur_megapixels", i);
        String str = f26171d;
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Selected Lens Blur megapixels: ");
        stringBuilder.append(i);
        bli.m894c(str, stringBuilder.toString());
        this.f26189R.mo2249a();
        this.f26224m = new dxj(this.f26221j, this.f26223l, aah, i);
        aah aah2 = this.f26224m.f16934b;
        if (aah2 == null) {
            Toast.makeText(this.f26221j.mo12475b(), R.string.error_cannot_connect_camera, 0).show();
            return;
        }
        this.f26199ab = aah2.mo24e();
        abo abo = this.f26224m.f16938f;
        abo.mo68a(1.0f);
        this.f26224m.mo13085a(abo);
        this.f26224m.f16937e = this;
        gwv gwv = this.f26229r;
        if (gwv == null) {
            boolean c = this.f26221j.mo12483n().mo1875b(this.f26235x).mo57c();
            String[] stringArray = this.f26221j.mo12494y().getStringArray(R.array.pref_camera_focusmode_default_array);
            List arrayList = new ArrayList();
            abe abe = this.f26199ab.f69w;
            for (String b : stringArray) {
                abc b2 = abe.m47b(b);
                if (b2 != null && this.f26199ab.mo48a(b2)) {
                    arrayList.add(b2);
                }
            }
            this.f26229r = new gwv(this.f26221j.mo12460B(), this.f26221j.mo12484o(), arrayList, this.f26199ab, this, c, this.f26221j.mo12491v(), this.f26211an, this.f26204ag);
        } else {
            gwv.f19763n.removeMessages(0);
        }
        this.f26222k.mo12471a(this.f26229r);
        this.f26229r.mo13478a(this.f26199ab);
        if (abo.f151q == abc.CONTINUOUS_PICTURE) {
            aah.mo15a(this.f26223l, this.f26196Y);
        }
        abw c2 = this.f26224m.f16938f.mo74c();
        Point point = c2.f178a;
        float f = ((float) point.x) / ((float) point.y);
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        this.f26222k.mo12481l().mo13112a();
        if (this.f26193V != f) {
            this.f26193V = f;
            this.f26222k.mo12466a(f);
        }
        ezy ezy = this.f26190S;
        Point point2 = c2.f178a;
        ezy.mo6694a(point2.x, point2.y, false);
        m17450D();
        this.f26230s = new hrg(this.f26191T.findViewById(R.id.shutter_view));
        SurfaceTexture surfaceTexture = this.f26222k.mo12481l().f17146I;
        if (surfaceTexture != null) {
            this.f26224m.mo13086a(surfaceTexture, this.f26205ah);
        }
    }

    /* renamed from: a */
    public final void mo6104a(ColorImage colorImage, long j) {
        this.f26236y.mo8075a(SystemClock.elapsedRealtimeNanos());
        if (this.f26234w == C0252go.f5832ae) {
            boolean z;
            Object obj;
            dxo dxo = this.f26232u;
            ProcessingNative.TrackFrame(colorImage);
            dxo.f3569d = ProcessingNative.RefineRotationAndGetParallax(dxo.f3566a) / dxo.f3570e;
            ProcessingNative.GetTrackerStats(dxo.f3572g);
            hrl hrl = this.f26231t;
            float f = this.f26232u.f3569d;
            hrl.f6869c.mo8075a(j);
            hrl.f6867a.mo8059b(f / 0.006f);
            if (hrl.f6869c.f6889b >= 2) {
                hrk hrk = hrl.f6867a;
                f = Math.max(0.0f, hrk.f6864a - hrk.f6865b);
                hru hru = hrl.f6869c;
                float f2 = hru.f6888a.f6864a * f;
                if (hru.f6889b == 2) {
                    hrl.f6868b.mo8058a(f2);
                } else {
                    hrl.f6868b.mo8059b(f2);
                }
                if (!hrl.f6874h) {
                    if (hrl.f6868b.f6864a < 0.6666667f) {
                        hrl.f6875i.mo8076b();
                    } else {
                        hrl.f6875i.mo8075a(j);
                        if (((float) hrl.f6875i.f6889b) >= 3.0f) {
                            hrl.f6874h = true;
                        }
                    }
                }
                if (hrl.f6874h) {
                    hrk hrk2 = hrl.f6867a;
                    if (hrk2.f6864a >= 0.2f) {
                        f2 = hrl.f6872f;
                        if (f2 <= 2.0f && f2 / hrl.f6868b.f6864a <= 1.5f) {
                            hrl.f6872f = (float) (Math.min(((((double) f) * 0.5d) / ((double) hrk2.f6865b)) + 1.0d, 1.0499999523162842d) * ((double) f2));
                            hrl.f6872f = Math.min(hrl.f6872f, 2.0f);
                        }
                    }
                }
            }
            hrl.f6873g = 1.0f / (hrl.f6867a.f6864a / hrl.f6869c.mo8074a());
            f = hrl.f6867a.f6864a;
            if (f < 1.0f) {
                hrl.f6870d = (float) Math.pow((double) f, 1.399999976158142d);
            } else {
                hrl.f6870d = f;
            }
            hrl.f6871e = Math.max(hrl.f6871e, hrl.mo8060a());
            this.f26225n.mo2763a(this.f26231t.mo8060a());
            dxn dxn = this.f26237z;
            TrackerStats trackerStats = dxn.f3547a.f3572g;
            if (trackerStats.numInitialTracks < 15 || trackerStats.inactiveTracksRatio > 0.8f) {
                dxn.f3555i = true;
            }
            if (trackerStats.averageMotionRatio > 0.2f) {
                dxn.f3556j = true;
            }
            if (trackerStats.inactiveTracksRatio > 0.6f && trackerStats.inactiveTracksBoundaryRatio <= 0.6f) {
                dxn.f3557k = true;
            }
            if (dxn.f3548b.mo8074a() > 8.0f && dxn.f3550d.f6873g > 20.0f) {
                dxn.f3554h = true;
            }
            if (trackerStats.averageMotionRatio > 0.1f) {
                z = true;
            } else if (trackerStats.inactiveTracksRatio <= 0.6f) {
                z = false;
            } else if (trackerStats.inactiveTracksBoundaryRatio <= 0.6f) {
                z = false;
            } else {
                z = true;
            }
            dxn.f3561o = z;
            if (trackerStats.frameAverageMotionRatio > 0.01f) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3558l = z;
            boolean z2 = dxn.f3558l;
            if (z2) {
                z = true;
            } else if (trackerStats.frameInactiveTracksRatio <= 0.2f) {
                z = false;
            } else {
                z = true;
            }
            dxn.f3560n = z;
            int i = dxn.f3551e;
            if (i != 0) {
                z = false;
            } else if (dxn.f3548b.f6888a.f6864a < 15.0f) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3559m = z;
            if (dxn.f3562p) {
                z = true;
            } else if (dxn.f3561o) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3562p = z;
            if (dxn.f3563q) {
                z = true;
            } else if (z2) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3563q = z;
            if (dxn.f3564r) {
                z = true;
            } else if (dxn.f3559m) {
                z = true;
            } else {
                z = false;
            }
            dxn.f3564r = z;
            if (dxn.f3560n) {
                dxn.f3552f++;
            }
            dxn.f3551e = i + 1;
            dxn = this.f26237z;
            if (dxn.f3559m) {
                obj = 1;
            } else if (dxn.f3558l) {
                obj = 1;
            } else if (dxn.f3561o) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f26225n.f2645a = true;
                if (dxn.f3561o) {
                    this.f26227p.setText(R.string.warning_viewport);
                }
                if (this.f26237z.f3558l) {
                    this.f26227p.setText(R.string.warning_fast_motion);
                    this.f26225n.f2645a = true;
                }
                if (this.f26237z.f3559m) {
                    this.f26227p.setText(R.string.warning_low_light_motion);
                    this.f26225n.f2645a = true;
                }
                this.f26223l.removeCallbacks(this.f26177F);
                this.f26223l.postDelayed(this.f26177F, 1500);
            }
            if (this.f26237z.mo6105a()) {
                mo15510a(true, true);
                return;
            }
            if ((this.f26237z.f3560n ^ 1) != 0) {
                hrj hrj = this.f26228q;
                float f3 = this.f26231t.f6870d;
                float ImageGradientMeasure = ProcessingNative.ImageGradientMeasure(colorImage);
                if (hrj.f6862b.size() < hrj.f6861a) {
                    hrj.f6862b.add(new SelectedFrame(f3, ImageGradientMeasure, colorImage));
                } else {
                    int i2;
                    SelectedFrame selectedFrame;
                    hrj.f6863c.update(f3, ImageGradientMeasure);
                    hrj.f6862b.add(hrj.f6863c);
                    Collections.sort(hrj.f6862b);
                    f = Float.MAX_VALUE;
                    int i3 = LfuScheduler.MAX_PRIORITY;
                    int i4 = 0;
                    while (true) {
                        i2 = i3;
                        float f4 = f;
                        if (i4 >= hrj.f6862b.size() - 1) {
                            break;
                        }
                        SelectedFrame selectedFrame2 = (SelectedFrame) hrj.f6862b.get(i4);
                        i = i4 + 1;
                        selectedFrame = (SelectedFrame) hrj.f6862b.get(i);
                        float f5 = selectedFrame.progress - selectedFrame2.progress;
                        if (f5 < f4) {
                            if (selectedFrame2.gradient >= selectedFrame.gradient) {
                                i3 = i;
                            } else {
                                i3 = i4;
                            }
                            f = f5;
                        } else {
                            i3 = i2;
                            f = f4;
                        }
                        i4++;
                    }
                    selectedFrame = (SelectedFrame) hrj.f6862b.get(i2);
                    if (selectedFrame != hrj.f6863c) {
                        selectedFrame.update(f3, ImageGradientMeasure, colorImage);
                    }
                    hrj.f6862b.remove(hrj.f6863c);
                }
            }
            if (this.f26231t.mo8060a() > 0.99f) {
                mo15510a(true, true);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12923a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 23:
                if (this.f26234w == C0252go.f5833af) {
                    this.f26219h.onShutterButtonClick();
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean mo12927b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                if (this.f26234w != C0252go.f5833af) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final void mo12926b(boolean z) {
        dxj dxj = this.f26224m;
        if (dxj != null) {
            dxj.mo13083a();
        }
        mo15516r();
        m17455x();
    }

    /* renamed from: l_ */
    public final void mo7613l_() {
        dxj dxj = this.f26224m;
        if (dxj != null) {
            dxj.mo13083a();
        }
    }

    /* renamed from: d */
    public final void mo7611d() {
        m17450D();
    }

    /* renamed from: q */
    public final void mo7068q() {
        if (this.f26234w == C0252go.f5833af) {
            this.f26223l.post(new dwu(this));
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        dxj dxj = this.f26224m;
        if (dxj != null) {
            dxj.mo13086a(surfaceTexture, this.f26205ah);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        dxj dxj = this.f26224m;
        if (dxj != null) {
            dxj.mo13090d();
        }
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: m_ */
    public final void mo12937m_() {
    }

    /* renamed from: C */
    private final void m17449C() {
        int i;
        iut b = this.f26220i.mo6125b();
        dzh dzh = this.f26220i;
        if (b != iut.BACK) {
            i = dzh.f3587b;
        } else {
            i = dzh.f3586a;
        }
        this.f26235x = i;
        this.f26188Q.mo14869a(b);
        this.f26222k.mo12460B().mo7289a(this.f26221j.mo12492w(), "pref_camera_id_key", this.f26235x);
        this.f26222k.mo12483n().mo1879d(this.f26235x);
    }

    /* renamed from: j */
    public final void mo12934j() {
        this.f26184M.mo7446f(this.f26208ak);
    }

    /* renamed from: r */
    final void mo15516r() {
        iqm b;
        switch (this.f26189R.mo2249a().getDefaultDisplay().getRotation()) {
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
        int a = this.f26221j.mo12483n().mo1875b(this.f26235x).mo55a(b.mo8806a(), true);
        gwv gwv = this.f26229r;
        if (gwv != null) {
            gwv.f19759j = a;
            gwv.mo13481c();
        }
    }

    /* renamed from: s */
    public final void mo7487s() {
        if (this.f26224m != null) {
            mo15521v();
        }
    }

    /* renamed from: k */
    public final void mo12935k() {
        this.f26234w = C0252go.f5830ac;
        this.f26201ad = new ikb();
        this.f26201ad.mo8557a(this.f26186O.mo7668a(this.f26219h));
        this.f26185N.addListener(this.f26187P);
        this.f26222k.mo12472a((haq) this, false);
        m17449C();
        this.f26173B = Executors.newSingleThreadExecutor();
        m17455x();
        this.f26227p.addTextChangedListener(this.f26206ai);
        this.f26209al.mo13554a(this.f26210am);
        if (this.f26200ac == null) {
            this.f26200ac = new abi(new dwi(this), this.f26223l);
            this.f23697b.mo1874a(this.f26200ac);
        }
    }

    /* renamed from: t */
    public final void mo7488t() {
    }

    /* renamed from: l */
    public final void mo12936l() {
        this.f26201ad.close();
        mo15510a(false, false);
        this.f26185N.removeListener(this.f26187P);
        this.f26203af.mo7133b();
        this.f26173B.shutdownNow();
        if (this.f26224m != null) {
            mo7485n();
            this.f26224m.mo13090d();
            this.f26224m.mo13089c();
            this.f26224m = null;
            this.f26222k.mo12483n().mo1878c(this.f26235x);
            this.f26229r.f19754e = 0;
        }
        this.f26234w = C0252go.f5830ac;
        hrm hrm = this.f26192U;
        if (hrm != null) {
            hrm.mo7758c();
            this.f26192U = null;
        }
        this.f26227p.removeTextChangedListener(this.f26206ai);
        this.f26193V = 0.0f;
        this.f26209al.mo13555b(this.f26210am);
        this.f23697b.mo1876b(this.f26200ac);
        this.f26200ac = null;
    }

    /* renamed from: a */
    final void mo15510a(boolean z, boolean z2) {
        long j = 3000;
        if (this.f26234w == C0252go.f5832ae) {
            this.f26218g.mo13402E();
            this.f26234w = C0252go.f5833af;
            this.f26224m.mo13087a(true);
            dxn dxn = this.f26237z;
            if (!dxn.mo6105a() && (((float) dxn.f3552f) / ((float) dxn.f3551e) > 0.1f || dxn.f3549c.mo8057a().size() < 7)) {
                dxn.f3553g = true;
            }
            ProcessingNative.StopTracker();
            mo7485n();
            this.f26225n.setVisibility(8);
            if (this.f26237z.mo6105a()) {
                int i;
                if (z2) {
                    this.f26216e.mo7328a(R.raw.staged_shot_cancelled);
                    this.f26185N.announceAccessibilityForThumbnail(this.f26183L.getResources().getString(R.string.photo_accessibility_shot_canceled));
                }
                dxn = this.f26237z;
                if (dxn.f3565s) {
                    i = -1;
                    j = 500;
                } else {
                    i = !dxn.f3553g ? !dxn.f3554h ? !dxn.f3555i ? !dxn.f3557k ? dxn.f3556j ? R.string.error_viewport : R.string.capture_error : R.string.error_scene : R.string.error_tracking_failed : R.string.error_slow_motion : R.string.error_fast_motion;
                }
                this.f26223l.removeCallbacks(this.f26177F);
                if (i >= 0) {
                    this.f26227p.setText(i);
                }
                this.f26226o.setImageResource(R.drawable.refocus_unsuccessful);
                dwd.m17453a(true, this.f26227p);
                dwd.m17453a(true, this.f26226o);
                this.f26223l.postDelayed(this.f26176E, j);
            } else {
                dxn = this.f26237z;
                boolean z3 = !dxn.f3564r ? !dxn.f3563q ? dxn.f3562p : true : true;
                if (z3) {
                    if (z2) {
                        m17448B();
                    }
                    dxn = this.f26237z;
                    if (dxn.f3563q) {
                        this.f26227p.setText(R.string.had_warning_fast_motion);
                    } else if (dxn.f3562p) {
                        this.f26227p.setText(R.string.had_warning_viewport);
                    } else if (dxn.f3564r) {
                        this.f26227p.setText(R.string.had_warning_low_light);
                    }
                    this.f26223l.removeCallbacks(this.f26177F);
                    this.f26226o.setImageResource(R.drawable.ic_warning_graphic);
                    dwd.m17453a(true, this.f26227p);
                    dwd.m17453a(true, this.f26226o);
                    this.f26223l.postDelayed(this.f26176E, 3000);
                } else {
                    if (z2) {
                        m17448B();
                    }
                    this.f26223l.removeCallbacks(this.f26177F);
                    this.f26226o.setImageResource(R.drawable.refocus_successful);
                    dwd.m17453a(false, this.f26227p);
                    dwd.m17453a(true, this.f26226o);
                    this.f26223l.postDelayed(this.f26176E, 1000);
                }
            }
            this.f26198aa = this.f26197Z.mo7915d();
            irs irs = this.f26204ag;
            dxn dxn2 = this.f26237z;
            boolean z4 = dxn2.f3553g;
            irs.mo8905a(z4, dxn2.f3554h, dxn2.f3555i, dxn2.f3556j, dxn2.f3557k, dxn2.f3565s, dxn2.f3562p, z4, dxn2.f3564r);
            this.f26175D.mo8826a(Integer.valueOf(this.f26174C.incrementAndGet()));
            this.f26222k.mo12481l().f17186r.mo2738a();
            if (z) {
                new Thread(new dwn(this, m17456y(), this.f26237z.mo6105a())).start();
                m17457z();
                return;
            }
            m17457z();
            this.f26175D.mo8826a(Integer.valueOf(this.f26174C.decrementAndGet()));
        }
    }

    /* renamed from: u */
    public final void mo7489u() {
    }

    /* renamed from: n_ */
    public final boolean mo7614n_() {
        return false;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    /* renamed from: v */
    final void mo15521v() {
        dxj dxj = this.f26224m;
        abo abo = dxj.f16938f;
        aaz e = dxj.f16934b.mo24e();
        if (e.mo46a(aba.FOCUS_AREA)) {
            Collection collection = this.f26229r.f19760k;
            abo.f139e.clear();
            if (collection != null) {
                abo.f139e.addAll(collection);
            }
        }
        if (e.mo46a(aba.METERING_AREA)) {
            Collection collection2 = this.f26229r.f19761l;
            abo.f138d.clear();
            if (collection2 != null) {
                abo.f138d.addAll(collection2);
            }
        }
        gwv gwv = this.f26229r;
        gwv.f19762m = null;
        abo.f151q = gwv.mo13474a(abo.f151q);
        this.f26224m.mo13085a(abo);
    }

    /* renamed from: D */
    private final void m17450D() {
        if (this.f26224m != null) {
            this.f26222k.mo12481l().f17141D.mo7601a(this.f26194W.mo5875a(new iqp(this.f26191T.getWidth(), this.f26191T.getHeight()), new iqp(this.f26224m.f16938f.mo74c().f178a.x, this.f26224m.f16938f.mo74c().f178a.y)));
        }
    }

    /* renamed from: w */
    final void mo15522w() {
        if (mo15515p()) {
            this.f26203af.mo7135d();
            this.f26186O.mo7673c(true);
            return;
        }
        this.f26203af.mo7136e();
        this.f26186O.mo7673c(false);
    }
}

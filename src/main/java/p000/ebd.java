package p000;

import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p005ui.modeswitch.ViewfinderCover;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p005ui.toyboxmenu.ToyboxMenuButton;
import com.google.android.apps.camera.p005ui.tutorialoverlay.TutorialOverlayWrapper;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;
import com.google.android.apps.camera.p005ui.wirers.PreviewOverlay;
import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: ebd */
public final class ebd implements SurfaceTextureListener, hdo {
    /* renamed from: R */
    private static boolean f17136R = false;
    /* renamed from: a */
    public static final String f17137a = bli.m887a("CameraAppUI");
    /* renamed from: A */
    public final cwd f17138A;
    /* renamed from: B */
    public final View f17139B;
    /* renamed from: C */
    public eiu f17140C;
    /* renamed from: D */
    public han f17141D;
    /* renamed from: E */
    public han f17142E;
    /* renamed from: F */
    public han f17143F;
    /* renamed from: G */
    public han f17144G;
    /* renamed from: H */
    public final hek f17145H;
    /* renamed from: I */
    public SurfaceTexture f17146I;
    /* renamed from: J */
    public int f17147J;
    /* renamed from: K */
    public int f17148K;
    /* renamed from: L */
    public final DisplayManager f17149L;
    /* renamed from: M */
    public final WindowManager f17150M;
    /* renamed from: N */
    public final bkw f17151N;
    /* renamed from: O */
    public final ebm f17152O;
    /* renamed from: P */
    public hhx f17153P;
    /* renamed from: Q */
    private final boolean f17154Q;
    /* renamed from: S */
    private final gyz f17155S;
    /* renamed from: T */
    private hcd f17156T;
    /* renamed from: U */
    private hny f17157U;
    /* renamed from: V */
    private final gvt f17158V;
    /* renamed from: W */
    private final gvr f17159W;
    /* renamed from: X */
    private final ilp f17160X;
    /* renamed from: Y */
    private final ilp f17161Y;
    /* renamed from: Z */
    private final gyl f17162Z;
    /* renamed from: aa */
    private ebk f17163aa = ebk.NONE;
    /* renamed from: ab */
    private long f17164ab = -1;
    /* renamed from: ac */
    private final aws f17165ac;
    /* renamed from: ad */
    private final edf f17166ad;
    /* renamed from: ae */
    private final edo f17167ae;
    /* renamed from: af */
    private final irs f17168af;
    /* renamed from: ag */
    private final cdq f17169ag;
    /* renamed from: b */
    public final cfh f17170b;
    /* renamed from: c */
    public final cjq f17171c;
    /* renamed from: d */
    public final FrameLayout f17172d;
    /* renamed from: e */
    public final FrameLayout f17173e;
    /* renamed from: f */
    public final gwp f17174f;
    /* renamed from: g */
    public ViewfinderCover f17175g;
    /* renamed from: h */
    public final MainActivityLayout f17176h;
    /* renamed from: i */
    public final csp f17177i;
    /* renamed from: j */
    public FrameLayout f17178j;
    /* renamed from: k */
    public ShutterButton f17179k;
    /* renamed from: l */
    public BottomBarController f17180l;
    /* renamed from: m */
    public brp f17181m;
    /* renamed from: n */
    public TutorialOverlayWrapper f17182n;
    /* renamed from: o */
    public DisplayListener f17183o;
    /* renamed from: p */
    public int f17184p;
    /* renamed from: q */
    public PreviewOverlay f17185q;
    /* renamed from: r */
    public CaptureAnimationOverlay f17186r;
    /* renamed from: s */
    public hdm f17187s;
    /* renamed from: t */
    public ToyboxMenuButton f17188t;
    /* renamed from: u */
    public gal f17189u;
    /* renamed from: v */
    public ImageButton f17190v;
    /* renamed from: w */
    public haq f17191w;
    /* renamed from: x */
    public final csg f17192x;
    /* renamed from: y */
    public final OnLayoutChangeListener f17193y = new ebe(this);
    /* renamed from: z */
    public final gyi f17194z;

    public ebd(cfh cfh, MainActivityLayout mainActivityLayout, hes hes, gyi gyi, hek hek, gvr gvr, aws aws, DisplayManager displayManager, WindowManager windowManager, boolean z, gvt gvt, hdm hdm, edf edf, edo edo, cwd cwd, csp csp, BottomBarController bottomBarController, hcd hcd, hny hny, ebq ebq, bkw bkw, irs irs, gyz gyz, gwp gwp, ebm ebm, gal gal, cdq cdq, ilp ilp, ilp ilp2, gyl gyl) {
        iqm b;
        jri.m13404b((Object) cfh);
        jri.m13404b((Object) mainActivityLayout);
        this.f17170b = cfh;
        this.f17176h = mainActivityLayout;
        this.f17154Q = z;
        this.f17194z = gyi;
        this.f17145H = hek;
        this.f17165ac = aws;
        this.f17149L = displayManager;
        this.f17150M = windowManager;
        this.f17166ad = (edf) jri.m13404b((Object) edf);
        this.f17167ae = (edo) jri.m13404b((Object) edo);
        this.f17158V = gvt;
        this.f17172d = hes.f6477a;
        this.f17173e = hes.f6478b;
        this.f17177i = csp;
        this.f17192x = this.f17177i.mo5742c();
        this.f17139B = hes.f6485i;
        this.f17159W = gvr;
        this.f17180l = bottomBarController;
        this.f17156T = hcd;
        this.f17157U = hny;
        this.f17187s = hdm;
        this.f17187s.f19936c = this;
        this.f17138A = cwd;
        this.f17155S = gyz;
        this.f17174f = gwp;
        this.f17189u = gal;
        hkg hkg = hes.f6486j;
        this.f17190v = (ImageButton) hkg.mo7919a((int) R.id.closeButton);
        this.f17175g = (ViewfinderCover) hkg.mo7919a((int) R.id.viewfinder_cover);
        this.f17171c = new cjq();
        this.f17188t = (ToyboxMenuButton) hkg.mo7919a((int) R.id.toybox_menu_button);
        this.f17151N = bkw;
        this.f17168af = irs;
        this.f17152O = ebm;
        this.f17169ag = cdq;
        this.f17160X = ilp;
        this.f17161Y = ilp2;
        this.f17162Z = gyl;
        this.f17190v.setOnClickListener(new ebf(this));
        aws.mo1824a().mo8557a(this.f17158V.mo7469a(new ebg(ebq, csp)));
        switch (this.f17150M.getDefaultDisplay().getRotation()) {
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
        this.f17184p = b.mo8806a();
        this.f17183o = new ebh(this);
        this.f17149L.registerDisplayListener(this.f17183o, null);
    }

    /* renamed from: a */
    public final void mo13114a(ham ham) {
        this.f17141D.mo7603a(ham);
    }

    /* renamed from: a */
    public final void mo13112a() {
        this.f17141D.mo7599a();
    }

    /* renamed from: b */
    public final void mo13117b() {
        boolean z = true;
        if (!this.f17165ac.mo1826c()) {
            if (this.f17154Q) {
                this.f17170b.mo12465a();
                return;
            }
            this.f17175g.mo12644a(this.f17153P);
            this.f17175g.mo12642a();
            mo13119b(true);
            if (this.f17153P != hhx.PHOTO) {
                z = false;
            }
            mo13124d(z);
            this.f17172d.post(new ebj(this));
            this.f17166ad.mo13450s();
            this.f17167ae.mo13450s();
        }
    }

    /* renamed from: c */
    public final void mo13120c() {
        this.f17180l.setClickable(true);
        this.f17156T.mo7672b(true);
        this.f17180l.setSwitchButtonClickEnabled(true);
        this.f17157U.mo13553a(C0252go.f5861bG);
    }

    /* renamed from: d */
    public final void mo13123d() {
        this.f17188t.setClickable(true);
    }

    /* renamed from: a */
    private final String m9759a(int i) {
        try {
            return this.f17170b.mo12480k().getResources().getString(i);
        } catch (NotFoundException e) {
            return "";
        }
    }

    /* renamed from: e */
    final void mo13125e() {
        bli.m894c(f17137a, "Revealing the viewfinder by hiding the mode cover.");
        this.f17175g.f12889d.start();
        if (this.f17164ab < 0) {
            this.f17164ab = System.currentTimeMillis();
        }
    }

    /* renamed from: f */
    public static boolean m9760f() {
        return false;
    }

    /* renamed from: g */
    public final void mo13128g() {
        fha f_ = this.f17170b.mo12488s().mo12931f_();
        if (f_ != null) {
            if (!this.f17170b.mo12460B().mo7294a("default_scope", "pref_flash_supported_back_camera", false) && f_.mo6786a()) {
                this.f17170b.mo12460B().mo7298b("default_scope", "pref_flash_supported_back_camera", true);
            }
            if (!this.f17170b.mo12460B().mo7302e("default_scope", "pref_hdr_support_mode_back_camera")) {
                String a;
                if (f_.mo6787b()) {
                    a = m9759a((int) R.string.pref_camera_hdr_supportmode_hdr_plus);
                } else if (f_.mo6788c()) {
                    a = m9759a((int) R.string.pref_camera_hdr_supportmode_hdr);
                } else {
                    a = m9759a((int) R.string.pref_camera_hdr_supportmode_none);
                }
                this.f17170b.mo12460B().mo7290a("default_scope", "pref_hdr_support_mode_back_camera", a);
            }
        }
    }

    /* renamed from: h */
    public final void mo13129h() {
        bli.m896d(f17137a, "onNewPreviewFrame");
        mo13125e();
    }

    /* renamed from: i */
    public static void m9761i() {
        bli.m896d(f17137a, "onPreviewStarted");
        f17136R = true;
    }

    /* renamed from: a */
    public final void mo13115a(boolean z) {
        this.f17168af.mo8903a(z);
    }

    /* renamed from: j */
    public final void mo13130j() {
        String str = f17137a;
        String valueOf = String.valueOf(this.f17163aa);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("shutdownPreviewImpl() = ");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        if (this.f17163aa != ebk.NONE) {
            this.f17141D.mo7602a(null);
            Object e = this.f17141D.mo7608e();
            jri.m13404b(e);
            try {
                valueOf = f17137a;
                String valueOf2 = String.valueOf(this.f17163aa);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                stringBuilder2.append("Waiting for Destroy via Future for ");
                stringBuilder2.append(valueOf2);
                bli.m896d(valueOf, stringBuilder2.toString());
                e.get(ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS, TimeUnit.MILLISECONDS);
                str = f17137a;
                valueOf = String.valueOf(this.f17163aa);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Got Destroy via Future for ");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                this.f17163aa = ebk.NONE;
            } catch (InterruptedException e2) {
                throw new IllegalStateException("Synchronization close failed on preview switch.");
            } catch (ExecutionException e3) {
                throw new IllegalStateException("Synchronization close failed on preview switch.");
            } catch (TimeoutException e4) {
                throw new IllegalStateException("Surface Destruction Synchronization on Module Switch Timed out.");
            }
        }
        this.f17187s.mo13525a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f17146I = surfaceTexture;
        this.f17147J = i;
        this.f17148K = i2;
        bli.m896d(f17137a, "SurfaceTexture is available");
        haq haq = this.f17191w;
        if (haq != null) {
            haq.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f17146I = null;
        bli.m896d(f17137a, "SurfaceTexture is destroyed");
        haq haq = this.f17191w;
        return haq != null ? haq.onSurfaceTextureDestroyed(surfaceTexture) : false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f17146I = surfaceTexture;
        this.f17147J = i;
        this.f17148K = i2;
        haq haq = this.f17191w;
        if (haq != null) {
            haq.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f17146I = surfaceTexture;
        haq haq = this.f17191w;
        if (haq != null) {
            haq.onSurfaceTextureUpdated(surfaceTexture);
        }
        if (f17136R) {
            mo13125e();
            f17136R = false;
        }
    }

    /* renamed from: a */
    public final void mo7748a(hhx hhx) {
        if (!this.f17165ac.mo1826c()) {
            this.f17187s.mo13525a();
            if (hhx == hhx.SETTINGS) {
                this.f17170b.mo12464F();
            } else if (hhx == hhx.ORNAMENT) {
                cdq cdq = this.f17169ag;
                Object intent = new Intent();
                intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity");
                intent.setFlags(65536);
                iut iut = iut.BACK;
                iur b = cdq.f1878c.mo9091b(iut);
                kvq kvq = new kvq();
                kvq.f9038b = Boolean.valueOf(((Boolean) cdq.f1882g.mo13673b()).booleanValue());
                kvq.f9037a = Boolean.valueOf(cdq.f1880e.mo7293a("default_scope", "pref_camera_recordlocation_key"));
                kvq.f9039c = ((gpe) cdq.f1883h.mo13673b()).name();
                Object e = cdq.f1879d.mo6160a(b, iut).mo8817e();
                jri.m13404b(e);
                kvq.f9040d = e.toString();
                e = cdq.f1881f.mo5997a(iut, (bez) cdq.f1876a.mo12367b(b).mo9706a(), inc.FPS_30, false).mo8639c().mo8817e();
                jri.m13404b(e);
                kvq.f9041e = e.toString();
                jri.m13404b(intent);
                Serializable serializable = kvq.f9037a;
                if (serializable != null) {
                    intent.putExtra("settings_save_location", serializable);
                }
                serializable = kvq.f9038b;
                if (serializable != null) {
                    intent.putExtra("settings_camera_sounds", serializable);
                }
                String str = kvq.f9039c;
                if (str != null) {
                    intent.putExtra("settings_volume_key_action", str);
                }
                str = kvq.f9040d;
                if (str != null) {
                    intent.putExtra("settings_back_camera_photo_resolution", str);
                }
                str = kvq.f9041e;
                if (str != null) {
                    intent.putExtra("settings_back_camera_video_resolution", str);
                }
                kvp kvp = new kvp(intent);
                cdq.f1877b.mo1823b(intent);
                this.f17160X.mo8826a(Boolean.valueOf(true));
            } else {
                this.f17175g.mo12644a(hhx);
                this.f17175g.mo12642a();
                if (hhx == hhx.LENS) {
                    gyl gyl = this.f17162Z;
                    kpk d = kpw.m18486d();
                    iel.m3771a().execute(new gyn(gyl, d));
                    kow.m13878a(d, new ebi(this), iel.m3771a());
                    return;
                }
                this.f17179k.setEnabled(false);
                f17136R = false;
                mo13118b(hhx);
            }
        }
    }

    /* renamed from: b */
    public final void mo13118b(hhx hhx) {
        hhx hhx2;
        if (this.f17170b.mo12487r() == hhx.VIDEO) {
            hhx2 = hhx.VIDEO;
        } else {
            hhx2 = hhx.PHOTO;
        }
        this.f17153P = hhx2;
        this.f17170b.mo12473a(hhx);
        mo13139p();
        if (hhx == hhx.PHOTO) {
            mo13119b(true);
            mo13124d(true);
        } else if (hhx == hhx.VIDEO) {
            mo13119b(true);
            mo13124d(false);
        } else if (hhx == hhx.VIDEO_INTENT) {
            mo13119b(false);
        } else {
            mo13119b(false);
        }
    }

    /* renamed from: k */
    public final void mo13131k() {
        this.f17192x.mo5725a();
        csh d = this.f17177i.mo5743d();
        kwa kwa = d.f2845b;
        if (kwa != null && ((cls) kwa.mo10562a()).isVisible()) {
            ((cls) d.f2845b.mo10562a()).dismiss();
        }
        mo13134o();
        this.f17175g.mo12644a(this.f17170b.mo12487r());
        if (this.f17154Q) {
            mo13139p();
        }
    }

    /* renamed from: l */
    public final void mo13132l() {
        this.f17180l.setCameraSwitchEnabled(true);
    }

    /* renamed from: b */
    public final void mo13119b(boolean z) {
        this.f17155S.mo7566a(z);
    }

    /* renamed from: a */
    public final void mo13113a(ebk ebk, haq haq) {
        boolean z;
        jri.m13404b(this.f17142E);
        jri.m13404b(this.f17143F);
        jri.m13404b(this.f17144G);
        if (ebk != ebk.NONE) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        String str = f17137a;
        String valueOf = String.valueOf(this.f17163aa);
        String valueOf2 = String.valueOf(ebk);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length());
        stringBuilder.append("Switching PreviewContentImpl ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" to ");
        stringBuilder.append(valueOf2);
        bli.m896d(str, stringBuilder.toString());
        ebk ebk2 = this.f17163aa;
        if (ebk == ebk2) {
            this.f17191w = haq;
        } else {
            han han;
            this.f17191w = null;
            if (ebk2 != ebk.NONE) {
                if (this.f17163aa == ebk.TEXTURE_VIEW_LEGACY) {
                    this.f17141D.mo7602a(null);
                }
                han = this.f17141D;
                if (han != null) {
                    han.mo7608e();
                }
            }
            this.f17191w = haq;
            jri.m13404b(this.f17142E);
            jri.m13404b(this.f17143F);
            jri.m13404b(this.f17144G);
            switch (ebk.ordinal()) {
                case 1:
                    han han2 = this.f17141D;
                    han = this.f17142E;
                    if (han2 == han) {
                        han = this.f17143F;
                        break;
                    }
                    break;
                case 2:
                    han = this.f17144G;
                    this.f17141D = han;
                    break;
                default:
                    throw new IllegalStateException("Cannot query next content adapter for a NONE implementation ");
            }
            this.f17141D = han;
            this.f17163aa = ebk;
            jri.m13404b(this.f17141D);
            if (ebk == ebk.TEXTURE_VIEW_LEGACY) {
                this.f17141D.mo7602a(this.f17193y);
            }
            this.f17141D.mo7607d();
        }
        haq haq2 = this.f17191w;
        if (haq2 != null) {
            OnGestureListener a = haq2.mo7610a();
            if (a != null) {
                PreviewOverlay previewOverlay = this.f17185q;
                if (a != null) {
                    previewOverlay.f2632a = new GestureDetector(previewOverlay.getContext(), a);
                }
            }
            OnTouchListener k_ = this.f17191w.mo7612k_();
            if (k_ != null) {
                this.f17185q.f2633b = k_;
            }
        }
    }

    /* renamed from: m */
    public final void mo13133m() {
        this.f17158V.mo7474a(true);
    }

    /* renamed from: c */
    public final void mo13122c(boolean z) {
        this.f17156T.mo7673c(z);
    }

    /* renamed from: n */
    public static void m9762n() {
    }

    /* renamed from: o */
    public final void mo13134o() {
        int i = 8;
        if (this.f17140C != null && !this.f17154Q && this.f17159W.mo7468a()) {
            cvx s = this.f17170b.mo12488s();
            eiu eiu = this.f17140C;
            boolean c = s.mo12928c();
            ikd.m12501a();
            Button button = eiu.f3850b;
            if (c && eiu.f3852d) {
                i = 0;
            }
            button.setVisibility(i);
            eiu.f3849a.setVisibility(0);
        }
    }

    /* renamed from: p */
    public final void mo13139p() {
        this.f17188t.setVisibility(8);
        this.f17190v.setVisibility(0);
    }

    /* renamed from: q */
    public final void mo13140q() {
        this.f17190v.setVisibility(8);
        this.f17188t.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo13124d(boolean z) {
        if (!this.f17155S.f6197e) {
            this.f17180l.setProgress(1.0f, z);
        }
    }

    /* renamed from: a */
    public final boolean mo13116a(hdz hdz, LayoutInflater layoutInflater) {
        int i;
        boolean z = true;
        TutorialOverlayWrapper tutorialOverlayWrapper = this.f17182n;
        heb heb = new heb(this);
        float f = hdz.f6446c.getResources().getConfiguration().fontScale;
        DisplayMetrics displayMetrics = hdz.f6446c.getResources().getDisplayMetrics();
        if (f > 1.0f) {
            i = 0;
        } else if (displayMetrics.densityDpi <= DisplayMetrics.DENSITY_DEVICE_STABLE) {
            i = hdz.f6447d.mo7468a() ^ 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            hdz.f6450g = tutorialOverlayWrapper;
            hdz.f6448e = heb;
            hdz.f6449f = layoutInflater;
            hdz.f6451h = true;
            hdz.mo7757b();
        } else {
            z = false;
        }
        if (z) {
            this.f17152O.mo6194a(4);
            this.f17174f.mo6368g();
            this.f17180l.setClickable(false);
            this.f17156T.mo7672b(false);
            this.f17180l.setSwitchButtonClickEnabled(false);
            this.f17157U.mo13553a(C0252go.f5862bH);
        }
        return z;
    }

    /* renamed from: c */
    public final void mo13121c(hhx hhx) {
        this.f17175g.mo12644a(hhx);
        this.f17175g.mo12642a();
    }

    /* renamed from: r */
    public final void mo13141r() {
        this.f17186r.mo2739a(true);
        this.f17180l.setCameraSwitchEnabled(false);
    }

    /* renamed from: s */
    public final void mo13142s() {
        this.f17186r.mo2739a(false);
        this.f17180l.setCameraSwitchEnabled(true);
    }

    /* renamed from: e */
    public final void mo13126e(boolean z) {
        if (z) {
            this.f17155S.mo7564a(0.0f, C0252go.f5895bo);
        } else {
            this.f17155S.mo7564a(0.0f, C0252go.f5894bn);
        }
    }

    /* renamed from: f */
    public final void mo13127f(boolean z) {
        if (!z) {
            mo13140q();
        }
    }
}

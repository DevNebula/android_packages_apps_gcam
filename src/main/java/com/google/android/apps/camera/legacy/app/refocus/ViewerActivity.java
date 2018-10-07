package com.google.android.apps.camera.legacy.app.refocus;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.widget.Toast;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.refocus.image.RGBZ;
import com.google.android.apps.refocus.processing.EditingFinishedListener;
import com.google.android.apps.refocus.viewer.RGBZFocusControls;
import com.google.android.apps.refocus.viewer.RGBZView;
import com.google.android.apps.refocus.viewer.RGBZViewer$RenderProgress;
import java.util.concurrent.CountDownLatch;
import p000.bkw;
import p000.bli;
import p000.cbx;
import p000.cby;
import p000.cct;
import p000.ccu;
import p000.cef;
import p000.ceg;
import p000.cgm;
import p000.cgn;
import p000.cgt;
import p000.dxd;
import p000.dxf;
import p000.dxi;
import p000.enq;
import p000.eqf;
import p000.gey;
import p000.gho;
import p000.ghp;
import p000.gls;
import p000.glu;
import p000.gnf;
import p000.gnu;
import p000.gsk;
import p000.gsn;
import p000.gsx;
import p000.gtf;
import p000.gtg;
import p000.gtj;
import p000.hsq;
import p000.hsr;
import p000.icu;
import p000.ird;
import p000.kwk;

/* compiled from: PG */
public class ViewerActivity extends cef implements cct {
    /* renamed from: d */
    public static final String f23265d = bli.m887a("ViewerActivity");
    /* renamed from: e */
    public RGBZFocusControls f23266e;
    /* renamed from: f */
    public icu f23267f;
    /* renamed from: g */
    public RGBZ f23268g;
    /* renamed from: h */
    public boolean f23269h = true;
    /* renamed from: i */
    public boolean f23270i;
    /* renamed from: j */
    public gnf f23271j;
    /* renamed from: k */
    public gnu f23272k;
    /* renamed from: l */
    public bkw f23273l;
    /* renamed from: m */
    public gey f23274m;
    /* renamed from: n */
    public Uri f23275n;
    /* renamed from: o */
    public ContentResolver f23276o;
    /* renamed from: p */
    public gtf f23277p;
    /* renamed from: q */
    public kwk f23278q;
    /* renamed from: r */
    public gho f23279r;
    /* renamed from: s */
    public Handler f23280s;
    /* renamed from: u */
    private ProgressOverlay f23281u;
    /* renamed from: v */
    private HandlerThread f23282v;
    /* renamed from: w */
    private Handler f23283w;
    /* renamed from: x */
    private dxi f23284x;
    /* renamed from: y */
    private final EditingFinishedListener f23285y = new dxd(this);

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f23269h ? super.dispatchTouchEvent(motionEvent) : false;
    }

    /* renamed from: a */
    public final ccu mo2254a(Class cls) {
        return (ccu) cls.cast(this.f23284x);
    }

    public void onBackPressed() {
        finish();
    }

    protected void onCreate(Bundle bundle) {
        cgm a = ((cgt) getApplication()).mo2290a();
        ceg b = mo12457b();
        mo12456a();
        this.f23284x = a.mo14591a(b);
        dxi dxi = this.f23284x;
        this.f12248a = (ird) dxi.f24090c.f25780p.mo10566a();
        this.f12249b = dxi.f24090c.mo15477b();
        this.f12250c = enq.m9937a(dxi.f24090c.f25676c);
        cgn cgn = dxi.f24090c;
        kwk kwk = cgn.f25778n;
        kwk kwk2 = cgn.f25607ak;
        kwk kwk3 = glu.f19296a;
        kwk kwk4 = dxi.f24090c.f25653bd;
        kwk kwk5 = gsk.f19560a;
        cgn cgn2 = dxi.f24090c;
        kwk kwk6 = cgn2.f25604ah;
        kwk kwk7 = cgn2.f25605ai;
        kwk kwk8 = gsn.f19562a;
        cgn cgn3 = dxi.f24090c;
        this.f23271j = new gnf(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8, cgn3.f25609am, dxi.f24088a, cgn3.f25606aj, cgn3.f25608al);
        this.f23272k = gls.m11384a(gsn.m11707b(), cby.m8074b(dxi.f24090c.f25623b));
        this.f23273l = (bkw) dxi.f24090c.f25783s.mo10566a();
        this.f23274m = (gey) dxi.f24090c.f25663bn.mo10566a();
        dxi.f24089b.mo10566a();
        this.f23275n = eqf.m9990b();
        this.f23276o = cbx.m8071b(dxi.f24090c.f25623b);
        cgn cgn4 = dxi.f24090c;
        this.f23277p = gtj.m11727a((gtg) cgn4.f25602af.mo10566a(), (gsx) cgn4.f25603ag.mo10566a());
        this.f23278q = dxi.f24090c.f25652bc;
        super.onCreate(bundle);
        setContentView(R.layout.viewer_activity);
        this.f23270i = false;
        if (getCallingPackage() != null) {
            String str = f23265d;
            String valueOf = String.valueOf(getCallingPackage());
            String str2 = "Calling from ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            if (getCallingPackage().indexOf("com.google.android.apps.photos") >= 0) {
                this.f23270i = true;
            }
        }
        this.f23282v = new HandlerThread("RGBZ RenderTask");
        this.f23282v.start();
        this.f23283w = new Handler(this.f23282v.getLooper());
        RGBZView rGBZView = (RGBZView) findViewById(R.id.render_image);
        this.f23266e = (RGBZFocusControls) findViewById(R.id.focus_controls);
        rGBZView.f2650a = this.f23266e;
        hsq hsq = rGBZView.f2650a;
        if (hsq != null) {
            hsq.mo8095a(rGBZView.f2651b);
        }
        this.f23266e.f12906g = this.f23285y;
        this.f23281u = (ProgressOverlay) findViewById(R.id.progress_overlay);
        this.f23267f = new icu(getApplicationContext(), this.f23283w, this.f23273l);
        this.f23268g = m15338d();
        if (this.f23268g == null) {
            bli.m891b(f23265d, "Could not read a valid RGBZ");
            finish();
            return;
        }
        icu icu = this.f23267f;
        icu.f20895f = rGBZView;
        Bitmap bitmap = icu.f20896g;
        if (bitmap != null) {
            rGBZView.setImageBitmap(bitmap);
        }
        this.f23267f.f20904o = this.f23266e;
        icu icu2 = this.f23267f;
        RGBZ rgbz = this.f23268g;
        Runnable dxf = new dxf(this);
        icu2.f20903n = false;
        icu2.f20900k = null;
        icu2.f20902m = null;
        icu2.f20897h = null;
        icu2.f20899j = null;
        icu2.f20898i = null;
        icu2.f20901l = 0.004f;
        if (rgbz != null) {
            icu2.mo13628b(rgbz.getPreview());
            icu2.f20905p = new CountDownLatch(1);
            new hsr(icu2, rgbz, dxf).start();
        }
        Toast.makeText(getApplicationContext(), R.string.processing_notification, 1);
        this.f23279r = new ghp();
        this.f23279r.mo7132a(this.f23281u);
        this.f23280s = new Handler(getMainLooper());
    }

    protected void onDestroy() {
        this.f23282v.quitSafely();
        super.onDestroy();
    }

    protected void onPause() {
        RGBZViewer$RenderProgress rGBZViewer$RenderProgress = this.f23267f.f20899j;
        if (rGBZViewer$RenderProgress != null) {
            rGBZViewer$RenderProgress.cancel();
        }
        this.f23279r.mo7133b();
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.f23279r.mo7134c();
    }

    /* renamed from: d */
    private final RGBZ m15338d() {
        String str;
        String valueOf;
        if ("content".equals(getIntent().getScheme())) {
            try {
                return new RGBZ(getIntent().getData(), getContentResolver());
            } catch (Throwable e) {
                str = f23265d;
                valueOf = String.valueOf(getIntent().getData());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Fail to parse RGBZ from ");
                stringBuilder.append(valueOf);
                bli.m892b(str, stringBuilder.toString(), e);
                return null;
            }
        }
        str = f23265d;
        String valueOf2 = String.valueOf(getIntent().getScheme());
        valueOf = "Refocus: Unknown scheme ";
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        bli.m891b(str, valueOf2);
        return null;
    }
}

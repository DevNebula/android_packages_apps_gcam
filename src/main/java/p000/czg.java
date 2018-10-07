package p000;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.OneCameraSession;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: czg */
public final class czg {
    /* renamed from: a */
    public static final String f3059a = bli.m887a("Capture1CC");
    /* renamed from: b */
    public final chu f3060b;
    /* renamed from: c */
    public final bnb f3061c;
    /* renamed from: d */
    public final ilp f3062d;
    /* renamed from: e */
    public final Object f3063e = new Object();
    /* renamed from: f */
    public kpk f3064f;
    /* renamed from: g */
    private final ikd f3065g;
    /* renamed from: h */
    private final kpm f3066h;
    /* renamed from: i */
    private final fxe f3067i;
    /* renamed from: j */
    private final ilp f3068j;
    /* renamed from: k */
    private final gor f3069k;
    /* renamed from: l */
    private final fbn f3070l;
    /* renamed from: m */
    private final fhc f3071m;
    /* renamed from: n */
    private final don f3072n;
    /* renamed from: o */
    private final DisplayMetrics f3073o;
    /* renamed from: p */
    private final ird f3074p;
    /* renamed from: q */
    private final Instrumentation f3075q;
    /* renamed from: r */
    private final ilp f3076r;
    /* renamed from: s */
    private final doz f3077s;
    /* renamed from: t */
    private hek f3078t;
    /* renamed from: u */
    private cza f3079u;
    /* renamed from: v */
    private fbj f3080v;
    /* renamed from: w */
    private bcl f3081w;
    /* renamed from: x */
    private Future f3082x;

    public czg(ikd ikd, kpm kpm, gor gor, fxe fxe, ilp ilp, fhc fhc, fbn fbn, don don, DisplayMetrics displayMetrics, chz chz, bnb bnb, Instrumentation instrumentation, ird ird, ilp ilp2, ilp ilp3, doz doz) {
        this.f3065g = ikd;
        this.f3066h = kpm;
        this.f3067i = fxe;
        this.f3068j = ilp;
        this.f3069k = gor;
        this.f3071m = fhc;
        this.f3070l = fbn;
        this.f3072n = don;
        this.f3073o = displayMetrics;
        this.f3060b = new ckt(chz);
        this.f3061c = bnb;
        this.f3075q = instrumentation;
        this.f3074p = ird;
        this.f3062d = ilp2;
        this.f3076r = ilp3;
        this.f3077s = doz;
    }

    /* renamed from: b */
    private final kpk m1606b(cwc cwc) {
        this.f3070l.mo13218b(cwc.f3020a);
        cza a = cza.m1600a(cwc);
        synchronized (this.f3063e) {
            cza cza = this.f3079u;
            if (cza != null && a.equals(cza)) {
                bcl bcl;
                kpk a2;
                if (this.f3080v != null && this.f3064f == null) {
                    bcl = this.f3081w;
                    if (bcl != null) {
                        if (!bcl.f11172a.get()) {
                            try {
                                Future future = this.f3082x;
                                if (future == null || (future.isDone() && !((Surface) this.f3082x.get()).isValid())) {
                                    bli.m894c(f3059a, "Camera with the same configuration is already open but surface is invalid");
                                    mo5901a();
                                } else {
                                    bli.m894c(f3059a, "Camera with the same configuration is already open, returning it.");
                                    a2 = kow.m13873a(this.f3080v);
                                    return a2;
                                }
                            } catch (InterruptedException e) {
                            } catch (ExecutionException e2) {
                            }
                        }
                    }
                }
                if (this.f3064f != null) {
                    bcl = this.f3081w;
                    if (!(bcl == null || bcl.f11172a.get())) {
                        bli.m894c(f3059a, "Camera with the same configuration is opening, returning Future.");
                        a2 = this.f3064f;
                        return a2;
                    }
                }
                bli.m894c(f3059a, "Camera with the same configuration exists, but has not been closed. Stopping and starting over.");
                mo5901a();
            } else if (!(this.f3079u == null || (this.f3080v == null && this.f3064f == null))) {
                mo5901a();
            }
            this.f3079u = a;
            return null;
        }
    }

    /* renamed from: a */
    public final kpk mo5899a(cwc cwc, kpk kpk, gjk gjk, etg etg) {
        return kow.m13875a(new czh(this, cwc, kpk, gjk, etg), this.f3066h);
    }

    /* renamed from: b */
    final kpk mo5903b(cwc cwc, kpk kpk, gjk gjk, etg etg) {
        kpk b = m1606b(cwc);
        if (b != null) {
            bli.m888a(f3059a, "Not opening camera because config did not change");
        } else {
            boolean z;
            kpk a = kny.m18476a(kpk, new czi(this, cwc), this.f3065g);
            OneCameraSession oneCameraSession = (OneCameraSession) this.f3075q.oneCamera().create();
            if (oneCameraSession.f12874a == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13406b(z, (Object) "Accidental session reuse.");
            iya iya = oneCameraSession.f2599m;
            oneCameraSession.f12874a = SystemClock.elapsedRealtimeNanos();
            this.f3074p.mo8856a("OneCamera#create");
            fbj a2 = m1605a(cwc, a, oneCameraSession, gjk, etg);
            if (oneCameraSession.f12876c == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13406b(z, (Object) "Accidental session reuse.");
            iya = oneCameraSession.f2599m;
            oneCameraSession.f12876c = SystemClock.elapsedRealtimeNanos();
            oneCameraSession.mo2698a("OneCamera Created", oneCameraSession.f12875b, oneCameraSession.f12876c);
            this.f3074p.mo8858b("OneCamera#start");
            bli.m894c(f3059a, "Starting OneCamera");
            if (oneCameraSession.f12877d == 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13406b(z, (Object) "Accidental session reuse.");
            iya = oneCameraSession.f2599m;
            oneCameraSession.f12877d = SystemClock.elapsedRealtimeNanos();
            oneCameraSession.mo2699a("OneCamera Created", oneCameraSession.f12876c, "OneCamera Start", oneCameraSession.f12877d);
            b = kny.m18475a(a2.mo13217d(), new czj(this, oneCameraSession, a2), this.f3066h);
            synchronized (this.f3063e) {
                this.f3080v = a2;
                this.f3064f = b;
            }
            this.f3074p.mo8857b();
        }
        return b;
    }

    /* renamed from: a */
    private final fbj m1605a(cwc cwc, kpk kpk, OneCameraSession oneCameraSession, gjk gjk, etg etg) {
        boolean z;
        fbj a;
        String a2 = gos.m2721a(cwc.f3020a.f7848b);
        ffc b = this.f3070l.mo13218b(cwc.f3020a);
        fha czd = new czd(this.f3071m, cwc, b);
        fxg a3 = fxg.m2462a(cwc.f3022c, this.f3067i, this.f3068j, new fxd(this.f3069k.mo7279a(a2, "pref_camera_flashmode_key"), b, fxi.AUTO), czd, this.f3076r);
        iqp iqp = cwc.f3023d.f6471a;
        chu chu = this.f3060b;
        bnb bnb = this.f3061c;
        dad dad = new dad();
        dof dof = new dof(iqp, kpk, chu, bnb, this.f3073o, gjk, etg);
        if (oneCameraSession.f12875b == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Accidental session reuse.");
        iya iya = oneCameraSession.f2599m;
        oneCameraSession.f12875b = SystemClock.elapsedRealtimeNanos();
        oneCameraSession.mo2699a("OneCamera Initialize", oneCameraSession.f12874a, "OneCamera Create", oneCameraSession.f12875b);
        synchronized (this.f3063e) {
            this.f3081w = new bcl();
            a = this.f3072n.mo6035a(cwc.f3020a, this.f3081w, dof, a3, this.f3077s);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo5902a(cwc cwc) {
        boolean z = false;
        this.f3070l.mo13218b(cwc.f3020a);
        cza a = cza.m1600a(cwc);
        synchronized (this.f3063e) {
            cza cza = this.f3079u;
            if (cza != null && a.equals(cza)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    final kpk mo5900a(heo heo, hek hek) {
        Object a;
        ikd.m12501a();
        jri.m13404b((Object) heo);
        jri.m13404b((Object) hek);
        synchronized (this.f3063e) {
            this.f3078t = hek;
            a = this.f3078t.mo7769a(heo);
            jri.m13404b(a);
            this.f3082x = a;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo5901a() {
        synchronized (this.f3063e) {
            this.f3079u = null;
            if (this.f3064f != null) {
                bli.m898e(f3059a, "Active camera open future currently exists. Aborting the previous open.");
                this.f3064f.cancel(true);
                this.f3064f = null;
            }
            fbj fbj = this.f3080v;
            if (fbj != null) {
                fbj.close();
                this.f3080v = null;
            }
        }
    }
}

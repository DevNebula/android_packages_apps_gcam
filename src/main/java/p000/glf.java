package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: glf */
public final class glf implements gkr {
    /* renamed from: a */
    public static final String f24410a = bli.m887a("CaptureSessionImpl");
    /* renamed from: A */
    private int f24411A = 0;
    /* renamed from: b */
    public final goe f24412b;
    /* renamed from: c */
    public final gsl f24413c;
    /* renamed from: d */
    public final gnh f24414d;
    /* renamed from: e */
    public final gmp f24415e;
    /* renamed from: f */
    public gmq f24416f;
    /* renamed from: g */
    public final Uri f24417g;
    /* renamed from: h */
    public volatile glk f24418h;
    /* renamed from: i */
    public final grg f24419i;
    /* renamed from: j */
    public final Map f24420j = new ConcurrentHashMap();
    /* renamed from: k */
    public int f24421k = 0;
    /* renamed from: l */
    public volatile god f24422l;
    /* renamed from: m */
    private final gny f24423m;
    /* renamed from: n */
    private final Executor f24424n;
    /* renamed from: o */
    private final gsq f24425o;
    /* renamed from: p */
    private final glt f24426p;
    /* renamed from: q */
    private final String f24427q;
    /* renamed from: r */
    private final long f24428r;
    /* renamed from: s */
    private final hju f24429s;
    /* renamed from: t */
    private gew f24430t;
    /* renamed from: u */
    private kbg f24431u = kau.f21835a;
    /* renamed from: v */
    private int f24432v = -1;
    /* renamed from: w */
    private hec f24433w = hci.m11977a();
    /* renamed from: x */
    private glw f24434x;
    /* renamed from: y */
    private boolean f24435y = false;
    /* renamed from: z */
    private int f24436z = 0;

    public glf(gnh gnh, gmp gmp, Executor executor, gsp gsp, gsl gsl, hju hju, grg grg, gny gny, gnu gnu, String str, long j, kbg kbg) {
        mo14929a("CaptureSessionImpl(#1)");
        this.f24427q = (String) jri.m13404b((Object) str);
        this.f24428r = j;
        this.f24431u = (kbg) jri.m13404b((Object) kbg);
        this.f24412b = new goe(gnu, "TEMP_SESSIONS", str);
        this.f24414d = (gnh) jri.m13404b((Object) gnh);
        this.f24415e = (gmp) jri.m13404b((Object) gmp);
        this.f24418h = glk.NOT_STARTED;
        this.f24423m = gny;
        this.f24424n = (Executor) jri.m13404b((Object) executor);
        this.f24426p = new glt();
        this.f24425o = gsp.mo7411b();
        this.f24413c = (gsl) jri.m13404b((Object) gsl);
        this.f24429s = hju;
        this.f24419i = grg;
        this.f24417g = gsp.mo7401a();
    }

    /* renamed from: a */
    public final void mo13369a(glm glm) {
        this.f24426p.mo13388a(glm);
    }

    /* renamed from: a */
    public final void mo13367a(bnl bnl) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo13360a() {
        if (this.f24435y) {
            mo14929a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo7076a(hci.m11977a(), true, "Session canceled.");
        } else {
            mo14929a("cancel");
            this.f24418h = glk.FINISHED_CANCELED;
            Uri uri = this.f24417g;
            if (uri != null) {
                this.f24414d.mo7251b(uri);
            }
            gmq gmq = this.f24416f;
            if (gmq != null) {
                this.f24415e.mo7236b(gmq);
                this.f24416f = null;
            }
            this.f24426p.onCaptureCanceled(this.f24436z, this.f24411A);
        }
    }

    /* renamed from: b */
    public final void mo13373b() {
        this.f24426p.onCaptureStartCommitted(this.f24436z, this.f24411A);
    }

    /* renamed from: a */
    private final void m16107a(glk... glkArr) {
        boolean z = false;
        glk glk = this.f24418h;
        for (glk glk2 : glkArr) {
            if (glk2 == glk) {
                z = true;
                break;
            }
        }
        String valueOf = String.valueOf(this.f24418h);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("Invalid session state: ");
        stringBuilder.append(valueOf);
        jri.m13406b(z, stringBuilder.toString());
    }

    /* renamed from: c */
    public final gob mo13375c() {
        m16107a(glk.STARTED);
        gob a = ((gnx) jri.m13404b(this.f24423m.mo7269a(this, this.f24427q, this.f24431u))).mo7268a(this.f24425o, new god(this));
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("createStackedSession -> ");
        stringBuilder.append(valueOf);
        mo14929a(stringBuilder.toString());
        this.f24420j.put(a.f19412b, a);
        god god = this.f24422l;
        return a;
    }

    /* renamed from: d */
    public final synchronized void mo13376d() {
        mo14929a("delete");
        this.f24418h = glk.FINISHED_CANCELED;
        Uri uri = this.f24417g;
        if (uri != null) {
            this.f24414d.mo7251b(uri);
        }
        this.f24426p.onCaptureDeleted();
    }

    /* renamed from: a */
    public final void mo13368a(gft gft) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final void mo13377e() {
        mo14929a("finalizeSession");
        this.f24415e.mo7236b(this.f24416f);
        this.f24426p.onCaptureFinalized();
    }

    /* renamed from: f */
    public final void mo13378f() {
        mo14929a("finish");
        m16107a(glk.STARTED);
        if (this.f24416f == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        } else if (this.f24434x == glw.BURST || this.f24434x == glw.PORTRAIT || this.f24434x == glw.RAW) {
            mo13370a(hci.m11979a((int) R.string.burst_process_done, new Object[0]));
            mo14932r();
            mo14929a("capturePersisted");
            this.f24414d.mo7249a((Uri) jri.m13404b(this.f24417g), this.f24425o.mo7418a());
            this.f24418h = glk.FINISHED_CANCELED;
        } else {
            this.f24418h = glk.FINISHING;
            this.f24424n.execute(new glh(this));
        }
    }

    /* renamed from: a */
    public final void mo7076a(hec hec, boolean z, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "finishWithFailure, throwable message = ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        mo14929a(valueOf);
        m16107a(glk.STARTED, glk.FINISHED_CANCELED);
        if (this.f24416f == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.f24433w = hec;
        this.f24414d.mo7248a((Uri) jri.m13404b(this.f24417g), hec, z);
        this.f24415e.mo7236b(this.f24416f);
        mo14931q();
    }

    /* renamed from: g */
    public final void mo13379g() {
        this.f24414d.mo7253c((Uri) jri.m13404b(this.f24417g));
    }

    /* renamed from: h */
    public final grg mo7077h() {
        return this.f24419i;
    }

    /* renamed from: i */
    public final synchronized int mo13380i() {
        return this.f24432v;
    }

    /* renamed from: j */
    public final synchronized hec mo13381j() {
        return this.f24433w;
    }

    /* renamed from: k */
    public final glw mo13382k() {
        return this.f24434x;
    }

    /* renamed from: l */
    public final long mo13383l() {
        return this.f24428r;
    }

    /* renamed from: m */
    public final goe mo13384m() {
        return this.f24412b;
    }

    /* renamed from: n */
    public final String mo13385n() {
        return this.f24427q;
    }

    /* renamed from: o */
    public final Uri mo13386o() {
        return (Uri) jri.m13404b(this.f24417g);
    }

    /* renamed from: a */
    final void mo14929a(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String str2 = f24410a;
        String str3 = this.f24427q;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str3).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m894c(str2, stringBuilder.toString());
    }

    /* renamed from: q */
    final void mo14931q() {
        this.f24426p.onCaptureFailed(this.f24436z, this.f24411A);
    }

    /* renamed from: r */
    final void mo14932r() {
        this.f24426p.onCapturePersisted(this.f24436z, this.f24411A);
    }

    /* renamed from: b */
    private final void m16108b(Bitmap bitmap, int i) {
        this.f24435y = true;
        this.f24414d.mo7243a(bitmap, i);
        this.f24426p.onTinyThumb();
    }

    /* renamed from: b */
    private final void m16109b(anq anq) {
        m16108b(hid.m3223a(anq.mo262b()), 0);
    }

    /* renamed from: a */
    public final synchronized kpk mo7074a(InputStream inputStream, glz glz) {
        kpk a;
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) glz);
        ixx ixx = glz.f5643b;
        ExifInterface exifInterface = (ExifInterface) glz.f5645d.mo9710c();
        mo14929a("saveAndFinish");
        if (this.f24418h == glk.FINISHED_CANCELED) {
            mo14930b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            a = kow.m13873a(kau.f21835a);
        } else {
            m16107a(glk.STARTED, glk.FINISHING);
            glz.mo7220a((Location) this.f24431u.mo9710c());
            this.f24418h = glk.FINISHED_CANCELED;
            a = kpw.m18486d();
            if (this.f24431u.mo9709b() && ixx == ixx.JPEG && exifInterface != null) {
                itg itg = new itg(exifInterface);
                itg.mo8999a((Location) this.f24431u.mo9706a());
                exifInterface = itg.f7821a;
            }
            if (exifInterface != null) {
                this.f24429s.mo7914a(exifInterface);
                this.f24419i.mo7366a(exifInterface);
            }
            jri.m13404b(this.f24416f);
            this.f24424n.execute(new glg(this, this.f24416f, glz, inputStream, a));
        }
        return a;
    }

    /* renamed from: a */
    public final void mo13361a(int i) {
        if (this.f24436z == 0) {
            this.f24436z = i;
        }
        this.f24411A = i;
    }

    /* renamed from: a */
    public final void mo13364a(Location location) {
        this.f24431u = kbg.m4803b(location);
    }

    /* renamed from: b */
    public final synchronized void mo13374b(int i) {
        if (this.f24418h != glk.STARTED) {
            mo14930b("Ignoring setProgress. CaptureSession is not started.");
        } else if (i != 0) {
            int i2;
            boolean z = this.f24435y;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f24435y = i2 | z;
            this.f24432v = i;
            this.f24414d.mo7245a(this.f24417g, this.f24432v);
            gew gew = this.f24430t;
            if (gew != null) {
                gew.mo7089a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo7075a(gew gew) {
        if (!hci.m11982a(this.f24433w)) {
            gew.mo7090a(this.f24433w);
        }
        gew.mo7089a(this.f24432v);
        this.f24430t = gew;
    }

    /* renamed from: a */
    public final synchronized void mo13370a(hec hec) {
        mo14929a("setProgressMessage");
        if (this.f24418h != glk.STARTED) {
            mo14930b("Ignoring setProgressMessage. CaptureSession is not started.");
        } else {
            this.f24433w = hec;
            if (!hci.m11982a(hec) && this.f24432v < 0) {
                this.f24432v = 0;
            }
            this.f24414d.mo7247a(this.f24417g, hec);
            gew gew = this.f24430t;
            if (gew != null) {
                gew.mo7090a(hec);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo13371a(iqp iqp, glw glw) {
        mo14929a("startEmpty");
        m16107a(glk.NOT_STARTED);
        this.f24418h = glk.STARTED;
        this.f24434x = glw;
        this.f24433w = hci.m11977a();
        this.f24432v = -1;
        this.f24416f = this.f24415e.mo7231a(this.f24427q, iqp, this.f24428r, mo13386o());
        this.f24414d.mo7246a(this.f24417g, this.f24434x, null);
        this.f24426p.onCaptureStarted(glw);
    }

    /* renamed from: a */
    public final synchronized void mo13366a(anq anq, hec hec, glw glw) {
        int i = 0;
        synchronized (this) {
            mo14929a("startSession(DrawableResource)");
            m16107a(glk.NOT_STARTED);
            this.f24418h = glk.STARTED;
            this.f24434x = glw;
            this.f24433w = hec;
            if (hci.m11982a(hec)) {
                i = -1;
            }
            this.f24432v = i;
            this.f24416f = this.f24415e.mo7230a(this.f24427q, anq, this.f24428r, mo13386o());
            this.f24414d.mo7246a(this.f24417g, this.f24434x, null);
            this.f24426p.onCaptureStarted(glw);
            m16109b(anq);
        }
    }

    /* renamed from: a */
    public final synchronized void mo13372a(byte[] bArr, hec hec, glw glw) {
        int i = 0;
        synchronized (this) {
            mo14929a("startSession(byte[])");
            m16107a(glk.NOT_STARTED);
            this.f24418h = glk.STARTED;
            this.f24434x = glw;
            this.f24433w = hec;
            if (hci.m11982a(hec)) {
                i = -1;
            }
            this.f24432v = i;
            this.f24416f = this.f24415e.mo7232a(this.f24427q, bArr, this.f24428r, this.f24417g);
            this.f24414d.mo7246a(this.f24417g, this.f24434x, null);
            this.f24426p.onCaptureStarted(glw);
            kbg a = this.f24415e.mo7233a((gmq) jri.m13404b(this.f24416f));
            if (a.mo9709b()) {
                m16109b((anq) a.mo9706a());
            }
        }
    }

    /* renamed from: a */
    public final void mo13363a(Bitmap bitmap, int i) {
        mo14929a("updateCaptureIndicatorThumbnail");
        m16108b(bitmap, i);
    }

    /* renamed from: p */
    public final void mo13387p() {
        mo14929a("updatePreview");
        if (this.f24418h != glk.STARTED) {
            mo14930b("Ignoring updatePreview. CaptureSession is not started.");
        } else {
            this.f24424n.execute(new gli(this));
        }
    }

    /* renamed from: a */
    public final void mo13362a(Bitmap bitmap) {
        mo14929a("updateThumbnail");
        if (this.f24416f == null || this.f24418h != glk.STARTED) {
            mo14930b("Ignoring updateThumbnail. CaptureSession is not started or placeholder has already been set.");
            return;
        }
        this.f24435y = true;
        this.f24415e.mo7234a(this.f24416f, bitmap);
        this.f24414d.mo7244a(this.f24417g);
        this.f24426p.onMediumThumb();
    }

    /* renamed from: a */
    public final void mo13365a(anq anq) {
        mo14929a("updateThumbnail]");
        if (this.f24416f == null || this.f24418h != glk.STARTED) {
            mo14930b("Ignoring updateThumbnail. CaptureSession is not started or placeholder has already been set.");
            return;
        }
        this.f24435y = true;
        this.f24415e.mo7235a(this.f24416f, anq);
        this.f24414d.mo7244a(this.f24417g);
        this.f24426p.onMediumThumb();
    }

    /* renamed from: b */
    final void mo14930b(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String str2 = f24410a;
        String str3 = this.f24427q;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 4) + String.valueOf(str3).length()) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m898e(str2, stringBuilder.toString());
    }
}

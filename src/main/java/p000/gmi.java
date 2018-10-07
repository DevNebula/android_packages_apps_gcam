package p000;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmi */
public final class gmi extends gkt {
    /* renamed from: a */
    public static final String f26434a = bli.m887a("PhtsphrCapSess");
    /* renamed from: b */
    public final goe f26435b;
    /* renamed from: c */
    public final gsl f26436c;

    public gmi(gmp gmp, glt glt, Executor executor, gsl gsl, eqa eqa, gsp gsp, gtf gtf, gsi gsi, grg grg, bcv bcv, goe goe, gnh gnh, String str, kbg kbg, long j, hju hju, gev gev) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, null, null, gnh, str, kbg, j, hju, gev, new glv(true));
        this.f26435b = (goe) jri.m13404b((Object) goe);
        this.f26436c = (gsl) jri.m13404b((Object) gsl);
    }

    /* renamed from: a */
    public final synchronized void mo13360a() {
        if (this.f24381B) {
            mo14919a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo7076a(hci.m11977a(), true, "Session canceled.");
        } else {
            mo14919a("cancel");
            this.f24391h.mo7214a(C0252go.f5882bb);
            mo14925w();
            mo14921b(this.f24402s);
            if (this.f24397n != null) {
                this.f24404u.mo7236b(this.f24397n);
                this.f24397n = null;
            }
            this.f24403t.onCaptureCanceled(this.f24382C, this.f24383D);
        }
    }

    /* renamed from: c */
    public final gob mo13375c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final synchronized void mo13376d() {
        mo14919a("delete");
        this.f24391h.mo7214a(C0252go.f5882bb);
        mo14925w();
        mo14921b(this.f24402s);
        this.f24403t.onCaptureDeleted();
    }

    /* renamed from: a */
    public final void mo13368a(gft gft) {
        this.f24384E = gft;
        mo14909A().mo7085a(gft);
        String str = f26434a;
        String valueOf = String.valueOf(gft);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
        stringBuilder.append("Enqueue file saving task ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
    }

    /* renamed from: e */
    public final void mo13377e() {
        mo14919a("finalizeSession");
        this.f24404u.mo7236b(this.f24397n);
        this.f24403t.onCaptureFinalized();
    }

    /* renamed from: f */
    public final void mo13378f() {
        mo14919a("finish");
        if (this.f24397n == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.f24391h.mo7215a(C0252go.f5827aZ, C0252go.f5881ba, f26434a);
        this.f24399p.execute(new gml(this));
    }

    /* renamed from: a */
    public final void mo7076a(hec hec, boolean z, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "finishWithFailure, throwable message  = ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        mo14922b(valueOf);
        this.f24391h.mo7216a(C0252go.f5827aZ, C0252go.f5882bb);
        if (this.f24397n == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.f24395l = hec;
        mo14925w();
        mo14917a(this.f24402s, hec, z);
        this.f24404u.mo7236b(this.f24397n);
        mo15544q();
    }

    /* renamed from: g */
    public final void mo13379g() {
        mo14923c(this.f24402s);
    }

    /* renamed from: s */
    final String mo14924s() {
        return f26434a;
    }

    /* renamed from: m */
    public final goe mo13384m() {
        return this.f26435b;
    }

    /* renamed from: q */
    final void mo15544q() {
        this.f24403t.onCaptureFailed(this.f24382C, this.f24383D);
    }

    /* renamed from: a */
    public final kpk mo7074a(InputStream inputStream, glz glz) {
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) glz);
        ixx ixx = glz.f5643b;
        ExifInterface exifInterface = (ExifInterface) glz.f5645d.mo9710c();
        mo14919a("saveAndFinish");
        if (this.f24391h.mo7217a()) {
            mo14922b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return kow.m13873a(kau.f21835a);
        }
        this.f24391h.mo7216a(C0252go.f5827aZ, C0252go.f5881ba);
        glz.mo7220a((Location) this.f24405v.mo9710c());
        this.f24391h.mo7214a(C0252go.f5882bb);
        kpw d = kpw.m18486d();
        if (this.f24405v.mo9709b() && ixx == ixx.JPEG && exifInterface != null) {
            itg itg = new itg(exifInterface);
            itg.mo8999a((Location) this.f24405v.mo9706a());
            exifInterface = itg.f7821a;
        }
        if (exifInterface != null) {
            mo14928z().mo7914a(exifInterface);
            this.f24407x.mo7366a(exifInterface);
        }
        this.f24399p.execute(new gmj(this, ixx, inputStream, kbg.m4803b(exifInterface), glz));
        kow.m13878a(mo14912D(), new gmk(this, d), this.f24399p);
        return d;
    }

    /* renamed from: a */
    public final void mo13364a(Location location) {
        this.f24405v = kbg.m4803b(location);
    }

    /* renamed from: a */
    public final void mo13371a(iqp iqp, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo13372a(byte[] bArr, hec hec, glw glw) {
        boolean z = true;
        int i = 0;
        synchronized (this) {
            int length;
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = 0;
            }
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("startSession(byte[]): ");
            stringBuilder.append(length);
            mo14919a(stringBuilder.toString());
            this.f24391h.mo7215a(C0252go.f5826aY, C0252go.f5827aZ, f26434a);
            this.f24394k = glw;
            if (!(glw == glw.PHOTOSPHERE || glw == glw.PANORAMA)) {
                z = false;
            }
            jri.m13395a(z);
            mo14913E();
            this.f24395l = hec;
            if (hci.m11982a(hec)) {
                i = -1;
            }
            this.f24396m = i;
            this.f24397n = this.f24404u.mo7232a(this.f24392i, (byte[]) jri.m13404b((Object) bArr), this.f24406w, this.f24402s);
            mo14915a(this.f24402s, glw);
            this.f24403t.onCaptureStarted(glw);
            kbg a = this.f24404u.mo7233a((gmq) jri.m13404b(this.f24397n));
            if (a.mo9709b()) {
                Bitmap a2 = hid.m3223a(((anq) a.mo9706a()).mo262b());
                this.f24381B = true;
                mo14920b(a2, 0);
                this.f24403t.onTinyThumb();
            }
        }
    }

    /* renamed from: a */
    public final void mo13363a(Bitmap bitmap, int i) {
        mo14919a("updateCaptureIndicatorThumbnail");
        mo14920b(bitmap, i);
        this.f24403t.onTinyThumb();
    }

    /* renamed from: p */
    public final void mo13387p() {
        mo14919a("updatePreview");
        if (this.f24391h.mo7218b()) {
            this.f24399p.execute(new gmm(this));
        } else {
            mo14922b("Ignoring updatePreview. CaptureSession is not started.");
        }
    }

    /* renamed from: a */
    public final void mo13362a(Bitmap bitmap) {
        mo14919a("updateThumbnail");
        if (this.f24397n == null || !this.f24391h.mo7218b()) {
            mo14922b("Ignoring updateThumbnail. CaptureSession is not started or placeholder has already been set.");
            return;
        }
        this.f24381B = true;
        this.f24404u.mo7234a((gmq) jri.m13404b(this.f24397n), bitmap);
        mo14914a(this.f24402s);
        this.f24403t.onMediumThumb();
    }
}

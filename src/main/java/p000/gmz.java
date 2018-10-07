package p000;

import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmz */
public final class gmz extends gkt {
    /* renamed from: a */
    public static final String f26437a = bli.m887a("RefocusCaptSess");
    /* renamed from: b */
    public final goe f26438b;
    /* renamed from: c */
    public final gsl f26439c;
    /* renamed from: d */
    public eql f26440d;

    public gmz(Executor executor, gmp gmp, glt glt, eqa eqa, gsi gsi, gtf gtf, gsp gsp, gsl gsl, grg grg, bcv bcv, gnh gnh, String str, kbg kbg, long j, goe goe, hju hju) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, null, null, gnh, str, kbg, j, hju, null, new glv(true));
        this.f26439c = (gsl) jri.m13404b((Object) gsl);
        this.f26438b = (goe) jri.m13404b((Object) goe);
    }

    /* renamed from: a */
    public final synchronized void mo13360a() {
        if (this.f24381B) {
            mo14919a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo7076a(hci.m11977a(), true, "");
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
        this.f24391h.mo7215a(C0252go.f5827aZ, C0252go.f5881ba, f26437a);
        this.f24399p.execute(new gne(this));
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
        mo14922b(valueOf);
        this.f24391h.mo7216a(C0252go.f5827aZ, C0252go.f5882bb);
        if (this.f24397n == null) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        this.f24395l = hec;
        mo14925w();
        mo14917a(this.f24402s, hec, z);
        this.f24404u.mo7236b(this.f24397n);
        this.f24403t.onCaptureFailed(this.f24382C, this.f24383D);
    }

    /* renamed from: g */
    public final void mo13379g() {
        mo14923c(this.f24402s);
    }

    /* renamed from: s */
    final String mo14924s() {
        return f26437a;
    }

    /* renamed from: m */
    public final goe mo13384m() {
        return this.f26438b;
    }

    /* renamed from: a */
    public final synchronized kpk mo7074a(InputStream inputStream, glz glz) {
        kpk a;
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) glz);
        ixx ixx = glz.f5643b;
        ExifInterface exifInterface = (ExifInterface) glz.f5645d.mo9710c();
        mo14919a("saveAndFinish");
        if (this.f24391h.mo7217a()) {
            mo14922b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            a = kow.m13873a(kau.f21835a);
        } else {
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
            this.f24399p.execute(new gnb(this, ixx, inputStream, kbg.m4803b(exifInterface), glz));
            kow.m13878a(mo14912D(), new gnc(this, d), this.f24399p);
            Object a2 = d;
        }
        return a2;
    }

    /* renamed from: a */
    public final synchronized void mo13371a(iqp iqp, glw glw) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final synchronized void mo15545a(Uri uri, hec hec, glw glw) {
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
        stringBuilder.append("startReprocessingSession(Uri)");
        stringBuilder.append(valueOf);
        mo14919a(stringBuilder.toString());
        if (glw.equals(glw.LENS_BLUR_RERENDER)) {
            this.f24391h.mo7215a(C0252go.f5826aY, C0252go.f5827aZ, f26437a);
            this.f24397n = this.f24404u.mo7229a(uri);
            this.f26440d = this.f24398o.mo6492a(uri, this.f24406w, this.f24392i, glw, this.f24380A);
            this.f24409z = kow.m13873a(this.f26440d);
            mo15546a(hec, glw, this.f26440d);
        } else {
            String valueOf2 = String.valueOf(glw.LENS_BLUR_RERENDER);
            String valueOf3 = String.valueOf(glw);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 33) + String.valueOf(valueOf3).length());
            stringBuilder2.append("sessionType must be ");
            stringBuilder2.append(valueOf2);
            stringBuilder2.append(", but we get ");
            stringBuilder2.append(valueOf3);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public final synchronized void mo13372a(byte[] bArr, hec hec, glw glw) {
        mo14919a("startSession(byte[])");
        if (glw.equals(glw.LENS_BLUR) || glw.equals(glw.NORMAL) || glw.equals(glw.CYCLOPS_PANO)) {
            this.f24391h.mo7215a(C0252go.f5826aY, C0252go.f5827aZ, f26437a);
            this.f24397n = this.f24404u.mo7232a(this.f24392i, bArr, this.f24406w, this.f24402s);
            kbg a = this.f24404u.mo7233a((gmq) jri.m13404b(this.f24397n));
            if (a.mo9709b()) {
                Bitmap a2 = hid.m3223a(((anq) a.mo9706a()).mo262b());
                this.f24381B = true;
                mo14920b(a2, 0);
                this.f24403t.onTinyThumb();
            }
            this.f24394k = glw;
            mo14913E();
            jri.m13404b(this.f24409z);
            this.f24409z.mo10200a(new gna(this, hec, glw), this.f24399p);
        } else {
            String valueOf = String.valueOf(glw.LENS_BLUR);
            String valueOf2 = String.valueOf(glw.NORMAL);
            String valueOf3 = String.valueOf(glw);
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 37) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
            stringBuilder.append("sessionType must be ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" or ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", but we get ");
            stringBuilder.append(valueOf3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final void mo15546a(hec hec, glw glw, eql eql) {
        int i;
        this.f24394k = glw;
        this.f24395l = hec;
        if (!(this.f24408y == null || hci.m11982a(hec))) {
            ((gew) jri.m13404b(this.f24408y)).mo7090a(hec);
        }
        if (hci.m11982a(hec)) {
            i = -1;
        } else {
            i = 0;
        }
        this.f24396m = i;
        mo14916a(this.f24402s, this.f24394k, (eqi) eql);
        this.f24403t.onCaptureStarted(glw);
    }

    /* renamed from: a */
    public final void mo13363a(Bitmap bitmap, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo13362a(Bitmap bitmap) {
        throw new UnsupportedOperationException();
    }
}

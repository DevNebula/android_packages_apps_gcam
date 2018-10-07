package p000;

import android.graphics.Bitmap;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmb */
public final class gmb extends gkt {
    /* renamed from: b */
    private static final String f26430b = bli.m887a("PhotoCaptureSession");
    /* renamed from: a */
    public final kbg f26431a;
    /* renamed from: c */
    private final ilp f26432c;
    /* renamed from: d */
    private boolean f26433d = false;

    public gmb(Executor executor, gmp gmp, glt glt, eqa eqa, gsi gsi, gtf gtf, gsp gsp, grg grg, bcv bcv, ird ird, bls bls, hju hju, gev gev, gnh gnh, String str, kbg kbg, long j, kbg kbg2, ilp ilp) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, ird, bls, gnh, str, kbg, j, hju, gev, new glv(true));
        this.f26431a = kbg2;
        this.f24384E = new gfu(this);
        this.f26432c = ilp;
    }

    /* renamed from: a */
    public final void mo13360a() {
        if (this.f24381B) {
            mo14919a("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            mo7076a(hci.m11977a(), true, "Session canceled.");
            return;
        }
        if (this.f26431a.mo9709b()) {
            ((etc) this.f26431a.mo9706a()).mo6579a(this.f24402s);
        }
        mo14919a("cancel");
        m17771q();
        jri.m13404b(this.f24397n);
        this.f24404u.mo7236b(this.f24397n);
        this.f24403t.onCaptureCanceled(this.f24382C, this.f24383D);
        mo14910B().mo2012a(this.f24392i);
    }

    /* renamed from: c */
    public final gob mo13375c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo13376d() {
        mo14919a("delete");
        m17771q();
        this.f24403t.onCaptureDeleted();
        mo14910B().mo2014b(this.f24392i);
    }

    /* renamed from: q */
    private final void m17771q() {
        this.f24391h.mo7214a(C0252go.f5882bb);
        jri.m13404b(this.f24402s);
        mo14925w();
        mo14921b(this.f24402s);
    }

    /* renamed from: e */
    public final void mo13377e() {
        mo14919a("finalizeSession");
        this.f24404u.mo7236b(this.f24397n);
        this.f24403t.onCaptureFinalized();
        this.f24384E.mo13344a();
    }

    /* renamed from: f */
    public final void mo13378f() {
        throw new UnsupportedOperationException();
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
        jri.m13404b(this.f24397n);
        if (this.f26431a.mo9709b()) {
            ((etc) this.f26431a.mo9706a()).mo6579a(this.f24402s);
        }
        this.f24395l = hec;
        mo14925w();
        mo14917a(this.f24402s, hec, z);
        this.f24404u.mo7236b(this.f24397n);
        this.f24403t.onCaptureFailed(this.f24382C, this.f24383D);
    }

    /* renamed from: s */
    final String mo14924s() {
        return f26430b;
    }

    /* renamed from: a */
    public final kpk mo7074a(InputStream inputStream, glz glz) {
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) glz);
        ixx ixx = glz.f5643b;
        mo14919a("saveAndFinish");
        if (this.f24391h.mo7217a()) {
            mo14922b("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return kow.m13873a(kau.f21835a);
        }
        this.f24391h.mo7216a(C0252go.f5827aZ, C0252go.f5881ba);
        glz.mo7220a((Location) this.f24405v.mo9710c());
        this.f24391h.mo7214a(C0252go.f5882bb);
        Object obj = (ExifInterface) glz.f5645d.mo9710c();
        if (obj != null) {
            if (ixx == ixx.JPEG) {
                itg itg = new itg(obj);
                if (((Boolean) this.f26432c.mo13673b()).booleanValue()) {
                    ite e = itg.f7821a.mo12678e(ExifInterface.f13031u);
                    if (e != null) {
                        int i;
                        int[] b = e.mo8987b();
                        if (b == null) {
                            i = 0;
                        } else if (b.length > 0) {
                            i = b[0];
                        } else {
                            i = 0;
                        }
                        e.mo8989c(i | 1);
                        itg.f7821a.mo12669a(e);
                    }
                }
                if (this.f24405v.mo9709b()) {
                    itg.mo8999a((Location) this.f24405v.mo9706a());
                }
                obj = itg.f7821a;
            }
            mo14928z().mo7914a(obj);
            this.f24407x.mo7366a((ExifInterface) obj);
        }
        this.f24399p.execute(new gmc(this, glz, inputStream, kbg.m4803b(obj), ixx));
        kpk d = kpw.m18486d();
        kow.m13878a(mo14912D(), new gmf(this, d), this.f24399p);
        return d;
    }

    /* renamed from: a */
    public final void mo13371a(iqp iqp, glw glw) {
        boolean z = true;
        mo14911C().mo8856a("PhotoCaptureSession#startEmpty");
        mo14919a("startEmpty");
        if (!(glw == glw.NORMAL || glw == glw.HDR_PLUS || glw == glw.HDR_PLUS_AUTO)) {
            z = false;
        }
        jri.m13395a(z);
        mo14910B().mo2017d(this.f24392i);
        mo14909A().mo7085a(this.f24384E);
        this.f24391h.mo7215a(C0252go.f5826aY, C0252go.f5827aZ, f26430b);
        this.f24394k = glw;
        mo14913E();
        this.f24396m = -1;
        mo14911C().mo8858b("insertEmptyPlaceholder");
        this.f24397n = this.f24404u.mo7231a(this.f24392i, iqp, this.f24406w, this.f24402s);
        mo14911C().mo8857b();
        mo14915a(this.f24402s, glw);
        this.f24403t.onCaptureStarted(glw);
        mo14911C().mo8857b();
    }

    /* renamed from: a */
    public final void mo13363a(Bitmap bitmap, int i) {
        mo14919a("updateCaptureIndicatorThumbnail");
        if (!this.f26433d) {
            this.f24381B = true;
            this.f26433d = true;
            mo14920b(bitmap, i);
            this.f24403t.onTinyThumb();
        }
    }

    /* renamed from: a */
    public final void mo13362a(Bitmap bitmap) {
        mo14919a("updateThumbnail");
        this.f24381B = true;
        this.f24404u.mo7234a((gmq) jri.m13404b(this.f24397n), bitmap);
        mo14914a(this.f24402s);
        this.f24403t.onMediumThumb();
    }
}

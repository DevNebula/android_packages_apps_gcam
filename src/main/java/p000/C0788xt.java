package p000;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.Parameters;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: xt */
final class C0788xt extends aah {
    /* renamed from: a */
    public final abh f22393a;
    /* renamed from: b */
    public boolean f22394b = true;
    /* renamed from: c */
    public final /* synthetic */ C0785xq f22395c;
    /* renamed from: d */
    private final C0785xq f22396d;
    /* renamed from: e */
    private final int f22397e;
    /* renamed from: f */
    private final C0794ym f22398f;
    /* renamed from: g */
    private abo f22399g = null;

    public C0788xt(C0785xq c0785xq, C0785xq c0785xq2, int i, abh abh, CameraCharacteristics cameraCharacteristics) {
        this.f22395c = c0785xq;
        this.f22396d = c0785xq2;
        this.f22397e = i;
        this.f22393a = abh;
        this.f22398f = new C0794ym(cameraCharacteristics);
    }

    /* renamed from: a */
    public final void mo17a(byte[] bArr) {
    }

    /* renamed from: a */
    public final boolean mo18a(abo abo) {
        if (abo == null) {
            abx.m91e(C0785xq.f22379a, "null parameters in applySettings()");
            return false;
        } else if (!(abo instanceof C0795yn)) {
            abx.m87b(C0785xq.f22379a, "Provided settings not compatible with the backing framework API");
            return false;
        } else if (!mo19a(abo, -2)) {
            return false;
        } else {
            this.f22399g = abo;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo14a(Handler handler, C0623zw c0623zw) {
        try {
            this.f22395c.f22382d.mo82a(new C0583xu(this, c0623zw, handler));
        } catch (RuntimeException e) {
            this.f22396d.f22385g.mo59a(e);
        }
    }

    /* renamed from: a */
    public final void mo16a(boolean z) {
        this.f22394b = z;
    }

    /* renamed from: a */
    public final C0619zs mo8a() {
        return this.f22396d;
    }

    /* renamed from: b */
    public final Handler mo20b() {
        return this.f22395c.f22380b;
    }

    /* renamed from: c */
    public final int mo22c() {
        return this.f22397e;
    }

    /* renamed from: d */
    public final abq mo23d() {
        return this.f22395c.f22381c;
    }

    /* renamed from: e */
    public final aaz mo24e() {
        return this.f22398f;
    }

    /* renamed from: f */
    public final abh mo25f() {
        return this.f22393a;
    }

    /* renamed from: g */
    public final abs mo26g() {
        return this.f22395c.f22382d;
    }

    /* renamed from: h */
    public final Parameters mo27h() {
        return null;
    }

    /* renamed from: i */
    public final abo mo28i() {
        if (this.f22399g == null) {
            this.f22399g = this.f22395c.f22380b.mo14467a();
        }
        return this.f22399g;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final void mo15a(Handler handler, C0624zx c0624zx) {
        try {
            this.f22395c.f22382d.mo82a(new C0585xx(this, c0624zx, handler));
        } catch (RuntimeException e) {
            this.f22396d.f22385g.mo59a(e);
        }
    }

    /* renamed from: a */
    public final void mo11a(Handler handler, aag aag) {
    }

    /* renamed from: b */
    public final void mo21b(Handler handler, aag aag) {
    }

    /* renamed from: a */
    public final void mo10a(SurfaceTexture surfaceTexture) {
        mo28i().f140f = true;
        super.mo10a(surfaceTexture);
    }

    /* renamed from: j */
    public final void mo29j() {
        mo28i().f140f = true;
        super.mo10a(null);
    }

    /* renamed from: a */
    public final void mo12a(Handler handler, aas aas, aaf aaf, aaf aaf2) {
        try {
            this.f22395c.f22382d.mo82a(new C0590yd(this, new C0791ya(this, aas, handler, aaf2)));
        } catch (RuntimeException e) {
            this.f22396d.f22385g.mo59a(e);
        }
    }
}

package p000;

import android.app.admin.DevicePolicyManager;
import android.os.Handler;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: cgu */
public final class cgu implements bah, C0625zy {
    /* renamed from: a */
    public static final String f12460a = bli.m887a("CameraController");
    /* renamed from: b */
    public final Handler f12461b;
    /* renamed from: c */
    public final C0619zs f12462c;
    /* renamed from: d */
    public final C0619zs f12463d;
    /* renamed from: e */
    public final ire f12464e;
    /* renamed from: f */
    public C0625zy f12465f;
    /* renamed from: g */
    public abg f12466g;
    /* renamed from: h */
    public aah f12467h;
    /* renamed from: i */
    public int f12468i = -1;
    /* renamed from: j */
    public boolean f12469j = false;
    /* renamed from: k */
    public HashSet f12470k;
    /* renamed from: l */
    private final irh f12471l;
    /* renamed from: m */
    private final DevicePolicyManager f12472m;
    /* renamed from: n */
    private final Executor f12473n;
    /* renamed from: o */
    private final Semaphore f12474o;
    /* renamed from: p */
    private abn f12475p = new cgx(this);

    public cgu(Handler handler, C0619zs c0619zs, irh irh, ire ire, DevicePolicyManager devicePolicyManager, Executor executor, Semaphore semaphore) {
        this.f12461b = handler;
        this.f12462c = c0619zs;
        this.f12472m = devicePolicyManager;
        this.f12463d = null;
        this.f12464e = ire;
        this.f12471l = irh;
        this.f12473n = executor;
        this.f12474o = semaphore;
        this.f12466g = this.f12462c.mo11589a();
        if (this.f12466g == null) {
            C0625zy c0625zy = this.f12465f;
            if (c0625zy != null) {
                c0625zy.mo11603a(-1, "GETTING_CAMERA_INFO");
            }
        }
        this.f12470k = new HashSet();
        this.f12462c.mo11590a(new abi(this.f12475p, this.f12461b));
    }

    /* renamed from: a */
    public final void mo1874a(abi abi) {
        if (abi != null) {
            this.f12470k.add(abi);
        }
    }

    /* renamed from: a */
    final void mo12498a(C0619zs c0619zs, int i, Handler handler, C0625zy c0625zy) {
        bli.m896d(f12460a, "checkAndOpenCamera");
        try {
            if (this.f12472m.getCameraDisabled(null)) {
                throw new box();
            }
            bli.m896d(f12460a, "Trying to acquire camera semaphore");
            this.f12474o.acquire();
            bli.m896d(f12460a, "Acquired camera semaphore");
            try {
                c0619zs.mo11595e().mo82a(new C0620zt(c0619zs, i, handler, c0625zy));
            } catch (RuntimeException e) {
                c0619zs.mo11592b().mo59a(e);
            }
        } catch (box e2) {
            handler.post(new cgy(this, c0625zy, i));
        }
    }

    /* renamed from: a */
    public final void mo12499a(boolean z) {
        bli.m896d(f12460a, "Closing camera");
        this.f12467h = null;
        this.f12462c.mo11591a(z);
        this.f12468i = -1;
        this.f12469j = false;
        mo12500c();
    }

    /* renamed from: b */
    public final abh mo1875b(int i) {
        abg abg = this.f12466g;
        if (abg == null) {
            return null;
        }
        return abg.mo53a(i);
    }

    /* renamed from: a */
    public final int mo1873a() {
        abg abg = this.f12466g;
        if (abg == null) {
            return -1;
        }
        return abg.mo52a();
    }

    /* renamed from: a */
    public final void mo11602a(int i) {
        C0625zy c0625zy = this.f12465f;
        if (c0625zy != null) {
            c0625zy.mo11602a(i);
        }
        mo12500c();
    }

    /* renamed from: a */
    public final void mo11604a(aah aah) {
        bli.m896d(f12460a, "onCameraOpened");
        if (this.f12468i == aah.mo22c() && aah.mo23d().mo77a() != 1) {
            this.f12467h = aah;
            this.f12468i = -1;
            C0625zy c0625zy = this.f12465f;
            if (c0625zy != null) {
                c0625zy.mo11604a(aah);
            }
        }
    }

    /* renamed from: a */
    public final void mo11603a(int i, String str) {
        C0625zy c0625zy = this.f12465f;
        if (c0625zy != null) {
            c0625zy.mo11603a(i, str);
        }
        mo12500c();
    }

    /* renamed from: b */
    public final void mo11606b(int i, String str) {
        C0625zy c0625zy = this.f12465f;
        if (c0625zy != null) {
            c0625zy.mo11606b(i, str);
        }
        mo12500c();
    }

    /* renamed from: a */
    public final void mo11605a(C0619zs c0619zs, String str) {
        C0625zy c0625zy = this.f12465f;
        if (c0625zy != null) {
            c0625zy.mo11605a(c0619zs, str);
        }
        mo12500c();
    }

    /* renamed from: c */
    public final void mo1878c(int i) {
        aah aah = this.f12467h;
        if (aah == null) {
            if (this.f12468i == -1) {
                bli.m898e(f12460a, "Trying to release the camera before requesting");
            }
            this.f12468i = -1;
            return;
        }
        int c = aah.mo22c();
        if (c != i) {
            int i2 = this.f12468i;
            if (i2 == i) {
                String str = f12460a;
                StringBuilder stringBuilder = new StringBuilder(100);
                stringBuilder.append("Releasing camera which was requested but not yet opened (current:requested): ");
                stringBuilder.append(c);
                stringBuilder.append(":");
                stringBuilder.append(i);
                bli.m898e(str, stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(ScriptIntrinsicBLAS.RsBlas_dtrmm);
                stringBuilder2.append("Trying to release a camera neither openednor requested (current:requested:for-release): ");
                stringBuilder2.append(c);
                stringBuilder2.append(":");
                stringBuilder2.append(i2);
                stringBuilder2.append(":");
                stringBuilder2.append(i);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        this.f12464e.mo8860a(iur.m4312a(String.valueOf(i)));
        this.f12468i = -1;
    }

    /* renamed from: c */
    final void mo12500c() {
        if (this.f12474o.availablePermits() == 0) {
            bli.m896d(f12460a, "Trying to release the camera semaphore");
            this.f12474o.release();
            bli.m896d(f12460a, "Semaphore released");
        }
    }

    /* renamed from: b */
    public final void mo1876b(abi abi) {
        if (abi != null) {
            this.f12470k.remove(abi);
        }
    }

    /* renamed from: d */
    public final void mo1879d(int i) {
        bli.m896d(f12460a, "requestCamera");
        int i2 = this.f12468i;
        if (i2 == -1 && i2 != i && this.f12466g != null) {
            this.f12471l.mo8869a(false);
            this.f12473n.execute(new cgv(this, i));
        }
    }

    /* renamed from: b */
    public final boolean mo1877b() {
        return this.f12468i != -1;
    }
}

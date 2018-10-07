package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: hod */
public final class hod implements hoc, igl {
    /* renamed from: a */
    public static final String f24495a = bli.m887a("WearRmtShttrLstnr");
    /* renamed from: e */
    public static hod f24496e;
    /* renamed from: b */
    public final Context f24497b;
    /* renamed from: c */
    public kpk f24498c;
    /* renamed from: d */
    public boolean f24499d;
    /* renamed from: f */
    private hob f24500f;
    /* renamed from: g */
    private final HandlerThread f24501g = new HandlerThread("camera.wearable");
    /* renamed from: h */
    private final Handler f24502h;
    /* renamed from: i */
    private final Handler f24503i;
    /* renamed from: j */
    private hji f24504j = new hji(new hur(this.f24497b).mo8146a(igq.f7368a).mo8145a());

    public hod(Context context) {
        this.f24497b = context.getApplicationContext();
        this.f24501g.start();
        this.f24502h = new Handler(this.f24501g.getLooper());
        this.f24503i = new Handler(this.f24497b.getMainLooper());
    }

    public final void close() {
        this.f24501g.quitSafely();
        kpk kpk = this.f24498c;
        if (kpk != null) {
            kow.m13878a(kpk, new hol(), kpq.f8776a);
        }
        this.f24504j = null;
    }

    /* renamed from: a */
    public final void mo8441a(igm igm) {
        if ("/takePicture".equals(igm.mo8442a())) {
            bli.m896d(f24495a, "Received remote shutter from Wear device");
            this.f24500f.mo7992u();
            return;
        }
        String str = f24495a;
        String valueOf = String.valueOf(igm.mo8442a());
        String str2 = "Unable to handle unknown message: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m898e(str, valueOf);
    }

    /* renamed from: a */
    public final void mo13556a() {
        this.f24500f = null;
        if (this.f24499d && this.f24498c != null) {
            bli.m888a(f24495a, "onModuleExit. Shutting down wearable connection");
            kow.m13878a(this.f24498c, new hof(this), kpq.f8776a);
        }
        this.f24499d = false;
    }

    /* renamed from: a */
    public final void mo13557a(hob hob) {
        this.f24500f = hob;
        this.f24499d = true;
        try {
            this.f24498c = this.f24504j.mo13541a();
            kow.m13878a(this.f24498c, new hoe(this), kpq.f8776a);
        } catch (SecurityException e) {
            bli.m898e(f24495a, "Bad install order on GmsCore and Camera - remote shutter will not work, reinstall the same GoogleCamera.apk");
            this.f24504j = null;
            this.f24499d = false;
        } catch (Throwable e2) {
            bli.m892b(f24495a, "Exception when connecting to wear", e2);
            this.f24504j = null;
            this.f24499d = false;
        }
    }

    /* renamed from: a */
    public final void mo13558a(byte[] bArr) {
        try {
            if (this.f24499d && this.f24504j != null) {
                this.f24503i.post(new hoi(this, bArr, new hoh(this)));
            }
        } catch (Throwable e) {
            bli.m892b(f24495a, "error processing photo for wear", e);
        }
    }

    /* renamed from: a */
    final void mo14939a(igo igo, Runnable runnable) {
        this.f24502h.post(new hoj(this, igo, runnable));
    }
}

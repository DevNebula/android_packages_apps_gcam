package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hqw */
public final class hqw {
    /* renamed from: a */
    public final List f6826a = new ArrayList();
    /* renamed from: b */
    public final hqv f6827b;

    public hqw(Context context, hqq hqq) {
        this.f6827b = new hqx(context, this, hqq);
    }

    /* renamed from: a */
    final void mo8046a() {
        for (hqu a : this.f6826a) {
            a.mo8037a(this.f6827b.mo8043d());
        }
        this.f6826a.clear();
    }

    /* renamed from: a */
    public final boolean mo8047a(Bundle bundle) {
        Throwable e;
        hhz.m3212a();
        if (this.f6827b.mo8043d()) {
            hqg hqg = (hqg) ((ksa) ((krz) hqg.f26751c.mo15667a(C0252go.f5880bZ, null))).mo15746a(hqe.LENS_SERVICE_IMAGE_INJECT.f20569h).mo14191c();
            try {
                this.f6827b.mo8039a(hqg.mo15156b(), new hqc(bundle));
                return true;
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceBridge", "Failed to inject image.", e);
                return false;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceBridge", "Failed to inject image.", e);
                return false;
            }
        }
        Log.i("LensServiceBridge", "Lens session is not ready.");
        return false;
    }

    /* renamed from: b */
    public final boolean mo8048b() {
        hhz.m3212a();
        if (!this.f6827b.mo8043d() || this.f6827b.mo8040b() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo8049c() {
        Throwable e;
        hhz.m3212a();
        if (this.f6827b.mo8043d()) {
            try {
                this.f6827b.mo8041b(((hqg) ((ksa) ((krz) hqg.f26751c.mo15667a(C0252go.f5880bZ, null))).mo15746a(hqe.LENS_SERVICE_WARM_UP_ACTIVITY.f20569h).mo14191c()).mo15156b());
                return true;
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
                return false;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", e);
                return false;
            }
        }
        Log.i("LensServiceBridge", "Lens session is not ready for prewarm.");
        return false;
    }

    /* renamed from: d */
    public final boolean mo8050d() {
        Throwable e;
        hhz.m3212a();
        if (this.f6827b.mo8043d()) {
            try {
                this.f6827b.mo8041b(((hqg) ((ksa) ((krz) hqg.f26751c.mo15667a(C0252go.f5880bZ, null))).mo15746a(hqe.LENS_SERVICE_START_ACTIVITY.f20569h).mo14191c()).mo15156b());
                this.f6827b.mo8044e();
                return true;
            } catch (RemoteException e2) {
                e = e2;
                Log.e("LensServiceBridge", "Failed to start Lens", e);
                return false;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("LensServiceBridge", "Failed to start Lens", e);
                return false;
            }
        }
        Log.i("LensServiceBridge", "Lens session is not ready.");
        return false;
    }
}

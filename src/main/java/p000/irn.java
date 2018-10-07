package p000;

import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.util.Log;

/* compiled from: PG */
/* renamed from: irn */
final class irn extends AvailabilityCallback {
    /* renamed from: a */
    private final /* synthetic */ irl f7730a;

    irn(irl irl) {
        this.f7730a = irl;
    }

    public final void onCameraAvailable(String str) {
        if (this.f7730a.f21220a.equals(str)) {
            synchronized (this.f7730a.f21222c) {
                String str2 = "CAM_CameraOpener";
                String str3 = "onCameraAvailable: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                Log.i(str2, valueOf);
                this.f7730a.f21222c.notify();
            }
        }
    }
}

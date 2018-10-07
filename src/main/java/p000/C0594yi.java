package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;

/* compiled from: PG */
/* renamed from: yi */
final class C0594yi extends StateCallback {
    /* renamed from: a */
    private final /* synthetic */ C0792ye f10045a;

    C0594yi(C0792ye c0792ye) {
        this.f10045a = c0792ye;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        aat aat = this.f10045a.f22416k;
        if (aat != null) {
            aat.mo42a();
            this.f10045a.f22416k = null;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        abx.m87b(C0785xq.f22379a, "Failed to configure the camera for capture");
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0792ye c0792ye = this.f10045a;
        c0792ye.f22414i = cameraCaptureSession;
        c0792ye.mo14468a(8);
    }
}

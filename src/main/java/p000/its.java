package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: its */
public final class its extends StateCallback {
    /* renamed from: a */
    private final iwi f7829a;

    its(iwi iwi) {
        this.f7829a = iwi;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f7829a.mo9126a(new itk(cameraCaptureSession));
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f7829a.mo9128b(new itk(cameraCaptureSession));
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f7829a.mo9129c(new itk(cameraCaptureSession));
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f7829a.mo9130d(new itk(cameraCaptureSession));
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f7829a.mo9131e(new itk(cameraCaptureSession));
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f7829a.mo9127a(new itk(cameraCaptureSession), surface);
    }
}

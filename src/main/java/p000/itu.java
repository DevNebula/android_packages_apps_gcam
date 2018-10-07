package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: itu */
public final class itu extends StateCallback {
    /* renamed from: a */
    private final iwk f7830a;

    itu(iwk iwk) {
        this.f7830a = iwk;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        iwj iwj = new iwj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        bli.m888a(bhm.f11392a, "onActive");
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        iwj iwj = new iwj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        bli.m888a(bhm.f11392a, "onClosed");
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession = (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession;
        iwk iwk = this.f7830a;
        iwj iwj = new iwj(cameraConstrainedHighSpeedCaptureSession);
        bli.m891b(bhm.f11392a, "onConfigureFailed");
        iwk.f7885a.mo15642a(new isr("CameraCaptureSession.onConfigureFailed"));
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession = (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession;
        iwk iwk = this.f7830a;
        iwg iwj = new iwj(cameraConstrainedHighSpeedCaptureSession);
        bli.m888a(bhm.f11392a, "onConfigured");
        iwk.f7885a.mo15641a(new bhj(iwj));
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        iwj iwj = new iwj((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        bli.m888a(bhm.f11392a, "onReady");
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        itk itk = new itk(cameraCaptureSession);
    }
}

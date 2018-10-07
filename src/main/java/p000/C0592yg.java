package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* renamed from: yg */
final class C0592yg extends CaptureCallback {
    /* renamed from: a */
    private boolean f10041a = false;
    /* renamed from: b */
    private final /* synthetic */ C0596yl f10042b;
    /* renamed from: c */
    private final /* synthetic */ C0792ye f10043c;

    C0592yg(C0792ye c0792ye, C0596yl c0596yl) {
        this.f10043c = c0792ye;
        this.f10042b = c0596yl;
    }

    /* renamed from: a */
    private final void m6311a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AE_STATE) != null && !this.f10041a) {
            this.f10041a = true;
            C0792ye c0792ye = this.f10043c;
            c0792ye.f22418m = this.f10042b;
            c0792ye.f22421p.mo11566a(captureResult);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m6311a(totalCaptureResult);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        aby aby = C0785xq.f22379a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Autoexposure and capture failed with reason ");
        stringBuilder.append(captureFailure.getReason());
        abx.m87b(aby, stringBuilder.toString());
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        m6311a(captureResult);
    }
}

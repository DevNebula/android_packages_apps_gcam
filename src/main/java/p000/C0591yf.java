package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* renamed from: yf */
final class C0591yf extends CaptureCallback {
    /* renamed from: a */
    private boolean f10038a = false;
    /* renamed from: b */
    private final /* synthetic */ C0623zw f10039b;
    /* renamed from: c */
    private final /* synthetic */ C0792ye f10040c;

    C0591yf(C0792ye c0792ye, C0623zw c0623zw) {
        this.f10040c = c0792ye;
        this.f10039b = c0623zw;
    }

    /* renamed from: a */
    private final void m6310a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AF_STATE) != null && !this.f10038a) {
            this.f10038a = true;
            C0792ye c0792ye = this.f10040c;
            c0792ye.f22417l = this.f10039b;
            c0792ye.f22421p.mo11566a(captureResult);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        m6310a(totalCaptureResult);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        aby aby = C0785xq.f22379a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Focusing failed with reason ");
        stringBuilder.append(captureFailure.getReason());
        abx.m87b(aby, stringBuilder.toString());
        this.f10039b.mo11600a(false, this.f10040c.f22410e);
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        m6310a(captureResult);
    }
}

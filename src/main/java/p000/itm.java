package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: itm */
public final class itm extends CaptureCallback {
    /* renamed from: a */
    private final iwh f7828a;

    public itm(iwh iwh) {
        this.f7828a = iwh;
    }

    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        try {
            this.f7828a.mo9122a(new itq(captureRequest), surface, j);
        } catch (Throwable th) {
            iks.m3859a(th);
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f7828a.mo9124a(new itq(captureRequest), new iuf(totalCaptureResult));
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.f7828a.mo9123a(new itq(captureRequest), new itp(captureFailure));
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f7828a.mo9125b(new itq(captureRequest), new itr(captureResult));
    }

    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        this.f7828a.mo9119a(i);
    }

    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.f7828a.mo9120a(i, j);
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        this.f7828a.mo9121a(new itq(captureRequest), j, j2);
    }
}

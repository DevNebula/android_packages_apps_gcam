package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: yj */
final class C0793yj extends C0595yk {
    /* renamed from: a */
    private int f22430a = -1;
    /* renamed from: b */
    private long f22431b = -1;
    /* renamed from: c */
    private long f22432c = -1;
    /* renamed from: d */
    private final /* synthetic */ C0792ye f22433d;

    C0793yj(C0792ye c0792ye) {
        this.f22433d = c0792ye;
    }

    /* renamed from: a */
    public final void mo11566a(CaptureResult captureResult) {
        boolean z = true;
        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null) {
            int intValue = num.intValue();
            if (captureResult.getFrameNumber() > this.f22431b) {
                int i = this.f22430a;
                this.f22430a = intValue;
                this.f22431b = captureResult.getFrameNumber();
                C0792ye c0792ye;
                switch (intValue) {
                    case 1:
                    case 2:
                    case 6:
                        if (intValue != i) {
                            c0792ye = this.f22433d;
                            C0624zx c0624zx = c0792ye.f22419n;
                            if (c0624zx != null) {
                                if (intValue != 1) {
                                    z = false;
                                }
                                c0624zx.mo11601a(z, c0792ye.f22410e);
                                break;
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        c0792ye = this.f22433d;
                        C0623zw c0623zw = c0792ye.f22417l;
                        if (c0623zw != null) {
                            boolean z2;
                            if (intValue == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c0623zw.mo11600a(z2, c0792ye.f22410e);
                            this.f22433d.f22417l = null;
                            break;
                        }
                        break;
                }
            }
        }
        num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (num != null) {
            int intValue2 = num.intValue();
            if (captureResult.getFrameNumber() > this.f22432c) {
                this.f22433d.f22420o = num.intValue();
                this.f22432c = captureResult.getFrameNumber();
                switch (intValue2) {
                    case 2:
                    case 3:
                    case 4:
                        Handler handler = this.f22433d;
                        OnImageAvailableListener onImageAvailableListener = handler.f22418m;
                        if (onImageAvailableListener != null) {
                            handler.f22415j.setOnImageAvailableListener(onImageAvailableListener, handler);
                            try {
                                C0792ye c0792ye2 = this.f22433d;
                                CameraCaptureSession cameraCaptureSession = c0792ye2.f22414i;
                                CaptureRequest a = c0792ye2.f22411f.mo104a(c0792ye2.f22409d, 2, c0792ye2.f22415j.getSurface());
                                Handler handler2 = this.f22433d;
                                cameraCaptureSession.capture(a, handler2.f22418m, handler2);
                                return;
                            } catch (Throwable e) {
                                abx.m85a(C0785xq.f22379a, "Unable to initiate capture", e);
                                return;
                            } finally {
                                this.f22433d.f22418m = null;
                            }
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        mo11566a(totalCaptureResult);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        aby aby = C0785xq.f22379a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Capture attempt failed with reason ");
        stringBuilder.append(captureFailure.getReason());
        abx.m87b(aby, stringBuilder.toString());
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        mo11566a(captureResult);
    }

    /* renamed from: a */
    public final void mo11565a() {
        this.f22430a = -1;
        this.f22431b = -1;
        this.f22432c = -1;
    }
}

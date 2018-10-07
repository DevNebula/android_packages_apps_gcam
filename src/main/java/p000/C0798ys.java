package p000;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;

/* compiled from: PG */
/* renamed from: ys */
final class C0798ys implements abg {
    /* renamed from: a */
    private final CameraInfo[] f22449a;
    /* renamed from: b */
    private final int f22450b;

    private C0798ys(CameraInfo[] cameraInfoArr, int i) {
        this.f22449a = cameraInfoArr;
        this.f22450b = i;
    }

    /* renamed from: b */
    public static C0798ys m14845b() {
        try {
            int i;
            int numberOfCameras = Camera.getNumberOfCameras();
            CameraInfo[] cameraInfoArr = new CameraInfo[numberOfCameras];
            for (i = 0; i < numberOfCameras; i++) {
                cameraInfoArr[i] = new CameraInfo();
                Camera.getCameraInfo(i, cameraInfoArr[i]);
            }
            i = -1;
            for (numberOfCameras--; numberOfCameras >= 0; numberOfCameras--) {
                CameraInfo cameraInfo = cameraInfoArr[numberOfCameras];
                if (cameraInfo.facing == 0) {
                    i = numberOfCameras;
                } else if (cameraInfo.facing == 1) {
                }
            }
            return new C0798ys(cameraInfoArr, i);
        } catch (Throwable e) {
            abx.m85a(C0796yo.f22440a, "Exception while creating CameraDeviceInfo", e);
            return null;
        }
    }

    /* renamed from: a */
    public final abh mo53a(int i) {
        CameraInfo cameraInfo = this.f22449a[i];
        return cameraInfo != null ? new C0799yt(cameraInfo) : null;
    }

    /* renamed from: a */
    public final int mo52a() {
        return this.f22450b;
    }
}

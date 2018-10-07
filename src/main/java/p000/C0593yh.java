package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;

/* compiled from: PG */
/* renamed from: yh */
final class C0593yh extends StateCallback {
    /* renamed from: a */
    private final /* synthetic */ C0792ye f10044a;

    C0593yh(C0792ye c0792ye) {
        this.f10044a = c0792ye;
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        aby aby = C0785xq.f22379a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Camera device '");
        stringBuilder.append(this.f10044a.f22407b);
        stringBuilder.append("' was disconnected");
        abx.m91e(aby, stringBuilder.toString());
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        aby aby = C0785xq.f22379a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Camera device '");
        stringBuilder.append(this.f10044a.f22407b);
        stringBuilder.append("' encountered error code '");
        stringBuilder.append(i);
        stringBuilder.append('\'');
        abx.m87b(aby, stringBuilder.toString());
        C0792ye c0792ye = this.f10044a;
        C0625zy c0625zy = c0792ye.f22406a;
        if (c0625zy != null) {
            int i2 = c0792ye.f22407b;
            c0625zy.mo11603a(i2, c0792ye.mo86b(i2));
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        C0792ye c0792ye = this.f10044a;
        c0792ye.f22409d = cameraDevice;
        if (c0792ye.f22406a != null) {
            try {
                boolean z;
                CameraCharacteristics cameraCharacteristics = c0792ye.f22422q.f22383e.getCameraCharacteristics(c0792ye.f22408c);
                abh a = this.f10044a.f22422q.mo11589a().mo53a(this.f10044a.f22407b);
                C0792ye c0792ye2 = this.f10044a;
                C0785xq c0785xq = c0792ye2.f22422q;
                c0792ye2.f22410e = new C0788xt(c0785xq, c0785xq, c0792ye2.f22407b, a, cameraCharacteristics);
                this.f10044a.f22411f = new aca();
                this.f10044a.f22412g = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                C0792ye c0792ye3 = this.f10044a;
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                c0792ye3.f22413h = z;
                this.f10044a.mo14468a(2);
                c0792ye = this.f10044a;
                c0792ye.f22406a.mo11604a(c0792ye.f22410e);
            } catch (CameraAccessException e) {
                c0792ye = this.f10044a;
                C0625zy c0625zy = c0792ye.f22406a;
                int i = c0792ye.f22407b;
                c0625zy.mo11603a(i, c0792ye.mo86b(i));
            }
        }
    }
}

package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: iwj */
public final class iwj implements iwg {
    /* renamed from: a */
    private final CameraConstrainedHighSpeedCaptureSession f24689a;

    public iwj(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession) {
        this.f24689a = cameraConstrainedHighSpeedCaptureSession;
    }

    /* renamed from: a */
    public final void mo13712a() {
        try {
            this.f24689a.abortCaptures();
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    /* renamed from: a */
    public final int mo13711a(List list, iwh iwh, Handler handler) {
        try {
            return this.f24689a.captureBurst(ion.m4021b(list), new itm(iwh), handler);
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    public final void close() {
        this.f24689a.close();
    }

    /* renamed from: a */
    public final List mo15022a(iwo iwo) {
        try {
            List createHighSpeedRequestList = this.f24689a.createHighSpeedRequestList((CaptureRequest) ion.m4003a((iwe) iwo));
            List arrayList = new ArrayList(createHighSpeedRequestList.size());
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= createHighSpeedRequestList.size()) {
                    return arrayList;
                }
                arrayList.add(new itq((CaptureRequest) createHighSpeedRequestList.get(i2)));
                i = i2 + 1;
            }
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    /* renamed from: a */
    public final void mo13713a(List list) {
        hsx.m3410a(this.f24689a, ion.m4021b(list));
    }

    /* renamed from: b */
    public final iwl mo13715b() {
        CameraDevice device = this.f24689a.getDevice();
        itt itt = new itt();
        return new itn(device);
    }

    /* renamed from: c */
    public final Surface mo13716c() {
        return this.f24689a.getInputSurface();
    }

    /* renamed from: b */
    public final int mo13714b(List list, iwh iwh, Handler handler) {
        try {
            return this.f24689a.setRepeatingBurst(ion.m4021b(list), new itm(iwh), handler);
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }

    /* renamed from: d */
    public final void mo13717d() {
        try {
            this.f24689a.stopRepeating();
        } catch (Throwable e) {
            throw new iwf(e);
        }
    }
}

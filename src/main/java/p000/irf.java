package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: irf */
final class irf extends StateCallback {
    /* renamed from: a */
    private final iri f7712a;
    /* renamed from: b */
    private final String f7713b;

    irf(iri iri, String str) {
        this.f7712a = (iri) jri.m13404b((Object) iri);
        this.f7713b = (String) jri.m13404b((Object) str);
    }

    public final void onClosed(CameraDevice cameraDevice) {
        jri.m13404b((Object) cameraDevice);
        jri.m13395a(cameraDevice.getId().equals(this.f7713b));
        this.f7712a.mo8871a();
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        jri.m13404b((Object) cameraDevice);
        jri.m13395a(cameraDevice.getId().equals(this.f7713b));
        this.f7712a.mo8874b();
        cameraDevice.close();
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        jri.m13404b((Object) cameraDevice);
        jri.m13395a(cameraDevice.getId().equals(this.f7713b));
        this.f7712a.mo8872a(i);
        cameraDevice.close();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        jri.m13404b((Object) cameraDevice);
        jri.m13395a(cameraDevice.getId().equals(this.f7713b));
        iri iri = this.f7712a;
        itt itt = new itt();
        iri.mo8873a(new itn(cameraDevice));
    }
}

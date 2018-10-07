package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashMap;
import java.util.Map;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: iui */
final class iui {
    /* renamed from: a */
    private final Object f7835a = new Object();
    /* renamed from: b */
    private final Map f7836b = new HashMap();
    /* renamed from: c */
    private final CameraManager f7837c;
    /* renamed from: d */
    private final iuk f7838d;

    iui(CameraManager cameraManager, iuk iuk) {
        this.f7837c = cameraManager;
        this.f7838d = iuk;
    }

    /* renamed from: a */
    public final iun mo9053a(iur iur) {
        try {
            iun iun;
            synchronized (this.f7835a) {
                iun = (iun) this.f7836b.get(iur);
                if (iun == null) {
                    CameraCharacteristics cameraCharacteristics = this.f7837c.getCameraCharacteristics(iur.f7848b);
                    iuk iuk = this.f7838d;
                    ium ium = new ium(new iul(iur, cameraCharacteristics, iuk.f7839a, iuk.f7841c, iuk.f7842d), iuk.f7840b);
                    this.f7836b.put(iur, ium);
                    iun = ium;
                }
            }
            return iun;
        } catch (Throwable e) {
            throw new IllegalStateException("Unable to get camera characteristics.", e);
        }
    }
}

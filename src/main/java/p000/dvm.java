package p000;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.List;

/* compiled from: PG */
/* renamed from: dvm */
public final class dvm implements iwl {
    /* renamed from: a */
    private final iwl f24085a;

    public dvm(iwl iwl, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession) {
        jri.m13404b((Object) iwl);
        jri.m13404b((Object) cameraDeviceInstrumentationSession);
        this.f24085a = iwl;
    }

    public final void close() {
        this.f24085a.close();
    }

    /* renamed from: a */
    public final iwn mo13718a(int i) {
        return this.f24085a.mo13718a(i);
    }

    /* renamed from: a */
    public final void mo13721a(iwu iwu) {
        CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession = (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create();
        iwv f = iwu.mo9142f();
        f.f7890d = new dvn(iwu.mo9141e(), cameraCaptureSessionInstrumentationSession);
        this.f24085a.mo13721a(f.mo9143a());
    }

    /* renamed from: a */
    public final void mo13722a(List list, iwi iwi, Handler handler) {
        this.f24085a.mo13722a(list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }

    /* renamed from: b */
    public final void mo13725b(List list, iwi iwi, Handler handler) {
        this.f24085a.mo13725b(list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }

    /* renamed from: a */
    public final void mo13723a(List list, iwk iwk, Handler handler) {
        this.f24085a.mo13723a(list, iwk, handler);
    }

    /* renamed from: a */
    public final iwn mo13719a(iwp iwp) {
        return this.f24085a.mo13719a(iwp);
    }

    /* renamed from: a */
    public final void mo13720a(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        this.f24085a.mo13720a(inputConfiguration, list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }

    /* renamed from: b */
    public final void mo13724b(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler) {
        this.f24085a.mo13724b(inputConfiguration, list, new dvn(iwi, (CameraCaptureSessionInstrumentationSession) Instrumentation.instance().captureSession().create()), handler);
    }
}

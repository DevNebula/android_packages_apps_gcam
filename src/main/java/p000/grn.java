package p000;

import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: grn */
public final class grn implements eoc, eol {
    /* renamed from: f */
    public final void mo6365f() {
        Instrumentation instance = Instrumentation.instance();
        for (InstrumentationSession l : instance.cameraActivity().getSessionList()) {
            l.mo2700l();
        }
        for (InstrumentationSession l2 : instance.cameraDevice().getSessionList()) {
            l2.mo2700l();
        }
        for (InstrumentationSession l22 : instance.cameraChange().getSessionList()) {
            l22.mo2700l();
        }
        for (InstrumentationSession l222 : instance.captureSession().getSessionList()) {
            l222.mo2700l();
        }
        for (InstrumentationSession l2222 : instance.modeSwitch().getSessionList()) {
            l2222.mo2700l();
        }
        for (InstrumentationSession l22222 : instance.jankStats().getSessionList()) {
            l22222.mo2700l();
        }
        for (InstrumentationSession l222222 : instance.viewfinder().getSessionList()) {
            l222222.mo2700l();
        }
        for (InstrumentationSession l2222222 : instance.oneCamera().getSessionList()) {
            l2222222.mo2700l();
        }
        for (InstrumentationSession l22222222 : instance.burstStats().getSessionList()) {
            l22222222.mo2700l();
        }
    }
}

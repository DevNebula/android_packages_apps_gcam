package p000;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;

/* compiled from: PG */
/* renamed from: dvl */
final class dvl implements iwh {
    /* renamed from: a */
    private final iwh f16861a;
    /* renamed from: b */
    private final CameraCaptureSessionInstrumentationSession f16862b;

    dvl(iwh iwh, CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession) {
        this.f16861a = iwh;
        this.f16862b = cameraCaptureSessionInstrumentationSession;
    }

    /* renamed from: a */
    public final void mo9122a(iwo iwo, Surface surface, long j) {
        this.f16861a.mo9122a(iwo, surface, j);
    }

    /* renamed from: a */
    public final void mo9124a(iwo iwo, iwp iwp) {
        CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession = this.f16862b;
        int i = cameraCaptureSessionInstrumentationSession.f12862a;
        iya iya;
        if (i == 0) {
            iya = cameraCaptureSessionInstrumentationSession.f2599m;
            cameraCaptureSessionInstrumentationSession.f12865d = SystemClock.elapsedRealtimeNanos();
            epf a = epf.m1992a();
            if (a.f4233d == 0) {
                a.f4233d = SystemClock.elapsedRealtimeNanos();
            }
            CameraActivitySession cameraActivitySession = (CameraActivitySession) Instrumentation.instance().cameraActivity().getCurrentSession();
            long j = cameraCaptureSessionInstrumentationSession.f12865d;
            if (cameraActivitySession.f12856g == 0) {
                cameraActivitySession.f12856g = j;
            }
            cameraCaptureSessionInstrumentationSession.mo2699a("First capture request sent", cameraCaptureSessionInstrumentationSession.f12864c, "first capture result received", j);
            cameraCaptureSessionInstrumentationSession.f12862a = 1;
        } else if (i == 1) {
            iya = cameraCaptureSessionInstrumentationSession.f2599m;
            cameraCaptureSessionInstrumentationSession.f12866e = SystemClock.elapsedRealtimeNanos();
            cameraCaptureSessionInstrumentationSession.mo2699a("first capture result received", cameraCaptureSessionInstrumentationSession.f12865d, "second capture result received", cameraCaptureSessionInstrumentationSession.f12866e);
            cameraCaptureSessionInstrumentationSession.f12862a = 2;
        }
        this.f16861a.mo9124a(iwo, iwp);
    }

    /* renamed from: a */
    public final void mo9123a(iwo iwo, iwm iwm) {
        this.f16861a.mo9123a(iwo, iwm);
    }

    /* renamed from: b */
    public final void mo9125b(iwo iwo, iwp iwp) {
        this.f16861a.mo9125b(iwo, iwp);
    }

    /* renamed from: a */
    public final void mo9119a(int i) {
        this.f16861a.mo9119a(i);
    }

    /* renamed from: a */
    public final void mo9120a(int i, long j) {
        this.f16861a.mo9120a(i, j);
    }

    /* renamed from: a */
    public final void mo9121a(iwo iwo, long j, long j2) {
        this.f16861a.mo9121a(iwo, j, j2);
    }
}

package p000;

import android.os.SystemClock;
import android.view.Surface;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: dvn */
public final class dvn implements iwi {
    /* renamed from: a */
    private final iwi f16863a;
    /* renamed from: b */
    private final CameraCaptureSessionInstrumentationSession f16864b;

    protected dvn(iwi iwi, CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession) {
        this.f16863a = iwi;
        this.f16864b = cameraCaptureSessionInstrumentationSession;
    }

    /* renamed from: a */
    public final void mo9126a(iwg iwg) {
        this.f16863a.mo9126a(new dvk(iwg, this.f16864b));
    }

    /* renamed from: b */
    public final void mo9128b(iwg iwg) {
        this.f16863a.mo9128b(new dvk(iwg, this.f16864b));
    }

    /* renamed from: c */
    public final void mo9129c(iwg iwg) {
        this.f16863a.mo9129c(new dvk(iwg, this.f16864b));
    }

    /* renamed from: d */
    public final void mo9130d(iwg iwg) {
        InstrumentationSession instrumentationSession = this.f16864b;
        iya iya = instrumentationSession.f2599m;
        instrumentationSession.f12863b = SystemClock.elapsedRealtimeNanos();
        instrumentationSession.mo2698a("Create", instrumentationSession.f2597k, instrumentationSession.f12863b);
        this.f16863a.mo9130d(new dvk(iwg, this.f16864b));
    }

    /* renamed from: e */
    public final void mo9131e(iwg iwg) {
        this.f16863a.mo9131e(new dvk(iwg, this.f16864b));
    }

    /* renamed from: a */
    public final void mo9127a(iwg iwg, Surface surface) {
        this.f16863a.mo9127a(new dvk(iwg, this.f16864b), surface);
    }
}

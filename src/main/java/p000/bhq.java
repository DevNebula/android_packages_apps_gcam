package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bhq */
final class bhq implements iwi {
    /* renamed from: a */
    private final /* synthetic */ kpw f11398a;

    bhq(kpw kpw) {
        this.f11398a = kpw;
    }

    /* renamed from: a */
    public final void mo9126a(iwg iwg) {
        bli.m888a(bho.f11395a, "onActive");
    }

    /* renamed from: b */
    public final void mo9128b(iwg iwg) {
        bli.m888a(bho.f11395a, "onClosed");
    }

    /* renamed from: c */
    public final void mo9129c(iwg iwg) {
        bli.m891b(bho.f11395a, "onConfigureFailed");
        this.f11398a.mo15642a(new isr("CameraCaptureSession.onConfigureFailed"));
    }

    /* renamed from: d */
    public final void mo9130d(iwg iwg) {
        this.f11398a.mo15641a(new bhj(iwg));
        bli.m888a(bho.f11395a, "onConfigured");
    }

    /* renamed from: e */
    public final void mo9131e(iwg iwg) {
        bli.m888a(bho.f11395a, "onReady");
    }

    /* renamed from: a */
    public final void mo9127a(iwg iwg, Surface surface) {
        bli.m888a(bho.f11395a, "onSurfacePrepared");
    }
}

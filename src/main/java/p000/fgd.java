package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgd */
public final class fgd implements kwk {
    /* renamed from: a */
    private final kwk f18236a;

    private fgd(kwk kwk) {
        this.f18236a = kwk;
    }

    /* renamed from: a */
    public static fgd m10496a(kwk kwk) {
        return new fgd(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, ((fbr) this.f18236a.mo10566a()).f4692b), "Cannot return null from a non-@Nullable @Provides method");
    }
}

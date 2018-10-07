package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fge */
public final class fge implements kwk {
    /* renamed from: a */
    private final kwk f18237a;

    private fge(kwk kwk) {
        this.f18237a = kwk;
    }

    /* renamed from: a */
    public static fge m10498a(kwk kwk) {
        return new fge(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AE_MODE, (fgp) this.f18237a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

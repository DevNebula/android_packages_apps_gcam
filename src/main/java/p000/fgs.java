package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgs */
public final class fgs implements kwk {
    /* renamed from: a */
    private final kwk f18260a;

    private fgs(kwk kwk) {
        this.f18260a = kwk;
    }

    /* renamed from: a */
    public static fgs m10520a(kwk kwk) {
        return new fgs(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AE_LOCK, ((fbr) this.f18260a.mo10566a()).f4691a), "Cannot return null from a non-@Nullable @Provides method");
    }
}

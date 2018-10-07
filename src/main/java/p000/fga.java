package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fga */
public final class fga implements kwk {
    /* renamed from: a */
    private final kwk f18233a;

    private fga(kwk kwk) {
        this.f18233a = kwk;
    }

    /* renamed from: a */
    public static fga m10491a(kwk kwk) {
        return new fga(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_MODE, (fgl) this.f18233a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

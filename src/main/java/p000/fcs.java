package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fcs */
public final class fcs implements kwk {
    /* renamed from: a */
    private final kwk f18129a;

    private fcs(kwk kwk) {
        this.f18129a = kwk;
    }

    /* renamed from: a */
    public static fcs m10376a(kwk kwk) {
        return new fcs(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AE_REGIONS, (fbu) this.f18129a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

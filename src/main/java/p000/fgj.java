package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgj */
public final class fgj implements kwk {
    /* renamed from: a */
    private final kwk f18242a;

    private fgj(kwk kwk) {
        this.f18242a = kwk;
    }

    /* renamed from: a */
    public static fgj m10507a(kwk kwk) {
        return new fgj(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, (fgy) this.f18242a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

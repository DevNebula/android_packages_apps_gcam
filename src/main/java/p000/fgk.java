package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgk */
public final class fgk implements kwk {
    /* renamed from: a */
    private final kwk f18243a;

    private fgk(kwk kwk) {
        this.f18243a = kwk;
    }

    /* renamed from: a */
    public static fgk m10509a(kwk kwk) {
        return new fgk(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AWB_MODE, ((fer) this.f18243a.mo10566a()).f26345a), "Cannot return null from a non-@Nullable @Provides method");
    }
}

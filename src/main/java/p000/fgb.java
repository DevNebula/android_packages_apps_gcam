package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgb */
public final class fgb implements kwk {
    /* renamed from: a */
    private final kwk f18234a;

    private fgb(kwk kwk) {
        this.f18234a = kwk;
    }

    /* renamed from: a */
    public static fgb m10493a(kwk kwk) {
        return new fgb(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_SCENE_MODE, (fgn) this.f18234a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

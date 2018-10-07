package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fgh */
public final class fgh implements kwk {
    /* renamed from: a */
    private final kwk f18240a;

    private fgh(kwk kwk) {
        this.f18240a = kwk;
    }

    /* renamed from: a */
    public static fgh m10503a(kwk kwk) {
        return new fgh(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.JPEG_ORIENTATION, ((axm) this.f18240a.mo10566a()).mo1837b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

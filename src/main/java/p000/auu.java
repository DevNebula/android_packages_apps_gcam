package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: auu */
public final class auu implements kwk {
    /* renamed from: a */
    private final kwk f10828a;

    private auu(kwk kwk) {
        this.f10828a = kwk;
    }

    /* renamed from: a */
    public static auu m7102a(kwk kwk) {
        return new auu(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AF_REGIONS, (fch) this.f10828a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

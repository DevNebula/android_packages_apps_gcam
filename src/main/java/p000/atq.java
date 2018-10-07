package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: atq */
public final class atq implements kwk {
    /* renamed from: a */
    private final kwk f10731a;

    private atq(kwk kwk) {
        this.f10731a = kwk;
    }

    /* renamed from: a */
    public static atq m7054a(kwk kwk) {
        return new atq(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AF_REGIONS, (fch) this.f10731a.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

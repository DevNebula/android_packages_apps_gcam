package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fdi */
public final class fdi implements kwk {
    /* renamed from: a */
    private final kwk f18144a;

    private fdi(kwk kwk) {
        this.f18144a = kwk;
    }

    /* renamed from: a */
    public static fdi m10400a(kwk kwk) {
        return new fdi(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(fds.m10423a(CaptureRequest.CONTROL_AF_MODE, ilq.m3875a((ilb) this.f18144a.mo10566a(), new fcq())), "Cannot return null from a non-@Nullable @Provides method");
    }
}

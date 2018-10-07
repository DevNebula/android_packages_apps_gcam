package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dsr */
public final class dsr implements kaw {
    /* renamed from: a */
    private final /* synthetic */ fis f16635a;

    public dsr(fis fis) {
        this.f16635a = fis;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        ffw ffw = (ffw) obj;
        r0 = new fis[3];
        r0[1] = fds.m10417a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(1))}));
        r0[2] = this.f16635a;
        return ffw.mo15526a(r0);
    }
}

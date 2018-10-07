package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dso */
final class dso implements kaw {
    /* renamed from: a */
    private final /* synthetic */ boolean f16623a;
    /* renamed from: b */
    private final /* synthetic */ dsn f16624b;

    dso(dsn dsn, boolean z) {
        this.f16624b = dsn;
        this.f16623a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        ffw ffw = (ffw) obj;
        fis[] fisArr = new fis[1];
        fisArr[0] = fds.m10417a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(2))}));
        ffw a = ffw.mo15526a(fisArr);
        if (this.f16623a && !this.f16624b.f3478a.mo13237v_()) {
            return a;
        }
        int i;
        if (this.f16623a) {
            i = 5;
        } else {
            i = 3;
        }
        fis[] fisArr2 = new fis[1];
        fisArr2[0] = fds.m10417a(Arrays.asList(new fin[]{new fin(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(i))}));
        return a.mo15526a(fisArr2);
    }
}

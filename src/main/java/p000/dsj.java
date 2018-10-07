package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dsj */
public final class dsj {
    /* renamed from: a */
    private final drl f3473a;

    public dsj(drl drl) {
        this.f3473a = drl;
    }

    /* renamed from: a */
    public final fwl mo6052a() {
        fis[] fisArr = new fis[2];
        fisArr[0] = fds.m10412a(5);
        r1 = new fin[6];
        Key key = CaptureRequest.CONTROL_AE_LOCK;
        Boolean valueOf = Boolean.valueOf(true);
        r1[3] = new fin(key, valueOf);
        r1[4] = new fin(CaptureRequest.CONTROL_AWB_LOCK, valueOf);
        r1[5] = new fin(CaptureRequest.CONTROL_CAPTURE_INTENT, Integer.valueOf(1));
        fisArr[1] = fds.m10417a(Arrays.asList(r1));
        fis a = fds.m10418a(fisArr);
        fdh fdh = fdh.ANY;
        fdg c = new fdg(fdh, fdh, fdh).mo6755a(fdh.LOCKED).mo6757c(fdh.LOCKED);
        drl drl = this.f3473a;
        return new dsw(new drs(drl.f3432a, drl.f3433b, drl.f3439h, drl.f3434c, drl.f3435d, drl.f3436e, kny.m18475a(drl.f3436e, new drm(a), kpq.f8776a), c, drl.f3437f, drl.f3438g, drl.f3440i, 3), 2, false);
    }
}

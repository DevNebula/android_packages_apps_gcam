package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: fdj */
public final class fdj implements fde {
    /* renamed from: a */
    private final fde f18145a;

    public fdj(fde fde) {
        this.f18145a = fde;
    }

    /* renamed from: a */
    public final fdf mo6751a(fip fip, fdg fdg, fim fim) {
        Integer num;
        for (fin fin : fim.f4796b) {
            if (fin.f4800a.equals(CaptureRequest.CONTROL_AF_MODE)) {
                num = (Integer) fin.f4801b;
                break;
            }
        }
        num = null;
        if (num == null || !num.equals(Integer.valueOf(1))) {
            return this.f18145a.mo6751a(fip, fdg, fim);
        }
        int equals;
        fdg a;
        fdg b = fdg.mo6756b(fdh.ANY);
        for (fin fin2 : fim.f4796b) {
            if (fin2.f4800a.equals(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
                equals = fin2.f4801b.equals(Integer.valueOf(0)) ^ 1;
                break;
            }
        }
        equals = 0;
        if (equals != 0) {
            a = b.mo6755a(fdh.ANY);
        } else {
            a = b;
        }
        return new fdk(this.f18145a.mo6751a(fip, a, fim), num);
    }
}

package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: dru */
public final class dru {
    /* renamed from: a */
    private final ffc f3447a;
    /* renamed from: b */
    private final fjd f3448b;

    dru(ffc ffc, fjd fjd) {
        this.f3447a = ffc;
        this.f3448b = fjd;
    }

    /* renamed from: a */
    public final fjs mo6048a(long j) {
        fjr fjr;
        fiw fjp = new fjp(j);
        this.f3448b.mo14892a(fjp);
        fjs[] fjsArr = new fjs[2];
        fjsArr[0] = fjp;
        if (this.f3447a.mo9080s()) {
            fjr = new fjr(CaptureResult.CONTROL_AF_STATE, keu.m13730a(Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(2), Integer.valueOf(6)));
        } else {
            fjr = new fjq();
        }
        fjsArr[1] = fjr;
        return new fjo(fjsArr);
    }
}

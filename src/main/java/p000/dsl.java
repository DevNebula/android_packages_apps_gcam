package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dsl */
public final class dsl {
    /* renamed from: a */
    private static final long f3474a = 1000000000;
    /* renamed from: b */
    private final dru f3475b;
    /* renamed from: c */
    private final dro f3476c;
    /* renamed from: d */
    private final ffc f3477d;

    dsl(dru dru, dro dro, ffc ffc) {
        this.f3475b = dru;
        this.f3476c = dro;
        this.f3477d = ffc;
    }

    /* renamed from: a */
    public final fwl mo6053a(fwl fwl) {
        Set a;
        Key key = CaptureResult.EDGE_MODE;
        Integer valueOf = Integer.valueOf(3);
        Key key2 = CaptureResult.NOISE_REDUCTION_MODE;
        Integer valueOf2 = Integer.valueOf(4);
        dty dtw = new dtw(kes.m4867b(key, valueOf, key2, valueOf2));
        fdh fdh = fdh.ANY;
        fdg fdg = new fdg(fdh, fdh, fdh);
        if (this.f3477d.mo9080s()) {
            fdg = fdg.mo6756b(fdh.LOCKED);
        }
        dty dtv = new dtv(new dts(dtw, fdg), kgn.f24941a);
        if (hsy.f6966a != null) {
            fin fin = new fin(CaptureRequest.EDGE_MODE, valueOf);
            fin fin2 = new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf2);
            CaptureRequest.Key key3 = CaptureRequest.FLASH_MODE;
            valueOf2 = Integer.valueOf(0);
            a = keu.m13730a(fin, fin2, new fin(key3, valueOf2), new fin(hsy.f6966a, valueOf2));
        } else {
            a = keu.m13729a(new fin(CaptureRequest.EDGE_MODE, valueOf), new fin(CaptureRequest.NOISE_REDUCTION_MODE, valueOf2), new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0)));
        }
        dro dro = this.f3476c;
        fjs a2 = this.f3475b.mo6048a(f3474a);
        long j = f3474a;
        return new dsw(new dtx(dro.f3442b, dro.f3441a, dro.f3443c.mo6779a(3, new fju(a2, new fjt())), dro.f3445e, fwl, dtv, dro.f3446f, 1, 3, j, a, dro.f3444d), 3, false);
    }
}

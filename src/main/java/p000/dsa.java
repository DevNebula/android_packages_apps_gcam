package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dsa */
public final class dsa {
    /* renamed from: a */
    private final ira f3450a;
    /* renamed from: b */
    private final dqo f3451b;
    /* renamed from: c */
    private final fgr f3452c;
    /* renamed from: d */
    private final ffc f3453d;
    /* renamed from: e */
    private final bym f3454e;
    /* renamed from: f */
    private final cdo f3455f;
    /* renamed from: g */
    private final ird f3456g;
    /* renamed from: h */
    private final ccy f3457h;
    /* renamed from: i */
    private final bzt f3458i;
    /* renamed from: j */
    private final grk f3459j;
    /* renamed from: k */
    private final hjf f3460k;
    /* renamed from: l */
    private final int f3461l;

    dsa(ira ira, ird ird, dtt dtt, fgr fgr, ffc ffc, bym bym, cdo cdo, ccy ccy, bzt bzt, grk grk, hjf hjf, int i) {
        this.f3450a = ira;
        this.f3456g = ird;
        this.f3451b = dtt;
        this.f3452c = fgr;
        this.f3453d = ffc;
        this.f3454e = bym;
        this.f3455f = cdo;
        this.f3457h = ccy;
        this.f3458i = bzt;
        this.f3459j = grk;
        this.f3460k = hjf;
        this.f3461l = i;
    }

    /* renamed from: a */
    public final fwl mo6050a(bxg bxg, fwl fwl, ffr ffr) {
        Set a;
        fdh fdh = fdh.ANY;
        dty dts = new dts(new fdg(fdh, fdh, fdh));
        hjf hjf = this.f3460k;
        ivy ivy = hjf.f6633b;
        if (!(ivy.f7875e || ivy.f7874d || hjf.mo7905c() || this.f3460k.mo7906d()) || hsy.f6966a == null) {
            a = keu.m13728a(new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0)), new fin(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1)));
        } else {
            fin fin = new fin(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
            Key key = CaptureRequest.CONTROL_AE_MODE;
            Integer valueOf = Integer.valueOf(1);
            a = keu.m13729a(fin, new fin(key, valueOf), new fin(hsy.f6966a, valueOf));
        }
        return new dsw(new dry(this.f3450a, this.f3456g, ffr, this.f3451b, fwl, dts, this.f3452c, bxg, ffr.f4767a, a, this.f3453d, this.f3454e, this.f3455f, this.f3457h, this.f3458i, this.f3459j, this.f3461l), 6, false);
    }
}

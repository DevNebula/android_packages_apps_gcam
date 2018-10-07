package p000;

import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgx */
public final class bgx implements bgw {
    /* renamed from: a */
    public static final String f11345a = bli.m887a("AFreqSendImp");
    /* renamed from: b */
    public final bhu f11346b;
    /* renamed from: c */
    public kpk f11347c;
    /* renamed from: d */
    private final bhr f11348d;
    /* renamed from: e */
    private final ijx f11349e;
    /* renamed from: f */
    private final ffc f11350f;
    /* renamed from: g */
    private final fdy f11351g;
    /* renamed from: h */
    private final iqt f11352h;
    /* renamed from: i */
    private final iqt f11353i;
    /* renamed from: j */
    private final ilp f11354j;

    public bgx(bhr bhr, bhu bhu, ijx ijx, ffc ffc, fdy fdy, iqt iqt, iqt iqt2, ilp ilp) {
        this.f11348d = bhr;
        this.f11346b = bhu;
        this.f11349e = ijx;
        this.f11350f = ffc;
        this.f11351g = fdy;
        this.f11352h = iqt;
        this.f11353i = iqt2;
        this.f11354j = ilp;
    }

    /* renamed from: a */
    private final iwn m7448a(bhj bhj, boolean z, List list) {
        iwn b;
        if (z) {
            b = this.f11348d.mo1956b(bhj);
        } else {
            b = this.f11348d.mo1954a(bhj);
        }
        for (Surface a : list) {
            b.mo9135a(a);
        }
        b.mo9134a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
        b.mo9134a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
        return b;
    }

    /* renamed from: a */
    public final kpk mo1946a(bhj bhj, bhs bhs, boolean z, PointF pointF, List list) {
        atz a = atz.m7074a(pointF, pointF, this.f11350f.mo9076o(), this.f11351g);
        this.f11352h.mo8826a(a);
        this.f11353i.mo8826a(a);
        kpk kpk = this.f11347c;
        if (kpk != null) {
            kpk.cancel(true);
        }
        fcb fcb = new fcb();
        fcp fcp = new fcp();
        kpk = iel.m3775a(fcb.f24235a, fcp.f24241b, new bgy(bhs.mo12380a(new bgs(fcb, fcp))));
        kpk d = kpw.m18486d();
        this.f11347c = d;
        kow.m13878a(kpk, new bgz(this, d), kpq.f8776a);
        try {
            iwn a2 = m7448a(bhj, z, list);
            iwn a3 = m7448a(bhj, z, list);
            a3.mo9134a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f11349e.execute(new bha(this, list, d, bhj, a2, bhs, a3));
            kny.m18475a(fcb.f24235a, new bhb(this, a2, bhj, bhs, d), this.f11349e);
            return d;
        } catch (Throwable e) {
            return kow.m13874a(e);
        }
    }
}

package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fdl */
public final class fdl {
    /* renamed from: a */
    public final Object f4713a = new Object();
    /* renamed from: b */
    public boolean f4714b;
    /* renamed from: c */
    public long f4715c;
    /* renamed from: d */
    public kpw f4716d;
    /* renamed from: e */
    public final fiw f4717e = new fdm(this);
    /* renamed from: f */
    public final fiw f4718f = new fdn(this);

    /* renamed from: a */
    static /* synthetic */ void m2309a(fdl fdl, iwp iwp) {
        knk knk;
        synchronized (fdl.f4713a) {
            long b = iwp.mo13731b() - fdl.f4715c;
            if (fcp.f24240a.contains((Integer) iwp.mo13730a(CaptureResult.CONTROL_AF_STATE)) || b >= 120) {
                fdl.f4714b = false;
                knk = fdl.f4716d;
            } else {
                knk = null;
            }
        }
        if (knk != null) {
            knk.mo15641a(Long.valueOf(iwp.mo13731b()));
        }
    }

    /* renamed from: a */
    public final kpk mo6759a() {
        kpk kpk;
        synchronized (this.f4713a) {
            kpk = this.f4716d;
        }
        return kpk;
    }
}

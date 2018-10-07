package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ckt */
public final class ckt implements chu {
    /* renamed from: a */
    public final AtomicReference f12669a = new AtomicReference(chw.ABSENT);
    /* renamed from: b */
    private final chu f12670b;

    public ckt(chu chu) {
        jri.m13404b((Object) chu);
        this.f12670b = chu;
    }

    /* renamed from: a */
    public final Surface mo2298a() {
        return this.f12670b.mo2298a();
    }

    /* renamed from: a */
    public final void mo2301a(SurfaceTexture surfaceTexture, List list, fyy fyy) {
        this.f12670b.mo2301a(surfaceTexture, list, fyy);
    }

    /* renamed from: b */
    public final ilp mo2303b() {
        return this.f12670b.mo2303b();
    }

    /* renamed from: c */
    public final void mo2304c() {
        this.f12670b.mo2304c();
        this.f12669a.set(chw.ABSENT);
    }

    /* renamed from: a */
    public final void mo2302a(chv chv) {
        this.f12670b.mo2302a(chv);
    }

    /* renamed from: a */
    public final kpk mo2300a(chw chw, gks gks, gln gln, iqm iqm, iut iut, int i, bcy bcy, cjo cjo, iqp iqp) {
        jri.m13404b((Object) chw);
        if (!this.f12669a.compareAndSet(chw.ABSENT, chw)) {
            return kow.m13873a(Boolean.FALSE);
        }
        kpk a = this.f12670b.mo2300a(chw, gks, gln, iqm, iut, i, bcy, cjo, iqp);
        kow.m13878a(a, new cku(this), kpq.f8776a);
        return a;
    }

    /* renamed from: a */
    public final kpk mo2299a(chw chw) {
        jri.m13404b((Object) chw);
        if (!chw.equals(this.f12669a.get()) && !chw.equals(chw.FORCE_STOP)) {
            return kow.m13873a(Boolean.FALSE);
        }
        kpk a = this.f12670b.mo2299a(chw);
        kow.m13878a(a, new ckv(this), kpq.f8776a);
        return a;
    }
}

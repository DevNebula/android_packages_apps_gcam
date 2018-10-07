package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: cii */
final class cii implements kov {
    /* renamed from: a */
    private final /* synthetic */ cig f12579a;

    cii(cig cig) {
        this.f12579a = cig;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        cig cig = this.f12579a;
        cjo cjo = (cjo) cig.f2224f.get();
        bli.m892b(cig.f2211a, "Exception while running the burst", th);
        gqw gqw = cig.f2239u;
        if (gqw.f6009b != null) {
            gqw.mo7360b();
        } else {
            gqw.f6009b = new klu();
            klu klu = gqw.f6009b;
            klu.f25297a = false;
            klu.f25300d = true;
            gqw.mo7358a();
        }
        new Handler(cig.f2220b.getMainLooper()).post(new cim(cjo));
        gkr gkr = (gkr) cig.f2233o.getAndSet(null);
        if (gkr != null) {
            gkr.mo13360a();
        }
        cig.mo2328a();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        gqw gqw = this.f12579a.f2239u;
        if (gqw.f6009b != null) {
            gqw.mo7360b();
            return;
        }
        gqw.f6009b = new klu();
        gqw.f6009b.f25297a = true;
    }
}

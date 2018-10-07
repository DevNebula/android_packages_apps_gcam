package p000;

import android.os.Handler;
import com.google.android.apps.camera.stats.BurstSessionStatistics;

@Deprecated
/* compiled from: PG */
/* renamed from: cjn */
public final class cjn {
    /* renamed from: a */
    public final /* synthetic */ cig f2262a;
    /* renamed from: b */
    private final /* synthetic */ cjo f2263b;

    cjn(cig cig, cjo cjo) {
        this.f2262a = cig;
        this.f2263b = cjo;
    }

    /* renamed from: a */
    public final void mo2338a(Exception exception) {
        this.f2262a.f2232n.close();
        this.f2262a.f2231m.mo15641a(null);
        cig cig = this.f2262a;
        cjo cjo = this.f2263b;
        bli.m892b(cig.f2211a, "Exception while running the burst", exception);
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

    /* renamed from: a */
    public final void mo2337a() {
        ((BurstSessionStatistics) this.f2262a.f2237s.burstStats().getCurrentSession()).mo12606h();
        bli.m896d(cig.f2211a, "onBurstPreviewAvailable");
        this.f2262a.f2231m.mo15641a(null);
    }
}

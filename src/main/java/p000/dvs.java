package p000;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: dvs */
public final class dvs implements dvp {
    /* renamed from: a */
    private final ViewfinderJankSession f16871a;
    /* renamed from: b */
    private double f16872b = 33.0d;

    dvs(ViewfinderJankSession viewfinderJankSession) {
        this.f16871a = viewfinderJankSession;
    }

    /* renamed from: a */
    public final void mo6083a(iwp iwp, double d, double d2) {
        double d3 = this.f16872b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 0.5d) {
                ViewfinderJankSession viewfinderJankSession = this.f16871a;
                synchronized (viewfinderJankSession.f12879a) {
                    if (d4 >= 0.5d) {
                        viewfinderJankSession.f12882d++;
                    }
                    if (d4 >= 1.5d) {
                        viewfinderJankSession.f12883e++;
                    }
                    if (d4 >= 5.0d) {
                        viewfinderJankSession.f12884f++;
                    }
                    if (d4 >= 1.5d) {
                        kke a = ViewfinderJankSession.m8542a(iwp, d, d3);
                        viewfinderJankSession.f12881c.add(a);
                        viewfinderJankSession.mo12638a(a);
                    }
                }
            }
        }
        if (d > 33.0d) {
            d3 = this.f16872b;
            if (d > d3) {
                this.f16872b = ((d3 * 10.0d) + d) / 11.0d;
            } else {
                this.f16872b = d;
            }
        }
    }
}

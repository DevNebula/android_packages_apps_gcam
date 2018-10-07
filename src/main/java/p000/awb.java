package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: awb */
final class awb implements kaw {
    /* renamed from: a */
    private final /* synthetic */ avy f10920a;

    awb(avy avy) {
        this.f10920a = avy;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        gvd gvd = (gvd) obj;
        PointF pointF = new PointF(gvd.mo7466c().centerX(), gvd.mo7466c().centerY());
        if (gvd.mo7465b()) {
            return this.f10920a.f10908c.mo6764b(pointF);
        }
        return pointF;
    }
}

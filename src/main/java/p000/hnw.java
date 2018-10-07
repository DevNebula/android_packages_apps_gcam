package p000;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: hnw */
final class hnw extends SimpleOnScaleGestureListener {
    /* renamed from: a */
    private final /* synthetic */ hnu f6772a;

    hnw(hnu hnu) {
        this.f6772a = hnu;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        hnq hnq = this.f6772a.f6758i;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        bli.m888a(hhs.f20133a, "ScaleListener zoomUi onScale");
        hnq.f6749a.mo7997a(scaleFactor);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        hnu hnu = this.f6772a;
        hnu.f6763n = true;
        hnq hnq = hnu.f6758i;
        bli.m888a(hhs.f20133a, "ScaleListener zoomUi onScaleBegin");
        hnq.f6749a.mo8008g();
        this.f6772a.f6756g.mo7973c();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        hnq hnq = this.f6772a.f6758i;
        bli.m888a(hhs.f20133a, "ScaleListener zoomUi onScaleEnd");
        hnq.f6749a.mo8009h();
    }
}

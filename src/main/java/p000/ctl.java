package p000;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: ctl */
final class ctl extends SimpleOnScaleGestureListener {
    /* renamed from: a */
    private final /* synthetic */ cti f2903a;

    ctl(cti cti) {
        this.f2903a = cti;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        cth cth = this.f2903a.f13248a;
        return cth != null ? cth.mo5773a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getScaleFactor()) : false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        cth cth = this.f2903a.f13248a;
        return cth != null ? cth.mo5780e(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) : false;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        cth cth = this.f2903a.f13248a;
        if (cth != null) {
            cth.mo5771a();
        }
    }
}

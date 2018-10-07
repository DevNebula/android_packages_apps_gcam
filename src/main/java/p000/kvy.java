package p000;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: kvy */
final class kvy extends SimpleOnScaleGestureListener {
    /* renamed from: a */
    private final /* synthetic */ kvr f9087a;

    kvy(kvr kvr) {
        this.f9087a = kvr;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f9087a.m5522a((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f9087a.f9044c = C0252go.f5915ch;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        boolean z;
        super.onScaleEnd(scaleGestureDetector);
        this.f9087a.f9044c = C0252go.f5913cf;
        kvr kvr = this.f9087a;
        float f = kvr.f9042a;
        float f2 = kvr.f9046e;
        if (f > f2) {
            z = true;
        } else {
            f2 = kvr.f9045d;
            if (f < f2) {
                z = true;
            } else {
                z = false;
                f2 = f;
            }
        }
        if (z) {
            this.f9087a.postOnAnimation(new kvu(kvr, f2, (float) (kvr.f9050i / 2), (float) (kvr.f9051j / 2), true));
        }
    }
}

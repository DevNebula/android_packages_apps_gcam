package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: ctj */
final class ctj extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ cti f2901a;

    ctj(cti cti) {
        this.f2901a = cti;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        cth cth = this.f2901a.f13248a;
        return (cth == null || motionEvent == null) ? false : cth.mo5776b(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        cth cth = this.f2901a.f13248a;
        return cth != null ? cth.mo5778c(f, f2) : false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        cth cth = this.f2901a.f13248a;
        if (cth != null && motionEvent != null) {
            cth.mo5779d(motionEvent.getX(), motionEvent.getY());
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        cth cth = this.f2901a.f13248a;
        if (cth == null || motionEvent == null || motionEvent2 == null) {
            return false;
        }
        return cth.mo5774a(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY(), f, f2, motionEvent2.getPointerCount(), motionEvent2.getEventTime());
    }
}

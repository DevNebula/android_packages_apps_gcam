package p000;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: ctk */
final class ctk implements OnDoubleTapListener {
    /* renamed from: a */
    private final /* synthetic */ cti f2902a;

    ctk(cti cti) {
        this.f2902a = cti;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        cth cth = this.f2902a.f13248a;
        return (cth == null || motionEvent == null) ? false : cth.mo5772a(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        cth cth = this.f2902a.f13248a;
        return (cth == null || motionEvent == null) ? false : cth.mo5781f(motionEvent.getX(), motionEvent.getY());
    }
}

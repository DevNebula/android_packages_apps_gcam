package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: kvw */
final class kvw extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ kvr f9084a;

    kvw(kvr kvr) {
        this.f9084a = kvr;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f9084a.f9044c != C0252go.f5913cf) {
            return false;
        }
        kvr kvr = this.f9084a;
        float f = kvr.f9042a;
        float f2 = kvr.f9045d;
        if (f == f2) {
            f2 = kvr.f9046e;
        }
        this.f9084a.postOnAnimation(new kvu(kvr, f2, motionEvent.getX(), motionEvent.getY(), false));
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        kvv kvv = this.f9084a.f9049h;
        if (kvv != null) {
            kvv.mo10550a();
        }
        kvr kvr = this.f9084a;
        kvr.f9049h = new kvv(kvr, (int) f, (int) f2);
        kvr = this.f9084a;
        kvr.postOnAnimation(kvr.f9049h);
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f9084a.performLongClick();
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.f9084a.performClick();
    }
}

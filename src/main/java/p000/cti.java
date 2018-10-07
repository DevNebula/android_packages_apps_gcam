package p000;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: cti */
public final class cti implements ctg {
    /* renamed from: a */
    public cth f13248a;
    /* renamed from: b */
    private final GestureDetector f13249b;
    /* renamed from: c */
    private final ScaleGestureDetector f13250c;
    /* renamed from: d */
    private final SimpleOnGestureListener f13251d = new ctj(this);
    /* renamed from: e */
    private final OnDoubleTapListener f13252e = new ctk(this);
    /* renamed from: f */
    private final SimpleOnScaleGestureListener f13253f = new ctl(this);

    static {
        bli.m887a("FilmstripGesture");
    }

    public cti(Context context) {
        jri.m13404b((Object) context);
        this.f13249b = new GestureDetector(context, this.f13251d, null, true);
        this.f13249b.setOnDoubleTapListener(this.f13252e);
        this.f13250c = new ScaleGestureDetector(context, this.f13253f);
        this.f13250c.setQuickScaleEnabled(false);
    }

    /* renamed from: a */
    public final boolean mo5770a(MotionEvent motionEvent) {
        jri.m13404b((Object) motionEvent);
        boolean onTouchEvent = this.f13249b.onTouchEvent(motionEvent);
        boolean onTouchEvent2 = this.f13250c.onTouchEvent(motionEvent);
        cth cth;
        if (motionEvent.getAction() == 1) {
            cth = this.f13248a;
            if (cth != null) {
                cth.mo5782g(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getAction() == 5) {
            cth = this.f13248a;
            if (cth != null) {
                cth.mo5775a(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerCount(), motionEvent.getEventTime());
            }
        } else if (motionEvent.getAction() == 6) {
            cth = this.f13248a;
            if (cth != null) {
                cth.mo5777b(motionEvent.getX(), motionEvent.getY(), motionEvent.getPointerCount(), motionEvent.getEventTime());
            }
        }
        return onTouchEvent | onTouchEvent2;
    }

    /* renamed from: a */
    public final void mo5769a(cth cth) {
        this.f13248a = cth;
    }
}

package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: sr */
final class C0482sr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0480sp f9737a;

    C0482sr(C0480sp c0480sp) {
        this.f9737a = c0480sp;
    }

    public final void run() {
        C0480sp c0480sp = this.f9737a;
        c0480sp.mo11106d();
        View view = c0480sp.f9727a;
        if (view.isEnabled() && !view.isLongClickable() && c0480sp.mo11104b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            c0480sp.f9728b = true;
        }
    }
}

package android.support.design.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import p000.C0177cw;
import p000.C0179cy;
import p000.C0181da;
import p000.C0183dc;

/* compiled from: PG */
public class BaseTransientBottomBar {

    /* compiled from: PG */
    public class Behavior extends SwipeDismissBehavior {
        /* renamed from: f */
        private final C0179cy f554f = new C0179cy(this);

        /* renamed from: a */
        public final boolean mo423a(View view) {
            return view instanceof C0181da;
        }

        /* renamed from: a */
        public final boolean mo422a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    if (coordinatorLayout.mo11689a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                        synchronized (C0183dc.m1622a().f3188a) {
                        }
                    }
                    break;
                case 1:
                case 3:
                    synchronized (C0183dc.m1622a().f3188a) {
                    }
            }
            return super.mo422a(coordinatorLayout, view, motionEvent);
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper(), new C0177cw());
    }

    /* renamed from: a */
    public static void m395a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public static void m396b() {
        throw new NoSuchMethodError();
    }
}

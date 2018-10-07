package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: li */
final class C0350li implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0710lh f9146a;

    C0350li(C0710lh c0710lh) {
        this.f9146a = c0710lh;
    }

    public final void run() {
        int i;
        View view;
        int i2;
        int i3 = 0;
        C0710lh c0710lh = this.f9146a;
        int i4 = c0710lh.f22035b.f9158h;
        int i5 = c0710lh.f22034a;
        if (i5 != 3) {
            i = 0;
        } else {
            boolean i6 = true;
        }
        int i7;
        if (i6 != 0) {
            View a = c0710lh.f22036c.mo10570a(3);
            if (a != null) {
                i7 = -a.getWidth();
            } else {
                i7 = 0;
            }
            i7 += i4;
            view = a;
            i2 = i7;
        } else {
            i7 = c0710lh.f22036c.getWidth() - i4;
            view = c0710lh.f22036c.mo10570a(5);
            i2 = i7;
        }
        if (view == null) {
            return;
        }
        if (((i6 != 0 && view.getLeft() < i2) || (i5 != 3 && view.getLeft() > i2)) && c0710lh.f22036c.mo10578b(view) == 0) {
            C0348le c0348le = (C0348le) view.getLayoutParams();
            c0710lh.f22035b.mo10623a(view, i2, view.getTop());
            c0348le.f9144c = true;
            c0710lh.f22036c.invalidate();
            c0710lh.mo14211b();
            C0345kz c0345kz = c0710lh.f22036c;
            if (!c0345kz.f9124g) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                i2 = c0345kz.getChildCount();
                while (i3 < i2) {
                    c0345kz.getChildAt(i3).dispatchTouchEvent(obtain);
                    i3++;
                }
                obtain.recycle();
                c0345kz.f9124g = true;
            }
        }
    }
}

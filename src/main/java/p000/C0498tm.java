package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: tm */
final class C0498tm implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ C0760tg f9790a;

    C0498tm(C0760tg c0760tg) {
        this.f9790a = c0760tg;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0760tg c0760tg;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.f9790a.f22326r;
            if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < this.f9790a.f22326r.getWidth() && y >= 0 && y < this.f9790a.f22326r.getHeight()) {
                c0760tg = this.f9790a;
                c0760tg.f22323o.postDelayed(c0760tg.f22322n, 250);
                return false;
            }
        }
        if (action == 1) {
            c0760tg = this.f9790a;
            c0760tg.f22323o.removeCallbacks(c0760tg.f22322n);
        }
        return false;
    }
}

package p000;

import android.content.Context;
import android.support.p002v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: ms */
final class C0718ms extends ContentFrameLayout {
    /* renamed from: i */
    private final /* synthetic */ C0713mg f22088i;

    public C0718ms(C0713mg c0713mg, Context context) {
        this.f22088i = c0713mg;
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f22088i.mo14218a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            boolean z;
            if (x < -5) {
                z = true;
            } else if (y < -5) {
                z = true;
            } else if (x > getWidth() + 5) {
                z = true;
            } else if (y <= getHeight() + 5) {
                x = 0;
            } else {
                z = true;
            }
            if (x != 0) {
                C0713mg c0713mg = this.f22088i;
                c0713mg.mo14216a(c0713mg.mo14222e(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0383nj.m5682b(getContext(), i));
    }
}

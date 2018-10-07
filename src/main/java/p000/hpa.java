package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: hpa */
final /* synthetic */ class hpa implements OnTouchListener {
    /* renamed from: a */
    private final hox f6788a;

    hpa(hox hox) {
        this.f6788a = hox;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        hox hox = this.f6788a;
        if (motionEvent.getAction() == 1) {
            hox.f20225b.mo14946am();
        }
        return false;
    }
}

package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* compiled from: PG */
/* renamed from: hmd */
public final class hmd implements OnTouchListener {
    /* renamed from: a */
    private final /* synthetic */ hlz f6727a;

    public hmd(hlz hlz) {
        this.f6727a = hlz;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f6727a.f6711b.mo13419Y();
        }
        return true;
    }
}

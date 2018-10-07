package p000;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: hbd */
public final class hbd extends SimpleOnGestureListener {
    /* renamed from: a */
    private final /* synthetic */ ShutterButton f6257a;

    public hbd(ShutterButton shutterButton) {
        this.f6257a = shutterButton;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (this.f6257a.buttonRect.contains(motionEvent.getX(), motionEvent.getY()) && this.f6257a.clickEnabled && this.f6257a.isLongPressInProgress.compareAndSet(false, true) && this.f6257a.listener != null) {
            this.f6257a.listener.onShutterButtonLongPressed();
        }
    }
}

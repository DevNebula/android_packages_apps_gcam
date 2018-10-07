package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;

/* renamed from: hbb */
public final /* synthetic */ class hbb implements AnimatorUpdateListener {
    /* renamed from: a */
    private final ShutterButton f6255a;

    public hbb(ShutterButton shutterButton) {
        this.f6255a = shutterButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6255a.lambda$runEnableChangeAnimation$0$ShutterButton(valueAnimator);
    }
}

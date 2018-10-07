package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hfd */
public final class hfd implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ CaptureAnimationOverlay f6506a;

    public hfd(CaptureAnimationOverlay captureAnimationOverlay) {
        this.f6506a = captureAnimationOverlay;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6506a.f2616c.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
        this.f6506a.invalidate();
    }
}

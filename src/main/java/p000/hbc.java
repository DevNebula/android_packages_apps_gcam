package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: hbc */
public final class hbc implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ ShutterButton f6256a;

    public hbc(ShutterButton shutterButton) {
        this.f6256a = shutterButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6256a.currentScaleFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6256a.updateButtonRect();
        this.f6256a.invalidateOutline();
        this.f6256a.invalidate();
    }
}

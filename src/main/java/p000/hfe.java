package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hfe */
public final class hfe extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ValueAnimator f6507a;
    /* renamed from: b */
    private final /* synthetic */ CaptureAnimationOverlay f6508b;

    public hfe(CaptureAnimationOverlay captureAnimationOverlay, ValueAnimator valueAnimator) {
        this.f6508b = captureAnimationOverlay;
        this.f6507a = valueAnimator;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6507a.start();
    }

    public final void onAnimationStart(Animator animator) {
        this.f6508b.f2614a = C0252go.f5900bt;
        this.f6508b.setVisibility(0);
    }
}

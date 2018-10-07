package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hff */
public final class hff extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ CaptureAnimationOverlay f6509a;

    public hff(CaptureAnimationOverlay captureAnimationOverlay) {
        this.f6509a = captureAnimationOverlay;
    }

    public final void onAnimationEnd(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.f6509a;
        captureAnimationOverlay.f2617d = null;
        captureAnimationOverlay.f2614a = C0252go.f5899bs;
        this.f6509a.setVisibility(4);
    }
}

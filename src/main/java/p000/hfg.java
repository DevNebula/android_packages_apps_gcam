package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p005ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hfg */
public final class hfg extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f6510a;
    /* renamed from: b */
    private final /* synthetic */ CaptureAnimationOverlay f6511b;

    public hfg(CaptureAnimationOverlay captureAnimationOverlay, boolean z) {
        this.f6511b = captureAnimationOverlay;
        this.f6510a = z;
    }

    public final void onAnimationCancel(Animator animator) {
        if (!this.f6510a) {
            this.f6511b.f2614a = C0252go.f5899bs;
            this.f6511b.setVisibility(4);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f6510a) {
            this.f6511b.f2614a = C0252go.f5899bs;
            this.f6511b.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f6510a) {
            this.f6511b.f2614a = C0252go.f5901bu;
            this.f6511b.setVisibility(0);
        }
    }
}

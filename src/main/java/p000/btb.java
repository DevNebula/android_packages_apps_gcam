package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btb */
public final class btb extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ FocusIndicatorView f1547a;

    public btb(FocusIndicatorView focusIndicatorView) {
        this.f1547a = focusIndicatorView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1547a.f23253m = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1547a.f23253m = animator;
    }
}

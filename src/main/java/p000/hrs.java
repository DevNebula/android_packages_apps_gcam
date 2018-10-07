package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* renamed from: hrs */
final class hrs implements AnimatorListener {
    /* renamed from: a */
    private boolean f6882a = false;
    /* renamed from: b */
    private final /* synthetic */ AnimatorSet f6883b;

    hrs(AnimatorSet animatorSet) {
        this.f6883b = animatorSet;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6882a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f6882a) {
            this.f6883b.start();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f6882a = false;
    }
}

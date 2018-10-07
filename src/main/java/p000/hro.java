package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: PG */
/* renamed from: hro */
final class hro implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ hrm f6878a;

    hro(hrm hrm) {
        this.f6878a = hrm;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        hrm hrm = this.f6878a;
        hrm.mo13560a(hrm.f20785a, -10.0f);
        animator.setStartDelay(0);
    }
}

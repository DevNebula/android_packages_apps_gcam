package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hja */
final class hja extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ kpw f6629a;

    hja(kpw kpw) {
        this.f6629a = kpw;
    }

    public final void onAnimationCancel(Animator animator) {
        animator.removeListener(this);
        this.f6629a.mo15641a(Boolean.FALSE);
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.f6629a.mo15641a(Boolean.TRUE);
    }
}

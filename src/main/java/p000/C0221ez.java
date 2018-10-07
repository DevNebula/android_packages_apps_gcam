package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: ez */
final class C0221ez extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0219ex f4605a;

    C0221ez(C0219ex c0219ex) {
        this.f4605a = c0219ex;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4605a.mo6648c();
        animator.removeListener(this);
    }
}

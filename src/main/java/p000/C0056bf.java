package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: PG */
/* renamed from: bf */
public final class C0056bf extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ HideBottomViewOnScrollBehavior f1143a;

    public C0056bf(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f1143a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1143a.f10409a = null;
    }
}

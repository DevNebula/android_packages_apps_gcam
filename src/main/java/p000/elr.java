package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: elr */
public final class elr implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ View f4174a;
    /* renamed from: b */
    private final /* synthetic */ elq f4175b;

    public elr(elq elq, View view) {
        this.f4175b = elq;
        this.f4174a = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4174a.setAlpha(0.0f);
        this.f4174a.setVisibility(8);
        this.f4175b.f4173a.removeAllListeners();
        this.f4175b.f4173a = null;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f4174a.setVisibility(0);
    }
}

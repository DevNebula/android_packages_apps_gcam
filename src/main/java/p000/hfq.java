package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hfq */
final class hfq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hfl f6534a;

    hfq(hfl hfl) {
        this.f6534a = hfl;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6534a.f6519f = C0252go.f5902bv;
        this.f6534a.setVisibility(4);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6534a.f6519f = C0252go.f5902bv;
        this.f6534a.setVisibility(4);
    }

    public final void onAnimationStart(Animator animator) {
        hfl hfl = this.f6534a;
        hfl.f6520g = hfl.f6515b;
        hfl.f6519f = C0252go.f5904bx;
    }
}

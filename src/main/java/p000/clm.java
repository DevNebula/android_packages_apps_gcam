package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: clm */
final class clm extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ cli f2312a;

    clm(cli cli) {
        this.f2312a = cli;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f2312a.f2304f = false;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f2312a.f2304f = true;
    }
}

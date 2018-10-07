package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cln */
final class cln extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ cli f2313a;

    cln(cli cli) {
        this.f2313a = cli;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f2313a.f2303e.setVisibility(8);
        this.f2313a.f2301c.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
    }
}

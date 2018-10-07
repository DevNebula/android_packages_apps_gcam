package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: csm */
final class csm extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ csl f2861a;

    csm(csl csl) {
        this.f2861a = csl;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2861a.f13234c.setVisibility(8);
    }
}

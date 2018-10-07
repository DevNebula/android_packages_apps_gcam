package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: brt */
final class brt extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ brq f1529a;

    brt(brq brq) {
        this.f1529a = brq;
    }

    public final void onAnimationEnd(Animator animator) {
        brq brq = this.f1529a;
        brq.f1519d.postDelayed(brq.f1524i, 1000);
    }
}

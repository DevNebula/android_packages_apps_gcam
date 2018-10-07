package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: gaf */
final class gaf extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ fzz f5181a;

    gaf(fzz fzz) {
        this.f5181a = fzz;
    }

    public final void onAnimationStart(Animator animator) {
        gbt gbt = this.f5181a.f5167b;
        gbt.f5274b = true;
        gbt.mo7023a(0.0f);
    }
}

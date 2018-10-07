package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: gae */
final class gae implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ fzz f5180a;

    gae(fzz fzz) {
        this.f5180a = fzz;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5180a.f5167b.mo7023a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f5180a.f5166a.invalidateSelf();
    }
}

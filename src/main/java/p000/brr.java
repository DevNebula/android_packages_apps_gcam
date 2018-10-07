package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: brr */
final /* synthetic */ class brr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final brq f1527a;

    brr(brq brq) {
        this.f1527a = brq;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        brq brq = this.f1527a;
        brq.f1520e = ((Float) valueAnimator.getAnimatedValue()).floatValue() * brq.f1518c.f6640a;
        brq.f1521f = (int) (valueAnimator.getAnimatedFraction() * 204.0f);
    }
}

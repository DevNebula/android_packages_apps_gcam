package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: brs */
final /* synthetic */ class brs implements AnimatorUpdateListener {
    /* renamed from: a */
    private final brq f1528a;

    brs(brq brq) {
        this.f1528a = brq;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1528a.f1521f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}

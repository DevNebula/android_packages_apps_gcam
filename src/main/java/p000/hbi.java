package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbi */
public final /* synthetic */ class hbi implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6297a;

    public hbi(hbh hbh) {
        this.f6297a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6297a.f6274b.currentSpec.mo7707e(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

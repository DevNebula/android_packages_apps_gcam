package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbt */
public final /* synthetic */ class hbt implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6308a;

    public hbt(hbh hbh) {
        this.f6308a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6308a.f6274b.currentSpec.mo7713h(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

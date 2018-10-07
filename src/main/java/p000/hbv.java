package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbv */
public final /* synthetic */ class hbv implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6311a;

    public hbv(hbh hbh) {
        this.f6311a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6311a.f6274b.currentSpec.mo7715i(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

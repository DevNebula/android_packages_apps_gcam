package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbs */
public final /* synthetic */ class hbs implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6307a;

    public hbs(hbh hbh) {
        this.f6307a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6307a.f6274b.currentSpec.mo7703c(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

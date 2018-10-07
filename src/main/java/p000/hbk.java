package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbk */
public final /* synthetic */ class hbk implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6299a;

    public hbk(hbh hbh) {
        this.f6299a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6299a.f6274b.currentSpec.mo7709f(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

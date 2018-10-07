package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbp */
public final /* synthetic */ class hbp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6303a;

    public hbp(hbh hbh) {
        this.f6303a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6303a.f6274b.currentSpec.mo7718k(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

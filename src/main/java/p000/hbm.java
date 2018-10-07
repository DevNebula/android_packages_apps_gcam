package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbm */
public final /* synthetic */ class hbm implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6301a;

    public hbm(hbh hbh) {
        this.f6301a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6301a.f6274b.currentSpec.mo7717j(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

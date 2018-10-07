package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbq */
public final /* synthetic */ class hbq implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6304a;

    public hbq(hbh hbh) {
        this.f6304a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6304a.f6274b.currentSpec.mo7697a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

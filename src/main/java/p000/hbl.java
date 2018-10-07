package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbl */
public final /* synthetic */ class hbl implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6300a;

    public hbl(hbh hbh) {
        this.f6300a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6300a.f6274b.currentSpec.mo7711g(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

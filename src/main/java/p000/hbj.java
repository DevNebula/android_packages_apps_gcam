package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbj */
public final /* synthetic */ class hbj implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6298a;

    public hbj(hbh hbh) {
        this.f6298a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6298a.f6274b.currentSpec.mo7720m(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

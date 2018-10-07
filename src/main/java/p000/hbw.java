package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbw */
public final /* synthetic */ class hbw implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6312a;
    /* renamed from: b */
    private final hcj f6313b;

    public hbw(hbh hbh, hcj hcj) {
        this.f6312a = hbh;
        this.f6313b = hcj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hbh hbh = this.f6312a;
        hbh.f6274b.currentSpec.mo7701b(((Integer) hbh.f6292t.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(hbh.f6275c.mo7682d()), Integer.valueOf(this.f6313b.mo7682d()))).intValue());
    }
}

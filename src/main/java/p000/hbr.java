package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbr */
public final /* synthetic */ class hbr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6305a;
    /* renamed from: b */
    private final hcj f6306b;

    public hbr(hbh hbh, hcj hcj) {
        this.f6305a = hbh;
        this.f6306b = hcj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hbh hbh = this.f6305a;
        hbh.f6274b.currentSpec.mo7705d(((Integer) hbh.f6292t.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(hbh.f6275c.mo7685g()), Integer.valueOf(this.f6306b.mo7685g()))).intValue());
    }
}

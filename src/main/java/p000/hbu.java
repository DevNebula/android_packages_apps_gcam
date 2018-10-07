package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbu */
public final /* synthetic */ class hbu implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6309a;
    /* renamed from: b */
    private final hcj f6310b;

    public hbu(hbh hbh, hcj hcj) {
        this.f6309a = hbh;
        this.f6310b = hcj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hbh hbh = this.f6309a;
        hbh.f6274b.currentSpec.mo7719l(((Integer) hbh.f6292t.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(hbh.f6275c.mo7693o()), Integer.valueOf(this.f6310b.mo7693o()))).intValue());
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btq */
final class btq implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1579a;

    btq(btl btl) {
        this.f1579a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1579a.f1573d.mo2110c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1579a.f1572c.invalidate();
    }
}

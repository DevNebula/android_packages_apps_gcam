package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btr */
final class btr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1580a;

    btr(btl btl) {
        this.f1580a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1580a.f1573d.mo2111d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1580a.f1572c.invalidate();
    }
}

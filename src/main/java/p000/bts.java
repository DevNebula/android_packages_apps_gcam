package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: bts */
final class bts implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1581a;

    bts(btl btl) {
        this.f1581a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1581a.f1573d.mo2108a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1581a.f1572c.invalidate();
    }
}

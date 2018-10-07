package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: bto */
final class bto implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1577a;

    bto(btl btl) {
        this.f1577a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1577a.f1574e.mo2112a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1577a.f1572c.invalidate();
    }
}

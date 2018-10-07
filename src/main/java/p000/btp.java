package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btp */
final class btp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1578a;

    btp(btl btl) {
        this.f1578a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1578a.f1573d.mo2109b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1578a.f1572c.invalidate();
    }
}

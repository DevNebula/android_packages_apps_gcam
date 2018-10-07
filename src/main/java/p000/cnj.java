package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cnj */
final class cnj implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cng f2397a;

    cnj(cng cng) {
        this.f2397a = cng;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2397a.mo14595a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

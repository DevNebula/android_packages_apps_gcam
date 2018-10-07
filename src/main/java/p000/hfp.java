package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hfp */
final class hfp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hfl f6533a;

    hfp(hfl hfl) {
        this.f6533a = hfl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6533a.f6521h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6533a.invalidate();
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cvi */
final class cvi implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f3011a;

    cvi(cvf cvf) {
        this.f3011a = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3011a.mo5847a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

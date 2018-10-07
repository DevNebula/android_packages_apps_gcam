package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cvh */
final class cvh implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f3010a;

    cvh(cvf cvf) {
        this.f3010a = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3010a.mo5857c(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

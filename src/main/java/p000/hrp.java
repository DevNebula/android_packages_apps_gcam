package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hrp */
final class hrp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hrm f6879a;

    hrp(hrm hrm) {
        this.f6879a = hrm;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hrm hrm = this.f6879a;
        hrm.mo13560a(hrm.f20785a, floatValue);
    }
}

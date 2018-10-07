package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cut */
final class cut implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cur f2974a;

    cut(cur cur) {
        this.f2974a = cur;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2974a.f2967b.mo5826a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: dwp */
final class dwp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ View f3532a;

    dwp(View view) {
        this.f3532a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3532a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

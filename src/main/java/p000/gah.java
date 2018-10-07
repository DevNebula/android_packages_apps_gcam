package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: gah */
final class gah implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ View f5183a;

    gah(View view) {
        this.f5183a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5183a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

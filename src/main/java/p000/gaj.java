package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: gaj */
final class gaj implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ View f5185a;

    gaj(View view) {
        this.f5185a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5185a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

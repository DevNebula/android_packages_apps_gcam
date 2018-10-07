package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: so */
final class C0479so implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ C0754sk f9726a;

    C0479so(C0754sk c0754sk) {
        this.f9726a = c0754sk;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f9726a.f22269b.setAlpha(floatValue);
        this.f9726a.f22270c.setAlpha(floatValue);
        this.f9726a.f22277j.invalidate();
    }
}

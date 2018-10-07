package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hpk */
final class hpk implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hpf f6795a;

    hpk(hpf hpf) {
        this.f6795a = hpf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6795a.f26476k.mo8826a(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: gad */
final class gad implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ gak f5179a;

    gad(gak gak) {
        this.f5179a = gak;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5179a.mo6999a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

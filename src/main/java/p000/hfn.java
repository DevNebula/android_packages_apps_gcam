package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hfn */
public final class hfn implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hfl f6531a;

    public hfn(hfl hfl) {
        this.f6531a = hfl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6531a.f6521h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hfl hfl = this.f6531a;
        hfl.f6517d.setStrokeWidth(hfl.f6521h);
        this.f6531a.invalidate();
    }
}

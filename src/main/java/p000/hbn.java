package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbn */
public final /* synthetic */ class hbn implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f6302a;

    public hbn(hbh hbh) {
        this.f6302a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6302a.f6274b.invalidate();
    }
}

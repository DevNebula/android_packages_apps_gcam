package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: gyv */
final /* synthetic */ class gyv implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f6187a;
    /* renamed from: b */
    private final hhx f6188b;
    /* renamed from: c */
    private final int f6189c;

    gyv(gyz gyz, hhx hhx, int i) {
        this.f6187a = gyz;
        this.f6188b = hhx;
        this.f6189c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f6187a;
        hhx hhx = this.f6188b;
        int i = this.f6189c;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (hhx != null) {
            gyz.f6195c.mo12643a(intValue, hhx, i);
        }
    }
}

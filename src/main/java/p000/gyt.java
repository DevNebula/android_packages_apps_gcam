package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: gyt */
final /* synthetic */ class gyt implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f6182a;
    /* renamed from: b */
    private final hhx f6183b;
    /* renamed from: c */
    private final int f6184c;

    gyt(gyz gyz, hhx hhx, int i) {
        this.f6182a = gyz;
        this.f6183b = hhx;
        this.f6184c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f6182a;
        hhx hhx = this.f6183b;
        int i = this.f6184c;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (hhx != null) {
            gyz.f6195c.mo12643a(intValue, hhx, i);
        }
    }
}

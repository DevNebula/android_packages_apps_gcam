package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btn */
final class btn implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1576a;

    btn(btl btl) {
        this.f1576a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bta bta = this.f1576a.f1574e;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        bta.f1546b = floatValue;
        this.f1576a.f1572c.invalidate();
    }
}

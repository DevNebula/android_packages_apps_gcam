package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: cmo */
final class cmo implements AnimatorUpdateListener {
    /* renamed from: a */
    private final kvr f2342a;
    /* renamed from: b */
    private final cnb f2343b;

    public cmo(kvr kvr, cnb cnb) {
        this.f2342a = kvr;
        this.f2343b = cnb;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cnb cnb = this.f2343b;
        Rect rect = cnb.f2383e;
        Rect rect2 = cnb.f2384f;
        float f = 1.0f - floatValue;
        this.f2342a.setClipBounds(new Rect((int) ((((float) rect.left) * floatValue) + (((float) rect2.left) * f)), (int) ((((float) rect.top) * floatValue) + (((float) rect2.top) * f)), (int) ((((float) rect.right) * floatValue) + (((float) rect2.right) * f)), (int) ((floatValue * ((float) rect.bottom)) + (((float) rect2.bottom) * f))));
    }
}

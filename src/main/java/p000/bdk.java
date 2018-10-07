package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdk */
public final class bdk implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1115a;

    public bdk(BurstChip burstChip) {
        this.f1115a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BurstChip burstChip = this.f1115a;
        float f = burstChip.f2434e;
        burstChip.f2430a.setCornerRadius(f + ((burstChip.f2437h - f) * floatValue));
        burstChip = this.f1115a;
        f = burstChip.f2432c;
        burstChip.f2439j = Math.round(f + ((burstChip.f2435f - f) * floatValue));
        burstChip = this.f1115a;
        f = burstChip.f2433d;
        burstChip.f2440k = Math.round((floatValue * (burstChip.f2436g - f)) + f);
        this.f1115a.requestLayout();
    }
}

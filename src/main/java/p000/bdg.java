package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdg */
public final class bdg implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1111a;

    public bdg(BurstChip burstChip) {
        this.f1111a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BurstChip burstChip = this.f1111a;
        burstChip.f2430a.setCornerRadius(((burstChip.f2434e + 0.0f) * floatValue) + 0.0f);
        burstChip = this.f1111a;
        burstChip.f2439j = Math.round(((burstChip.f2432c + 0.0f) * floatValue) + 0.0f);
        burstChip = this.f1111a;
        burstChip.f2440k = Math.round((floatValue * (burstChip.f2433d + 0.0f)) + 0.0f);
        this.f1111a.requestLayout();
    }
}

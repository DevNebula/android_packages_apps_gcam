package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdh */
public final class bdh implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1112a;

    public bdh(BurstChip burstChip) {
        this.f1112a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1112a.f2438i.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

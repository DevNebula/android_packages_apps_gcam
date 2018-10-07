package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdl */
public final class bdl implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1116a;

    public bdl(BurstChip burstChip) {
        this.f1116a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1116a.f2438i.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f1116a.invalidate();
    }
}

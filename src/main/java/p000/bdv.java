package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdv */
public final class bdv implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1126a;

    public bdv(BurstChip burstChip) {
        this.f1126a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1126a.f2431b.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

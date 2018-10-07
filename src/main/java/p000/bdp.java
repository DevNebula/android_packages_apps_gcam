package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdp */
public final class bdp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1120a;

    public bdp(BurstChip burstChip) {
        this.f1120a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1120a.f2431b.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}

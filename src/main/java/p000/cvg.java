package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cvg */
public final class cvg implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f3009a;

    public cvg(cvf cvf) {
        this.f3009a = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3009a.f2996a.invalidate();
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.evcomp.EvCompView;

/* renamed from: bpu */
public final /* synthetic */ class bpu implements AnimatorUpdateListener {
    /* renamed from: a */
    private final float f1451a;
    /* renamed from: b */
    private final float f1452b;
    /* renamed from: c */
    private final EvCompView f1453c;

    public bpu(float f, float f2, EvCompView evCompView) {
        this.f1451a = f;
        this.f1452b = f2;
        this.f1453c = evCompView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        float f = this.f1451a;
        float f2 = this.f1452b;
        EvCompView evCompView = this.f1453c;
        evCompView.f2467c = f + ((f2 - f) * valueAnimator.getAnimatedFraction());
        evCompView.invalidate();
        f2 = valueAnimator.getAnimatedFraction();
        if (f2 != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        evCompView.f2470f = z;
        evCompView.f2468d = f2;
        evCompView.invalidate();
    }
}

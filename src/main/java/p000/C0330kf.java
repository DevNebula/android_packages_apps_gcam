package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: kf */
final class C0330kf implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ C0332ki f8628a;

    C0330kf(C0332ki c0332ki) {
        this.f8628a = c0332ki;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.f8628a.f8675a.f22101c.getParent()).invalidate();
    }
}

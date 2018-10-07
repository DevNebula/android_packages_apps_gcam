package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* renamed from: gys */
final /* synthetic */ class gys implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f6180a;
    /* renamed from: b */
    private final int f6181b;

    gys(gyz gyz, int i) {
        this.f6180a = gyz;
        this.f6181b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f6180a;
        int i = this.f6181b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gyz.f6195c.setAlpha(floatValue);
        if (!gyz.f6199g) {
            boolean z;
            BottomBarController bottomBarController = gyz.f6193a;
            if (i == C0252go.f5895bo) {
                z = true;
            } else {
                z = false;
            }
            bottomBarController.setProgress(floatValue, z);
        }
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* renamed from: gyu */
final /* synthetic */ class gyu implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f6185a;
    /* renamed from: b */
    private final int f6186b;

    gyu(gyz gyz, int i) {
        this.f6185a = gyz;
        this.f6186b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f6185a;
        int i = this.f6186b;
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

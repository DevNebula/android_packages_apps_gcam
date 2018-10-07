package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: bdu */
public final class bdu extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1125a;

    public bdu(BurstChip burstChip) {
        this.f1125a = burstChip;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1125a.f2438i.setAlpha(Illuminant.kOther);
    }

    public final void onAnimationStart(Animator animator) {
        this.f1125a.setVisibility(0);
        this.f1125a.setAlpha(1.0f);
        this.f1125a.f2431b.setAlpha(0);
        this.f1125a.f2431b.setVisible(false, false);
        this.f1125a.f2438i.setAlpha(0);
    }
}

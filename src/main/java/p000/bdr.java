package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdr */
public final class bdr extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1122a;

    public bdr(BurstChip burstChip) {
        this.f1122a = burstChip;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1122a.setVisibility(0);
        this.f1122a.setAlpha(1.0f);
        this.f1122a.f2431b.setAlpha(0);
        this.f1122a.f2431b.setVisible(false, true);
        this.f1122a.f2438i.setAlpha(0);
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdo */
public final class bdo extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1119a;

    public bdo(BurstChip burstChip) {
        this.f1119a = burstChip;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1119a.f2438i.setAlpha(0);
    }
}

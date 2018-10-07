package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdj */
public final class bdj extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1114a;

    public bdj(BurstChip burstChip) {
        this.f1114a = burstChip;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1114a.setVisibility(8);
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdq */
public final class bdq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1121a;

    public bdq(BurstChip burstChip) {
        this.f1121a = burstChip;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1121a.f2431b.setVisible(true, true);
        this.f1121a.f2431b.start();
    }
}

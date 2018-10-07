package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdw */
public final class bdw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1127a;

    public bdw(BurstChip burstChip) {
        this.f1127a = burstChip;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1127a.f2431b.stop();
    }
}

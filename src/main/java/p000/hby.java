package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hby */
public final class hby extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbh f6315a;

    public hby(hbh hbh) {
        this.f6315a = hbh;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6315a.f6274b.setVideoButtonAnimating(false);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6315a.f6274b.setVideoButtonAnimating(true);
    }
}

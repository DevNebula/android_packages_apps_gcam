package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hfo */
public final class hfo extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hfl f6532a;

    public hfo(hfl hfl) {
        this.f6532a = hfl;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6532a.f6519f = C0252go.f5905by;
        hfl hfl = this.f6532a;
        hfl.f6520g = hfl.f6515b;
        hfl.f6521h = (float) hfl.f6516c;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6532a.f6519f = C0252go.f5905by;
    }

    public final void onAnimationStart(Animator animator) {
        this.f6532a.f6519f = C0252go.f5903bw;
        this.f6532a.setVisibility(0);
    }
}

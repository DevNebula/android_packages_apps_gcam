package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hca */
final class hca extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbz f6318a;

    hca(hbz hbz) {
        this.f6318a = hbz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6318a.f6317b.f6274b.setClickEnabled(true);
    }

    public final void onAnimationStart(Animator animator) {
        this.f6318a.f6317b.f6274b.setClickEnabled(false);
    }
}

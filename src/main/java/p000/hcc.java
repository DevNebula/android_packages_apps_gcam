package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hcc */
final class hcc extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbz f6320a;

    hcc(hbz hbz) {
        this.f6320a = hbz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6320a.f6317b.f6274b.currentSpec.f6329c = null;
    }
}

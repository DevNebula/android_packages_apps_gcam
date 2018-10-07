package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: PG */
/* renamed from: hiz */
public final class hiz implements hix {
    /* renamed from: b */
    private final Animator f20162b;

    hiz(Animator animator) {
        this.f20162b = animator;
    }

    /* renamed from: a */
    public final void mo7900a(AnimatorListener animatorListener) {
        this.f20162b.addListener(animatorListener);
    }

    /* renamed from: a */
    public final hiv mo7899a() {
        kpk d = kpw.m18486d();
        this.f20162b.addListener(new hja(d));
        this.f20162b.start();
        return new hjd(this.f20162b, d);
    }
}

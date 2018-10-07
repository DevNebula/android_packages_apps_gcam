package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hmg */
public final class hmg extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hlz f6730a;

    public hmg(hlz hlz) {
        this.f6730a = hlz;
    }

    public final void onAnimationStart(Animator animator) {
        this.f6730a.f6723n.setVisibility(0);
    }
}

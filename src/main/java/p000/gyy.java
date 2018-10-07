package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: gyy */
final class gyy extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ gyz f6192a;

    gyy(gyz gyz) {
        this.f6192a = gyz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6192a.f6195c.setVisibility(8);
        this.f6192a.f6197e = false;
    }
}

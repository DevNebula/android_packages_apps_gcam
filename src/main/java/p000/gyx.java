package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: gyx */
final class gyx extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hhx f6190a;
    /* renamed from: b */
    private final /* synthetic */ gyz f6191b;

    gyx(gyz gyz, hhx hhx) {
        this.f6191b = gyz;
        this.f6190a = hhx;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6191b.mo7573c(this.f6190a);
        this.f6191b.f6197e = false;
    }
}

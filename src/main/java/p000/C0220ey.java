package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: ey */
final class C0220ey extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0691ih f4567a;
    /* renamed from: b */
    private final /* synthetic */ C0219ex f4568b;

    C0220ey(C0219ex c0219ex, C0691ih c0691ih) {
        this.f4568b = c0219ex;
        this.f4567a = c0691ih;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4567a.remove(animator);
        this.f4568b.f4543l.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f4568b.f4543l.add(animator);
    }
}

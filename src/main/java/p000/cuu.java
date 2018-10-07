package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuu */
final class cuu implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ cur f2975a;

    cuu(cur cur) {
        this.f2975a = cur;
    }

    public final void onAnimationCancel(Animator animator) {
        bli.m896d(FilmstripView.f2524a, "[fling] mXScrollAnimatorListener.onAnimationCancel");
    }

    public final void onAnimationEnd(Animator animator) {
        bli.m888a(FilmstripView.f2524a, "[fling] onScrollEnd from mXScrollAnimatorListener.onAnimationEnd");
        this.f2975a.f2967b.mo5825a();
    }

    public final void onAnimationRepeat(Animator animator) {
        bli.m888a(FilmstripView.f2524a, "[fling] mXScrollAnimatorListener.onAnimationRepeat");
    }

    public final void onAnimationStart(Animator animator) {
        bli.m888a(FilmstripView.f2524a, "[fling] mXScrollAnimatorListener.onAnimationStart");
    }
}

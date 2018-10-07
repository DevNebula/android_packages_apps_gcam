package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;

/* compiled from: PG */
/* renamed from: cts */
public final class cts extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ FilmstripTransitionLayout f2917a;

    public cts(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f2917a = filmstripTransitionLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ctt ctt = this.f2917a.f2511i;
        if (ctt != null) {
            ctt.mo5807a();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2917a.setVisibility(4);
        this.f2917a.f2509g.setVisibility(0);
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2917a;
        if (filmstripTransitionLayout.f2507e) {
            filmstripTransitionLayout.f2507e = false;
            return;
        }
        ctt ctt = filmstripTransitionLayout.f2511i;
        if (ctt != null) {
            ctt.mo5808b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f2917a.setVisibility(0);
    }
}

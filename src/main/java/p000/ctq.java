package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;

/* compiled from: PG */
/* renamed from: ctq */
public final class ctq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ FilmstripTransitionLayout f2915a;

    public ctq(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f2915a = filmstripTransitionLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ctt ctt = this.f2915a.f2510h;
        if (ctt != null) {
            ctt.mo5807a();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2915a;
        if (filmstripTransitionLayout.f2512j) {
            filmstripTransitionLayout.setVisibility(4);
        }
        filmstripTransitionLayout = this.f2915a;
        if (filmstripTransitionLayout.f2506d) {
            filmstripTransitionLayout.f2506d = false;
            return;
        }
        ctt ctt = filmstripTransitionLayout.f2510h;
        if (ctt != null) {
            ctt.mo5808b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f2915a.setVisibility(0);
        this.f2915a.f2509g.setVisibility(4);
    }
}

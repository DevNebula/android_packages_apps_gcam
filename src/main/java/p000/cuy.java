package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuy */
final class cuy implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ cuw f2979a;

    cuy(cuw cuw) {
        this.f2979a = cuw;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        FilmstripView filmstripView = this.f2979a.f13292f;
        float f = filmstripView.f2535j;
        cst cst;
        if (f == 1.0f) {
            filmstripView.f2546u = false;
            cst = filmstripView.f2539n;
            if (cst != null) {
                filmstripView.mo2640d();
                cst.mo12905d();
            }
        } else if (f == 0.7f) {
            bli.m888a(FilmstripView.f2524a, "onEnterFilmstrip()");
            cst = filmstripView.f2539n;
            if (cst != null) {
                filmstripView.mo2640d();
                cst.mo12904c();
            }
        }
        this.f2979a.f13292f.mo2649m();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        FilmstripView filmstripView = this.f2979a.f13292f;
        float f = filmstripView.f2535j;
        if (f != 1.0f) {
            if (f == 0.7f && filmstripView.f2539n != null) {
                filmstripView.mo2640d();
            }
        } else if (filmstripView.f2539n != null) {
            filmstripView.mo2640d();
        }
    }
}

package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;

/* compiled from: PG */
/* renamed from: ctr */
public final class ctr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ FilmstripTransitionLayout f2916a;

    public ctr(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f2916a = filmstripTransitionLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2916a;
        jri.m13404b(filmstripTransitionLayout.f2513k);
        float c = filmstripTransitionLayout.f2513k.mo5812c(animatedFraction);
        filmstripTransitionLayout.f2508f.setScaleX(c);
        filmstripTransitionLayout.f2508f.setScaleY(c);
        PointF d = filmstripTransitionLayout.f2513k.mo5813d(animatedFraction);
        filmstripTransitionLayout.f2508f.setTranslationX(d.x);
        filmstripTransitionLayout.f2508f.setTranslationY(d.y);
        filmstripTransitionLayout.f2508f.mo2623a(filmstripTransitionLayout.f2513k.mo5811b(animatedFraction));
        filmstripTransitionLayout.mo2614a(filmstripTransitionLayout.f2513k.mo5810a(animatedFraction));
        this.f2916a.invalidate();
        ctt ctt = this.f2916a.f2511i;
        if (ctt != null) {
            ctt.mo5809c();
        }
    }
}

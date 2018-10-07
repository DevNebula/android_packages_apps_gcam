package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cvb */
final class cvb implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ ValueAnimator f2990a;
    /* renamed from: b */
    private final /* synthetic */ ValueAnimator f2991b;
    /* renamed from: c */
    private final /* synthetic */ cvf f2992c;
    /* renamed from: d */
    private final /* synthetic */ cuw f2993d;

    cvb(cuw cuw, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, cvf cvf) {
        this.f2993d = cuw;
        this.f2990a = valueAnimator;
        this.f2991b = valueAnimator2;
        this.f2992c = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) this.f2990a.getAnimatedValue()).floatValue();
        float floatValue2 = ((Float) this.f2991b.getAnimatedValue()).floatValue();
        cvf cvf = this.f2992c;
        FilmstripView filmstripView = this.f2993d.f13292f;
        float f = filmstripView.f2535j;
        cvf.mo5848a(floatValue, floatValue2, f, f, filmstripView.f2534i.width(), this.f2993d.f13292f.f2534i.height());
    }
}

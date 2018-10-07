package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cva */
final class cva implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f2986a;
    /* renamed from: b */
    private final /* synthetic */ float f2987b;
    /* renamed from: c */
    private final /* synthetic */ float f2988c;
    /* renamed from: d */
    private final /* synthetic */ cuw f2989d;

    cva(cuw cuw, cvf cvf, float f, float f2) {
        this.f2989d = cuw;
        this.f2986a = cvf;
        this.f2987b = f;
        this.f2988c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FilmstripView filmstripView = this.f2989d.f13292f;
        float f = filmstripView.f2535j;
        filmstripView.f2535j = floatValue;
        this.f2986a.mo5849a(this.f2987b, this.f2988c, floatValue / f, filmstripView.f2534i.width(), this.f2989d.f13292f.f2534i.height());
    }
}

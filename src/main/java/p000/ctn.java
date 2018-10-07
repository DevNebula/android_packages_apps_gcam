package p000;

import android.graphics.PointF;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;

/* compiled from: PG */
/* renamed from: ctn */
public final class ctn {
    /* renamed from: a */
    public final /* synthetic */ PeekableFilmstripLayout f2904a;

    public ctn(PeekableFilmstripLayout peekableFilmstripLayout) {
        this.f2904a = peekableFilmstripLayout;
    }

    /* renamed from: a */
    public final void mo5793a() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2904a.f12806f;
        filmstripTransitionLayout.f2510h = new cvk(this);
        jri.m13404b(filmstripTransitionLayout.f2514l);
        ctv a = filmstripTransitionLayout.mo2613a();
        ctu a2 = a.mo5815a();
        a.f2927b = filmstripTransitionLayout.f2514l.mo5797b();
        a.f2929d = filmstripTransitionLayout.f2514l.mo5798c();
        a.f2930e = a2.f2920c;
        a.f2932g = filmstripTransitionLayout.f2514l.mo5796a();
        filmstripTransitionLayout.f2513k = a.mo5815a();
        filmstripTransitionLayout.mo2620d();
        filmstripTransitionLayout.f2504b.start();
        filmstripTransitionLayout.f2514l = null;
    }

    /* renamed from: b */
    public final void mo5795b() {
        this.f2904a.mo12579c();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2904a.f12806f;
        filmstripTransitionLayout.f2511i = new cvj(this);
        jri.m13404b(filmstripTransitionLayout.f2514l);
        ctv a = filmstripTransitionLayout.mo2613a();
        a.f2926a = filmstripTransitionLayout.f2514l.mo5797b();
        a.f2928c = filmstripTransitionLayout.f2514l.mo5798c();
        a.f2931f = filmstripTransitionLayout.f2514l.mo5796a();
        filmstripTransitionLayout.f2513k = a.mo5815a();
        filmstripTransitionLayout.mo2619c();
        filmstripTransitionLayout.f2505c.start();
    }

    /* renamed from: a */
    public final void mo5794a(float f, float f2, float f3) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2904a.f12806f;
        jri.m13404b(filmstripTransitionLayout.f2514l);
        cto cto = filmstripTransitionLayout.f2514l;
        cto.f2905a -= f;
        cto.f2906b -= f2;
        cto.f2907c = f3;
        float b = cto.mo5797b();
        filmstripTransitionLayout.f2508f.setScaleX(b);
        filmstripTransitionLayout.f2508f.setScaleY(b);
        PointF c = filmstripTransitionLayout.f2514l.mo5798c();
        filmstripTransitionLayout.f2508f.setTranslationX(c.x);
        filmstripTransitionLayout.f2508f.setTranslationY(c.y);
        filmstripTransitionLayout.mo2614a(filmstripTransitionLayout.f2514l.mo5796a());
    }
}

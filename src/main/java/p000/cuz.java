package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.RectF;
import android.net.Uri;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuz */
final class cuz implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ float f2980a;
    /* renamed from: b */
    private final /* synthetic */ cvf f2981b;
    /* renamed from: c */
    private final /* synthetic */ float f2982c;
    /* renamed from: d */
    private final /* synthetic */ float f2983d;
    /* renamed from: e */
    private final /* synthetic */ cuw f2984e;

    cuz(cuw cuw, float f, cvf cvf, float f2, float f3) {
        this.f2984e = cuw;
        this.f2980a = f;
        this.f2981b = cvf;
        this.f2982c = f2;
        this.f2983d = f3;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        FilmstripView filmstripView = this.f2984e.f13292f;
        float f = filmstripView.f2535j;
        float f2 = this.f2980a;
        if (f != f2) {
            this.f2981b.mo5849a(this.f2982c, this.f2983d, f2 / f, filmstripView.f2534i.width(), this.f2984e.f13292f.f2534i.height());
            this.f2984e.f13292f.f2535j = this.f2980a;
        }
        cuw cuw;
        cvf cvf;
        if (this.f2984e.f13292f.mo2642f()) {
            cuw = this.f2984e;
            for (int i = 0; i < 2; i++) {
                cvf = cuw.f13292f.f2538m[i];
                if (cvf != null) {
                    cvf.mo5851a(0);
                }
            }
            this.f2984e.f13292f.f2540o.setVisibility(8);
            this.f2981b.mo5860f();
        } else {
            cuw = this.f2984e.f13292f.f2536k;
            if (cuw.f13292f.mo2643g()) {
                cvf = cuw.f13292f.f2538m[2];
                if (cvf != null) {
                    err e = cvf.f3002g.mo5692e();
                    if (e.mo6540f().mo6551d()) {
                        Uri uri;
                        cvf cvf2 = cuw.f13292f.f2538m[2];
                        if (cvf2 == null) {
                            uri = Uri.EMPTY;
                        } else {
                            uri = cvf2.f3003h.mo6541g().f4384h;
                        }
                        RectF rectF = new RectF();
                        rectF.left = cvf.f2997b.getX();
                        rectF.top = cvf.f2997b.getY();
                        rectF.right = rectF.left + (((float) cvf.f2997b.getWidth()) * cvf.f2997b.getScaleX());
                        rectF.bottom = (cvf.f2997b.getScaleY() * ((float) cvf.f2997b.getHeight())) + rectF.top;
                        if (!(uri == null || uri == Uri.EMPTY)) {
                            int l = e.mo6546l();
                            hfu hfu = cuw.f13292f.f2540o;
                            if (!uri.equals(hfu.f6540e)) {
                                hfu.f6540e = uri;
                                hfu.f6541f = l;
                            }
                            hfu.mo7803a();
                            hfu.f6539d = new hfw(hfu);
                            hfu.f6539d.execute(new RectF[]{rectF});
                        }
                    }
                }
            }
        }
        cuw cuw2 = this.f2984e;
        cuw2.f13288b = null;
        cuw2.f13292f.mo2649m();
        this.f2984e.f13292f.invalidate();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        int i = 0;
        this.f2984e.f13292f.f2540o.setVisibility(8);
        cuw cuw = this.f2984e;
        FilmstripView filmstripView = cuw.f13292f;
        if (filmstripView.f2535j == 1.0f) {
            while (i < 2) {
                cvf cvf = cuw.f13292f.f2538m[i];
                if (cvf != null) {
                    cvf.mo5851a(4);
                }
                i++;
            }
        } else if (filmstripView.mo2643g()) {
            cuw cuw2 = this.f2984e.f13292f.f2536k;
            for (int i2 = 0; i2 < 2; i2++) {
                cvf cvf2 = cuw2.f13292f.f2538m[i2];
                if (cvf2 != null) {
                    cvf2.mo5851a(0);
                }
            }
        }
        this.f2984e.f13292f.f2540o.mo7803a();
    }
}

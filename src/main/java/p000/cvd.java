package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.RectF;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: cvd */
final class cvd implements AnimatorListener {
    /* renamed from: a */
    private boolean f2994a = false;
    /* renamed from: b */
    private final /* synthetic */ cuw f2995b;

    cvd(cuw cuw) {
        this.f2995b = cuw;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2994a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f2994a) {
            cuw cuw = this.f2995b;
            if (cuw.f13292f.mo2643g()) {
                cvf cvf = cuw.f13292f.f2538m[2];
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
        this.f2995b.f13289c = null;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}

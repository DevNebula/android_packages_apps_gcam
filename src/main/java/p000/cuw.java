package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.List;

/* compiled from: PG */
/* renamed from: cuw */
public final class cuw implements csw {
    /* renamed from: a */
    public final ValueAnimator f13287a;
    /* renamed from: b */
    public ValueAnimator f13288b;
    /* renamed from: c */
    public AnimatorSet f13289c;
    /* renamed from: d */
    public final cur f13290d;
    /* renamed from: e */
    public boolean f13291e;
    /* renamed from: f */
    public final /* synthetic */ FilmstripView f13292f;
    /* renamed from: g */
    private final cuv f13293g = new cuv(this);
    /* renamed from: h */
    private final AnimatorUpdateListener f13294h = new cux(this);

    public cuw(FilmstripView filmstripView) {
        this.f13292f = filmstripView;
        TimeInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.f13290d = new cur(filmstripView.f2528c.getContext(), new Handler(Looper.getMainLooper()), this.f13293g, decelerateInterpolator);
        this.f13291e = true;
        this.f13287a = new ValueAnimator();
        this.f13287a.addUpdateListener(this.f13294h);
        this.f13287a.setInterpolator(decelerateInterpolator);
        this.f13287a.addListener(new cuy(this));
    }

    /* renamed from: a */
    final float mo12910a(boolean z) {
        cvf cvf = this.f13292f.f2538m[2];
        if (cvf == null) {
            return 1.0f;
        }
        err e = cvf.f3002g.mo5692e();
        if (e == null || !e.mo6540f().mo6551d()) {
            return 1.0f;
        }
        float f = (float) e.mo6542h().f7695a;
        if (e.mo6546l() == 90 || e.mo6546l() == MediaDecoder.ROTATE_90_LEFT) {
            f = (float) e.mo6542h().f7696b;
        }
        f /= (float) cvf.f2997b.getWidth();
        if (z) {
            return f * this.f13292f.f2545t;
        }
        return f;
    }

    /* renamed from: a */
    public final cre mo5754a() {
        return this.f13292f.mo2640d();
    }

    /* renamed from: f */
    public final void mo12915f() {
        FilmstripView filmstripView = this.f13292f;
        if (filmstripView.f2538m[2] != null && filmstripView.f2535j != 0.7f) {
            m8892b(0.7f);
            filmstripView = this.f13292f;
            cvf[] cvfArr = filmstripView.f2538m;
            cvfArr = filmstripView.f2538m;
            if (filmstripView.f2535j == 0.7f && filmstripView.f2539n != null) {
                filmstripView.mo2640d();
            }
        }
    }

    /* renamed from: b */
    public final void mo5759b() {
        int i = 0;
        cvf cvf = this.f13292f.f2538m[2];
        if (!(cvf == null || cvf.mo5858d())) {
            this.f13292f.mo2647k();
            FilmstripView filmstripView = this.f13292f;
            if (filmstripView.f2532g.mo7814a(filmstripView.f2538m[2].f3002g) < 7) {
                this.f13292f.mo2645i();
            } else {
                FilmstripView filmstripView2 = this.f13292f;
                bli.m894c(FilmstripView.f2524a, "loadAtBeginning()");
                List a = filmstripView2.f2532g.mo7826b(0).mo5686a(2);
                while (true) {
                    int i2 = i;
                    if (i2 >= 5) {
                        break;
                    }
                    cvf cvf2 = filmstripView2.f2538m[i2];
                    if (!(cvf2 == null || a.contains(cvf2.f3002g))) {
                        filmstripView2.f2538m[i2].mo5859e();
                    }
                    cre cre = (cre) a.get(i2);
                    if (cre == cre.f2792c) {
                        filmstripView2.f2538m[i2] = null;
                    } else {
                        int d = filmstripView2.mo2639d(cre);
                        if (d == -1) {
                            filmstripView2.f2538m[i2] = filmstripView2.mo2637c(cre);
                        } else {
                            cvf[] cvfArr = filmstripView2.f2538m;
                            cvfArr[i2] = cvfArr[d];
                        }
                    }
                    i = i2 + 1;
                }
                filmstripView2.f2537l = -1;
                filmstripView2.f2535j = 1.0f;
                filmstripView2.mo2629a();
                filmstripView2.mo2646j();
                filmstripView2.invalidate();
                cst cst = filmstripView2.f2539n;
                if (cst != null) {
                    cst.mo12903b();
                    filmstripView2.f2539n.mo12902a(filmstripView2.mo2640d());
                }
            }
        }
        this.f13292f.mo2647k();
        this.f13292f.mo2648l();
    }

    /* renamed from: c */
    public final void mo5761c() {
        if (!this.f13292f.mo2642f()) {
            m8892b(1.0f);
        }
    }

    /* renamed from: c */
    final boolean mo12914c(int i) {
        cvf cvf = this.f13292f.f2538m[i];
        if (cvf == null) {
            return false;
        }
        mo12913b(true);
        mo12912a(cvf.mo5846a(), 800, false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo5757a(int i) {
        FilmstripView filmstripView = this.f13292f;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf == null || filmstripView.f2532g.mo7816a(i) == null) {
            return false;
        }
        int i2 = cvf.f3000e;
        int a = cvf.mo5846a();
        int i3 = i2;
        i2 = cvf.f2997b.getMeasuredWidth();
        while (i3 != i) {
            int i4;
            if (i3 >= i) {
                i4 = i3 - 1;
            } else {
                i4 = i3 + 1;
            }
            int i5 = i4 - i3;
            iqp g = this.f13292f.f2532g.mo7816a(i4).mo6541g().mo6556g();
            if (g.f7696b > 0) {
                i3 = (this.f13292f.getMeasuredHeight() * g.f7695a) / g.f7696b;
            } else {
                i3 = LfuScheduler.MAX_PRIORITY;
            }
            i3 = Math.min(this.f13292f.getMeasuredWidth(), i3);
            a = ((((i2 / 2) + (i3 / 2)) + this.f13292f.f2533h) * i5) + a;
            i2 = i3;
            i3 = i4;
        }
        mo12913b(true);
        mo12912a(a, 800, false);
        return true;
    }

    /* renamed from: d */
    public final boolean mo5762d() {
        return mo12914c(3);
    }

    /* renamed from: e */
    public final boolean mo5763e() {
        return mo12914c(1);
    }

    /* renamed from: g */
    public final boolean mo12916g() {
        AnimatorSet animatorSet = this.f13289c;
        return animatorSet != null && animatorSet.isRunning();
    }

    /* renamed from: h */
    public final boolean mo12917h() {
        int i = 0;
        cur cur = this.f13290d;
        if (cur.f2968c.isFinished() && !cur.f2969d.isRunning()) {
            i = 1;
        }
        return i ^ 1;
    }

    /* renamed from: a */
    public final boolean mo5758a(err err) {
        for (cvf cvf : this.f13292f.f2538m) {
            if (err != null && cvf != null && cvf.f2997b.getVisibility() == 0 && err.equals(cvf.f3003h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo12918i() {
        ValueAnimator valueAnimator = this.f13288b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: b */
    private final void m8892b(float f) {
        if (this.f13292f.f2538m[2] != null) {
            this.f13287a.cancel();
            this.f13287a.setDuration(400);
            this.f13287a.setFloatValues(new float[]{this.f13292f.f2535j, f});
            this.f13287a.start();
        }
    }

    /* renamed from: a */
    public final void mo12911a(float f) {
        if (mo12913b(false)) {
            FilmstripView filmstripView = this.f13292f;
            filmstripView.f2537l = (int) (((float) filmstripView.f2537l) + f);
            if (filmstripView.mo2638c()) {
                this.f13292f.f2536k.mo12913b(true);
            }
            this.f13292f.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo12912a(int i, int i2, boolean z) {
        FilmstripView filmstripView = this.f13292f;
        if (filmstripView.f2538m[2] != null) {
            this.f13291e = z;
            cur cur = this.f13290d;
            int i3 = filmstripView.f2537l;
            cur.f2969d.cancel();
            cur.f2969d.setDuration((long) i2);
            cur.f2969d.setIntValues(new int[]{i3, (i - i3) + i3});
            cur.f2967b.f2976a = i3;
            cur.f2969d.start();
        }
    }

    /* renamed from: a */
    public final void mo5756a(hfz hfz) {
        FilmstripView filmstripView = this.f13292f;
        filmstripView.f2532g = hfz;
        int max = (int) (((float) Math.max(filmstripView.getHeight(), filmstripView.getWidth())) * 0.7f);
        filmstripView.f2532g.mo7829b(max, max);
        filmstripView.f2532g.mo7822a(new csz(new cup(filmstripView)));
    }

    /* renamed from: b */
    public final void mo5760b(int i) {
        this.f13292f.f2533h = i;
    }

    /* renamed from: a */
    public final void mo5755a(cst cst) {
        this.f13292f.f2539n = cst;
    }

    /* renamed from: b */
    public final boolean mo12913b(boolean z) {
        if (!mo12917h()) {
            return true;
        }
        if (!this.f13291e && !z) {
            return false;
        }
        cur cur = this.f13290d;
        cur.f2968c.forceFinished(true);
        cur.f2969d.cancel();
        return true;
    }
}

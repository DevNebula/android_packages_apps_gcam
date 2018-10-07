package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuq */
public final class cuq implements cth {
    /* renamed from: a */
    private float f13281a;
    /* renamed from: b */
    private float f13282b;
    /* renamed from: c */
    private int f13283c = 0;
    /* renamed from: d */
    private float f13284d;
    /* renamed from: e */
    private cvf f13285e;
    /* renamed from: f */
    private final /* synthetic */ FilmstripView f13286f;

    public cuq(FilmstripView filmstripView) {
        this.f13286f = filmstripView;
    }

    /* renamed from: a */
    public final boolean mo5772a(float f, float f2) {
        float f3 = 1.0f;
        FilmstripView filmstripView = this.f13286f;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf == null) {
            return false;
        }
        if (filmstripView.mo2641e()) {
            this.f13286f.f2536k.mo5761c();
            return true;
        }
        filmstripView = this.f13286f;
        if (filmstripView.f2535j < 1.0f) {
            return false;
        }
        if (!filmstripView.f2536k.mo12913b(false)) {
            return false;
        }
        cuw cuw;
        ValueAnimator valueAnimator;
        float a;
        if (this.f13286f.mo2642f()) {
            cuw = this.f13286f.f2536k;
            valueAnimator = cuw.f13288b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            a = cuw.mo12910a(false);
            if (cuw.f13292f.f2535j < a - (0.1f * a)) {
                f3 = a;
            }
            cuw.f13288b = new ValueAnimator();
            cuw.f13288b.setFloatValues(new float[]{cuw.f13292f.f2535j, f3});
            cuw.f13288b.setDuration(200);
            cuw.f13288b.addListener(new cuz(cuw, f3, cvf, f, f2));
            cuw.f13288b.addUpdateListener(new cva(cuw, cvf, f, f2));
            cuw.f13288b.start();
            cvf cvf2 = this.f13286f.f2538m[2];
            if (!(cvf2 == null || cvf2.f3004i == C0252go.f5800Z)) {
                cvf2.f3004i = C0252go.f5800Z;
                String str = FilmstripView.f2524a;
                int i = cvf2.f3000e;
                StringBuilder stringBuilder = new StringBuilder(43);
                stringBuilder.append("[ViewItem:");
                stringBuilder.append(i);
                stringBuilder.append("] data.renderFullRes()");
                bli.m888a(str, stringBuilder.toString());
                cvf2.f3003h.mo6535b(cvf2.f2997b);
            }
            return true;
        }
        filmstripView = this.f13286f;
        if (filmstripView.f2535j > 1.0f) {
            cuw = filmstripView.f2536k;
            valueAnimator = cuw.f13288b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            a = cuw.mo12910a(false);
            if (cuw.f13292f.f2535j < a - (0.1f * a)) {
                f3 = a;
            }
            cuw.f13288b = new ValueAnimator();
            cuw.f13288b.setFloatValues(new float[]{cuw.f13292f.f2535j, f3});
            cuw.f13288b.setDuration(200);
            cuw.f13288b.addListener(new cuz(cuw, f3, cvf, f, f2));
            cuw.f13288b.addUpdateListener(new cva(cuw, cvf, f, f2));
            cuw.f13288b.start();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5776b(float f, float f2) {
        this.f13283c = 0;
        SystemClock.uptimeMillis();
        this.f13284d = f2;
        cuw cuw = this.f13286f.f2536k;
        if (cuw.mo12916g()) {
            cuw.f13289c.cancel();
        }
        if (this.f13286f.f2536k.mo12913b(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo5778c(float f, float f2) {
        FilmstripView filmstripView = this.f13286f;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf == null) {
            return false;
        }
        cuw cuw;
        float b;
        if (filmstripView.mo2643g()) {
            cuw = this.f13286f.f2536k;
            if (cuw.f13292f.mo2643g()) {
                cvf = cuw.f13292f.f2538m[2];
                if (cvf != null) {
                    float pow = (float) (Math.pow((double) Math.max(Math.abs(f), Math.abs(f2)), 0.3333333432674408d) * 0.05000000074505806d);
                    b = cvf.mo5853b() * cuw.f13292f.f2535j;
                    float c = cvf.mo5856c() * cuw.f13292f.f2535j;
                    float[] fArr = new float[2];
                    fArr[0] = b;
                    fArr[1] = b + ((pow / 4.0f) * f);
                    Animator ofFloat = ValueAnimator.ofFloat(fArr);
                    Animator ofFloat2 = ValueAnimator.ofFloat(new float[]{c, (r7 * f2) + c});
                    ofFloat2.addUpdateListener(new cvb(cuw, ofFloat, ofFloat2, cvf));
                    cuw.f13289c = new AnimatorSet();
                    cuw.f13289c.play(ofFloat).with(ofFloat2);
                    cuw.f13289c.setDuration((long) ((int) (1000.0f * pow)));
                    cuw.f13289c.setInterpolator(new cvc());
                    cuw.f13289c.addListener(new cvd(cuw));
                    cuw.f13289c.start();
                }
            }
            return true;
        } else if (Math.abs(f) < Math.abs(f2)) {
            return true;
        } else {
            FilmstripView filmstripView2;
            if (this.f13286f.f2535j == 1.0f) {
                int a = cvf.mo5846a();
                cvf cvf2;
                if (f > 0.0f) {
                    filmstripView2 = this.f13286f;
                    if (filmstripView2.f2537l <= a) {
                        cvf2 = filmstripView2.f2538m[1];
                        if (cvf2 == null) {
                            return false;
                        }
                        filmstripView2.f2536k.mo12912a(cvf2.mo5846a(), 400, true);
                    } else {
                        filmstripView2.f2536k.mo12912a(a, 400, true);
                        return true;
                    }
                } else if (this.f13286f.f2536k.mo12913b(false)) {
                    filmstripView2 = this.f13286f;
                    if (filmstripView2.f2537l >= a) {
                        cvf2 = filmstripView2.f2538m[3];
                        if (cvf2 == null) {
                            return false;
                        }
                        filmstripView2.f2536k.mo12912a(cvf2.mo5846a(), 400, true);
                    } else {
                        filmstripView2.f2536k.mo12912a(a, 400, true);
                        return true;
                    }
                }
            }
            filmstripView = this.f13286f;
            if (filmstripView.f2535j == 0.7f) {
                cuw = filmstripView.f2536k;
                if (cuw.mo12913b(false)) {
                    filmstripView2 = cuw.f13292f;
                    cvf cvf3 = filmstripView2.f2538m[2];
                    if (cvf3 != null) {
                        b = f / filmstripView2.f2535j;
                        if (filmstripView2.mo2642f() && b < 0.0f) {
                            cuw.mo12915f();
                        }
                        int width = cuw.f13292f.getWidth();
                        int i = cvf3.f3000e;
                        int i2 = cvf3.f3001f;
                        filmstripView2 = cuw.f13292f;
                        int i3 = filmstripView2.f2533h;
                        int d = filmstripView2.f2532g.mo7835d();
                        filmstripView2 = cuw.f13292f;
                        int i4 = filmstripView2.f2533h;
                        cur cur = cuw.f13290d;
                        i3 += width;
                        i = i2 + ((width + i4) * ((d - i) + 100));
                        cur.f2968c.fling(filmstripView2.f2537l, 0, (int) (-f), 0, i2 - (i3 * (i + 100)), i, 0, 0);
                        Handler handler = cur.f2966a;
                        if (!(handler == null || cur.f2967b == null)) {
                            handler.removeCallbacks(cur.f2970e);
                            cur.f2966a.post(cur.f2970e);
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public final void mo5779d(float f, float f2) {
        if (this.f13286f.mo2640d() != cre.f2792c) {
            this.f13286f.f2539n;
            this.f13286f.mo2640d();
        }
    }

    /* renamed from: a */
    public final boolean mo5775a(float f, float f2, int i, long j) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo5777b(float f, float f2, int i, long j) {
        return false;
    }

    /* renamed from: e */
    public final boolean mo5780e(float f, float f2) {
        if (!this.f13286f.f2536k.mo12917h()) {
            FilmstripView filmstripView = this.f13286f;
            if (!filmstripView.f2543r) {
                filmstripView.f2544s = true;
                if (filmstripView.mo2643g()) {
                    filmstripView.f2536k.f13292f.f2540o.mo7803a();
                    filmstripView.f2540o.setVisibility(8);
                }
                this.f13285e = this.f13286f.f2538m[2];
                cvf cvf = this.f13285e;
                if (!(cvf == null || cvf.f3006k)) {
                    cvf.f3006k = true;
                    cvf.f2997b.setAlpha(1.0f);
                }
                this.f13281a = 1.0f;
                this.f13282b = Math.max(this.f13286f.f2536k.mo12910a(true), 1.0f);
                return true;
            }
        }
        this.f13286f.f2544s = false;
        return false;
    }

    /* renamed from: a */
    public final void mo5771a() {
        FilmstripView filmstripView = this.f13286f;
        if (filmstripView.f2544s) {
            filmstripView.f2544s = false;
            cvf cvf = this.f13285e;
            if (cvf != null) {
                cvf.f3006k = false;
            }
            filmstripView.mo2649m();
            filmstripView = this.f13286f;
            if (filmstripView.f2535j <= 1.1f) {
                int i;
                cuw cuw = filmstripView.f2536k;
                for (i = 0; i < 2; i++) {
                    cvf cvf2 = cuw.f13292f.f2538m[i];
                    if (cvf2 != null) {
                        cvf2.mo5851a(0);
                    }
                }
                filmstripView = this.f13286f;
                float f = filmstripView.f2535j;
                if (f <= 0.8f) {
                    filmstripView.f2536k.mo12915f();
                } else if (this.f13281a > 1.0f || f > 0.9f) {
                    if (filmstripView.mo2643g()) {
                        filmstripView = this.f13286f;
                        filmstripView.f2535j = 1.0f;
                        filmstripView.mo2647k();
                    }
                    this.f13286f.f2536k.mo5761c();
                    FilmstripView filmstripView2 = this.f13286f;
                    cvf cvf3 = filmstripView2.f2538m[2];
                    if (cvf3 != null) {
                        if (filmstripView2.mo2644h() || !filmstripView2.mo2636b()) {
                            cve cve = filmstripView2.f2550y;
                            if (cve != null) {
                                cve.mo5845a(cvf3.f3003h);
                            }
                        } else if (filmstripView2.f2536k.mo12917h() || filmstripView2.f2543r) {
                            String str = FilmstripView.f2524a;
                            boolean h = filmstripView2.f2536k.mo12917h();
                            StringBuilder stringBuilder = new StringBuilder(41);
                            stringBuilder.append("[fling] mController.isScrolling() - ");
                            stringBuilder.append(h);
                            bli.m896d(str, stringBuilder.toString());
                        } else {
                            int a = cvf3.mo5846a();
                            i = (int) ((((float) Math.abs(filmstripView2.f2537l - a)) * 600.0f) / ((float) filmstripView2.f2534i.width()));
                            if (i < 0) {
                                i = 400;
                            }
                            bli.m896d(FilmstripView.f2524a, "[fling] Scroll to center.");
                            filmstripView2.f2536k.mo12912a(a, i, false);
                        }
                    }
                } else {
                    filmstripView.f2536k.mo12915f();
                }
                this.f13281a = 1.0f;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5773a(float f, float f2, float f3) {
        int i = 0;
        FilmstripView filmstripView = this.f13286f;
        if (!filmstripView.f2544s) {
            return false;
        }
        this.f13281a = (this.f13281a * 0.3f) + (f3 * 0.7f);
        float f4 = filmstripView.f2535j;
        float f5 = f4 * f3;
        FilmstripView filmstripView2;
        FilmstripView filmstripView3;
        cst cst;
        if (f4 < 1.0f && f5 < 1.0f) {
            float f6;
            if (f5 <= 0.7f) {
                f6 = 0.7f;
            } else {
                f6 = f5;
            }
            if (f4 != f6) {
                if (f4 == 0.7f && filmstripView.f2539n != null) {
                    filmstripView.mo2640d();
                }
                if (f6 == 0.7f) {
                    filmstripView2 = this.f13286f;
                    bli.m888a(FilmstripView.f2524a, "onEnterFilmstrip()");
                    cst cst2 = filmstripView2.f2539n;
                    if (cst2 != null) {
                        filmstripView2.mo2640d();
                        cst2.mo12904c();
                    }
                }
            }
            filmstripView2 = this.f13286f;
            filmstripView2.f2535j = f6;
            filmstripView2.invalidate();
        } else if (f4 < 1.0f && f5 >= 1.0f) {
            if (f4 == 0.7f && filmstripView.f2539n != null) {
                filmstripView.mo2640d();
            }
            filmstripView3 = this.f13286f;
            filmstripView3.f2535j = 1.0f;
            filmstripView3.f2546u = false;
            cst = filmstripView3.f2539n;
            if (cst != null) {
                filmstripView3.mo2640d();
                cst.mo12905d();
            }
            cuw cuw = this.f13286f.f2536k;
            while (i < 2) {
                cvf cvf = cuw.f13292f.f2538m[i];
                if (cvf != null) {
                    cvf.mo5851a(4);
                }
                i++;
            }
            this.f13286f.invalidate();
        } else if (f4 < 1.0f || f5 >= 1.0f) {
            if (!filmstripView.mo2643g()) {
                cuw cuw2 = this.f13286f.f2536k;
                for (int i2 = 0; i2 < 2; i2++) {
                    cvf cvf2 = cuw2.f13292f.f2538m[i2];
                    if (cvf2 != null) {
                        cvf2.mo5851a(4);
                    }
                }
            }
            cvf cvf3 = this.f13286f.f2538m[2];
            float min = Math.min(f5, this.f13282b);
            filmstripView2 = this.f13286f;
            f5 = filmstripView2.f2535j;
            if (min == f5) {
                return true;
            }
            cvf3.mo5849a(f, f2, min / f5, filmstripView2.f2534i.width(), this.f13286f.f2534i.height());
            filmstripView3 = this.f13286f;
            filmstripView3.f2535j = min;
            if (filmstripView3.f2535j == 1.0f) {
                filmstripView3.f2546u = false;
                cst = filmstripView3.f2539n;
                if (cst != null) {
                    filmstripView3.mo2640d();
                    cst.mo12905d();
                }
            }
            cvf3 = this.f13286f.f2538m[2];
            if (!(cvf3 == null || cvf3.f3004i == C0252go.f5800Z)) {
                cvf3.f3004i = C0252go.f5800Z;
                String str = FilmstripView.f2524a;
                int i3 = cvf3.f3000e;
                StringBuilder stringBuilder = new StringBuilder(43);
                stringBuilder.append("[ViewItem:");
                stringBuilder.append(i3);
                stringBuilder.append("] data.renderFullRes()");
                bli.m888a(str, stringBuilder.toString());
                cvf3.f3003h.mo6535b(cvf3.f2997b);
            }
        } else {
            filmstripView.f2535j = 1.0f;
            filmstripView.invalidate();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5774a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j) {
        FilmstripView filmstripView = this.f13286f;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf == null) {
            return false;
        }
        if (i > 1) {
            return false;
        }
        if (filmstripView.mo2643g()) {
            filmstripView.f2536k.f13292f.f2540o.mo7803a();
            filmstripView.f2540o.setVisibility(8);
        }
        cvf cvf2;
        if (this.f13286f.mo2643g()) {
            cvf2 = this.f13286f.f2538m[2];
            float b = cvf2.mo5853b();
            float f7 = this.f13286f.f2535j;
            float c = cvf2.mo5856c();
            FilmstripView filmstripView2 = this.f13286f;
            float f8 = filmstripView2.f2535j;
            cvf2.mo5848a((b * f7) - f5, (c * f8) - f6, f8, f8, filmstripView2.f2534i.width(), this.f13286f.f2534i.height());
            return true;
        }
        filmstripView = this.f13286f;
        int i2 = (int) (f5 / filmstripView.f2535j);
        filmstripView.f2536k.mo12913b(true);
        filmstripView = this.f13286f;
        if (!filmstripView.f2543r) {
            filmstripView.f2543r = true;
        }
        int i3;
        if (filmstripView.mo2641e()) {
            if (this.f13283c == 0) {
                if (Math.abs(f5) > Math.abs(f6)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                this.f13283c = i3;
            }
            if (this.f13283c != 2) {
                int i4;
                Rect rect = new Rect();
                i3 = 0;
                while (true) {
                    i4 = i3;
                    if (i4 >= 5) {
                        break;
                    }
                    cvf2 = this.f13286f.f2538m[i4];
                    if (cvf2 != null) {
                        cvf2.f2997b.getHitRect(rect);
                        if (rect.contains((int) f3, (int) f4)) {
                            break;
                        }
                    }
                    i3 = i4 + 1;
                }
                if (i4 == 5) {
                    return true;
                }
                err e = this.f13286f.f2538m[i4].f3002g.mo5692e();
                float c2 = this.f13286f.f2538m[i4].mo5856c() - (f6 / this.f13286f.f2535j);
                if (!e.mo6540f().mo6550c() && c2 > 0.0f) {
                    c2 = 0.0f;
                }
                if (!e.mo6540f().mo6550c() && r0 < 0.0f) {
                    c2 = 0.0f;
                }
                this.f13286f.f2538m[i4].mo5857c(c2);
            } else if (this.f13286f.f2537l == cvf.mo5846a() && cvf.mo5858d() && f5 < 0.0f) {
                this.f13286f.f2543r = false;
                this.f13283c = 0;
                return false;
            } else {
                this.f13286f.f2536k.mo12911a((float) i2);
            }
        } else if (this.f13286f.mo2642f()) {
            if (this.f13283c == 0) {
                if (Math.abs(f5) > Math.abs(f6)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                this.f13283c = i3;
            }
            if (this.f13283c != 1) {
                filmstripView = this.f13286f;
                if (filmstripView.f2538m[2] == null || (i2 < 0 && filmstripView.f2537l <= cvf.mo5846a() && cvf.mo5858d())) {
                    this.f13286f.f2543r = false;
                    this.f13283c = 0;
                    return false;
                }
                this.f13286f.f2536k.mo12911a((float) i2);
            } else if (this.f13286f.mo2644h()) {
                return false;
            } else {
                return true;
            }
        }
        this.f13286f.invalidate();
        return true;
    }

    /* renamed from: f */
    public final boolean mo5781f(float f, float f2) {
        FilmstripView filmstripView = this.f13286f;
        cvf cvf = filmstripView.f2538m[2];
        if (cvf == null) {
            return false;
        }
        err err = cvf.f3003h;
        if (filmstripView.mo2641e() && cvf.f2998c.contains(f, f2)) {
            if (!(err == null || err.mo6533a(this.f13286f.f2527b, cvf.f3002g))) {
                this.f13286f.f2536k.mo5761c();
            }
            return true;
        } else if (!this.f13286f.mo2642f() && !this.f13286f.mo2643g()) {
            return false;
        } else {
            if (!(err == null || err.mo6533a(this.f13286f.f2527b, cvf.f3002g))) {
                filmstripView = this.f13286f;
                cst cst;
                if (filmstripView.f2546u) {
                    filmstripView.f2546u = false;
                    cst = filmstripView.f2539n;
                    if (cst != null) {
                        filmstripView.mo2640d();
                        cst.mo12905d();
                    }
                    this.f13286f.f2529d.mo13443l();
                } else {
                    filmstripView.f2546u = true;
                    cst = filmstripView.f2539n;
                    if (cst != null) {
                        filmstripView.mo2640d();
                        cfk cfk = cst.f13242a;
                        if (cfk.f23076X) {
                            cfk.f23072T = true;
                            cfk.mo14584Q();
                            cfk cfk2 = cst.f13242a;
                            ikd.m12501a();
                            if (!cfk2.f23073U) {
                                bli.m896d(cfk.f23052a, "stopPreviewWhenEnteringFilmstrip");
                                cfk2.f23073U = true;
                                cfk2.f23187v.execute(cfk2.f23107ac);
                                cfk2.f23108ad.mo8826a((Boolean) cfk2.f23131b.mo2303b().mo13673b());
                            }
                        }
                    }
                    this.f13286f.f2529d.mo13443l();
                }
            }
            return true;
        }
    }

    /* renamed from: g */
    public final boolean mo5782g(float f, float f2) {
        FilmstripView filmstripView = this.f13286f;
        if (filmstripView.f2538m[2] == null) {
            return false;
        }
        if (filmstripView.f2536k.mo12918i() || this.f13286f.f2536k.mo12916g()) {
            return false;
        }
        cvf cvf;
        if (this.f13286f.mo2643g()) {
            cuw cuw = this.f13286f.f2536k;
            if (cuw.f13292f.mo2643g()) {
                cvf cvf2 = cuw.f13292f.f2538m[2];
                if (cvf2 != null) {
                    err e = cvf2.f3002g.mo5692e();
                    if (e.mo6540f().mo6551d()) {
                        Uri uri;
                        cvf = cuw.f13292f.f2538m[2];
                        if (cvf == null) {
                            uri = Uri.EMPTY;
                        } else {
                            uri = cvf.f3003h.mo6541g().f4384h;
                        }
                        RectF rectF = new RectF();
                        rectF.left = cvf2.f2997b.getX();
                        rectF.top = cvf2.f2997b.getY();
                        rectF.right = rectF.left + (((float) cvf2.f2997b.getWidth()) * cvf2.f2997b.getScaleX());
                        rectF.bottom = (cvf2.f2997b.getScaleY() * ((float) cvf2.f2997b.getHeight())) + rectF.top;
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
            return true;
        }
        int i;
        FilmstripView filmstripView2;
        this.f13286f.getHeight();
        this.f13286f.getHeight();
        this.f13286f.f2543r = false;
        this.f13283c = 0;
        Math.abs(f2 - this.f13284d);
        SystemClock.uptimeMillis();
        for (i = 0; i < 5; i++) {
            cvf cvf3 = this.f13286f.f2538m[i];
            if (!(cvf3 == null || cvf3.mo5856c() == 0.0f)) {
                filmstripView2 = this.f13286f;
                filmstripView2.mo2633a(filmstripView2.f2538m[i]);
            }
        }
        filmstripView2 = this.f13286f;
        cvf = filmstripView2.f2538m[2];
        if (cvf == null) {
            return true;
        }
        if (cvf != null) {
            if (filmstripView2.mo2644h() || !filmstripView2.mo2636b()) {
                cve cve = filmstripView2.f2550y;
                if (cve != null) {
                    cve.mo5845a(cvf.f3003h);
                }
            } else if (filmstripView2.f2536k.mo12917h() || filmstripView2.f2543r) {
                String str = FilmstripView.f2524a;
                boolean h = filmstripView2.f2536k.mo12917h();
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("[fling] mController.isScrolling() - ");
                stringBuilder.append(h);
                bli.m896d(str, stringBuilder.toString());
            } else {
                int a = cvf.mo5846a();
                i = (int) ((((float) Math.abs(filmstripView2.f2537l - a)) * 600.0f) / ((float) filmstripView2.f2534i.width()));
                if (i < 0) {
                    i = 400;
                }
                bli.m896d(FilmstripView.f2524a, "[fling] Scroll to center.");
                filmstripView2.f2536k.mo12912a(a, i, false);
            }
        }
        return false;
    }
}

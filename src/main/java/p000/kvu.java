package p000;

import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: PG */
/* renamed from: kvu */
final class kvu implements Runnable {
    /* renamed from: a */
    private long f9070a;
    /* renamed from: b */
    private float f9071b;
    /* renamed from: c */
    private float f9072c;
    /* renamed from: d */
    private float f9073d;
    /* renamed from: e */
    private float f9074e;
    /* renamed from: f */
    private boolean f9075f;
    /* renamed from: g */
    private AccelerateDecelerateInterpolator f9076g = new AccelerateDecelerateInterpolator();
    /* renamed from: h */
    private PointF f9077h;
    /* renamed from: i */
    private PointF f9078i;
    /* renamed from: j */
    private final /* synthetic */ kvr f9079j;

    kvu(kvr kvr, float f, float f2, float f3, boolean z) {
        this.f9079j = kvr;
        kvr.f9044c = C0252go.f5917cj;
        this.f9070a = System.currentTimeMillis();
        this.f9071b = kvr.f9042a;
        this.f9072c = f;
        this.f9075f = z;
        PointF a = kvr.mo10530a(f2, f3, false);
        this.f9073d = a.x;
        this.f9074e = a.y;
        float f4 = this.f9073d;
        float f5 = this.f9074e;
        kvr.f9043b.getValues(kvr.f9047f);
        int intrinsicWidth = kvr.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = kvr.getDrawable().getIntrinsicHeight();
        this.f9077h = new PointF(((f4 / ((float) intrinsicWidth)) * kvr.mo10535d()) + kvr.f9047f[2], ((f5 / ((float) intrinsicHeight)) * kvr.mo10533c()) + kvr.f9047f[5]);
        this.f9078i = new PointF((float) (kvr.f9050i / 2), (float) (kvr.f9051j / 2));
    }

    public final void run() {
        float interpolation = this.f9076g.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f9070a)) / 500.0f));
        float f = this.f9071b;
        float f2 = this.f9072c;
        kvr kvr = this.f9079j;
        kvr.m5522a(((double) (f + ((f2 - f) * interpolation))) / ((double) kvr.f9042a), this.f9073d, this.f9074e, this.f9075f);
        PointF pointF = this.f9077h;
        f = pointF.x;
        PointF pointF2 = this.f9078i;
        float f3 = pointF2.x;
        float f4 = pointF.x;
        float f5 = pointF.y;
        f2 = pointF2.y;
        float f6 = pointF.y;
        kvr kvr2 = this.f9079j;
        float f7 = this.f9073d;
        float f8 = this.f9074e;
        kvr2.f9043b.getValues(kvr2.f9047f);
        int intrinsicWidth = kvr2.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = kvr2.getDrawable().getIntrinsicHeight();
        PointF pointF3 = new PointF(((f7 / ((float) intrinsicWidth)) * kvr2.mo10535d()) + kvr2.f9047f[2], (kvr2.mo10533c() * (f8 / ((float) intrinsicHeight))) + kvr2.f9047f[5]);
        this.f9079j.f9043b.postTranslate((f + ((f3 - f4) * interpolation)) - pointF3.x, (((f2 - f6) * interpolation) + f5) - pointF3.y);
        this.f9079j.mo10531a();
        kvr = this.f9079j;
        kvr.setImageMatrix(kvr.f9043b);
        kvr = this.f9079j;
        if (interpolation >= 1.0f) {
            kvr.f9044c = C0252go.f5913cf;
        } else {
            kvr.postOnAnimation(this);
        }
    }
}

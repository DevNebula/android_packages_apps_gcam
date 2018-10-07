package com.google.android.apps.camera.legacy.app.filmstrip.transition;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import p000.bli;
import p000.cto;
import p000.ctp;
import p000.ctq;
import p000.ctr;
import p000.cts;
import p000.ctt;
import p000.ctu;
import p000.ctv;
import p000.hhz;
import p000.hjf;
import p000.jri;

@TargetApi(23)
/* compiled from: PG */
public class FilmstripTransitionLayout extends FrameLayout {
    /* renamed from: a */
    public static final String f2503a = bli.m887a("FSTransLayout");
    /* renamed from: b */
    public final ValueAnimator f2504b;
    /* renamed from: c */
    public final ValueAnimator f2505c;
    /* renamed from: d */
    public boolean f2506d = false;
    /* renamed from: e */
    public boolean f2507e = false;
    /* renamed from: f */
    public FilmstripTransitionThumbnailView f2508f;
    /* renamed from: g */
    public RoundedThumbnailView f2509g;
    /* renamed from: h */
    public ctt f2510h = null;
    /* renamed from: i */
    public ctt f2511i = null;
    /* renamed from: j */
    public boolean f2512j = true;
    /* renamed from: k */
    public ctu f2513k;
    /* renamed from: l */
    public cto f2514l;

    public FilmstripTransitionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(4);
        mo2614a(0.0f);
        TimeInterpolator loadInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
        this.f2504b = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f2504b.setDuration(350);
        this.f2504b.setInterpolator(loadInterpolator);
        this.f2504b.addUpdateListener(new ctp(this));
        this.f2504b.addListener(new ctq(this));
        this.f2505c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2505c.setDuration(350);
        this.f2505c.setInterpolator(loadInterpolator);
        this.f2505c.addUpdateListener(new ctr(this));
        this.f2505c.addListener(new cts(this));
    }

    /* renamed from: a */
    public final ctv mo2613a() {
        int i = 0;
        jri.m13404b(this.f2509g);
        SizeF sizeF = new SizeF((float) this.f2508f.mo2622a().getWidth(), (float) this.f2508f.mo2622a().getHeight());
        float thumbnailFinalDiameter = this.f2509g.getThumbnailFinalDiameter();
        int a = hhz.m3208a(this.f2509g);
        int b = hhz.m3215b(this.f2509g);
        float rippleRingMaxDiameterDp = this.f2509g.getRippleRingMaxDiameterDp();
        float f = (float) a;
        float f2 = (float) b;
        RectF rectF = new RectF(f, f2, f + rippleRingMaxDiameterDp, rippleRingMaxDiameterDp + f2);
        View rootView = getRootView();
        int[] c = hhz.m3216c(rootView);
        int i2 = c[0];
        RectF rectF2 = new RectF((float) i2, (float) c[1], (float) (i2 + rootView.getWidth()), (float) (rootView.getHeight() + c[1]));
        Context context = getContext();
        Point point = new Point();
        ((Activity) context).getWindowManager().getDefaultDisplay().getRealSize(point);
        RectF rectF3 = new RectF(0.0f, 0.0f, (float) point.x, (float) point.y);
        if (hjf.m3248a().f6634c.f7869d) {
            int i3;
            c = hhz.m3216c(getRootView());
            if (c[0] != 0) {
                i3 = 1;
            } else if (c[1] != 0) {
                i3 = 1;
            } else if (getRootWindowInsets().getDisplayCutout() != null) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                c = hhz.m3216c(getRootView());
                WindowInsets rootWindowInsets = getRootWindowInsets();
                if (getResources().getConfiguration().orientation == 1) {
                    i3 = Math.max(c[1] + rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetBottom());
                } else {
                    int max = Math.max(c[0] + rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetRight());
                    i3 = 0;
                    i = max;
                }
                Point point2 = new Point(i, i3);
                rectF3.inset((float) point2.x, (float) point2.y);
            }
        }
        return new ctv(sizeF, rectF2, rectF3, rectF, thumbnailFinalDiameter);
    }

    /* renamed from: b */
    public final void mo2618b() {
        this.f2513k = mo2613a().mo5815a();
        mo2619c();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2508f = (FilmstripTransitionThumbnailView) findViewById(R.id.transition_thumbnail_view);
    }

    /* renamed from: a */
    public final void mo2614a(float f) {
        setBackgroundColor(Color.argb((int) (255.0f * f), 0, 0, 0));
    }

    /* renamed from: a */
    public final void mo2615a(Bitmap bitmap) {
        FilmstripTransitionThumbnailView filmstripTransitionThumbnailView = this.f2508f;
        synchronized (filmstripTransitionThumbnailView.f2515a) {
            filmstripTransitionThumbnailView.f2516b = bitmap;
            filmstripTransitionThumbnailView.setLayoutParams(new LayoutParams(filmstripTransitionThumbnailView.f2516b.getWidth(), filmstripTransitionThumbnailView.f2516b.getHeight()));
            filmstripTransitionThumbnailView.requestLayout();
            Paint paint = new Paint(1);
            paint.setShader(new BitmapShader(filmstripTransitionThumbnailView.f2516b, TileMode.CLAMP, TileMode.CLAMP));
            filmstripTransitionThumbnailView.f2517c = new Paint(paint);
        }
        if (this.f2504b.isRunning()) {
            this.f2513k = mo2613a().mo5815a();
        }
    }

    /* renamed from: a */
    public final void mo2617a(RoundedThumbnailView roundedThumbnailView) {
        jri.m13404b((Object) roundedThumbnailView);
        this.f2509g = roundedThumbnailView;
    }

    /* renamed from: c */
    public final void mo2619c() {
        float c = this.f2513k.mo5812c(0.0f);
        this.f2508f.setScaleX(c);
        this.f2508f.setScaleY(c);
        PointF d = this.f2513k.mo5813d(0.0f);
        this.f2508f.setTranslationX(d.x);
        this.f2508f.setTranslationY(d.y);
        this.f2508f.mo2623a(this.f2513k.mo5811b(0.0f));
        mo2614a(this.f2513k.mo5810a(0.0f));
    }

    /* renamed from: d */
    public final void mo2620d() {
        float c = this.f2513k.mo5812c(1.0f);
        this.f2508f.setScaleX(c);
        this.f2508f.setScaleY(c);
        PointF d = this.f2513k.mo5813d(1.0f);
        this.f2508f.setTranslationX(d.x);
        this.f2508f.setTranslationY(d.y);
        this.f2508f.mo2623a(this.f2513k.mo5811b(1.0f));
        mo2614a(this.f2513k.mo5810a(1.0f));
    }

    /* renamed from: a */
    public final void mo2616a(Bitmap bitmap, ctt ctt) {
        mo2615a(bitmap);
        this.f2510h = ctt;
        this.f2513k = mo2613a().mo5815a();
        mo2620d();
        this.f2504b.start();
        this.f2514l = null;
    }
}

package com.google.android.apps.camera.burstchip;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import p000.bdg;
import p000.bdh;
import p000.bdi;
import p000.bdj;
import p000.bdk;
import p000.bdl;
import p000.bdm;
import p000.bdn;
import p000.bdo;
import p000.bdp;
import p000.bdq;
import p000.bdr;
import p000.bds;
import p000.bdt;
import p000.bdu;
import p000.bdv;
import p000.bdw;

@TargetApi(21)
/* compiled from: PG */
public class BurstChip extends View {
    /* renamed from: A */
    private boolean f2429A;
    /* renamed from: a */
    public GradientDrawable f2430a;
    /* renamed from: b */
    public AnimatedVectorDrawable f2431b;
    /* renamed from: c */
    public float f2432c;
    /* renamed from: d */
    public float f2433d;
    /* renamed from: e */
    public float f2434e;
    /* renamed from: f */
    public float f2435f;
    /* renamed from: g */
    public float f2436g;
    /* renamed from: h */
    public float f2437h;
    /* renamed from: i */
    public Paint f2438i;
    /* renamed from: j */
    public int f2439j;
    /* renamed from: k */
    public int f2440k;
    /* renamed from: l */
    public Animator f2441l;
    /* renamed from: m */
    public Animator f2442m;
    /* renamed from: n */
    public Animator f2443n;
    /* renamed from: o */
    public Animator f2444o;
    /* renamed from: p */
    public AnimatorSet f2445p;
    /* renamed from: q */
    private Interpolator f2446q;
    /* renamed from: r */
    private Interpolator f2447r;
    /* renamed from: s */
    private float f2448s;
    /* renamed from: t */
    private float f2449t;
    /* renamed from: u */
    private float f2450u;
    /* renamed from: v */
    private float f2451v;
    /* renamed from: w */
    private String f2452w;
    /* renamed from: x */
    private Rect f2453x;
    /* renamed from: y */
    private float f2454y;
    /* renamed from: z */
    private float f2455z;

    public BurstChip(Context context) {
        super(context);
        m1247a(context);
    }

    public BurstChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1247a(context);
    }

    /* renamed from: a */
    public final void mo2569a() {
        mo2571b();
        this.f2442m.cancel();
    }

    /* renamed from: b */
    public final void mo2571b() {
        this.f2441l.cancel();
        this.f2443n.cancel();
        this.f2445p.cancel();
        this.f2444o.cancel();
    }

    /* renamed from: a */
    private final void m1247a(Context context) {
        this.f2446q = AnimationUtils.loadInterpolator(context, 17563661);
        this.f2447r = AnimationUtils.loadInterpolator(context, 17563659);
        Theme theme = context.getTheme();
        this.f2448s = context.getResources().getDimension(R.dimen.burst_animation_width);
        this.f2449t = context.getResources().getDimension(R.dimen.burst_animation_height);
        this.f2432c = context.getResources().getDimension(R.dimen.burst_animation_chip_width);
        this.f2433d = context.getResources().getDimension(R.dimen.burst_animation_chip_height);
        this.f2434e = context.getResources().getDimension(R.dimen.burst_animation_corner_radius);
        this.f2451v = context.getResources().getDimension(R.dimen.burst_text_height);
        this.f2450u = context.getResources().getDimension(R.dimen.burst_text_chip_width_padding);
        this.f2436g = context.getResources().getDimension(R.dimen.burst_text_chip_height);
        this.f2437h = context.getResources().getDimension(R.dimen.burst_text_corner_radius);
        this.f2430a = (GradientDrawable) context.getResources().getDrawable(R.drawable.chip_background, theme);
        this.f2431b = (AnimatedVectorDrawable) context.getResources().getDrawable(R.drawable.ic_burst_animation, theme);
        this.f2438i = new Paint();
        this.f2438i.setColor(-1);
        this.f2438i.setAlpha(0);
        this.f2438i.setTypeface(Typeface.defaultFromStyle(0));
        this.f2438i.setTextSize(this.f2451v);
        this.f2438i.setAntiAlias(true);
        this.f2453x = new Rect();
        this.f2452w = "";
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(this.f2446q);
        ofFloat.setDuration(200);
        ofFloat.addUpdateListener(new bdg(this));
        Animator ofInt = ValueAnimator.ofInt(new int[]{0, Illuminant.kOther});
        ofInt.setInterpolator(this.f2447r);
        ofInt.setDuration(100);
        ofInt.addUpdateListener(new bdp(this));
        ofInt.addListener(new bdq(this));
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofInt).after(100);
        animatorSet.addListener(new bdr(this));
        this.f2441l = animatorSet;
        ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(this.f2446q);
        ofFloat.setDuration(200);
        ofFloat.addUpdateListener(new bds(this));
        ofInt = ValueAnimator.ofInt(new int[]{0, Illuminant.kOther});
        ofInt.setInterpolator(this.f2447r);
        ofInt.setDuration(500);
        ofInt.addUpdateListener(new bdt(this));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat);
        animatorSet2.play(ofInt);
        animatorSet2.addListener(new bdu(this));
        this.f2445p = animatorSet2;
        ofFloat = ValueAnimator.ofInt(new int[]{Illuminant.kOther, 0});
        ofFloat.setInterpolator(this.f2447r);
        ofFloat.setDuration(750);
        ofFloat.addUpdateListener(new bdv(this));
        ofFloat.addListener(new bdw(this));
        this.f2442m = ofFloat;
        ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(this.f2446q);
        ofFloat.setDuration(350);
        ofFloat.addUpdateListener(new bdk(this));
        ofInt = ValueAnimator.ofInt(new int[]{0, Illuminant.kOther});
        ofInt.addUpdateListener(new bdl(this));
        ofInt.setDuration(217);
        animatorSet = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        animatorSet.setDuration(500);
        animatorSet.setInterpolator(this.f2447r);
        animatorSet.addUpdateListener(new bdm(this));
        animatorSet.addListener(new bdn(this));
        Animator animatorSet3 = new AnimatorSet();
        animatorSet3.play(ofFloat);
        animatorSet3.play(ofInt).after(133);
        animatorSet3.addListener(new bdo(this));
        animatorSet3.play(animatorSet).after(2850);
        this.f2443n = animatorSet3;
        ofFloat = ValueAnimator.ofInt(new int[]{Illuminant.kOther, 0});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(this.f2447r);
        ofFloat.addUpdateListener(new bdh(this));
        ofInt = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofInt.setInterpolator(this.f2446q);
        ofInt.setDuration(200);
        ofInt.addUpdateListener(new bdi(this));
        animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofInt).after(500);
        animatorSet.addListener(new bdj(this));
        this.f2444o = animatorSet;
        setBackground(this.f2430a);
        setVisibility(8);
        this.f2431b.setVisible(false, true);
        this.f2431b.setCallback(this);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2431b.draw(canvas);
        canvas.drawText(this.f2452w, this.f2454y, this.f2455z, this.f2438i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z || this.f2429A) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            float f = this.f2448s;
            float f2 = (((float) i5) - f) / 2.0f;
            float f3 = this.f2449t;
            float f4 = (((float) i6) - f3) / 2.0f;
            this.f2431b.setBounds((int) f2, (int) f4, (int) (f + f2), (int) (f4 + f3));
            int width = this.f2453x.width();
            int height = this.f2453x.height();
            Rect rect = this.f2453x;
            this.f2454y = (((float) (i5 - width)) / 2.0f) - ((float) rect.left);
            this.f2455z = (((float) (i6 - height)) / 2.0f) - ((float) rect.top);
            this.f2429A = false;
        }
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(MeasureSpec.makeMeasureSpec(this.f2439j, 1073741824), MeasureSpec.makeMeasureSpec(this.f2440k, 1073741824));
    }

    /* renamed from: a */
    public final void mo2570a(String str) {
        this.f2452w = str;
        Paint paint = this.f2438i;
        String str2 = this.f2452w;
        paint.getTextBounds(str2, 0, str2.length(), this.f2453x);
        int width = this.f2453x.width();
        float f = this.f2450u;
        this.f2435f = ((float) width) + (f + f);
        this.f2429A = true;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f2431b || super.verifyDrawable(drawable);
    }
}

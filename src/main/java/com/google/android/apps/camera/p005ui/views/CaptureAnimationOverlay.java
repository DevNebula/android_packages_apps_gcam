package com.google.android.apps.camera.p005ui.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p000.C0252go;
import p000.bli;
import p000.hfd;
import p000.hfe;
import p000.hff;
import p000.hfg;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.views.CaptureAnimationOverlay */
public class CaptureAnimationOverlay extends View {
    /* renamed from: a */
    public int f2614a = C0252go.f5899bs;
    /* renamed from: b */
    public final RectF f2615b = new RectF();
    /* renamed from: c */
    public final Paint f2616c = new Paint();
    /* renamed from: d */
    public AnimatorSet f2617d;
    /* renamed from: e */
    public AnimatorSet f2618e;
    /* renamed from: f */
    private final Interpolator f2619f;
    /* renamed from: g */
    private final Interpolator f2620g;
    /* renamed from: h */
    private final Interpolator f2621h;
    /* renamed from: i */
    private final AnimatorUpdateListener f2622i;

    static {
        bli.m887a("CaptureAnimOverlay");
    }

    public CaptureAnimationOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2616c.setColor(-16777216);
        this.f2619f = new LinearInterpolator();
        this.f2620g = AnimationUtils.loadInterpolator(getContext(), 17563661);
        this.f2621h = AnimationUtils.loadInterpolator(getContext(), 17563663);
        this.f2622i = new hfd(this);
    }

    /* renamed from: a */
    public final void mo2739a(boolean z) {
        Animator ofFloat;
        AnimatorSet animatorSet = this.f2618e;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f2618e.cancel();
        }
        if (z) {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 0.6f});
            ofFloat.setDuration(167);
            ofFloat.setInterpolator(this.f2620g);
        } else {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.6f, 0.0f});
            ofFloat.setDuration(133);
            ofFloat.setInterpolator(this.f2621h);
        }
        ofFloat.addUpdateListener(this.f2622i);
        this.f2618e = new AnimatorSet();
        this.f2618e.play(ofFloat);
        this.f2618e.addListener(new hfg(this, z));
        this.f2618e.start();
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onDraw(Canvas canvas) {
        if (this.f2614a != C0252go.f5899bs) {
            canvas.drawRect(this.f2615b, this.f2616c);
            canvas.clipRect(this.f2615b);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2615b.set((float) i, (float) i2, (float) i3, (float) i4);
    }

    /* renamed from: a */
    public final void mo2738a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.76f, 0.76f});
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.76f, 0.0f});
        ofFloat.setDuration(66);
        ofFloat2.setDuration(166);
        ofFloat.addUpdateListener(this.f2622i);
        ofFloat2.addUpdateListener(this.f2622i);
        ofFloat.setInterpolator(this.f2619f);
        ofFloat2.setInterpolator(this.f2619f);
        ofFloat.addListener(new hfe(this, ofFloat2));
        ofFloat2.addListener(new hff(this));
        ofFloat.start();
    }
}

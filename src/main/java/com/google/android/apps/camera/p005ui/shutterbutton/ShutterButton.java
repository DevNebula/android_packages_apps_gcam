package com.google.android.apps.camera.p005ui.shutterbutton;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0704ks;
import p000.bli;
import p000.epf;
import p000.eph;
import p000.hbb;
import p000.hbc;
import p000.hbd;
import p000.hbe;
import p000.hbf;
import p000.hbg;
import p000.hbh;
import p000.hbi;
import p000.hbj;
import p000.hbk;
import p000.hbl;
import p000.hbm;
import p000.hbn;
import p000.hbo;
import p000.hbp;
import p000.hbq;
import p000.hbr;
import p000.hbs;
import p000.hbt;
import p000.hbu;
import p000.hbv;
import p000.hbw;
import p000.hbx;
import p000.hby;
import p000.hbz;
import p000.hch;
import p000.hcj;
import p000.hck;
import p000.hcl;
import p000.hin;
import p000.ilb;
import p000.ilp;
import p000.ilq;
import p000.iya;
import p000.jri;
import p000.kda;
import p000.ken;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.shutterbutton.ShutterButton */
public class ShutterButton extends ImageButton {
    public static final float BUTTON_CLICK_SPLASH_FACTOR = 1.06f;
    public static final int BUTTON_CLICK_SPLASH_IN_DURATION_MS = 250;
    public static final int BUTTON_CLICK_SPLASH_OUT_DURATION_MS = 100;
    public static final int BUTTON_DISABLED_DELAY_MS = 500;
    public static final int DISABLED_FILTER_COLOR_VALUE = 165;
    public static final int LONG_PRESS_DURATION_MS = 350;
    public static final int PHOTO_DISABLE_ANIMATION_DURATION_MS = 150;
    public static final String TAG = bli.m887a("ShutterButton");
    public int buttonCenterX;
    public int buttonCenterY;
    public RectF buttonRect;
    public int buttonSize;
    public boolean clickEnabled = true;
    public ilb clickEnabledObservable = new ilb(Boolean.valueOf(this.clickEnabled));
    public Paint currentInnerPortraitRingPaint;
    public Paint currentMainButtonPaint;
    public Paint currentOuterPortraitRingPaint;
    public Paint currentPhotoCirclePaint;
    public Paint currentRipplePaint;
    public float currentScaleFactor;
    public hck currentSpec;
    public Paint currentVideoCirclePaint;
    public int disabledFilterGreyValue;
    public ValueAnimator enableStateChangeAnimator;
    public final ilp filteredClickEnabledObservable = ilq.m3889b(this.clickEnabledObservable);
    public hcl gestureDetector;
    public final AtomicBoolean isLongPressInProgress = new AtomicBoolean(false);
    public boolean isVideoButtonAnimating;
    public hch listener;
    public AnimatorSet modeTransitionAnimatorSet;
    public boolean oldPressed;
    public hbe onDrawListener;
    public hin touchCoordinate;
    public int videoButtonStopSquareHalfSize;
    public Paint videoButtonStopSquarePaint;

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    private void animateMainButton(hbf hbf, hbh hbh) {
        cancelModeTransitionAnimations(true);
        hcj a = hcj.m3084a(hbf, getResources());
        while (true) {
            hbh.f6275c = hbh.f6274b.getSpec();
            hbh.f6276d = a;
            hbh.f6277e = hbh.mo7634a(hbh.f6275c.mo7686h(), a.mo7686h(), new hbi(hbh));
            hbh.f6278f = hbh.mo7634a(hbh.f6275c.mo7694p(), a.mo7694p(), new hbj(hbh));
            hbh.f6279g = hbh.mo7634a(hbh.f6275c.mo7692n(), a.mo7692n(), new hbp(hbh));
            hbh.f6281i = hbh.mo7634a(hbh.f6275c.mo7681c(), a.mo7681c(), new hbq(hbh));
            hbh.f6282j = hbh.mo7634a(0, 1, new hbr(hbh, a));
            hbh.f6280h = hbh.mo7634a(hbh.f6275c.mo7684f(), a.mo7684f(), new hbs(hbh));
            hbh.f6283k = hbh.mo7634a(hbh.f6275c.mo7689k(), a.mo7689k(), new hbt(hbh));
            hbh.f6284l = hbh.mo7634a(0, 1, new hbu(hbh, a));
            hbh.f6285m = hbh.mo7634a(hbh.f6275c.mo7690l(), a.mo7690l(), new hbv(hbh));
            hbh.f6286n = hbh.mo7634a(0, 1, new hbw(hbh, a));
            hbh.f6288p = hbh.mo7634a(hbh.f6275c.mo7687i(), a.mo7687i(), new hbk(hbh));
            hbh.f6287o = hbh.mo7634a(hbh.f6275c.mo7688j(), a.mo7688j(), new hbl(hbh));
            hbh.f6289q = hbh.mo7634a(hbh.f6275c.mo7691m(), a.mo7691m(), new hbm(hbh));
            hbh.f6290r = hbh.mo7634a(0, 1, new hbn(hbh));
            hbh.f6291s = ken.m13712a(hbh.f6290r, hbh.f6279g, hbh.f6277e, hbh.f6280h, hbh.f6278f, hbh.f6281i, hbh.f6282j, hbh.f6283k, hbh.f6285m, hbh.f6286n, hbh.f6284l, hbh.f6288p, hbh.f6287o);
            switch (hbh.f6275c.mo7683e().ordinal()) {
                case 0:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 1:
                            hbh.mo7636a(hbh.f6280h).mo7656a(50).mo7659d();
                            hbh.mo7636a(hbh.f6283k).mo7656a(50).mo7657b();
                            break;
                        case 2:
                            hbh.mo7636a(hbh.f6282j).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6285m).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6283k).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6277e).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6288p).mo7656a(400);
                            hbh.mo7636a(hbh.f6287o).mo7656a(600);
                            hbh.mo7636a(hbh.f6289q).mo7656a(800);
                            break;
                        case 4:
                            hbh.f6274b.resetTo(hbf.PHOTO_PRESSED);
                            a = hbh.f6276d;
                            continue;
                            continue;
                        case 5:
                            hbh.mo7636a(hbh.f6277e).mo7656a(400);
                            hbh.mo7636a(hbh.f6280h).mo7659d().mo7656a(LONG_PRESS_DURATION_MS).mo7655a();
                            hbh.mo7636a(hbh.f6278f).mo7656a(LONG_PRESS_DURATION_MS).mo7655a();
                            break;
                        case 6:
                            hbh.mo7636a(hbh.f6281i).mo7656a(500);
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.f6274b.currentSpec.f6329c = hbh.f6276d.mo7680b();
                            break;
                        case 8:
                            hbh.f6274b.setClickEnabled(false);
                            hbh.mo7636a(hbh.f6277e).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6281i).mo7656a(500);
                            hbh.f6274b.currentSpec.f6329c = hbh.f6276d.mo7680b();
                            break;
                        case 9:
                            hbh.mo7636a(hbh.f6277e).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d().mo7660e();
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6281i).mo7656a(500);
                            hbh.f6274b.currentSpec.f6329c = hbh.f6276d.mo7680b();
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 1:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.mo7636a(hbh.f6280h).mo7656a(50).mo7659d();
                            hbh.mo7636a(hbh.f6283k).mo7656a(50).mo7657b();
                            break;
                        case 4:
                            hbh.f6285m.setRepeatCount(9);
                            hbh.f6285m.setRepeatMode(1);
                            hbh.mo7636a(hbh.f6285m).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.mo7636a(hbh.f6283k).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d().mo7657b();
                            hbh.mo7636a(hbh.f6286n).mo7656a(1967).mo7659d();
                            break;
                        default:
                            hbh.f6274b.resetTo(hbf.PHOTO_IDLE);
                            a = hbh.f6276d;
                            continue;
                            continue;
                    }
                case 2:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.mo7636a(hbh.f6282j).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6285m).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6283k).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6277e).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6288p).mo7656a(400);
                            hbh.mo7636a(hbh.f6287o).mo7656a(600);
                            hbh.mo7636a(hbh.f6289q).mo7656a(800);
                            break;
                        case 3:
                            hbh.mo7636a(hbh.f6283k).mo7656a(80);
                            hbh.mo7636a(hbh.f6285m).mo7656a(80).mo7657b();
                            hbh.mo7636a(hbh.f6277e).mo7656a(80);
                            hbh.mo7636a(hbh.f6288p).mo7656a(80);
                            hbh.mo7636a(hbh.f6287o).mo7656a(80);
                            break;
                        case 5:
                            hbh.mo7636a(hbh.f6277e).mo7656a(400);
                            hbh.mo7636a(hbh.f6280h).mo7659d().mo7656a(LONG_PRESS_DURATION_MS).mo7655a();
                            hbh.mo7636a(hbh.f6278f).mo7656a(LONG_PRESS_DURATION_MS).mo7655a();
                            hbh.mo7636a(hbh.f6288p).mo7659d().mo7656a(LONG_PRESS_DURATION_MS).mo7655a();
                            hbh.mo7636a(hbh.f6287o).mo7659d().mo7656a(LONG_PRESS_DURATION_MS).mo7655a();
                            break;
                        case 6:
                            hbh.mo7636a(hbh.f6281i).mo7656a(500);
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.f6274b.currentSpec.f6329c = hbh.f6276d.mo7680b();
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 3:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                        case 5:
                            break;
                        case 2:
                            hbh.mo7636a(hbh.f6285m).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6283k).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6277e).mo7656a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.mo7636a(hbh.f6288p).mo7656a(400);
                            hbh.mo7636a(hbh.f6287o).mo7656a(600);
                            hbh.mo7636a(hbh.f6289q).mo7656a(800);
                            break;
                        default:
                            hbh.f6274b.resetTo(hbf.PORTRAIT_IDLE);
                            a = hbh.f6276d;
                            continue;
                            continue;
                    }
                case 4:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.mo7636a(hbh.f6283k).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d().mo7657b();
                            hbh.mo7636a(hbh.f6286n).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 5:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.mo7636a(hbh.f6277e).mo7656a(400);
                            hbh.mo7636a(hbh.f6280h).mo7659d().mo7656a(LONG_PRESS_DURATION_MS);
                            hbh.mo7636a(hbh.f6278f).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            break;
                        case 2:
                            hbh.mo7636a(hbh.f6277e).mo7656a(400);
                            hbh.mo7636a(hbh.f6280h).mo7659d().mo7656a(LONG_PRESS_DURATION_MS);
                            hbh.mo7636a(hbh.f6278f).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.mo7636a(hbh.f6288p).mo7656a(400);
                            hbh.mo7636a(hbh.f6287o).mo7656a(600);
                            hbh.mo7636a(hbh.f6289q).mo7656a(800);
                            break;
                        case 10:
                            hbz a2 = hbh.mo7636a(hbh.f6278f).mo7656a(LONG_PRESS_DURATION_MS);
                            a2.f6316a.setInterpolator(a2.f6317b.f6294v);
                            a2.mo7660e();
                            a2 = hbh.mo7636a(hbh.f6279g).mo7656a(500);
                            a2.f6316a.setInterpolator(a2.f6317b.f6293u);
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 6:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.mo7636a(hbh.f6277e).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d().mo7660e();
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6281i).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7658c();
                            break;
                        case 2:
                            hbh.mo7636a(hbh.f6277e).mo7656a(400);
                            hbh.mo7636a(hbh.f6280h).mo7659d().mo7656a(LONG_PRESS_DURATION_MS);
                            hbh.mo7636a(hbh.f6278f).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.mo7636a(hbh.f6288p).mo7656a(400);
                            hbh.mo7636a(hbh.f6287o).mo7656a(600);
                            hbh.mo7636a(hbh.f6289q).mo7656a(800);
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 8:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.f6274b.setClickEnabled(true);
                            hbh.mo7636a(hbh.f6277e).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6281i).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7658c();
                            break;
                        case 9:
                            hbh.f6274b.setClickEnabled(true);
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 9:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 0:
                            hbh.mo7636a(hbh.f6277e).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d().mo7660e();
                            hbh.mo7636a(hbh.f6282j).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6281i).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7658c();
                            break;
                        case 5:
                            hbh.mo7636a(hbh.f6278f).mo7656a(500);
                            hbh.mo7636a(hbh.f6284l).mo7656a(200).mo7660e();
                            hbh.mo7636a(hbh.f6281i).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7658c();
                            break;
                        case 7:
                            hbh.mo7636a(hbh.f6284l).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6278f).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7659d();
                            hbh.mo7636a(hbh.f6281i).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).mo7660e();
                            hbh.f6281i.addListener(new hbx(hbh));
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                case 10:
                    switch (hbh.f6276d.mo7683e().ordinal()) {
                        case 5:
                            hbh.mo7636a(hbh.f6278f).mo7656a(LONG_PRESS_DURATION_MS).mo7660e();
                            hbh.mo7636a(hbh.f6279g).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            break;
                        case 9:
                            hbh.mo7636a(hbh.f6279g).mo7656a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.mo7636a(hbh.f6284l).mo7656a(500).mo7660e();
                            hbh.mo7636a(hbh.f6281i).mo7656a(500);
                            hbh.f6274b.currentSpec.f6329c = hbh.f6276d.mo7680b();
                            break;
                        default:
                            hbh.mo7637a();
                            break;
                    }
                default:
                    hbh.mo7637a();
                    break;
            }
        }
        hbh.f6290r.setDuration(((Long) Collections.max(new kda(hbh.f6291s, hbo.f19897a))).longValue());
        hbh.f6290r.addListener(new hby(hbh));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(hbh.f6291s);
        this.modeTransitionAnimatorSet = animatorSet;
        this.modeTransitionAnimatorSet.start();
    }

    public void animateToScale(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.currentScaleFactor, getDefaultScale() * f});
        ofFloat.addUpdateListener(new hbc(this));
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new C0704ks());
        ofFloat.start();
    }

    public void buildDrawingCache(boolean z) {
        invalidate();
        super.buildDrawingCache(z);
    }

    void cancelModeTransitionAnimations(boolean z) {
        AnimatorSet animatorSet = this.modeTransitionAnimatorSet;
        if (animatorSet != null) {
            if (z) {
                animatorSet.end();
            }
            this.modeTransitionAnimatorSet.cancel();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.getX() >= 0.0f ? motionEvent.getY() >= 0.0f ? motionEvent.getX() < ((float) getWidth()) ? motionEvent.getY() >= ((float) getHeight()) : true : true : true;
        if (!(motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 2) || z) {
            hcl hcl;
            if (z) {
                hcl = this.gestureDetector;
                synchronized (hcl.f6343a) {
                    if (hcl.f6348f != null) {
                        hcl.f6346d.removeCallbacks(hcl.f6349g);
                    }
                    hcl.f6348f = null;
                }
            } else {
                hcl = this.gestureDetector;
                synchronized (hcl.f6343a) {
                    if (motionEvent.getActionMasked() == 0) {
                        if (hcl.f6348f != null) {
                        } else {
                            hcl.f6348f = MotionEvent.obtain(motionEvent);
                            hcl.f6346d.postDelayed(hcl.f6349g, hcl.f6345c);
                        }
                    } else if (motionEvent.getActionMasked() == 1) {
                        if (hcl.f6348f != null) {
                            hcl.f6346d.removeCallbacks(hcl.f6349g);
                        }
                        hcl.f6348f = null;
                    }
                }
            }
            if (this.isLongPressInProgress.compareAndSet(true, false)) {
                hch hch = this.listener;
                if (hch != null) {
                    hch.onShutterButtonLongPressRelease();
                }
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.touchCoordinate = new hin(motionEvent.getX(), motionEvent.getY(), (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        boolean isPressed = isPressed();
        if (isPressed != this.oldPressed) {
            hch hch = this.listener;
            if (hch != null) {
                hch.onShutterButtonPressedStateChanged(isPressed);
            }
            this.oldPressed = isPressed;
        }
    }

    public ilp getClickEnabledObservable() {
        return this.filteredClickEnabledObservable;
    }

    public float getDefaultScale() {
        return 1.0f;
    }

    public Drawable getDrawable() {
        return getBackground();
    }

    public hbf getMode() {
        return this.currentSpec.mo7702c();
    }

    public hcj getSpec() {
        return this.currentSpec.mo7696a();
    }

    private void initialize() {
        setLayerType(2, null);
        this.gestureDetector = new hcl(new hbd(this));
        initializeButtonDimensions();
        this.currentMainButtonPaint = new Paint();
        this.currentMainButtonPaint.setAntiAlias(true);
        this.currentMainButtonPaint.setColor(-1);
        this.currentPhotoCirclePaint = new Paint(this.currentMainButtonPaint);
        this.currentPhotoCirclePaint.setColor(getResources().getColor(R.color.camera_mode_idle_color, null));
        this.currentInnerPortraitRingPaint = new Paint(this.currentMainButtonPaint);
        this.currentInnerPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_inner_color, null));
        this.currentOuterPortraitRingPaint = new Paint(this.currentMainButtonPaint);
        this.currentOuterPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_outer_color, null));
        this.disabledFilterGreyValue = Illuminant.kOther;
        this.currentRipplePaint = new Paint(this.currentMainButtonPaint);
        this.currentRipplePaint.setColor(getResources().getColor(R.color.camera_mode_color, null));
        this.videoButtonStopSquarePaint = new Paint(this.currentMainButtonPaint);
        this.currentVideoCirclePaint = new Paint(this.currentMainButtonPaint);
        this.currentVideoCirclePaint.setColor(getResources().getColor(R.color.video_mode_color, null));
        this.currentSpec = hcj.m3084a(hbf.PHOTO_IDLE, getResources()).mo7695q();
        resetShutterButton();
        this.buttonRect = new RectF();
        this.currentScaleFactor = getDefaultScale();
        setOutlineProvider(new hbg(this));
        updateContentDescription(this.currentSpec.mo7702c());
        setClickEnabled(false);
    }

    protected void initializeButtonDimensions() {
        this.buttonSize = getResources().getDimensionPixelSize(R.dimen.bottom_bar_content_size);
        this.videoButtonStopSquareHalfSize = getResources().getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    private boolean isVideoMode(hbf hbf) {
        return hbf == hbf.VIDEO_IDLE || hbf == hbf.CONFIRM_ENABLED || hbf == hbf.CONFIRM_DISABLED || hbf == hbf.VIDEO_RECORDING;
    }

    public final /* synthetic */ void lambda$runEnableChangeAnimation$0$ShutterButton(ValueAnimator valueAnimator) {
        this.disabledFilterGreyValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        updateShutterButtonColor();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.currentPhotoCirclePaint;
        Integer num = this.currentSpec.f6327a;
        if (num == null) {
            throw new IllegalStateException("Property \"photoCircleColor\" has not been set");
        }
        paint.setColor(num.intValue());
        this.currentPhotoCirclePaint.setAlpha(this.currentSpec.mo7704d());
        this.currentInnerPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_inner_color, null));
        this.currentOuterPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_outer_color, null));
        paint = this.currentRipplePaint;
        num = this.currentSpec.f6331e;
        if (num == null) {
            throw new IllegalStateException("Property \"ripplePaintAlpha\" has not been set");
        }
        paint.setAlpha(num.intValue());
        paint = this.currentVideoCirclePaint;
        num = this.currentSpec.f6328b;
        if (num == null) {
            throw new IllegalStateException("Property \"videoCircleColor\" has not been set");
        }
        paint.setColor(num.intValue());
        paint = this.currentMainButtonPaint;
        num = this.currentSpec.f6333g;
        if (num == null) {
            throw new IllegalStateException("Property \"mainButtonColor\" has not been set");
        }
        paint.setColor(num.intValue());
        if (!isEnabled() && (this.currentSpec.mo7702c() == hbf.PHOTO_IDLE || this.currentSpec.mo7702c() == hbf.PORTRAIT_IDLE)) {
            updateShutterButtonColor();
        }
        hbe hbe = this.onDrawListener;
        if (hbe != null) {
            iya iya;
            CameraActivitySession cameraActivitySession = hbe.f6258a.f23175j;
            if (cameraActivitySession.f12858i == 0) {
                iya = cameraActivitySession.f2599m;
                cameraActivitySession.f12858i = SystemClock.elapsedRealtimeNanos();
                cameraActivitySession.mo2697a("Shutter button first draw", cameraActivitySession.f12858i);
            }
            epf a = epf.m1992a();
            if (a.f4236g.mo6442a(eph.f4241f)) {
                a.f4234e = SystemClock.elapsedRealtimeNanos();
            }
            if (this.clickEnabled) {
                cameraActivitySession = this.onDrawListener.f6258a.f23175j;
                if (cameraActivitySession.f12859j == 0) {
                    iya = cameraActivitySession.f2599m;
                    cameraActivitySession.f12859j = SystemClock.elapsedRealtimeNanos();
                    cameraActivitySession.mo2697a("Shutter button first enabled", cameraActivitySession.f12859j);
                }
                a = epf.m1992a();
                if (a.f4236g.mo6442a(eph.f4242g)) {
                    a.f4235f = SystemClock.elapsedRealtimeNanos();
                }
            }
        }
        canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.mo7712h()) * this.currentScaleFactor, this.currentMainButtonPaint);
        if (this.currentSpec.mo7710g() > this.currentSpec.mo7706e()) {
            canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.mo7710g()) * this.currentScaleFactor, this.currentOuterPortraitRingPaint);
        }
        if (this.currentSpec.mo7708f() > this.currentSpec.mo7706e()) {
            canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.mo7708f()) * this.currentScaleFactor, this.currentInnerPortraitRingPaint);
        }
        if (this.currentSpec.mo7704d() > 0) {
            canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.mo7706e()) * this.currentScaleFactor, this.currentPhotoCirclePaint);
        }
        Boolean bool = this.currentSpec.f6330d;
        if (bool == null) {
            throw new IllegalStateException("Property \"animateRippleEffect\" has not been set");
        }
        float f;
        if (bool.booleanValue()) {
            f = (float) this.buttonCenterX;
            float f2 = (float) this.buttonCenterY;
            Integer num2 = this.currentSpec.f6332f;
            if (num2 == null) {
                throw new IllegalStateException("Property \"rippleRadius\" has not been set");
            }
            canvas.drawCircle(f, f2, ((float) num2.intValue()) * this.currentScaleFactor, this.currentRipplePaint);
        }
        if (isVideoMode(this.currentSpec.mo7702c()) || this.isVideoButtonAnimating) {
            if (this.currentSpec.mo7716j() > 0) {
                canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.mo7716j()) * this.currentScaleFactor, this.currentVideoCirclePaint);
            }
            if (this.currentSpec.mo7714i() > 0) {
                f = ((float) this.currentSpec.mo7714i()) * this.currentScaleFactor;
                float f3 = (float) this.buttonCenterX;
                float f4 = (float) this.buttonCenterY;
                canvas.drawRect(f3 - f, f4 - f, f3 + f, f4 + f, this.videoButtonStopSquarePaint);
            }
        }
        hck hck = this.currentSpec;
        Drawable drawable = hck.f6329c;
        if (drawable != null) {
            drawable.setBounds(this.buttonCenterX - hck.mo7700b(), this.buttonCenterY - this.currentSpec.mo7700b(), this.buttonCenterX + this.currentSpec.mo7700b(), this.buttonCenterY + this.currentSpec.mo7700b());
            drawable.draw(canvas);
        }
    }

    protected void onMeasure(int i, int i2) {
        updateButtonRect();
        int i3 = this.buttonSize;
        setMeasuredDimension(i3, i3);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.buttonCenterX = i / 2;
        this.buttonCenterY = i2 / 2;
        updateButtonRect();
    }

    public boolean performClick() {
        if (!this.clickEnabled) {
            return false;
        }
        boolean performClick = super.performClick();
        if (getVisibility() != 0) {
            return performClick;
        }
        hch hch = this.listener;
        if (hch == null) {
            return performClick;
        }
        hin hin = this.touchCoordinate;
        if (hin != null) {
            hch.onShutterTouch(hin);
        }
        this.touchCoordinate = null;
        this.listener.onShutterButtonClick();
        return performClick;
    }

    public void removeListener() {
        this.listener = null;
    }

    private void resetShutterButton() {
        String str = TAG;
        String valueOf = String.valueOf(this.currentSpec.mo7702c());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
        stringBuilder.append("Resetting ShutterButton in current mode :");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        cancelModeTransitionAnimations(false);
        this.currentSpec = hcj.m3084a(this.currentSpec.mo7702c(), getResources()).mo7695q();
        invalidate();
    }

    public void resetTo(hbf hbf) {
        this.currentSpec.mo7698a(hbf);
        resetShutterButton();
    }

    private void runEnableChangeAnimation(boolean z) {
        int i;
        ValueAnimator valueAnimator = this.enableStateChangeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            i = Illuminant.kOther;
        } else {
            i = DISABLED_FILTER_COLOR_VALUE;
        }
        this.enableStateChangeAnimator = ValueAnimator.ofInt(new int[]{this.disabledFilterGreyValue, i});
        this.enableStateChangeAnimator.setDuration(150);
        this.enableStateChangeAnimator.addUpdateListener(new hbb(this));
        if (!z) {
            this.enableStateChangeAnimator.setStartDelay(500);
        }
        this.enableStateChangeAnimator.start();
    }

    /* renamed from: runPressedStateAnimation */
    public void access$000(boolean z, hbh hbh) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("Running pressed state animation with isPressed=");
        stringBuilder.append(z);
        bli.m888a(str, stringBuilder.toString());
        if (!z) {
            hbh.mo7635a(1.0f, BUTTON_CLICK_SPLASH_IN_DURATION_MS).start();
            if (this.currentSpec.mo7702c() == hbf.PHOTO_PRESSED) {
                setMode(hbf.PHOTO_IDLE, hbh);
            } else if (this.currentSpec.mo7702c() == hbf.PORTRAIT_PRESSED) {
                setMode(hbf.PORTRAIT_IDLE, hbh);
            }
        } else if (isEnabled() && ((Boolean) getClickEnabledObservable().mo13673b()).booleanValue()) {
            hbh.mo7635a(1.06f, 100).start();
            if (this.currentSpec.mo7702c() == hbf.PHOTO_IDLE) {
                setMode(hbf.PHOTO_PRESSED, hbh);
            } else if (this.currentSpec.mo7702c() == hbf.PORTRAIT_IDLE) {
                setMode(hbf.PORTRAIT_PRESSED, hbh);
            }
        } else {
            str = TAG;
            boolean isEnabled = isEnabled();
            String valueOf = String.valueOf(getClickEnabledObservable().mo13673b());
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 81);
            stringBuilder2.append("Ignoring pressed state animation. Button enabled: ");
            stringBuilder2.append(isEnabled);
            stringBuilder2.append(", clickEnabledObservable: ");
            stringBuilder2.append(valueOf);
            bli.m896d(str, stringBuilder2.toString());
        }
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
        this.clickEnabledObservable.mo8826a(Boolean.valueOf(this.clickEnabled));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickEnabled(z);
        runEnableChangeAnimation(z);
    }

    public void setListener(hch hch) {
        this.listener = hch;
    }

    public void setMode(hbf hbf, hbh hbh) {
        if (hbf != this.currentSpec.mo7702c()) {
            String str = TAG;
            String valueOf = String.valueOf(hbf);
            String valueOf2 = String.valueOf(this.currentSpec.mo7702c());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length());
            stringBuilder.append("Entering ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" from ");
            stringBuilder.append(valueOf2);
            bli.m888a(str, stringBuilder.toString());
            animateMainButton(hbf, hbh);
            this.currentSpec.mo7698a(hbf);
            str = TAG;
            valueOf = String.valueOf(this.currentSpec.mo7702c());
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 12);
            stringBuilder2.append("Mode set to ");
            stringBuilder2.append(valueOf);
            bli.m888a(str, stringBuilder2.toString());
            setTag(hbf.toString());
            updateContentDescription(hbf);
        }
    }

    public void setOnDrawListener(hbe hbe) {
        boolean z;
        if (this.onDrawListener == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Cannot set on draw listener more than once.");
        this.onDrawListener = hbe;
        invalidate();
    }

    public void setVideoButtonAnimating(boolean z) {
        this.isVideoButtonAnimating = z;
    }

    private void updateButtonRect() {
        int h = (int) (((float) this.currentSpec.mo7712h()) * this.currentScaleFactor);
        int i = this.buttonCenterX - h;
        int i2 = this.buttonCenterY - h;
        h += h;
        this.buttonRect.set((float) i, (float) i2, (float) (i + h), (float) (h + i2));
    }

    private void updateContentDescription(hbf hbf) {
        CharSequence string;
        if (hbf == hbf.CONFIRM_ENABLED) {
            string = getResources().getString(R.string.accessibility_done_button);
        } else if (hbf == hbf.CANCEL) {
            string = getResources().getString(R.string.accessibility_cancel_button);
        } else if (hbf == hbf.VIDEO_IDLE) {
            string = getResources().getString(R.string.accessibility_capture_video_start);
        } else if (hbf == hbf.VIDEO_RECORDING) {
            string = getResources().getString(R.string.accessibility_capture_video_stop);
        } else {
            string = getResources().getString(R.string.accessibility_shutter_button);
        }
        setContentDescription(string);
    }

    private void updateShutterButtonColor() {
        int i = this.disabledFilterGreyValue;
        ColorFilter lightingColorFilter = new LightingColorFilter(Color.rgb(i, i, i), 0);
        this.currentInnerPortraitRingPaint.setColorFilter(lightingColorFilter);
        this.currentOuterPortraitRingPaint.setColorFilter(lightingColorFilter);
        this.currentPhotoCirclePaint.setColorFilter(lightingColorFilter);
        this.currentMainButtonPaint.setColorFilter(lightingColorFilter);
    }
}

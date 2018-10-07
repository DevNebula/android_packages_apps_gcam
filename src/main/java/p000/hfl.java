package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: hfl */
public final class hfl extends View {
    /* renamed from: a */
    public final int f6514a;
    /* renamed from: b */
    public final int f6515b;
    /* renamed from: c */
    public final int f6516c;
    /* renamed from: d */
    public final Paint f6517d;
    /* renamed from: e */
    public final Interpolator f6518e;
    /* renamed from: f */
    public int f6519f = C0252go.f5902bv;
    /* renamed from: g */
    public int f6520g;
    /* renamed from: h */
    public float f6521h;
    /* renamed from: i */
    public int f6522i = 0;
    /* renamed from: j */
    public AnimatorSet f6523j = null;
    /* renamed from: k */
    public AnimatorSet f6524k = null;
    /* renamed from: l */
    private final Paint f6525l;
    /* renamed from: m */
    private final Interpolator f6526m;
    /* renamed from: n */
    private int f6527n;
    /* renamed from: o */
    private int f6528o;
    /* renamed from: p */
    private RectF f6529p = new RectF();

    static {
        bli.m887a("ProgressOverlay");
    }

    public hfl(Context context) {
        super(context);
        setVisibility(4);
        this.f6514a = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius_max);
        this.f6515b = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius);
        this.f6516c = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_width);
        this.f6526m = new LinearInterpolator();
        this.f6518e = AnimationUtils.loadInterpolator(getContext(), 17563661);
        this.f6517d = new Paint();
        this.f6517d.setAntiAlias(true);
        this.f6517d.setStyle(Style.STROKE);
        this.f6517d.setColor(-1);
        this.f6517d.setAlpha(51);
        this.f6525l = new Paint(this.f6517d);
        this.f6525l.setAlpha(Illuminant.kOther);
    }

    /* renamed from: a */
    public final void mo7791a() {
        AnimatorSet animatorSet = this.f6524k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f6524k.cancel();
        }
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.f6516c, 0.0f});
        ofFloat.setDuration(133);
        ofFloat.setInterpolator(this.f6526m);
        ofFloat.addUpdateListener(new hfp(this));
        this.f6524k = new AnimatorSet();
        this.f6524k.play(ofFloat);
        this.f6524k.addListener(new hfq(this));
        this.f6524k.start();
    }

    public final void onDraw(Canvas canvas) {
        if (this.f6519f != C0252go.f5902bv) {
            canvas.drawCircle((float) this.f6527n, (float) this.f6528o, (float) this.f6520g, this.f6517d);
            if (this.f6519f == C0252go.f5905by || this.f6519f == C0252go.f5904bx) {
                this.f6517d.setStrokeWidth(this.f6521h);
                this.f6525l.setStrokeWidth(this.f6521h);
                RectF rectF = this.f6529p;
                int i = this.f6527n;
                int i2 = this.f6520g;
                int i3 = this.f6528o;
                rectF.set((float) (i - i2), (float) (i3 - i2), (float) (i + i2), (float) (i2 + i3));
                canvas.drawArc(this.f6529p, -90.0f, (float) this.f6522i, false, this.f6525l);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f6527n = (i3 - i) / 2;
            this.f6528o = (i4 - i2) / 2;
        }
    }
}

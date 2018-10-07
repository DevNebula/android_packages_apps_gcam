package p000;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;
import java.util.List;

/* compiled from: PG */
/* renamed from: hbh */
public final class hbh {
    /* renamed from: a */
    public static final Interpolator f6272a = new LinearInterpolator();
    /* renamed from: w */
    private static final String f6273w = bli.m887a(hbh.class.getSimpleName());
    /* renamed from: b */
    public final ShutterButton f6274b;
    /* renamed from: c */
    public hcj f6275c;
    /* renamed from: d */
    public hcj f6276d;
    /* renamed from: e */
    public ValueAnimator f6277e;
    /* renamed from: f */
    public ValueAnimator f6278f;
    /* renamed from: g */
    public ValueAnimator f6279g;
    /* renamed from: h */
    public ValueAnimator f6280h;
    /* renamed from: i */
    public ValueAnimator f6281i;
    /* renamed from: j */
    public ValueAnimator f6282j;
    /* renamed from: k */
    public ValueAnimator f6283k;
    /* renamed from: l */
    public ValueAnimator f6284l;
    /* renamed from: m */
    public ValueAnimator f6285m;
    /* renamed from: n */
    public ValueAnimator f6286n;
    /* renamed from: o */
    public ValueAnimator f6287o;
    /* renamed from: p */
    public ValueAnimator f6288p;
    /* renamed from: q */
    public ValueAnimator f6289q;
    /* renamed from: r */
    public ValueAnimator f6290r;
    /* renamed from: s */
    public List f6291s;
    /* renamed from: t */
    public final ArgbEvaluator f6292t = new ArgbEvaluator();
    /* renamed from: u */
    public final Interpolator f6293u;
    /* renamed from: v */
    public final Interpolator f6294v;
    /* renamed from: x */
    private final Interpolator f6295x;
    /* renamed from: y */
    private final boolean f6296y;

    public hbh(ShutterButton shutterButton, boolean z) {
        this.f6274b = shutterButton;
        this.f6296y = z;
        this.f6293u = AnimationUtils.loadInterpolator(shutterButton.getContext(), R.interpolator.custom_40_in_60_out);
        this.f6294v = AnimationUtils.loadInterpolator(shutterButton.getContext(), R.interpolator.custom_60_in_60_out);
        this.f6295x = AnimationUtils.loadInterpolator(shutterButton.getContext(), 17563661);
    }

    /* renamed from: a */
    public final hbz mo7636a(Animator animator) {
        return new hbz(this, animator);
    }

    /* renamed from: a */
    public final ValueAnimator mo7634a(int i, int i2, AnimatorUpdateListener animatorUpdateListener) {
        jri.m13391a(this.f6274b, (Object) "Trying to create animators for null shutterbutton");
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i, i2}).setDuration(40);
        duration.addUpdateListener(animatorUpdateListener);
        duration.setInterpolator(this.f6295x);
        return duration;
    }

    /* renamed from: a */
    public final ViewPropertyAnimator mo7635a(float f, int i) {
        ViewPropertyAnimator animate = this.f6274b.animate();
        animate.setDuration((long) i);
        animate.setInterpolator(this.f6295x);
        animate.scaleX(f).scaleY(f);
        return animate;
    }

    /* renamed from: a */
    public final void mo7637a() {
        String format = String.format("Unsupported transition from %s -> %s", new Object[]{this.f6275c.mo7683e(), this.f6276d.mo7683e()});
        if (this.f6296y) {
            throw new IllegalArgumentException(format);
        }
        bli.m898e(f6273w, format);
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: hic */
public final class hic {
    /* renamed from: a */
    public int f6584a;
    /* renamed from: b */
    public final AnimatorSet f6585b = new AnimatorSet();
    /* renamed from: c */
    private Interpolator f6586c;
    /* renamed from: d */
    private Builder f6587d;

    private hic(int i, Interpolator interpolator) {
        this.f6584a = i;
        this.f6586c = interpolator;
    }

    /* renamed from: a */
    public final hic mo7879a(Object obj, String str, float f, float f2) {
        Animator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{f, f2});
        ofFloat.setDuration((long) this.f6584a);
        ofFloat.setInterpolator(this.f6586c);
        Builder builder = this.f6587d;
        if (builder == null) {
            this.f6587d = this.f6585b.play(ofFloat);
        } else {
            builder.with(ofFloat);
        }
        return this;
    }

    /* renamed from: a */
    public final hic mo7880a(Object obj, String str, int i, int i2) {
        Animator ofArgb = ObjectAnimator.ofArgb(obj, str, new int[]{i, i2});
        ofArgb.setDuration((long) this.f6584a);
        ofArgb.setInterpolator(this.f6586c);
        Builder builder = this.f6587d;
        if (builder == null) {
            this.f6587d = this.f6585b.play(ofArgb);
        } else {
            builder.with(ofArgb);
        }
        return this;
    }

    /* renamed from: a */
    public static hic m3218a(int i, Interpolator interpolator) {
        return new hic(i, interpolator);
    }
}

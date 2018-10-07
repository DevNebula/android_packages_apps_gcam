package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cd */
abstract class C0072cd extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    /* renamed from: a */
    private boolean f1871a;
    /* renamed from: b */
    private float f1872b;
    /* renamed from: c */
    private float f1873c;
    /* renamed from: d */
    private final /* synthetic */ C0066bu f1874d;

    private C0072cd(C0066bu c0066bu) {
        this.f1874d = c0066bu;
    }

    /* renamed from: a */
    protected abstract float mo2255a();

    /* synthetic */ C0072cd(C0066bu c0066bu, byte b) {
        this(c0066bu);
    }

    public void onAnimationEnd(Animator animator) {
        this.f1874d.f1610h.mo12908a(this.f1873c);
        this.f1871a = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f1871a) {
            this.f1872b = this.f1874d.f1610h.f13265a;
            this.f1873c = mo2255a();
            this.f1871a = true;
        }
        C0665cu c0665cu = this.f1874d.f1610h;
        float f = this.f1872b;
        c0665cu.mo12908a(f + ((this.f1873c - f) * valueAnimator.getAnimatedFraction()));
    }
}

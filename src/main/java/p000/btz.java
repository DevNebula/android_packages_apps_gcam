package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btz */
public final class btz implements kwk {
    /* renamed from: a */
    private final kwk f11779a;
    /* renamed from: b */
    private final kwk f11780b;
    /* renamed from: c */
    private final kwk f11781c;
    /* renamed from: d */
    private final kwk f11782d;
    /* renamed from: e */
    private final kwk f11783e;
    /* renamed from: f */
    private final kwk f11784f;

    public btz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11779a = kwk;
        this.f11780b = kwk2;
        this.f11781c = kwk3;
        this.f11782d = kwk4;
        this.f11783e = kwk5;
        this.f11784f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11779a;
        kwk kwk2 = this.f11780b;
        kwk kwk3 = this.f11781c;
        kwk kwk4 = this.f11782d;
        kwk kwk5 = this.f11783e;
        Context context = (Context) kwk.mo10566a();
        Resources resources = (Resources) kwk2.mo10566a();
        btl btl = (btl) kwk3.mo10566a();
        bsz bsz = (bsz) kwk4.mo10566a();
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) kwk5.mo10566a();
        this.f11784f.mo10566a();
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_inner_splash_diameter_scale_up);
        valueAnimator.addUpdateListener(btl.mo2115a());
        ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_inner_splash_opacity_fade_in);
        valueAnimator2.addUpdateListener(btl.mo2116b());
        ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_outer_ring_opacity_fade_in);
        valueAnimator3.addUpdateListener(btl.mo2119e());
        ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_hold_outer_ring_thickness_scale_up);
        valueAnimator4.addUpdateListener(new btr(btl));
        Animator animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimator).with(valueAnimator2).with(valueAnimator3).with(valueAnimator4);
        animatorSet.addListener(new btw(resources, bsz, focusIndicatorView));
        animatorSet.addListener(new hiu("FocusLockHoldAnimation"));
        return (hix) ktm.m14219a(hiy.m3247a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}

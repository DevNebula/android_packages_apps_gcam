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
/* renamed from: bty */
public final class bty implements kwk {
    /* renamed from: a */
    private final kwk f11773a;
    /* renamed from: b */
    private final kwk f11774b;
    /* renamed from: c */
    private final kwk f11775c;
    /* renamed from: d */
    private final kwk f11776d;
    /* renamed from: e */
    private final kwk f11777e;
    /* renamed from: f */
    private final kwk f11778f;

    public bty(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11773a = kwk;
        this.f11774b = kwk2;
        this.f11775c = kwk3;
        this.f11776d = kwk4;
        this.f11777e = kwk5;
        this.f11778f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11773a;
        kwk kwk2 = this.f11774b;
        kwk kwk3 = this.f11775c;
        kwk kwk4 = this.f11776d;
        kwk kwk5 = this.f11777e;
        Context context = (Context) kwk.mo10566a();
        Resources resources = (Resources) kwk2.mo10566a();
        btl btl = (btl) kwk3.mo10566a();
        bsz bsz = (bsz) kwk4.mo10566a();
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) kwk5.mo10566a();
        this.f11778f.mo10566a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_inner_splash_diameter_scale_up)).addUpdateListener(btl.mo2115a());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_inner_splash_opacity_fade_in)).addUpdateListener(btl.mo2116b());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_inner_splash_opacity_fade_out)).addUpdateListener(btl.mo2116b());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_outer_ring_diameter_scale_down)).addUpdateListener(btl.mo2118d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.active_focus_scan_outer_ring_opacity_fade_in)).addUpdateListener(btl.mo2119e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r5, r6, r7, r8, r0});
        animatorSet.addListener(new btu(resources, bsz, focusIndicatorView));
        animatorSet.addListener(new hiu("ActiveFocusScanAnimation"));
        return (hix) ktm.m14219a(hiy.m3247a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}

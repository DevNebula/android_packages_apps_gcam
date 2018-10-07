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
/* renamed from: buc */
public final class buc implements kwk {
    /* renamed from: a */
    private final kwk f11791a;
    /* renamed from: b */
    private final kwk f11792b;
    /* renamed from: c */
    private final kwk f11793c;
    /* renamed from: d */
    private final kwk f11794d;
    /* renamed from: e */
    private final kwk f11795e;
    /* renamed from: f */
    private final kwk f11796f;

    public buc(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11791a = kwk;
        this.f11792b = kwk2;
        this.f11793c = kwk3;
        this.f11794d = kwk4;
        this.f11795e = kwk5;
        this.f11796f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11791a;
        kwk kwk2 = this.f11792b;
        kwk kwk3 = this.f11793c;
        kwk kwk4 = this.f11794d;
        kwk kwk5 = this.f11795e;
        Context context = (Context) kwk.mo10566a();
        Resources resources = (Resources) kwk2.mo10566a();
        btl btl = (btl) kwk3.mo10566a();
        bsz bsz = (bsz) kwk4.mo10566a();
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) kwk5.mo10566a();
        this.f11796f.mo10566a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.passive_focus_scan_outer_ring_diameter_scale_down)).addUpdateListener(btl.mo2118d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.passive_focus_scan_outer_ring_opacity_fade_in)).addUpdateListener(btl.mo2119e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r5, r0});
        animatorSet.addListener(new btv(resources, bsz, focusIndicatorView));
        animatorSet.addListener(new hiu("PassiveFocusScanAnimation"));
        return (hix) ktm.m14219a(hiy.m3247a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}

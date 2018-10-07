package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bua */
public final class bua implements kwk {
    /* renamed from: a */
    private final kwk f11785a;
    /* renamed from: b */
    private final kwk f11786b;
    /* renamed from: c */
    private final kwk f11787c;

    public bua(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11785a = kwk;
        this.f11786b = kwk2;
        this.f11787c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11785a;
        kwk kwk2 = this.f11786b;
        Context context = (Context) kwk.mo10566a();
        btl btl = (btl) kwk2.mo10566a();
        this.f11787c.mo10566a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_inner_splash_diameter_scale_down)).addUpdateListener(btl.mo2115a());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_inner_splash_opacity_fade_out)).addUpdateListener(btl.mo2116b());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_outer_ring_diameter_scale_down)).addUpdateListener(btl.mo2118d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.focus_lock_release_outer_ring_opacity_fade_out)).addUpdateListener(btl.mo2119e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r2, r3, r4, r0});
        animatorSet.addListener(new hiu("FocusLockReleaseAnimation"));
        return (hix) ktm.m14219a(hiy.m3247a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bue */
public final class bue implements kwk {
    /* renamed from: a */
    private final kwk f11800a;
    /* renamed from: b */
    private final kwk f11801b;
    /* renamed from: c */
    private final kwk f11802c;

    public bue(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11800a = kwk;
        this.f11801b = kwk2;
        this.f11802c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11800a;
        kwk kwk2 = this.f11801b;
        Context context = (Context) kwk.mo10566a();
        btl btl = (btl) kwk2.mo10566a();
        this.f11802c.mo10566a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_selected_ring_diameter_scale_up)).addUpdateListener(btl.mo2118d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_selected_ring_corner_radius_decrease)).addUpdateListener(btl.mo2117c());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_selected_ring_opacity_fade_in)).addUpdateListener(btl.mo2119e());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r2, r3, r0});
        animatorSet.addListener(new btm(btl));
        animatorSet.addListener(new hiu("VslGleamSelectedAnimator"));
        return (hix) ktm.m14219a(hiy.m3247a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}

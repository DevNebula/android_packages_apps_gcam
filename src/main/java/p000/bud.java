package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bud */
public final class bud implements kwk {
    /* renamed from: a */
    private final kwk f11797a;
    /* renamed from: b */
    private final kwk f11798b;
    /* renamed from: c */
    private final kwk f11799c;

    public bud(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f11797a = kwk;
        this.f11798b = kwk2;
        this.f11799c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11797a;
        kwk kwk2 = this.f11798b;
        Context context = (Context) kwk.mo10566a();
        btl btl = (btl) kwk2.mo10566a();
        this.f11799c.mo10566a();
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_detected_ring_diameter_scale_up)).addUpdateListener(btl.mo2118d());
        ((ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.vsl_gleam_detected_ring_corner_radius_decrease)).addUpdateListener(btl.mo2117c());
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r2, r0});
        animatorSet.addListener(new hiu("VslGleamDetectedAnimator"));
        return (hix) ktm.m14219a(hiy.m3247a(animatorSet), "Cannot return null from a non-@Nullable @Provides method");
    }
}

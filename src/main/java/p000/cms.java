package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cms */
public final class cms implements OnPreDrawListener {
    /* renamed from: a */
    private final /* synthetic */ BurstImageView f2358a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2359b;

    public cms(cmp cmp, BurstImageView burstImageView) {
        this.f2359b = cmp;
        this.f2358a = burstImageView;
    }

    public final boolean onPreDraw() {
        cmp cmp = this.f2359b;
        BurstImageView burstImageView = this.f2358a;
        kvr kvr = (kvr) cmp.f2356l.get(((cot) cmp.f2346b.get(cmp.f2357m.f591e)).f13151c.f13139e.f4384h);
        cmp.m1217b(kvr);
        cnb a = cmp.mo2387a(burstImageView, kvr);
        cmp.f2351g = a;
        Animator animatorSet = new AnimatorSet();
        cmp.f2348d = animatorSet;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.addUpdateListener(new cmo(kvr, a));
        animatorSet.play(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_X, new float[]{a.f2380b, 0.0f})).with(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_Y, new float[]{a.f2381c, 0.0f})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_X, new float[]{a.f2382d, 1.0f})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_Y, new float[]{a.f2382d, 1.0f})).with(ObjectAnimator.ofFloat(cmp.f2350f, View.ALPHA, new float[]{1.0f, 0.0f})).with(ObjectAnimator.ofFloat(cmp.f2354j, View.ALPHA, new float[]{0.0f, 1.0f})).with(ofFloat);
        animatorSet.setDuration(250);
        animatorSet.setInterpolator(axl.f1036a);
        animatorSet.addListener(new cmt(cmp, burstImageView, kvr));
        animatorSet.start();
        this.f2359b.f2357m.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cmu */
final class cmu extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstImageView f2363a;
    /* renamed from: b */
    private final /* synthetic */ kvr f2364b;
    /* renamed from: c */
    private final /* synthetic */ cmp f2365c;

    cmu(cmp cmp, BurstImageView burstImageView, kvr kvr) {
        this.f2365c = cmp;
        this.f2363a = burstImageView;
        this.f2364b = kvr;
    }

    public final void onAnimationCancel(Animator animator) {
        onAnimationEnd(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2363a.setAlpha(1.0f);
        this.f2365c.mo2389a(4);
        this.f2364b.setTranslationX(0.0f);
        this.f2364b.setTranslationY(0.0f);
        this.f2364b.setScaleX(1.0f);
        this.f2364b.setScaleY(1.0f);
        this.f2364b.setClipBounds(null);
        cmp cmp = this.f2365c;
        cmp.f2348d = null;
        cmp.f2345a.mo2399a();
        for (kvr e : this.f2365c.f2356l.values()) {
            e.mo10536e();
        }
    }
}

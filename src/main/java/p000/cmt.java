package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cmt */
final class cmt extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstImageView f2360a;
    /* renamed from: b */
    private final /* synthetic */ kvr f2361b;
    /* renamed from: c */
    private final /* synthetic */ cmp f2362c;

    cmt(cmp cmp, BurstImageView burstImageView, kvr kvr) {
        this.f2362c = cmp;
        this.f2360a = burstImageView;
        this.f2361b = kvr;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2360a.setAlpha(1.0f);
        this.f2362c.f2348d = null;
        this.f2361b.setClipBounds(null);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2362c.f2350f.setVisibility(4);
        for (View a : this.f2362c.f2356l.values()) {
            cmp.m1216a(a);
        }
        onAnimationCancel(animator);
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p002v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: pt */
public final class C0420pt extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9545a;

    public C0420pt(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9545a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9545a;
        actionBarOverlayLayout.f10561h = null;
        actionBarOverlayLayout.f10558e = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9545a;
        actionBarOverlayLayout.f10561h = null;
        actionBarOverlayLayout.f10558e = false;
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sc */
final class C0470sc extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0472se f9690a;
    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9691b;
    /* renamed from: c */
    private final /* synthetic */ View f9692c;
    /* renamed from: d */
    private final /* synthetic */ C0839rv f9693d;

    C0470sc(C0839rv c0839rv, C0472se c0472se, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9693d = c0839rv;
        this.f9690a = c0472se;
        this.f9691b = viewPropertyAnimator;
        this.f9692c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9691b.setListener(null);
        this.f9692c.setAlpha(1.0f);
        this.f9692c.setTranslationX(0.0f);
        this.f9692c.setTranslationY(0.0f);
        this.f9693d.mo11211f(this.f9690a.f9698a);
        this.f9693d.f25461g.remove(this.f9690a.f9698a);
        this.f9693d.mo15286a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

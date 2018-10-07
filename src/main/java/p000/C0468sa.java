package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sa */
final class C0468sa extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0530ux f9680a;
    /* renamed from: b */
    private final /* synthetic */ View f9681b;
    /* renamed from: c */
    private final /* synthetic */ ViewPropertyAnimator f9682c;
    /* renamed from: d */
    private final /* synthetic */ C0839rv f9683d;

    C0468sa(C0839rv c0839rv, C0530ux c0530ux, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9683d = c0839rv;
        this.f9680a = c0530ux;
        this.f9681b = view;
        this.f9682c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9681b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9682c.setListener(null);
        this.f9683d.mo11211f(this.f9680a);
        this.f9683d.f25458d.remove(this.f9680a);
        this.f9683d.mo15286a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sd */
final class C0471sd extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0472se f9694a;
    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9695b;
    /* renamed from: c */
    private final /* synthetic */ View f9696c;
    /* renamed from: d */
    private final /* synthetic */ C0839rv f9697d;

    C0471sd(C0839rv c0839rv, C0472se c0472se, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9697d = c0839rv;
        this.f9694a = c0472se;
        this.f9695b = viewPropertyAnimator;
        this.f9696c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9695b.setListener(null);
        this.f9696c.setAlpha(1.0f);
        this.f9696c.setTranslationX(0.0f);
        this.f9696c.setTranslationY(0.0f);
        this.f9697d.mo11211f(this.f9694a.f9699b);
        this.f9697d.f25461g.remove(this.f9694a.f9699b);
        this.f9697d.mo15286a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

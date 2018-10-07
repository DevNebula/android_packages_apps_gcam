package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sb */
final class C0469sb extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0530ux f9684a;
    /* renamed from: b */
    private final /* synthetic */ int f9685b;
    /* renamed from: c */
    private final /* synthetic */ View f9686c;
    /* renamed from: d */
    private final /* synthetic */ int f9687d;
    /* renamed from: e */
    private final /* synthetic */ ViewPropertyAnimator f9688e;
    /* renamed from: f */
    private final /* synthetic */ C0839rv f9689f;

    C0469sb(C0839rv c0839rv, C0530ux c0530ux, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9689f = c0839rv;
        this.f9684a = c0530ux;
        this.f9685b = i;
        this.f9686c = view;
        this.f9687d = i2;
        this.f9688e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f9685b != 0) {
            this.f9686c.setTranslationX(0.0f);
        }
        if (this.f9687d != 0) {
            this.f9686c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9688e.setListener(null);
        this.f9689f.mo11211f(this.f9684a);
        this.f9689f.f25459e.remove(this.f9684a);
        this.f9689f.mo15286a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

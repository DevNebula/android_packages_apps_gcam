package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: rz */
final class C0466rz extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0530ux f9676a;
    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9677b;
    /* renamed from: c */
    private final /* synthetic */ View f9678c;
    /* renamed from: d */
    private final /* synthetic */ C0839rv f9679d;

    C0466rz(C0839rv c0839rv, C0530ux c0530ux, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9679d = c0839rv;
        this.f9676a = c0530ux;
        this.f9677b = viewPropertyAnimator;
        this.f9678c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9677b.setListener(null);
        this.f9678c.setAlpha(1.0f);
        this.f9679d.mo11211f(this.f9676a);
        this.f9679d.f25460f.remove(this.f9676a);
        this.f9679d.mo15286a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}

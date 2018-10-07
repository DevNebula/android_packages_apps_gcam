package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: ke */
final class C0329ke extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0331kg f8611a;

    C0329ke(C0331kg c0331kg, View view) {
        this.f8611a = c0331kg;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f8611a.mo9956a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8611a.mo9957b();
    }

    public final void onAnimationStart(Animator animator) {
        this.f8611a.mo9958c();
    }
}

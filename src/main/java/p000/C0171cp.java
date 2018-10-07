package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cp */
final class C0171cp extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ C0078co f2739a;

    C0171cp(C0078co c0078co) {
        this.f2739a = c0078co;
    }

    public final void onAnimationEnd(Animator animator) {
        C0078co c0078co = this.f2739a;
        if (c0078co.f2407c == animator) {
            c0078co.f2407c = null;
        }
    }
}

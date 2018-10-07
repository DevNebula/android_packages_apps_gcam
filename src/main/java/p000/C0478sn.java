package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: sn */
final class C0478sn extends AnimatorListenerAdapter {
    /* renamed from: a */
    private boolean f9724a = false;
    /* renamed from: b */
    private final /* synthetic */ C0754sk f9725b;

    C0478sn(C0754sk c0754sk) {
        this.f9725b = c0754sk;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9724a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C0754sk c0754sk;
        if (this.f9724a) {
            this.f9724a = false;
        } else if (((Float) this.f9725b.f22281n.getAnimatedValue()).floatValue() == 0.0f) {
            c0754sk = this.f9725b;
            c0754sk.f22282o = 0;
            c0754sk.mo14417a(0);
        } else {
            c0754sk = this.f9725b;
            c0754sk.f22282o = 2;
            c0754sk.f22277j.invalidate();
        }
    }
}

package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: faz */
final class faz extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ far f4648a;

    faz(far far) {
        this.f4648a = far;
    }

    public final void onAnimationEnd(Animator animator) {
        fbe fbe;
        synchronized (far.f18096a) {
            fbe = this.f4648a.f18101e;
        }
        if (fbe != null) {
            this.f4648a.mo6719a(fbe);
        }
    }
}

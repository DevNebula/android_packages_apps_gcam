package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: eq */
final class C0215eq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final View f4304a;
    /* renamed from: b */
    private boolean f4305b = false;

    C0215eq(View view) {
        this.f4304a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        C0231fo.m2404a(this.f4304a, 1.0f);
        if (this.f4305b) {
            this.f4304a.setLayerType(0, null);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (C0315jm.m4646u(this.f4304a) && this.f4304a.getLayerType() == 0) {
            this.f4305b = true;
            this.f4304a.setLayerType(2, null);
        }
    }
}

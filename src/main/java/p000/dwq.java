package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: dwq */
final class dwq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f3533a;
    /* renamed from: b */
    private final /* synthetic */ View f3534b;

    dwq(boolean z, View view) {
        this.f3533a = z;
        this.f3534b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f3533a) {
            this.f3534b.setVisibility(8);
            this.f3534b.setAlpha(1.0f);
        }
    }
}

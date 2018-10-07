package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: hae */
final class hae extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f6241a;

    hae(View view) {
        this.f6241a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f6241a.setAlpha(0.0f);
        this.f6241a.setVisibility(0);
    }
}

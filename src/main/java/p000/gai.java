package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: gai */
final class gai extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f5184a;

    gai(View view) {
        this.f5184a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f5184a.setVisibility(0);
    }
}

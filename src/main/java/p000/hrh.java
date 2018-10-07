package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hrh */
public final class hrh extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hrg f6857a;

    public hrh(hrg hrg) {
        this.f6857a = hrg;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6857a.f6856a.setAlpha(1.0f);
        this.f6857a.f6856a.setVisibility(8);
    }
}

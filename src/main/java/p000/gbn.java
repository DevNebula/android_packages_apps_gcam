package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbn */
final class gbn extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ OptionsBarView f5264a;

    gbn(OptionsBarView optionsBarView) {
        this.f5264a = optionsBarView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5264a.setVisibility(4);
    }
}
